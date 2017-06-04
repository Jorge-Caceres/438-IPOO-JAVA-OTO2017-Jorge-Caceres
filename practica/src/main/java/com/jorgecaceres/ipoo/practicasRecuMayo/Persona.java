package com.jorgecaceres.ipoo.practicasRecuMayo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

	private int id;
	private String nombre;
	private String nroDoc;
	private String tipoDoc;
	private Date fechaNacimiento;
	
	public Persona(){
		
	}



	public Persona(int id, String nombre, String nroDoc, String tipoDoc, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDoc = nroDoc;
		this.tipoDoc = tipoDoc;
		this.fechaNacimiento = fechaNacimiento;
	}



	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String formatearFecha(Date fecha){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fec = sdf.format(fecha);
		
		return fec;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", nroDoc=" + nroDoc + ", tipoDoc=" + tipoDoc
				+ ", fechaNacimiento=" + formatearFecha(fechaNacimiento) + "]";
	}



	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
