package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros;

public class LugarTrabajo {
	
	private String puesto;
	private double ingresos;
	private int antiguedad;
	private Empresa empresa;
	
	public LugarTrabajo(){
		
	}

	public String getPuesto() {
		return puesto;
	}

	public double getIngresos() {
		return ingresos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public LugarTrabajo(String puesto, double ingresos, int antiguedad, Empresa empresa) {
		super();
		this.puesto = puesto;
		this.ingresos = ingresos;
		this.antiguedad = antiguedad;
		this.empresa = empresa;
	}
	
	

}
