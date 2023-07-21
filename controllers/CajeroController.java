package es.nextdigital.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.nextdigital.demo.dto.DineroDTO;
import es.nextdigital.demo.models.TarjetaModel;
import es.nextdigital.demo.services.CuentaService;
import es.nextdigital.demo.services.TarjetaService;

@RestController
@RequestMapping("api/cajero")
public class CajeroController {

	private final CuentaService cuentaService;
	private final TarjetaService tarjetaService;

	@Autowired
	public CajeroController(CuentaService cuentaService, TarjetaService tarjetaService) {
		this.cuentaService = cuentaService;
		this.tarjetaService = tarjetaService;
	}

	@PostMapping("/retirar-dinero")
	public ResponseEntity<String> retirarDinero(@RequestBody DineroDTO retiroDineroDTO) {
		// Obtener el número de tarjeta y el monto a retirar del DTO
		String numeroTarjeta = retiroDineroDTO.getNumeroTarjeta();
		double montoRetiro = retiroDineroDTO.getMonto();

		// Obtener información de la tarjeta por el número de tarjeta
		TarjetaModel tarjeta = tarjetaService.findByNumTarjeta(numeroTarjeta);

		// Verificar si la tarjeta tiene saldo suficiente o si está dentro del límite de
		// crédito
		boolean puedeSacarDinero = tarjetaService.puedeSacarDinero(tarjeta, montoRetiro);

		if (tarjeta.getCuenta().getBanco() == retiroDineroDTO.getBanco()) {
			// Si el cajero es de otro banco, aplicar comisiones
			double comision = cuentaService.calcularComision(montoRetiro);
			montoRetiro += comision;
		}

		if (puedeSacarDinero) {
			// Actualizar el saldo de la cuenta asociada a la tarjeta
			tarjetaService.actualizarSaldoCuenta(tarjeta, montoRetiro);
			return ResponseEntity.ok("Retiro exitoso. Monto retirado: " + montoRetiro);
		} else {
			return ResponseEntity.badRequest()
					.body("No se puede realizar el retiro. Saldo insuficiente o límite de crédito excedido.");
		}
	}

	@PostMapping("/ingresar-dinero")
	public ResponseEntity<String> ingresarDinero(@RequestBody DineroDTO ingresoDineroDTO) {
		// Obtener el número de tarjeta y el monto a ingresar del DTO
		String numeroTarjeta = ingresoDineroDTO.getNumeroTarjeta();
		double montoIngreso = ingresoDineroDTO.getMonto();

		// Obtener información de la tarjeta por el número de tarjeta
		TarjetaModel tarjeta = tarjetaService.findByNumTarjeta(numeroTarjeta);

		// Verificar si el cajero es del mismo banco que la tarjeta

		if (tarjeta.getCuenta().getBanco() != ingresoDineroDTO.getBanco()) {
			return ResponseEntity.badRequest().body("No se puede ingresar dinero desde cajeros de otras entidades.");
		}

		// Actualizar el saldo de la cuenta asociada a la tarjeta
		tarjetaService.actualizarSaldoCuenta(tarjeta, montoIngreso);

		return ResponseEntity.ok("Ingreso de dinero exitoso. Monto ingresado: " + montoIngreso);
	}
	

}
