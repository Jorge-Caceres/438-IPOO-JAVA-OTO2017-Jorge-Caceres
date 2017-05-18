package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.inmuebles;

import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.Propietario;

public class Inmueble {
     private long id;
     private String cuentaCatastral;
     private String direccion;
     private String caracteristicas;
     private double valorTerreno;
     private double valorEdificio;
     private Item item;
     private List <Item> itemList;
     
     private List <Propietario> propietario;
     
     

	public Inmueble(long id, String cuentaCatastral, String direccion, String caracteristicas, double valorTerreno,
			double valorEdificio, Item item, List<Item> itemList, List<Propietario> propietario) {
		super();
		this.id = id;
		this.cuentaCatastral = cuentaCatastral;
		this.direccion = direccion;
		this.caracteristicas = caracteristicas;
		this.valorTerreno = valorTerreno;
		this.valorEdificio = valorEdificio;
		this.item = item;
		this.itemList = itemList;
		this.propietario = propietario;
	}

	public Inmueble(){
    	 
     }

	public long getId() {
		return id;
	}

	public String getCuentaCatastral() {
		return cuentaCatastral;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public double getValorTerreno() {
		return valorTerreno;
	}

	public double getValorEdificio() {
		return valorEdificio;
	}

	public Item getItem() {
		return item;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCuentaCatastral(String cuentaCatastral) {
		this.cuentaCatastral = cuentaCatastral;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public void setValorTerreno(double valorTerreno) {
		this.valorTerreno = valorTerreno;
	}

	public void setValorEdificio(double valorEdificio) {
		this.valorEdificio = valorEdificio;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public void agregarItem(Item i){
		itemList = new ArrayList<Item>();
		itemList.add(i);
	}
	
	public void eliminarItem(Item i){
		itemList = new ArrayList<Item>();

		itemList.remove(i);
	}
	
	public void eliminarItem(long id){
		itemList = new ArrayList<Item>();

		for (Item i: itemList){
			if (i.getId() == id){
				itemList.remove(i);
			}
		}
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
     
     
     
}
