package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao4 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero 2: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero 3: "));

		if (valor1==valor2 || valor2==valor3 || valor1==valor3) {
			System.out.println("Existem n�meros iguais");
		}else {
			if (valor1>valor2 && valor1>valor3) {
				System.out.println(valor1);
				if (valor2>valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
			}else if(valor2>valor1 && valor2>valor3) {
				System.out.println(valor2);
				if (valor1>valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);
				}
			}else {
				System.out.println(valor3);
				if (valor2>valor1) {
					System.out.println(valor2);
					System.out.println(valor1);
				}else {
					System.out.println(valor1);
					System.out.println(valor2);
				}
			}

		}
	}
}
