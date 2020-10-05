package br.com.lojauati.teste;

import br.com.lojauati.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		//preencher estatico os paramentros no momento de estanciar o objeto
		Elevador objeto = new Elevador(25,100); //vai sobrescrever os valores qdo n tiver preenchimento
		Elevador objeto2 = new Elevador(); //instacia outro objeto para valor nulo
		System.out.println(objeto.exibirTudo());
		//objeto.preencherCapacidadePessoas(0); //exemplo com capacidade pessoas e Maior Andar
		//objeto.preencherMaiorAndar(0);
		objeto.preenhcerMenorAndar(0);
		System.out.println("===============================");
		System.out.println(objeto.exibirTudo());
		objeto.entrar(5);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.sair(2);
		System.out.println("===============================");
		System.out.println(objeto.exibirTudo());
	}

}
