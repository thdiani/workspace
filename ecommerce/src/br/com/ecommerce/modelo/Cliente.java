package br.com.ecommerce.modelo;
/*
 * Design Patterns (Melhores praticas para projetos com OO)
 * DTO (Data Transfer Object) => Best practice (Beans / JavaBeans / TO / model)
 * 1 Sugestao: TODOS os atributos devem ser privados
 * 2 Sugestao: Cada atributo deve ter o seu metodo getter(output - Ex.: return) e setter(input - Ex.: preencherXpto)
 * 3 Sugestao: Toda classe deve possuir no minimo 2 construtores (um vazio e outro cheio - com todos os atributos)
 */

public class Cliente {
	private int id;
	private String nome;
	private Endereco endereco;
	
	public Cliente () {}
	
	public Cliente (int i, String n, Endereco e) {
		id=i;
		nome=n;
		endereco=e;
	}
	
	public void setAll(int id,String nome,Endereco endereco) {
		this.id=id;
		this.nome=nome;
		this.endereco=endereco;
	}
	public String getAll() {
		return
				"ID.........: " + id + "\n" +
				"Nome.......: " + nome + "\n" +
				"Endereco...: " + "\n" + endereco.getAll();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
