package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Pos extends Formacao implements PadraoFormacao{
	private String nivel;
	private boolean planoEstendido;
	String resposta="";
	
	public String getAll() {
		if (planoEstendido==true){
			resposta = "SIM";
		}else if (planoEstendido==false){
			resposta = "NAO";
		}
			return
				super.getAll() +
				"Nivel............: " + nivel + "\n" +
				"Plano Estendido..: " + resposta;
		
	}
	public void setAll(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super.setAll(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}
	public Pos() {
		super();
	}
	public Pos(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/18 * fator;
	}
	@Override
	public void definirDuracao() {
		setDuracao(18);
		
	}


}
