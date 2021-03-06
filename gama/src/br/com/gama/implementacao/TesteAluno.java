package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. Itaquera");
		endereco.setNumero("385");
		endereco.setComplemento("Viela 321");
		endereco.setBairro("Itaquera");
		endereco.setCidade("S?o Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-000");
		
		
		Aluno aluno = new Aluno();
		aluno.setEndereco(endereco);
		aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone"));
		aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula")));
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Email: " + aluno.getEmail());
		System.out.println("Fone: " + aluno.getFone());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Endere?o: " + aluno.getEndereco ());
	
		// ou
		
		Aluno aluno2 = new Aluno();
		aluno2.SetAll(
				endereco,
				JOptionPane.showInputDialog("Nome 2").toUpperCase(), 
				Integer.parseInt(JOptionPane.showInputDialog("Matricula 2")), 
				JOptionPane.showInputDialog("Email 2").toLowerCase(), 
				JOptionPane.showInputDialog("Fone 2")				
				);
		
		System.out.println(aluno2.toString());
		
	}
	
		
	
}
