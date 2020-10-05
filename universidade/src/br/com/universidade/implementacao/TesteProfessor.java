package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Digite o Cidade"));
		endereco.setEstado(JOptionPane.showInputDialog("Digite o Estado"));
		endereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		
		Professor professor = new Professor();
		professor.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID")));
		professor.setNome(JOptionPane.showInputDialog("Digite seu mome").toUpperCase());
		professor.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Digite seu Valor Hora")));
		professor.setFormacao(JOptionPane.showInputDialog("Digite sua Formacao").toUpperCase());
		professor.setEndereco(endereco);
		//professor.setAll(
				//Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID")), 
				//JOptionPane.showInputDialog("Digite seu mome").toUpperCase(), 
				//Float.parseFloat(JOptionPane.showInputDialog("Digite seu Valor Hora")), 
				//JOptionPane.showInputDialog("Digite sua Formacao").toUpperCase()
				//);
		System.out.println(professor.getId());
		System.out.println(professor.getNome());
		System.out.println(professor.getValorHora());
		System.out.println(professor.getFormacao());
		System.out.println(professor.getEndereco().getLogradouro());
		System.out.println(professor.getEndereco().getBairro());
		System.out.println(professor.getEndereco().getCidade());
		System.out.println(professor.getEndereco().getEstado());
		System.out.println(professor.getEndereco().getCep());
		//System.out.println(professor.getAll());
	}

}
