package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
		/*
		 * Jogador 1: vai digitar um numero inteiro
		 * Jogador 2: tem que descobrir esse numero
		 * Exibir o Parabens para o jogador2 quando ele descobrir
		 * Atualizacoes
		 * - o jogador2 ira receber dicas enquanto ele nao acertar
		 * - no final tem que exibir qtas tentativas foras utilizadas pelo Jogador2
		 */
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 digite seu numero"));
		int chute = 0;
		int tentativas=0;
		//n tem parse para char
		//charAt para pegar o caracter no showInputDialog - ex. abaixo o primeiro caracter (0)
		do {
		chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 digite seu numero"));
		if (chute>valor1) {
			System.out.println("Numero maior");
		}else if (chute<valor1) {
			System.out.println("Numero menor...: ");
		}
		tentativas = tentativas+1;
		//toUpperCase tem q ser antes por conta da conversao do charAtwhile();
		
		}while(valor1!=chute);
		System.out.println("Parabens vc acertou! com " + tentativas + " tentativas!");
		
	}
}


