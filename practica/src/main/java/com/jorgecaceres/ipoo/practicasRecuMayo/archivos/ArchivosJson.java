package com.jorgecaceres.ipoo.practicasRecuMayo.archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jorgecaceres.ipoo.practicasRecuMayo.Persona;

public class ArchivosJson {
      
      private List<Persona> listaPersona;

      public ArchivosJson(){
    	  
      }
      
      public void copiar(String origen, String destino){
    	  
    	  //FileReader entrada = null;
    	  
    	  FileWriter salida = null;
    	  
    	  List<Persona> listaPersona = new ArrayList<Persona>();
    	  
    	  //listaPersona.add(new Persona(1, "Jorge Caceres", "444444", "CI"));
    	  //listaPersona.add(new Persona(2, "Diego Bonnin", "555555", "CI"));
    	  //listaPersona.add(new Persona(3, "Ariel Flores", "666666", "CI"));
    	  
    	  try{
    		  //entrada = new FileReader(origen);
    		  salida = new FileWriter(destino);
    		  int c =0;
    		  
    		  while (c<listaPersona.size()){
    			  String persona = listaPersona.get(c).toString();
    			  salida.write(persona);
    			  c++;
    			  System.out.println("Escribiendo: "+persona);
    		  }
    	  }catch(IOException ioe){
    		  System.out.println("Ocurrió un error al acceder a uno de los archivos: "+ ioe.getMessage());
    	  }finally{
    		  /*if(entrada != null){
    			  try{
    				  entrada.close();
    			  }catch(IOException e){
    				  System.out.println("No se pudo cerrar el archivo de origen: "+e.getMessage());
    			  }
    		}*/
    		  
    		  if(salida != null){
    			  try{
    				  salida.close();
    			  }catch(IOException _e){
    				  System.out.println("No se pudo cerrar el archivo de destino: "+_e.getMessage());
    			  }
    		  }
    	  }
      }
      
      public String leerArchivo(String archivo){
    	  FileReader entrada = null;
    	  
    	  char[] buffer = new char[1024];
    	  
    	  StringBuilder sb = new StringBuilder();
    	  
    	  try{
    		  entrada = new FileReader(archivo);
    		  
    		  while(entrada.read(buffer) > 0){
    			  sb.append(buffer);
    		  }
    	  }catch(IOException ioe){
    		  System.out.println("Ocurrión un error al acceder al archivo: "+ioe.getMessage());
    		  
    	  }finally{
    		  if(entrada!= null){
    			  try{
    				  entrada.close();
    			  }catch(IOException _ioe){
    				  System.out.println("No se pudo cerrar el archivo: "+_ioe.getMessage());
    			  }
    		  }
    	  }
    	  //trim es una función para eliminar espacios dentro del string
    	  return sb.toString().trim();
      }
      
      public void escribirArchivo(String archivo, String contenido){
    	  
    	  FileWriter salida = null;
    	  char[] buffer = contenido.toCharArray();
    	  
    	  try{
    		  salida = new FileWriter(archivo);
    		  salida.write(buffer, 0, buffer.length);
    		  
    	  }catch(IOException ioe){
    		  System.out.println("Hubo un error al acceder al archivo: "+ioe.getMessage());
    	  }finally{
    		  if(salida!=null){
    			  try{
    				  salida.close();
    			  }catch(IOException _ioe){
    				  System.out.println("Hubo un error al cerrar el archivo: "+_ioe.getMessage());
    			  }
    		  }
    	  }
      }
      
      
      public void testLecturaEscrituraObjeto(){
    	  
    	  List<Persona> listaPersona = new ArrayList<Persona>();
    	  
    	  listaPersona.add(new Persona(1, "Jorge Caceres", "444444", "CI", new Date()));
    	  listaPersona.add(new Persona(2, "Diego Bonnin", "555555", "CI", new Date()));
    	  listaPersona.add(new Persona(3, "Ariel Flores", "666666", "CI", new Date()));
    	  
    	  //System.out.println(listaPersona.get(1).toString());
    	  
    	  //Serializar en JSON, también se puede hacer XML, txt, etc
    	  ObjectMapper mapper = new ObjectMapper();
    	  
    	  String archivo = "C:\\Users\\Jorge Caceres\\Documents\\entrada.txt";
    	  
    	  try{
    		  String json = mapper.writeValueAsString(listaPersona);
    		  escribirArchivo(archivo, json);
    		  
    		  String jsonLeido = leerArchivo(archivo);
    		  System.out.println("Leído: "+jsonLeido);
    		  
  			List<Persona> otraInstancia=mapper.readValue(jsonLeido,  new TypeReference<List<Persona>>(){});
  			
  			String jsonOtraInstancia = mapper.writeValueAsString(otraInstancia);
  			
  			archivo = "C:\\Users\\Jorge Caceres\\Documents\\salida.txt";

  			escribirArchivo(archivo, jsonOtraInstancia);
    		  
    		  System.out.println("Otra instancia: "+otraInstancia);
    		  
    	  }catch(JsonProcessingException e){
    		  e.printStackTrace();
    		  System.out.println("Hubo un problema al convertir a Json");
    		  
    	  }catch(IOException e){
    		  
    		  e.printStackTrace();
    		  
    	  }
      }
      
      
      
      
      
      
    public static void main(String args[]){
         
         String origen ="C:\\Users\\Jorge Caceres\\Documents\\entrada.txt";
         String destino="C:\\Users\\Jorge Caceres\\Documents\\salida.txt";
         ArchivosJson a = new ArchivosJson();
         //a.copiar(origen, destino);
         a.testLecturaEscrituraObjeto();
    	
    }

}
