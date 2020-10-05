package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo2 {


	public static void main(String[] args) {
		//sempre usar variaveis fora do loop Do/While
		char resposta=0;
		int valor1=0;
		int valor2=0;
		char sinal=0;
		do {	
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
		sinal = JOptionPane.showInputDialog("Operacao").charAt(0);

		if (sinal=='+') {
			System.out.println("Adicao " + (valor1+valor2));
		}else if (sinal=='-') {
			System.out.println("Subtracao " + (valor1-valor2));
		}else if (sinal=='*') {
			System.out.println("Multiplicacao " + (valor1*valor2));
		}else if (sinal=='/') {
			System.out.println("Divisao " + (valor1/valor2));
		}else {
			System.out.println("Operacao Invalida!");
		}
		//toUpperCase tem q ser antes por conta da conversao do charAt;
		resposta = JOptionPane.showInputDialog("Tecle <S> para continuar").toUpperCase().charAt(0);
		}while(resposta=='S');
		
	}
}


