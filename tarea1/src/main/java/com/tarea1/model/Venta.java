package com.tarea1.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "venta")
public class Venta {
	/*
	* 	Venta [Crear]
		-----------
		idVenta		: int
		fecha		: LocalDateTime
		idPersona	: Persona
		importe		: double*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_persona"))
	private Persona idPersona;
	
	@Column(name = "importe", nullable = false)
	private Double importe;
	
	@OneToMany(mappedBy = "idVenta", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<DetallesVenta> detallesVenta;//*/

	public Integer getIdVenta() {
		return idVenta;
	}

	public List<DetallesVenta> getDetallesVenta() {
		return detallesVenta;
	}

	public void setDetallesVenta(List<DetallesVenta> detallesVenta) {
		this.detallesVenta = detallesVenta;
	}//*/

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
