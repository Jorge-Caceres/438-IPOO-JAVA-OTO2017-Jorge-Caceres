package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class Departamento {
     private int id;
     private String nombre;
     
     public Departamento(){
    	 
    	 
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

	public Departamento(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
     
     
}
