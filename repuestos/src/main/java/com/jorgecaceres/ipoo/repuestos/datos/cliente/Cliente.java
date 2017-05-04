package com.jorgecaceres.ipoo.repuestos.datos.cliente;

public class Cliente {

	//constructor por defecto
	public Cliente(){
		
	}
	
	
	private Long id;
	private String nroDoc;
	private String tipoDoc;
	private String nombre;
	private String direccion;
	private String telefono;
	private String password;
	
	
	
	
	//GETTERS Y SETTERS
	public Long getId() {
		return id;
	}
	public String getNroDoc() {
		return nroDoc;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Constructor
		public Cliente(Long id, String nroDoc, String tipoDoc, String nombre, String direccion, String telefono,
				String password) {
			super();
			this.id = id;
			this.nroDoc = nroDoc;
			this.tipoDoc = tipoDoc;
			this.nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
			this.password = password;
		}
	
}
