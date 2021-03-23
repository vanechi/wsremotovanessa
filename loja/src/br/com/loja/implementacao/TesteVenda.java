package br.com.loja.implementacao;

import br.com.loja.modelo.Cliente;
import br.com.loja.modelo.Fabricante;
import br.com.loja.modelo.Produto;
import br.com.loja.modelo.Venda;

public class TesteVenda {

	
	public static void main(String[] args) {
		
	
		Venda venda = new Venda (
			123,
			1000,
			new Cliente(
					"Xpto",
					"xpto@xpto.com"
					),
			new Produto(
					1,
					"churros",
					new Fabricante(	
							"123456789",
							"churrolandia",
							"1234-5678"
							),
					10,
					5,1000
					)
			);
			
			
		
		System.out.println(venda.toString());
		System.out.println("Resumo: " + venda.getResumo());
		System.out.println("Total Estoque Venda: " + venda.getProduto().totalEstoqueVenda());
		System.out.println("Total Estoque Compra: " + venda.getProduto().totalEstoqueCompra());
		
				
	}
	
}
