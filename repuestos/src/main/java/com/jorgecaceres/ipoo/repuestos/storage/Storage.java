package com.jorgecaceres.ipoo.repuestos.storage;

import com.jorgecaceres.ipoo.repuestos.datos.cliente.Cliente;

public interface Storage {
      //se implementa el método 	
      Cliente getCliente(String tipoDoc, String nroDoc, String password);
	
}
