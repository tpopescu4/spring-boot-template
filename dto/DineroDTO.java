package es.nextdigital.demo.dto;

public class DineroDTO {

    private String numeroTarjeta; // Número de la tarjeta desde la que se realizará el retiro
    private double monto; // Monto a retirar en la operación
    private int idCajero; // Identificador del cajero donde se realiza el retiro
    private String banco;
    
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}
	
	public DineroDTO(String numeroTarjeta, double monto, int idCajero) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.monto = monto;
		this.idCajero = idCajero;
	}

	

}

