package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.vehiculos;

import java.util.Date;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros.Municipio;

public class Habilitacion {
    private Date fechaVencimiento;
    private Municipio municipio;
    
    public Habilitacion(){
    	
    }

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Habilitacion(Date fechaVencimiento, Municipio municipio) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.municipio = municipio;
	}
    
    

}
