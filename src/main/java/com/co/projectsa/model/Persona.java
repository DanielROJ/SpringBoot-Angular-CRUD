package com.co.projectsa.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "identificacion")
	private long identificacion;
	
	@OneToMany(mappedBy = "idPersona",cascade = CascadeType.ALL)
	private Set<Ubicacion> listUbicacion;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, long identificacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	
	
	
	
	
	
}
