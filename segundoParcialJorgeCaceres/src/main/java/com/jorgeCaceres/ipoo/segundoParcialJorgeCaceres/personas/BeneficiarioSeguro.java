package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas;

public class BeneficiarioSeguro {

	private long id;
	private int porcentaje;
	private TipoRelacion tipoRelacion;
	public BeneficiarioSeguro(long id, int porcentaje, TipoRelacion tipoRelacion) {
		super();
		this.id = id;
		this.porcentaje = porcentaje;
		this.tipoRelacion = tipoRelacion;
	}
	public long getId() {
		return id;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public TipoRelacion getTipoRelacion() {
		return tipoRelacion;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	public void setTipoRelacion(TipoRelacion tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}
	
	
	
}
