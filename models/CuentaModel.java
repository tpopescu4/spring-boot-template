package es.nextdigital.demo.models;

import jakarta.persistence.*;

@Entity
@Table (name = "cuenta")
public class CuentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroCuenta;
    
    @Column(nullable = false)
    private String banco;
    
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private double saldo;

    @Column(nullable = false)
    private boolean tipoCuenta;// TRUE = CREDITO FALSE = DEBITO

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public boolean isTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(boolean tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}



}