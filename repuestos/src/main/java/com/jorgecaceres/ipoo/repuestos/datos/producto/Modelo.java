package com.jorgecaceres.ipoo.repuestos.datos.producto;

public class Modelo {

	private int id;
	private String nombre;
	private String descripcion;
	private Marca marca;
	

	public Modelo(int id, String nombre, String descripcion, Marca marca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
