package br.com.loja.modelo;

public class Fabricante {

	private String cnpj;
	private String razaoSocial;
	private String telefone;
	
	
	
	
	
	@Override
	public String toString() {
		return "Fabricante [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", telefone=" + telefone + "]";
	}



	public Fabricante() {
		super();
	}



	public Fabricante(String cnpj, String razaoSocial, String telefone) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getRazaoSocial() {
		return razaoSocial;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
