package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Informe o nome do Produto - ex. notebook:");
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do imposto - Porcentagem:"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unit?rio:"));
		
		float imposto = valor * (porcentagem/100);
		
		System.out.println("Valor com o imposto..: " + (valor+imposto));
		System.out.println("Valor do imposto.....: " + imposto);
		System.out.println("Total com imposto....: " + (valor+imposto)*qtde);
		System.out.println("Total sem imposto....: " + (valor*qtde));
		
		
		
	}
	
}
