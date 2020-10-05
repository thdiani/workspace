package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	/*
	 * Identificadores = nomes (classe, variavel...)
	 * 
	 * Regras:
	 * 1 - Nao comeca com numero ....1berto (errado) h1berto (certo)
	 * 2 - Nao usa caracteres especiais (@, #, ...) Excecao underline (_)
	 * 
	 * Padroes:
	 * - nomes significativos
	 * - sempre comecam com letras minisculas (a unica coisa que comeca com letra Maiscula eh classe)
	 * - utilizar padrao Camel Case:
	 * 					  String nomeDoCliente; (com letra Maiscula - excecao da primeira)
	 * 					  String nomeDoClientePessoaFisica;
	 *                    String nome_do_cliente_pessoa_fisica; (padrao python, linux)
	 * 
	 * 
	 * and => &&
	 * or => ||
	 */

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do Aluno:").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Total de Faltas:"));
		if (faltas>20) {
			System.out.println("Reprovado");

		}else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1:"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2:"));
			float media = (nota1 + nota2) / 2;

			System.out.println("Aluno " + nome + " sua media foi: " + media);
			if (media>=6) {
				System.out.println("Parabens:" + nome + " vc foi aprovado");
			}else if (media<4) {
				System.out.println("Reprovado");
			}else  {
				System.out.println("voce ainda tem chance");
			}
		}
	}
}
