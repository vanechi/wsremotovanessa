package br.com.bancofoz.beans;

import br.com.bancofoz.util.PadraoBasico;

public class Corrente extends Conta implements PadraoBasico {

	private float limite;
	private float taxa;
	
	
	
	public boolean sacar(float valor) {
		if ((getSaldo()+limite)>=valor) {
			setSaldo(getSaldo()-valor);
			return true;
		}
			return false;
	}

	public void debitarTaxa() {
		setSaldo(getSaldo()-taxa);
	}
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
	}
	
	
	
	
	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}


	public float getTaxa() {
		return taxa;
	}





	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}





	public Corrente() {
		super();
	}


	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}





	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + super.toString() + " ]";
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
