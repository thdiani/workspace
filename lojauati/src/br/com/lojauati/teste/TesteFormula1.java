package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		//Formula1 objeto; //criando objeto
		//objeto.preencherEscuderia("Ferrari"); - NAO FUNCIONA pq o objeto tem q ser instanciado
		
		//Formula1 carro = new Formula1(); //instanciando objeto
		//carro.preencherEscuderia(JOptionPane.showInputDialog("Preencher Escuderia"));
		//carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Preencher Valor")));
		//carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("Preencher RPM")));
		//System.out.println(carro.exibirEscuderia());
		//System.out.println(carro.exibirValor());
		//System.out.println(carro.exibirRpm());
		
		Formula1 carro2 = new Formula1(); //instanciando objeto
		carro2.preencherTudo(JOptionPane.showInputDialog("Preencher Escuderia").toUpperCase(),Float.parseFloat(JOptionPane.showInputDialog("Preencher Valor")),Integer.parseInt(JOptionPane.showInputDialog("Preencher RPM")));
		System.out.println(carro2.exibirTudo());
		System.out.println(carro2.exibirPromocao());
		System.out.println(carro2.exibirPromocao(50));
	}

}
