package br.com.caicai.teste;

import javax.swing.JOptionPane;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		//Instanciando um objeto
				Elevador objeto = new Elevador ();
				objeto.inicializar("Torre B", (byte)20, (byte)10, (byte)0);
				objeto.subir();
				objeto.subir();
				objeto.entrar((byte)5);
				System.out.println(objeto.toString());
				objeto.descer();
				objeto.sair((byte)2);
				objeto.descer();
				objeto.descer();
				System.out.println(objeto.toString());
		
		
		
		
		
		
	}
	
	
}
