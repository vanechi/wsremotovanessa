package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao1 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		int cont=0;
		String resp = "";
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 1"));
		
		do {		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero digitado anteriormente:"));
		cont = cont+1;
		
		if (numero2 > numero1) {
			System.out.println("Voc� digitou um n�mero maior " );
		} else if (numero2 < numero1) {
			System.out.println("Voc� digitou um numero menor " );
		} else {
			System.out.println("Parab�ns, voc� acertou na tentativa de n�mero " + cont);
			resp = "acertou";
		} 
		
		} while (!resp.equals("acertou"));
				
		 
	}
		
}
