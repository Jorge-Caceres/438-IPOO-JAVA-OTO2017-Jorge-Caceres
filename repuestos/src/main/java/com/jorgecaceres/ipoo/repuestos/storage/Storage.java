package com.jorgecaceres.ipoo.repuestos.storage;

import com.jorgecaceres.ipoo.repuestos.datos.cliente.Cliente;

public interface Storage {

	Cliente getCliente(String tipoDoc, String nroDoc, String password);
	
}
