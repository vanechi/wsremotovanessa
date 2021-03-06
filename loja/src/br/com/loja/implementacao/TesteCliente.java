package br.com.loja.implementacao;

import javax.swing.JOptionPane;

import br.com.loja.modelo.Cliente;
import br.com.loja.modelo.PessoaFisica;
import br.com.loja.modelo.PessoaJuridica;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		if (JOptionPane.showInputDialog
				("Digite <F> para f?sica ou qq coisa para Juridica").toUpperCase().contentEquals("F")) {
			
			cliente = new PessoaFisica(
					"NOME PF",
					"EMAIL@PF.COM.BR",
					"12345678900",
					"111111-x"					
					);			
		} else {
			cliente = new PessoaJuridica(
					"NOME PJ",
					"EMAIL@PJ.COM.BR",
					"12345678900/55",
					"CONTATO",
					"123.123.123"	
					);
			
		}
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
		
	}
	
	
}
