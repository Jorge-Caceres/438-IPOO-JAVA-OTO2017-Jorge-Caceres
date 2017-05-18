package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class Municipio {

	private long id;
	private String nombre;
	private Ciudad ciudad;
	
	public Municipio(){
		
		
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Municipio(long id, String nombre, Ciudad ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	
}
