package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		
		while (nome.length()<5 || nome.length()>15==false) {
			nome = JOptionPane.showInputDialog("Nome Invalido");
		
		System.out.println(nome);	
		
		}
		//invertendo o conceito do contains ou equals
		while (!email.contains("@")==true) {
			email = JOptionPane.showInputDialog("Email Invalido").toLowerCase();
		}
		
		System.out.println(email);
	}

}
