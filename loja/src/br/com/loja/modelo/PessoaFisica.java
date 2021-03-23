package br.com.loja.modelo;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;
	
	public String getDocumentos() {
		return cpf + " - " + rg;
	}
	
	
	public PessoaFisica() {
		super();
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public PessoaFisica(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}



	public PessoaFisica(String nome, String email, String cpf, String rg) {
		super(nome, email);
		this.cpf = cpf;
		this.rg = rg;
	}



	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", " + super.toString() + "]";
	}
	
	
	
	
}
