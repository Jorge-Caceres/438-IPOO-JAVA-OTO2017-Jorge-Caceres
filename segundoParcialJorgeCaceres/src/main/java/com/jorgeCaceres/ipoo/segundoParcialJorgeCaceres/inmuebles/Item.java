package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

public class Item {
     private long id;
     private double valor;
     private String nombre;
     private String descripcion;
     
     public Item(){
    	 
     }

	public Item(long id, double valor, String nombre, String descripcion) {
		super();
		this.id = id;
		this.valor = valor;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public double getValor() {
		return valor;
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

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
     
     
	
}
