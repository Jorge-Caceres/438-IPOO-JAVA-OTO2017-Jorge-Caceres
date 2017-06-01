package com.jorgecaceres.ipoo.practicasRecuMayo.archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jorgecaceres.ipoo.practicasRecuMayo.Persona;

public class Archivo {

	private List<Persona> listaPersona;
	
	
	public void escribirArchivo(String origen, String destino){
		//FileInputStream entrada = null;
		//FileOutputStream salida= null;
		//FileReader entrada = null;
		//FileWriter salida = null;
		FileReader entrada = null;
		FileWriter salida = null;
		listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona(1, "Jorge Cáceres", "4787628", "C.I."));
		listaPersona.add(new Persona(2, "Ariel Flores", "4787627", "C.I."));
		listaPersona.add(new Persona(3, "Ariel Cáceres", "4787629", "C.I."));

		

		
		try{
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);
			int i=0;
				while(i<listaPersona.size()){
					String personaP = listaPersona.get(i).toString();
					salida.write(personaP);
					System.out.println(personaP);
					i++;
				}
				
				ObjectMapper mapper = new ObjectMapper();
				mapper.writeValue(salida, Persona.class);

			}catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}finally{
				
				try {
					salida.close();
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
	
	public static void main(String[] args) {
		Archivo a = new Archivo();
		String origen ="C:\\Users\\Jorge Caceres\\Documents\\entrada.txt";
		String destino="C:\\Users\\Jorge Caceres\\Documents\\salida.txt";
		a.escribirArchivo(origen, destino);
		

	}

}
