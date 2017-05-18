package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class Pais {

	private int id;
	private String nombre;
	public Pais(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Pais(){}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombr(String nombr) {
		this.nombre = nombre;
	}
	
	
}
