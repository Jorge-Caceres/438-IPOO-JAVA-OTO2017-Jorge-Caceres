package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

public class Componente {

	private long id;
	private String nombre;
	private String descripcion;
	
	public Componente(){
		
	}

	public Componente(long id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
