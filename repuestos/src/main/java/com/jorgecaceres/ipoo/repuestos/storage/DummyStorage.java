package com.jorgecaceres.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.jorgecaceres.ipoo.repuestos.datos.cliente.Cliente;

public class DummyStorage implements Storage {
	
	//Lista de clientes
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		long id = 0;
		
		clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente();
		c1.setId(++id);
		c1.setNombre("Jorge");
		c1.setNroDoc("4787628");
		c1.setDireccion("Avenida 420");
		c1.setTipoDoc("CI");
		c1.setTelefono("021 962 343");
		c1.setPassword("123");
		
		//se agrega la instancia de Cliente al vector
		clientes.add(c1);
	}
	
	
	@Override
	public Cliente getCliente(String tipoDoc, String nroDoc, String password) {
		
		for (Cliente c: clientes){
			
			if(c.getTipoDoc().equals(tipoDoc) && c.getNroDoc().equals(nroDoc) && c.getPassword().equals(password)){
				
				return c;
				
			}
		}
		return null;
	}
}
