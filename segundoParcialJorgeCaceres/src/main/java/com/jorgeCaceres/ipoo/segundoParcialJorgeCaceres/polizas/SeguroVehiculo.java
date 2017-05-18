package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.polizas;

import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.vehiculos.Vehiculo;

public class SeguroVehiculo extends Poliza{

	private Opcion opcion;
	private Vehiculo vehiculo;
	private List<Opcion> opcionList;
	
	public SeguroVehiculo(Opcion opcion, Vehiculo vehiculo) {
		super();
		this.opcion = opcion;
		this.vehiculo = vehiculo;
	}


	public SeguroVehiculo(){
		
	}


	public Opcion getOpcion() {
		return opcion;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void agregarOpcion(Opcion opcion){
		opcionList = new ArrayList<Opcion>();
		
		opcionList.add(opcion);
		
	}
	
	public void eliminarOpcion(Opcion opcion){
		opcionList = new ArrayList<Opcion>();

		opcionList.remove(opcion);
	}
		
	public void eliminarOpcion(long id){
		
		opcionList = new ArrayList<Opcion>();
		
		for(Opcion o: opcionList){
			if (o.getId() == id){
				opcionList.remove(o);
			}
		}
	}
	
}
