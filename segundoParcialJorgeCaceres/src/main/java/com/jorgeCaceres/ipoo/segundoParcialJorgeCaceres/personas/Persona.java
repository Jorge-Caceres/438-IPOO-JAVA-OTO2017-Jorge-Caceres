package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas;

import java.util.Date;

public class Persona {
	
	private String nombre;
	private String lugarNacimiento;
	private Date fechaNacimiento;
	private String nacionalidad;
	private String tipoDoc;
	private String nroDoc;
	private String direccion;
	private String telefono;
	private long id;
	
	public Persona(){
		
	}

	
	public Persona(String nombre, String lugarNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccion, String telefono, long id) {
		super();
		this.nombre = nombre;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	

}
