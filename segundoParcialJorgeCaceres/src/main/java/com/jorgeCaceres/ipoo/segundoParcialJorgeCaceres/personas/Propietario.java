package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles.Inmueble;
import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.vehiculos.Vehiculo;

public class Propietario extends Persona {

	private Inmueble inmueble;
	private Vehiculo vehiculo;
	
     public Propietario(){
    	 
     }

	public Propietario(Inmueble inmueble, Vehiculo vehiculo) {
		super();
		this.inmueble = inmueble;
		this.vehiculo = vehiculo;
		
	}
     
     
     
     
}
