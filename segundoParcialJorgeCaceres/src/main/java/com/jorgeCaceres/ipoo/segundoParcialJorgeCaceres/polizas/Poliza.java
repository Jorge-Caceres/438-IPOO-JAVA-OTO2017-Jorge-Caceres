package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.polizas;

import java.util.Date;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.otros.*;
import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.Cliente;

public class Poliza {

	private long id;
	private Date fechaHoraEmision;
	private Date fechaInicio;
	private Date fechaFin;
	private double capitalAsegurado;
	private double importeTotal;
	private double cuota;
	private Date fechaVencimiento;
	private Cliente cliente;
	private Agente agente;
	private AccesoAgente accesoAgente;
	
	public Poliza(){
		
	}
	public Poliza(long id, Date fechaHoraEmision, Date fechaInicio, Date fechaFin, double capitalAsegurado,
			double importeTotal, double cuota, Date fechaVencimiento, Cliente cliente, Agente agente,
			AccesoAgente accesoAgente) {
		super();
		this.id = id;
		this.fechaHoraEmision = fechaHoraEmision;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.capitalAsegurado = capitalAsegurado;
		this.importeTotal = importeTotal;
		this.cuota = cuota;
		this.fechaVencimiento = fechaVencimiento;
		this.cliente = cliente;
		this.agente = agente;
		this.accesoAgente = accesoAgente;
	}
	public long getId() {
		return id;
	}
	public Date getFechaHoraEmision() {
		return fechaHoraEmision;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public double getCapitalAsegurado() {
		return capitalAsegurado;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public double getCuota() {
		return cuota;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Agente getAgente() {
		return agente;
	}
	public AccesoAgente getAccesoAgente() {
		return accesoAgente;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFechaHoraEmision(Date fechaHoraEmision) {
		this.fechaHoraEmision = fechaHoraEmision;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public void setCapitalAsegurado(double capitalAsegurado) {
		this.capitalAsegurado = capitalAsegurado;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	public void setAccesoAgente(AccesoAgente accesoAgente) {
		this.accesoAgente = accesoAgente;
	}
	
	
	
}
