package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "vanessa.ChiareLLi@itau-unibanco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("É igual 1: " + email.equals("teste"));
		System.out.println("É igual 2: " + email.contentEquals("vanessa.ChiareLLi@itau-unibanco.com.br"));
		System.out.println("É igual 3: " + email.equalsIgnoreCase("vanessa.chiarelli@itau-unibanco.com.br"));
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @? " + email.indexOf("@"));
		System.out.println("Do 3º até o 5º: " + email.substring(2,4));
		
		if (email.contains("@")==true) {
			System.out.println("Usuário: " + email.substring(0,email.indexOf("@")));	
		}
		
		
		
	}
	
}
