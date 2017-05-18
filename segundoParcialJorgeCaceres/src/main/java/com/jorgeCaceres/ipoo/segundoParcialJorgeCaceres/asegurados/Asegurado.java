package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.asegurados;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.Persona;

public class Asegurado extends Persona {
    
    private HistorialMedico historialMedico;
    private List <HistorialMedico> historial;
    
    public Asegurado(){
    	
    }

	public Asegurado(HistorialMedico historialMedico) {
		super();
		this.historialMedico = historialMedico;
	}

	public HistorialMedico getHistorialMedico() {
		return historialMedico;
	}

	public void setHistorialMedico(HistorialMedico historialMedico) {
		this.historialMedico = historialMedico;
	}
    
    

	public void agregarItem(HistorialMedico historialMedico){
	
		 historial = new ArrayList<HistorialMedico>();
	
		 historial.add(historialMedico);
		
		
	}
	
public void eliminarItem(long id){
	 historial = new ArrayList<HistorialMedico>();

		for (HistorialMedico h: historial){
			if (h.getId() == id){
				historial.remove(h);
			}
		}
	}
public void eliminarItem(HistorialMedico historialMedico){
	 historial = new ArrayList<HistorialMedico>();

			historial.remove(historialMedico);
		
	
}
}
