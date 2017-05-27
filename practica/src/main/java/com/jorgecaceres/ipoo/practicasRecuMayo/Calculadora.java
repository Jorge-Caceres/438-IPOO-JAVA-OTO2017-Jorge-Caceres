package com.jorgecaceres.ipoo.practicasRecuMayo;

public class Calculadora {
     public int sumar(int sumando1, int sumando2){
    	 
    	 int suma = sumando1 + sumando2;
    	 return suma;
     }
     
     public int restar(int minuendo, int sustraendo){
    	 int resta = minuendo - sustraendo;
    	 return resta;
     }
     
     public int multiplicar(int multiplicando, int multiplicador){
    	 int producto = multiplicando * multiplicador;
    	 return producto;
    	 
     }
     
     public int dividir(int dividendo, int divisor){
    	 int cociente = dividendo / divisor;
    	 return cociente;
     }
     
     public Calculadora(){
    	 
     }
     
     

public static void main(String args[]){
	Calculadora c = new Calculadora();
	int a = 5;
	int b= 3;
	
	System.out.println("La suma es: "+c.sumar(a, b));
	System.out.println("La resta es: "+c.restar(a, b));
	System.out.println("La multiplicación es: "+c.multiplicar(a, b));
	System.out.println("La división es: "+c.dividir(a, a));
	
}
}