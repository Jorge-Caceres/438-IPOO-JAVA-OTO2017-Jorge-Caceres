package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.asegurados;

import java.util.Date;
import java.util.List;

public class HistorialMedico {
     
     private long id;
     private Date fecha;
     private TipoEvento tipoEvento;
     private LocalDeSalud localDeSalud;
     private Medico medico;
     public HistorialMedico(){
    	 
    	 
     }

	public long getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public LocalDeSalud getLocalDeSalud() {
		return localDeSalud;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public void setLocalDeSalud(LocalDeSalud localDeSalud) {
		this.localDeSalud = localDeSalud;
	}

	public HistorialMedico(long id, Date fecha, TipoEvento tipoEvento, LocalDeSalud localDeSalud, Medico medico) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.tipoEvento = tipoEvento;
		this.localDeSalud = localDeSalud;
		this.medico = medico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	
     
     
}
