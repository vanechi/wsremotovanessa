package variaveis;

public class TiposDados {

	public static void main(String[] args) {
		
		String nome = "Vanessa Chiarelli";
		int idade = 42;
		double altura = 1.62; 
		double peso = 67.0;
		double imc = peso / (altura * altura);				
				
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.printf("\nIMC...: %.2f\n" , imc);
		System.out.printf("Ol� %s seu IMC eh %.2f", nome, imc);
		
	}
	
	
	
	
	
}
