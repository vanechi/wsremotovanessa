package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "vanessa.ChiareLLi@itau-unibanco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("� igual 1: " + email.equals("teste"));
		System.out.println("� igual 2: " + email.contentEquals("vanessa.ChiareLLi@itau-unibanco.com.br"));
		System.out.println("� igual 3: " + email.equalsIgnoreCase("vanessa.chiarelli@itau-unibanco.com.br"));
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @? " + email.indexOf("@"));
		System.out.println("Do 3� at� o 5�: " + email.substring(2,4));
		
		if (email.contains("@")==true) {
			System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));	
		}
		
		
		
	}
	
}
