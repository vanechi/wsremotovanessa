package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));
		
		if (faltas >20) {
			System.out.println("Reprovado por faltas");
		} else {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
		
		float media = (nota1 + nota2)/2;
					
		System.out.println("Média: " + media);
		System.out.println("Faltas: " + faltas);
		
		if (media >= 6) {
			System.out.println("Parabéns!!!\nAprovado na disciplina: " + disciplina);
		} else if (media < 4) {
			System.out.println("Infelizmente você foi reprovado na disciplina: " + disciplina);
		} else {
			System.out.println("Exame: " + disciplina);
		}
		
		
	}
	}
}
