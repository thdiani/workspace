package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {


	public static void main(String[] args) {

		String nome="";
		String nomemaior="";
		String nomemenor="";
		int idade=0;
		int maioridade=0;
		int menoridade=999;
		float somaidade=0;
		int qtdadeMaior=0;
		int vezes=0;
		char resposta=0;

		do {	
			nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));

			if (idade>maioridade){
				maioridade=idade;
				nomemaior=nome;
			}if (idade<menoridade) {
				menoridade=idade;
				nomemenor=nome;
			}if (idade>=18) {
				qtdadeMaior=qtdadeMaior+1;	 
			}else {

			}

			somaidade = idade+somaidade;
			vezes = vezes+1;

			resposta = JOptionPane.showInputDialog("Tecle <S> para continuar").toUpperCase().charAt(0);
		}while(resposta=='S');

		System.out.println("Quantidade de pessoas Maior de Idade: " + qtdadeMaior);
		System.out.println("Media de Idades: " + (somaidade/vezes));
		System.out.println("Maior idade digitada eh: " + maioridade);
		System.out.println("Nome da pessoa veia: " + nomemaior);
		System.out.println("Nome da pessoa nova: " + nomemenor);
	}
}


