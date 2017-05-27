package com.jorgecaceres.ipoo.practicasRecuMayo;

public class PracticaArrays {
      private int [] arrayDeEnteros;
      
      public PracticaArrays(){
        arrayDeEnteros= new int[10];
      }
      
      public static void main(String args[]){
    	  PracticaArrays pa = new PracticaArrays();
    	  pa.test();
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
