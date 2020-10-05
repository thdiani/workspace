package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		//String eh do tipo Referencia - tem metodos
		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original: " + email);
		System.out.println("Maiscula: " + email.toLowerCase());
		System.out.println("Maiscula: " + email.toUpperCase());
		System.out.println("Pos do @: " + email.indexOf("@"));
		System.out.println("Existe @: " + email.contains("@"));
		System.out.println("Qtdade caracteres: " + email.length());
		System.out.println("Do 2 ao 4 caracter: " + email.substring(1, 4)); // usar sub para parte da string
		System.out.println("A partir do 2: " + email.substring(1));
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toUpperCase());
		System.out.println("Compare: " + email.equals("abc@gmail.com")); // case sensitive
		System.out.println("Compare: " + email.equalsIgnoreCase("abc@gmail.com")); // qlqr caixa
		

		
	}

}
