package com.jorgecaceres.ipoo.datos.proveedor;

public class Proveedor {
	
	private int id;
	private String nombre;
	private String descripcion;
	private Procedencia procedencia;
	
	public Proveedor(int id, String nombre, String descripcion, Procedencia procedencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.procedencia = procedencia;
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
	
	public Procedencia getProcedencia(){
		return procedencia;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setProcedencia(Procedencia procedencia){
		this.procedencia = procedencia;
	}
	
	

}
