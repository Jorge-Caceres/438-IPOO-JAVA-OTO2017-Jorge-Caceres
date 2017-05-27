package com.jorgecaceres.ipoo.practicasRecuMayo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Asignaciones {
    //variable para números pequeños hasta 32.767
    private short _short;
    //variable de tipo int para números hasta 2 a la 31
    private int _int;
    //variable de tipo long para números hasta 2 a la 63
    private long _long;
    //variable de tipo double, 
    private double _double;
    //variable de float, números decimales hasta 2.000.000.000
    private float _float;
    
    private boolean booleano;
    
    private char _char;
    
    private String _string;
    
    private Date _date;
    
    
     
    
    
    
    public Asignaciones(){
    
    
    }
    
    public void test() {
    	System.out.println("****MÉTODO TEST****");
    	_short = 1;
    	_int = 20;
    	_long = 50L;

    	imp("_short", _short+"");
    	imp("_long", _long+"");
    	imp("_int", _int+"");
    	
    	_short +=5;
    	_int +=5;
    	_long +=5;
    	

    	System.out.println("\nVariables después de sumarles 5");
    	imp("_short", _short+"");
    	imp("_long", _long+"");
    	imp("_int", _int+"");
    	
    	_float = 6.0f;
    	_double = 7.0d;
    	
    	imp("_float", _float+"");
    	imp("_double", _double+"");
    	
    	_char = 'A';
    	_string = "AAA";
    	
    	imp("_char",_char+"");
    	imp("_string", _string+"");
    	
    	_char = 'D';
    	imp("_char", _char+"");
    	
    	_string = "BBB";
    	imp("_string", _string+"");
    	
    	booleano = true;
    	imp("booleano", booleano+"");
    	
    	booleano = false;
    	imp("booleano",booleano+"");
    	
    	_date = new Date();
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	imp("_date", sdf.format(_date));
    	
    	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/M/yyyy HH:mm:ss");
    	imp("_date", sdf2.format(_date));
    	
    	_date = new Date();
    	imp("_date", _date+"");
    	
    	try{
    	_date = sdf.parse("05/05/2017");
    	}catch(ParseException pe){
    		
    	}
    	imp("_date", _date+"");
    	
    }
    
    private void imp(String variable, String valor){
    	
    	System.out.println("Valor "+ variable+": "+valor);
    }
    
    public static void main(String args[]){
    	//se instancia el objeto Asignaciones
    	Asignaciones a = new Asignaciones();
    	
    	a.test();
    	
    }
}
