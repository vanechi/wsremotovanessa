package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {

	public static void main(String[] args) {
		
		double diaria = 80.00;
		double taxa1 = 5.50;
		double taxa2 = 6.00;
		double taxa3 = 8.00;
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde de diarias: "));
		
		if (qtde > 15) {
			System.out.println("Valor total: " + ((diaria+taxa1)* qtde));
		} else if (qtde == 15) {
			System.out.println("Valor total: " + ((diaria+taxa2)*qtde));
		} else {
			System.out.println("Valor total: " + ((diaria+taxa3)*qtde));
		}
		
		
		
	}
	
}
