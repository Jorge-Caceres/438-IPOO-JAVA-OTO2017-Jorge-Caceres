package com.jorgecaceres.ipoo.practicas;

public class Asignaciones {
	
       private int a;
       
       private Integer objA;
	public void test(){
	      System.out.println("Valor de a: "+a);
	      System.out.println("Valor de objA: "+objA);
	      System.out.println("");
	}
	
	public static void maint (String args[]){
		Asignaciones a = new Asignaciones();
		a.test();
	}

	
}
