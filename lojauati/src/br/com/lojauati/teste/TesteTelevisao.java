package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao objeto = new Televisao();
		objeto.ligarTv();
		objeto.aumentaVolume();
		objeto.aumentaVolume();
		objeto.aumentaVolume();
		objeto.aumentaVolume();
		objeto.diminuiVolume();
		objeto.mudarCanal(10);
		System.out.println(objeto.exibirTudo());
		System.out.println(objeto.exibirStatus());
		System.out.println("===============================");
	}

}