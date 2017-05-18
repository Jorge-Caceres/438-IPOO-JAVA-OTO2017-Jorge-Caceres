package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.vehiculos;

import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros.Pais;
import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.Propietario;

public class Vehiculo {

	private String nroChasis;
	private int año;
    private String chapa;
    private double kilometraje;
    private String color;
    private Habilitacion habilitacion;
    private CedulaVerde cedulaVerde;
    private Pais paisProcedencia;
    private List<Propietario> propietario;
    
    public Vehiculo(){
    	
    }





	public Vehiculo(String nroChasis, int año, String chapa, double kilometraje, String color,
			Habilitacion habilitacion, CedulaVerde cedulaVerde, Pais paisProcedencia, List<Propietario> propietario) {
		super();
		this.nroChasis = nroChasis;
		this.año = año;
		this.chapa = chapa;
		this.kilometraje = kilometraje;
		this.color = color;
		this.habilitacion = habilitacion;
		this.cedulaVerde = cedulaVerde;
		this.paisProcedencia = paisProcedencia;
		this.propietario = propietario;
	}





	public String getNroChasis() {
		return nroChasis;
	}

	public int getAño() {
		return año;
	}

	public String getChapa() {
		return chapa;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setNroChasis(String nroChasis) {
		this.nroChasis = nroChasis;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setChapa(String chapa) {
		this.chapa = chapa;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public Habilitacion getHabilitacion() {
		return habilitacion;
	}



	public CedulaVerde getCedulaVerde() {
		return cedulaVerde;
	}



	public void setHabilitacion(Habilitacion habilitacion) {
		this.habilitacion = habilitacion;
	}



	public void setCedulaVerde(CedulaVerde cedulaVerde) {
		this.cedulaVerde = cedulaVerde;
	}



	public Pais getPaisProcedencia() {
		return paisProcedencia;
	}



	public void setPaisProcedencia(Pais paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}



	
public void agregarPropietario(Propietario p){
		
		propietario = new ArrayList<Propietario>();
		
		propietario.add(p);
		
	}
	
	public void eliminarPropietario(Propietario p){
		propietario = new ArrayList<Propietario>();
		propietario.remove(p);
	}
	
public void eliminarPropietario(long id){
	
		
		propietario = new ArrayList<Propietario>();
		
		
		
		for (Propietario p: propietario){
			if (p.getId() == id){
				propietario.remove(p);
			}
		}
	}





public List<Propietario> getPropietario() {
	return propietario;
}





public void setPropietario(List<Propietario> propietario) {
	this.propietario = propietario;
}
    
    
	
}
