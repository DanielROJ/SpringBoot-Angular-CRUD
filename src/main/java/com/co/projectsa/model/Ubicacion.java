package com.co.projectsa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ubicacion")
public class Ubicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "longitud")
	private String longitud;
	
	@Column(name = "latitud")
	private String latitud;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_persona", nullable = false)
	
	private Persona idPersona;

	
	
	public Ubicacion() {
		super();
	}

	public Ubicacion(String longitud, String latitud, Persona idPersona) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
		this.idPersona = idPersona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}
	
	
	
	
	
	
	
}
