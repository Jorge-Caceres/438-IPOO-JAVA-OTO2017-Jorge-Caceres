package com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.polizas;

import java.util.ArrayList;
import java.util.List;

import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.asegurados.Asegurado;
import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.Beneficiario;
import com.jorgeCaceres.ipoo.segundoParcialJorgeCaceres.personas.BeneficiarioSeguro;

public class SeguroDeVida extends Poliza{

	private List <Asegurado> asegurado;
	private BeneficiarioSeguro beneficiarioSeguro;
	private List<BeneficiarioSeguro> beneficiarios;
	
	public SeguroDeVida(){
		
	}


	public SeguroDeVida(List<Asegurado> asegurado, BeneficiarioSeguro beneficiarioSeguro,
			List<BeneficiarioSeguro> beneficiarios) {
		super();
		this.asegurado = asegurado;
		this.beneficiarioSeguro = beneficiarioSeguro;
		this.beneficiarios = beneficiarios;
	}


	public BeneficiarioSeguro getBeneficiarioSeguro() {
		return beneficiarioSeguro;
	}

	

	public void setBeneficiarioSeguro(BeneficiarioSeguro beneficiarioSeguro) {
		this.beneficiarioSeguro = beneficiarioSeguro;
	}


	
	public void agregarBeneficiario(BeneficiarioSeguro beneficiario){
		
		beneficiarios = new ArrayList<BeneficiarioSeguro>();
		
		beneficiarios.add(beneficiario);
		
	}
	
	public void eliminarBeneficiario(BeneficiarioSeguro beneficiario){
		
		beneficiarios = new ArrayList<BeneficiarioSeguro>();
		beneficiarios.remove(beneficiario);
	}
	
	public void eliminarBeneficiario(long id){
		

		
		beneficiarios = new ArrayList<BeneficiarioSeguro>();
		
		for (BeneficiarioSeguro bs : beneficiarios){
			if (bs.getId() == id){
				beneficiarios.remove(bs);
			}
		}
	}


	public List<Asegurado> getAsegurado() {
		return asegurado;
	}


	public List<BeneficiarioSeguro> getBeneficiarios() {
		return beneficiarios;
	}


	public void setAsegurado(List<Asegurado> asegurado) {
		this.asegurado = asegurado;
	}


	public void setBeneficiarios(List<BeneficiarioSeguro> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}
	
}
