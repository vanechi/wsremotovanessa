package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {

	public static void main(String[] args) {
				
		String nome = "";
		short idade=0;
		short qtdeMaioresIdade=0;
		short totalIdades=0;
		short qtdePessoas=0;
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		String nomeMaisJovem="";
		short idadeMaisJovem=0;
							
		do {		
		nome = JOptionPane.showInputDialog("Digite o nome:");
		idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
				
		if (idade<idadeMaisJovem || qtdePessoas==0) {
			idadeMaisJovem = idade;
			nomeMaisJovem = nome;
		}
		
		if (idade>idadeMaisExperiente) {
			idadeMaisExperiente = idade;
			nomeMaisExperiente = nome;
		}
		
		
		if (idade>=18) {
			qtdeMaioresIdade+=1;
		}
		
		qtdePessoas+=1;
		totalIdades+=idade;
				
		} while (JOptionPane.showConfirmDialog 
				(null, "Continuar?", "Exercicio 2", JOptionPane.YES_NO_CANCEL_OPTION)==0);
				
		 JOptionPane.showMessageDialog(null, "Maiores de idade: " + qtdeMaioresIdade);
		 JOptionPane.showMessageDialog(null, "Média de idade: " + (totalIdades/qtdePessoas));
		 JOptionPane.showMessageDialog(null, "Nome da mais Experiente : " + nomeMaisExperiente + "\nIdade mais experiente: " + idadeMaisExperiente);
		 JOptionPane.showMessageDialog(null, "Nome do mais Jovem : " + nomeMaisJovem + "\nIdade do mais Jovem: " + idadeMaisJovem);
		 
	}
		
}
