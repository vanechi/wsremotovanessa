package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
		
		float media = (nota1 + nota2)/2;
			
		System.out.println("M?dia: " + media);
		
		if (media >= 6) {
			System.out.println("Parab?ns!!!\nAprovado na disciplina: " + disciplina);
		}
		
		if (media < 4) {
			System.out.println("Infelizmente voc? foi reprovado na discipplina: " + disciplina);
		}
		
		if (media >= 4 && media < 6) {
			System.out.println("Exame: " + disciplina);
		}
		
		
	}
	
}
