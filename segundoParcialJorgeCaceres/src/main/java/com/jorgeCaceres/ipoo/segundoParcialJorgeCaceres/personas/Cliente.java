package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros.LugarTrabajo;

public class Cliente extends Persona {

	private LugarTrabajo lugarTrabajo;
	
	public Cliente(){
		
		
	}

	public Cliente(LugarTrabajo lugarTrabajo) {
		super();
		this.lugarTrabajo = lugarTrabajo;
	}

	public LugarTrabajo getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(LugarTrabajo lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
}
