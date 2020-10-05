package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicitar nome e a idade da pessoa
		 * 
		 * "Eh obrigatorio votar => 18 e <=70
		 * "Voto facultativo" => 16,17 ou =>70
		 * "Nao pode votar" <= 16
		 */
		
		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		// Decisao Simples soh avalia o true - avalia cada condicao de If mesmo ja dando match - mais processamento
		// Decisao Composta avalia o false - no primeiro true ja para de processar nos demais
		if (idade>=18 && idade<=70) {
			System.out.println("Cidadao " + nome + " Eh obrigatorio votar");
		}
		if (idade<16) {
			System.out.println("Cidadao " + nome + " N pode votar");
		}
		if (idade ==16 || idade ==17 || idade>70){
			System.out.println("Cidadao " + nome + " Voto facultativo");
		}

		
		
}
	
	
}