package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia;
	private float valor;
	private int rpm;
	// sintaxe pra criacao de metodos
	//<modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>){...}
	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}
	public String exibirEscuderia() {
		return escuderia;
	}
	public void preencherValor(float parametro) {
		if (parametro>0) {
			valor = parametro;
		}
	}
	public float exibirValor() {
		return valor;
	}
	public void preencherRpm(int parametrorpm) {
		if (parametrorpm>0) {
			rpm = parametrorpm;
		}
	}
	public int exibirRpm() {
		return rpm;
	}


	//metodo para preencher todos os atributos
	//metodo para exibir todos os atributos
	//metodo para 10% no valor
	//metodo para exibir o valor com desconto aplicado acima


	public void preencherTudo(String p1, float p2, int p3) {
		escuderia = p1;
		valor = p2;
		rpm = p3;

	}
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
	}
	public float exibirPromocao() {
		return valor * (float) 0.9;
	}
}
