package com.jorgecaceres.ipoo.repuestos.datos.producto;

import java.awt.Image;

import com.jorgecaceres.ipoo.datos.proveedor.Proveedor;

public class Producto {


	private Long id;
	private String nombre;
	private String descripcion;
	private byte imagen;
	private double precio;
	private Modelo modelo;
	private Proveedor proveedor;
	
	public Producto(Long id, String nombre, String descripcion, byte imagen, double precio, Modelo modelo, Proveedor proveedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.modelo = modelo;
		this.proveedor = proveedor;
	}
	
	
	public Producto(){
		
	}
		
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public byte getImagen() {
		return imagen;
	}
	public double getPrecio() {
		return precio;
	}
	
	public Modelo getModelo(){
		return modelo;
	}
	
	public Proveedor getProveedor(){
		return proveedor;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setModelo(Modelo modelo){
		this.modelo = modelo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setImagen(byte imagen) {
		this.imagen = imagen;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setProveedor(Proveedor proveedor){
		this.proveedor = proveedor;
	}
	


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + "]";
	}
	
}
