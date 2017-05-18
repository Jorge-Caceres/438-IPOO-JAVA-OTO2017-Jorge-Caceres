package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.asegurados;

public class Medico {
    private long id;
    private String nombre;
    
    public Medico(){
    	
    }

	public Medico(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
	
}
