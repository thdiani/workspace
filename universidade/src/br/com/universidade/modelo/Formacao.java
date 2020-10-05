package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

/*
 * Pilares orientacao a objeto
 * 1 - Abstracao
 * 2 - Encapsulamento
 * 3 - Hierarquia
 * 4 - Polimorfismo
 * 
 * Polimorfismo: metodos com o mesmo e acoes diferentes
 * 
 */

public class Formacao implements PadraoFormacao {
	private float valor;
	private String descricao;
	private int duracao;

	public void setAll(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	public String getAll() {
		return
				"Valor.......: " + valor + "\n" +
				"Descricao...: " + descricao + "\n"+
				"Duracao.....: " + duracao + "\n";
	}
	public Formacao() {
		super();
	}
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		
	}


}
