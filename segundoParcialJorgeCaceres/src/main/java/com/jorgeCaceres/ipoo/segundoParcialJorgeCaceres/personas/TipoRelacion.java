package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas;

public class TipoRelacion {

	private int id;
	private String nombre;
	
	public TipoRelacion(){
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoRelacion(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
}
