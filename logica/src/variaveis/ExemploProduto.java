package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// Solicitar os dados:
		// Nome do produto:
		// Quantidade:
		// Valor:
		// Exibir o total e nome do produto
		// Exibir o total com 10%
		
		String nome = ""; // string tudo que estiver em aspas - Alfanumerico (classe) - n incorporado no JAVA
		int qtdade = 0; //Numerico inteiro primitivo (embarcado no JAVA)
		double valor = 0; //Numerico real primitivo (embarcado no JAVA)e Numeros quebrados
		
		nome = JOptionPane.showInputDialog("Digite o nome do Produto");
		qtdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto"));


		double total = valor * qtdade;
		double total2 = total * 0.90;
		
		System.out.println("Nome do Produto........: " + nome);
		System.out.println("Quantidade.............: " + qtdade);
		System.out.println("Valor Total............: R$ " + total);
		System.out.println("Valor Total com 10% ...: R$ " + total2);
		
	}

}
