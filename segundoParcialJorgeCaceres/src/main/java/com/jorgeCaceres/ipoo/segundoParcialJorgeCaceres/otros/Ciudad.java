package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class Ciudad {
	
	private int id;
	private String nombre;
	private Departamento departamento;
	
	public Ciudad(){
		
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Ciudad(int id, String nombre, Departamento departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
	}
	
	

}
