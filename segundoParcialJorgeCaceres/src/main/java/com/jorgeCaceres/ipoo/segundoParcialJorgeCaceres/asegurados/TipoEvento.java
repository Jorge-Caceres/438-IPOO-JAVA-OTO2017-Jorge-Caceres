package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.asegurados;

public class TipoEvento {
    
	    private int id;
	    private String nombre;
	    
	    public TipoEvento(){}

		public int getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public TipoEvento(int id, String nombre) {
			super();
			this.id = id;
			this.nombre = nombre;
		};
	    
	    
}
