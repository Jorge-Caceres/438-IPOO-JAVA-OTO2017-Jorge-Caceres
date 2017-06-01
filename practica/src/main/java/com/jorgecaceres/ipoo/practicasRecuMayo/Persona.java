package com.jorgecaceres.ipoo.practicasRecuMayo;

public class Persona {

	private int id;
	private String nombre;
	private String nroDoc;
	private String tipoDoc;
	
	public Persona(){
		
	}

	public Persona(int id, String nombre, String nroDoc, String tipoDoc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDoc = nroDoc;
		this.tipoDoc = tipoDoc;
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

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", nroDoc=" + nroDoc + ", tipoDoc=" + tipoDoc + "]";
	}
	
	
}
