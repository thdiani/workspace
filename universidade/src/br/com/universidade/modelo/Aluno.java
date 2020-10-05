package br.com.universidade.modelo;
/*
 * Design Patterns (Melhores praticas para projetos com OO)
 * DTO (Data Transfer Object) => Best practice (Beans / JavaBeans / TO / model)
 * 1 Sugestao: TODOS os atributos devem ser privados
 * 2 Sugestao: Cada atributo deve ter o seu metodo getter(output - Ex.: return) e setter(input - Ex.: preencherXpto)
 * 3 Sugestao: Toda classe deve possuir no minimo 2 construtores (um vazio e outro cheio - com todos os atributos)
 */

public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	
	public Aluno () {}
	
	public Aluno (int i, String n, String email, Endereco e) {
		rm=i;
		nome=n;
		this.email=email;
		endereco=e;	
	}
		
	
	public String getAll() {
		return
				"RM....: " + rm + "\n" +
				"Nome..: " + nome + "\n" +
				"Email.: " + email + "\n" +
				"Endereco... " + "\n" + endereco.getAll();
	}

	public void setAll(int rm, String nome, String email,Endereco endereco) {
		this.rm=rm;
		this.nome=nome;
		this.email=email;
		this.endereco=endereco;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}