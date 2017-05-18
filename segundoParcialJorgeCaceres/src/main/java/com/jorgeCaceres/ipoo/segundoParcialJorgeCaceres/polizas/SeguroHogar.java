package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.polizas;

import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles.Inmueble;

public class SeguroHogar extends Poliza {

	private List <Inmueble> inmueble;
	private Opcion opcion;
	private List<Opcion> opcionList;
	

	public Opcion getOpcion() {
		return opcion;
	}
	
	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
	
	public SeguroHogar(List<Inmueble> inmueble, Opcion opcion, List<Opcion> opcionList) {
		super();
		this.inmueble = inmueble;
		this.opcion = opcion;
		this.opcionList = opcionList;
	}

	public SeguroHogar(){
		
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
		
		for(Opcion o: opcionList){
		
			if (o.getId() == id){
			
				opcionList.remove(opcion);
			}
		}
	}

	public List<Inmueble> getInmueble() {
		return inmueble;
	}

	public List<Opcion> getOpcionList() {
		return opcionList;
	}

	public void setInmueble(List<Inmueble> inmueble) {
		this.inmueble = inmueble;
	}

	public void setOpcionList(List<Opcion> opcionList) {
		this.opcionList = opcionList;
	}
}
