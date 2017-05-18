package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.polizas;

public class Opcion {

	private long id;
	private String nombre;
	private String descripcion;
	private int porcentajeCobertura;
	private double importeCobertura;
	
	public Opcion(){
		
	}

	public Opcion(long id, String nombre, String descripcion, int porcentajeCobertura, double importeCobertura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.porcentajeCobertura = porcentajeCobertura;
		this.importeCobertura = importeCobertura;
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

	public int getPorcentajeCobertura() {
		return porcentajeCobertura;
	}

	public double getImporteCobertura() {
		return importeCobertura;
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

	public void setPorcentajeCobertura(int porcentajeCobertura) {
		this.porcentajeCobertura = porcentajeCobertura;
	}

	public void setImporteCobertura(double importeCobertura) {
		this.importeCobertura = importeCobertura;
	}
}
