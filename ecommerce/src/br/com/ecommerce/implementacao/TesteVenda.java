package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {


	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID Produto")));
		produto.setDescricao(JOptionPane.showInputDialog("Digite a descricao").toUpperCase());
		produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a Qtdade Produto")));
		produto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de Compra")));
		produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Venda")));
		
		Endereco endereco = new Endereco();
		//substituindo JOPtionPane pela Classe Magica (Classe dos Alias de metodo)
		//n precisa instanciar a Magica como objeto soh importar <ctrl+shift+o>
		endereco.setLogradouro(Magica.s("Digite o Logradouro"));
		endereco.setBairro(Magica.s("Digite o Bairro"));
		endereco.setCidade(Magica.s("Digite o Cidade"));
		endereco.setEstado(Magica.s("Digite o Estado"));
		endereco.setCep(Magica.s("Digite o CEP"));
		endereco.setNumero(Magica.s("Digite o Numero"));
		endereco.setComplemento(Magica.s("Digite o Complemento"));
		
		Cliente cliente = new Cliente();
		cliente.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID Cliente")));
		cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente").toUpperCase());
		//amarracao entre cliente e endereco
		// melhor fazer a amarracao antes dos sets
		cliente.setEndereco(endereco);
		
		Venda venda = new Venda();
		venda.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Digite a NF")),
				JOptionPane.showInputDialog("Digite a Data"),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o Total")),
				produto,
				cliente
				);
		System.out.println(venda.getAll());
	}

}
