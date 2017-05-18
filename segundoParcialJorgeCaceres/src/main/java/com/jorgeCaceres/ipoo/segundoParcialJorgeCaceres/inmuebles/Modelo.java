package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

public class Modelo {
    private Marca marca;
    private long id;
    private String nombre;
    private String descripcion;
    
    public Modelo(){
    	
    }

	public Modelo(Marca marca, long id, String nombre, String descripcion) {
		super();
		this.marca = marca;
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Marca getMarca() {
		return marca;
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

	public void setMarca(Marca marca) {
		this.marca = marca;
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
