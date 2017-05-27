package com.jorgecaceres.ipoo.practicasRecuMayo;

import java.util.ArrayList;
import java.util.List;

public class PracticaArrays {
      private int [] arrayDeEnteros;
      private List<Integer> listaDeEnteros;
      
      
      public PracticaArrays(){
        arrayDeEnteros= new int[10];
        listaDeEnteros = new ArrayList<>();
      }
      
      public void testList(){
    	  System.out.println("Elementos que posee la lista: "+listaDeEnteros.size());
    	  int valor =0;
    	  int valorMaximo = 10;
    	  
    	  for(int i=0; i<valorMaximo; i++){
    		  valor++;
    		  listaDeEnteros.add(valor);
    		  
    		  
    	  }
    	  
    	  for(Integer lista: listaDeEnteros){
    		  System.out.println(lista);
    	  }
    	  
    	  listaDeEnteros.remove(5);
    	  Integer i = listaDeEnteros.get(2);
    	  listaDeEnteros.remove(i);
    	  System.out.println("******************************");
    	  for(Integer lista: listaDeEnteros){
    		  System.out.println(lista);
    	  }
    	  listaDeEnteros.clear();
    	  System.out.println("Elementos que posee la lista: "+listaDeEnteros.size());
      }
      
      public static void main(String args[]){
    	  PracticaArrays pa = new PracticaArrays();
    	  pa.test();
    	  pa.testList();
      }
      
      private void test() {
          int  valor = 20;
    	  for(int i=0; i< arrayDeEnteros.length; i++){
    		  valor++;
    		  System.out.println("Asignando: "+valor+" a posición: "+i);
    		  arrayDeEnteros[i] = valor; 
      }
    	  
    	  for(int i=0; i<arrayDeEnteros.length;i++){
    		  System.out.println("arrayDeEnteros["+i+"]: "+ arrayDeEnteros[i]);
    	  }
      }
      

}
