package es.nextdigital.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "moves")
public class MovimientoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double monto;

    @Column(nullable = false)
    private String tipoMovimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta", nullable = false)
    private CuentaModel cuenta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public CuentaModel getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaModel cuenta) {
		this.cuenta = cuenta;
	}

    
}
