package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

public class Electrodomestico extends Item {

	private String nroSerie;
	private Modelo modelo;
	
	public Electrodomestico(){
		
	}

	public Electrodomestico(String nroSerie, Modelo modelo) {
		super();
		this.nroSerie = nroSerie;
		this.modelo = modelo;
	}

	public String getNroSerie() {
		return nroSerie;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setNroSerie(String nroSerie) {
		this.nroSerie = nroSerie;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	
	
	
}
