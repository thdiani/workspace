package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVendaConstrutor {

	public static void main(String[] args) {
		Venda objeto = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.s("Data"),
				Magica.f("Total"),
				//instanciar o Produto dentro do construtor
				new Produto(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.i("Qtde"),
						Magica.f("Compra"),
						Magica.f("Venda")
						),
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						new Endereco(
								Magica.s("Digite o Logradouro"),
								Magica.s("Digite o Bairro"),
								Magica.s("Digite o Cidade"),
								Magica.s("Digite o Estado"),
								Magica.s("Digite o CEP"),
								Magica.s("Digite o Numero"),
								Magica.s("Digite o Complemento")
								)
						)
				); 
		System.out.println(objeto.getAll());
		{
			
		}

	}

}
