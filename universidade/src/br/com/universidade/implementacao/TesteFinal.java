package br.com.universidade.implementacao;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;

public class TesteFinal {
	
	public static void main(String[] args) {
		Formacao f = new Bacharelado();
		f.setValor(5000);	
		f.definirDuracao();
		System.out.println(f.calcularMensalidade((float) 0.05));
		System.out.println(f.getDuracao());

}
	
}
