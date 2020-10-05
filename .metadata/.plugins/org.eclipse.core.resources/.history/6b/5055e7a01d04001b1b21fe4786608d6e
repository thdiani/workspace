package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
	
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Digite o Cidade"));
		endereco.setEstado(JOptionPane.showInputDialog("Digite o Estado"));
		endereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		Aluno objeto = new Aluno();
		//objeto.setRm(1000000);
		//objeto.setNome("A");
		//objeto.setEmail("Email");
		objeto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o RM")),
				JOptionPane.showInputDialog("Digite o Nome").toUpperCase(),
				JOptionPane.showInputDialog("Digite o Email").toLowerCase(),
				endereco
				);
		//System.out.println(objeto.getRm());
		//System.out.println(objeto.getNome());
		//System.out.println(objeto.getEmail());
		System.out.println(objeto.getAll());

	}

}
