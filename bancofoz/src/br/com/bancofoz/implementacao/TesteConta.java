package br.com.bancofoz.implementacao;

import br.com.bancofoz.beans.Cliente;
import br.com.bancofoz.beans.Conta;
import br.com.bancofoz.beans.Corrente;
import br.com.bancofoz.beans.Poupanca;
import br.com.bancofoz.util.Magica;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
			Magica.i("ID"),
			Magica.s("Nome"),
			Magica.s("CPF"),
			Magica.s("Fone")
		);
		
		Conta conta = new Conta();
		if (Magica.b("Abrir conta corrente?")==true) {
			conta = new Corrente (
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
						
		} else {
			conta = new Poupanca (
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Rendimento")
					);
		}
		
		System.out.println(conta.toString());
		System.out.println(conta.sacar(1000));
		System.out.println("ap?s sacar: " + conta.verificarSaldo());
		System.out.println(conta.depositar(1550));
		System.out.println("ap?s depositar: " + conta.verificarSaldo());
		
		/*
		if (conta instanceof Corrente) {
			((Corrente) conta).aumentarLimite(15);
			System.out.println("Limite: " + ((Corrente) conta).getLimite());			
		} else if (conta instanceof Poupanca) {
			((Poupanca) conta).creditarRendimentos();
			System.out.println("Saldo ap?s creditar rendimento: " + conta.verificarSaldo());
		}
		
		*/
		conta.creditarRendimento();
		System.out.println(conta.verificarSaldo());
		
		
	}
		
	
}
