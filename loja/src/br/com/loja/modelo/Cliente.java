package br.com.loja.modelo;

public class Cliente {

	private String nome;
	private String email;
	
	public String getDocumentos() {
		return null;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}



	public Cliente() {
		super();
	}



	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	
	
}
