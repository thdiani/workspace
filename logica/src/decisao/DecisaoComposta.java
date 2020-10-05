package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	// Solicite para o usu�rio:
	// nome do cliente, valor investido,
	// tempo (anos) de fidelidade, regi�o (nivel Brasil) onde mora
	// Se a regi�o for sul ou sudeste, o tempo de fidelidade ter� um acr�scimo
	// de 20%
	// Se o valor investido for menor que 1000, aplique um acrescimo de 1.5%
	// no valor investido.
	// Se o valor investido estiver entre 1000 e 5000, aplique um acrescimo
	// de 2% no valor investido.
	// Se o valor investido for maior que 5000, aplique um acrescimo de 3% no valor investido.
	// Se a fidelidade for maior que 5 anos, aplique mais um acrescimo de 1% no valor investido.
	// No final exiba o valor investido atualizado de acordo com o perfil do usu�rio
	// e a diferen�a que foi obtida entre o valor investido e o valor atual.




	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do Cliente:").toUpperCase();
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Investido:"));
		short anos = Short.parseShort(JOptionPane.showInputDialog("Tempo de fidelidade:"));
		String regiao = JOptionPane.showInputDialog("Regiao do Brasil:").toUpperCase();
		short valorAtualizado=0;
		short valorAno=0;
		short valorRegiao=0;
		
		if (valor<1000) {
			valorAtualizado = (short) (valor * 0.015);
		}else if (valor>=5000) {
			valorAtualizado = (short) (valor * 0.02);
		}else {
			valorAtualizado = (short) (valor * 0.03);
		}
		
		
		if (anos>5) {
			valorAno = (short) (valor * 0.01);
		}

		
		if (regiao.equals("SUL") || regiao.equals("SUDESTE")) {
			valorRegiao = (short) (valor * 0.20); 
			//valorRegiao *= (short) 1.2;
		}
		
		System.out.println("Nome do Cliente: " + nome + " da Regiao: " + regiao);
		System.out.println("Valor Investido: R$ " + valor);
		System.out.println("Valor Investido Atualizado: R$ " +  (valor+valorAtualizado + valorAno + valorRegiao));
		System.out.println("Lucro no Periodo: R$ " + (valorAtualizado + valorAno + valorRegiao));

	}

}


