package es.nextdigital.demo.models;

import jakarta.persistence.*;;

@Entity
@Table(name = "tarjeta")
public class TarjetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroTarjeta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cuenta", nullable = false)
    private CuentaModel cuenta;

    @Column(nullable = false)
    private boolean tipoTarjeta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public CuentaModel getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaModel cuenta) {
		this.cuenta = cuenta;
	}

	

    
}