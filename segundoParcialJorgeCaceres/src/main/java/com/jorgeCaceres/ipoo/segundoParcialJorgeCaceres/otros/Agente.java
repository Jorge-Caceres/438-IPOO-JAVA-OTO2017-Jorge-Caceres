package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class Agente {

	private long id;
	private String usuario;
	private String contraseña;
	
	public Agente(){
		
	}

	public Agente(long id, String usuario, String contraseña) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public long getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
