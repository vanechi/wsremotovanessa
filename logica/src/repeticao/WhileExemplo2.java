package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo2 {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Email com @").toLowerCase();
		
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email com @").toLowerCase();
		}
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")));
		
	}

}
