package br.com.bancofoz.beans;

import br.com.bancofoz.util.PadraoBasico;

public class Cliente implements PadraoBasico{

	private int id;
	private String nome;
	private String cpf;
	private String fone;
	
		
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String cpf, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", fone=" + fone + "]";
	}

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
