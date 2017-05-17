package com.jorgecaceres.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
		
		//se crea otro cliente de prueba
        Cliente c2 = new Cliente();
        c2.setId(++id);
        c2.setNombre("Ariel");
        c2.setNroDoc("123456");
        c2.setTipoDoc("CI");
        c2.setPassword("000000");
        
        //se agrega el cliente creado al ArrayList
        clientes.add(c2);
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
	
    public static void main(String args[]){
        
        Storage s = new DummyStorage();
        
        Cliente c = s.getCliente("CI", "4787628", "123");
        System.out.println( "¿Es NULL el cliente?"+(c==null));
        
        if(c != null){
        	System.out.println("El nombre del cliente es: "+c.getNombre());
            
        }else{
            System.out.println("No existe el cliente inicializado");
        }
        
        Cliente c2 = s.getCliente("CI", "123456", "000000");
        System.out.println("¿Es null el cliente? "+(c2==null));
        
        if(c2 != null){
        	System.out.println("El nombre del cliente buscado es: "+c2.getNombre());
        }else{
        	System.out.println("No existe el cliente");
        }
   }
}
