package br.com.universidade.modelo;

public class Curso {
	private Formacao formacao;
	private String sigla;
	private String dataLancamento;

	public String getAll() {
		return
				"Formacao...........: " + formacao.getAll() + "\n" +
				"Sigla..............: " + sigla + "\n" +
				"Data Lancamento....: " + dataLancamento;
	}
	public void setAll(Formacao formacao, String sigla, String dataLancamento) {
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	public Curso() {
		super();
	}
	public Curso(Formacao formacao, String sigla, String dataLancamento) {
		super();
		this.formacao = formacao;
		this.sigla = sigla;
		this.dataLancamento = dataLancamento;
	}
	public Curso(char c, boolean b) {
		// TODO Auto-generated constructor stub
	}
	public Formacao getFormacao() {
		return formacao;
	}
	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


}
