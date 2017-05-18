package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

public class Mueble extends Item {

	private Componente componente;
	
	public Mueble(Componente componente) {
		super();
		this.componente = componente;
	}

	public Mueble(){
		
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
	
}
