package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao3 {

	public static void main(String[] args) {
		
		String oper = JOptionPane.showInputDialog("Informe a Opera??o Aritm?tica (Adi??o A, Subtra??o S, Multiplica??o M, Divis?o D: ").toUpperCase();
		byte num1 = Byte.parseByte(JOptionPane.showInputDialog("Informe o n?mero 1: "));
		byte num2 = Byte.parseByte(JOptionPane.showInputDialog("Informe o n?mero 2: "));
		
		if (oper.equals("A")) {
			System.out.println("Adi??o: " + (num1 + num2));
		} else if (oper.equals("S")) {
			System.out.println("Subtra??o: " + (num1 - num2));
		} else if (oper.equals("M")) {
			System.out.println("Multiplica??o: " + (num1 * num2));
		} else {
			System.out.println("Divis?o: " + (num1 / num2));
		}
		
		
	}
	
}
