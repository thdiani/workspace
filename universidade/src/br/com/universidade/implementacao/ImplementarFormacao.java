package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Pos;
import br.com.universidade.tela.Magica;

public class ImplementarFormacao {

	public static void main(String[] args) {

		char opcao = 0;
		Formacao formacao=null;
		char resposta=0;
		do {
			opcao = Magica.s("Digite:\n<1> Medio\n<2> Bacharelado\n<3> Pos").charAt(0);
			if(opcao=='1') {
				formacao = new Medio(
						Magica.f("Valor"),
						Magica.s("Descricao"),
						Magica.i("Duracao"),
						Magica.i("tipo")
						);
			}else if(opcao=='2') {
				formacao = new Bacharelado(
						Magica.f("Valor"),
						Magica.s("Descricao"),
						Magica.i("Duracao"),
						Magica.s("Projeto Conclusao"),
						Magica.i("Carga Horaria Estagio")
						);
			}else if(opcao=='3') {
				formacao = new Pos(
						Magica.f("Valor"),
						Magica.s("Descricao"),
						Magica.i("Duracao"),
						Magica.s("Nivel"),
						Magica.b("Plano Estendido")
						);
			}else 
				System.out.println("Non ecziste");

			System.out.println(formacao.getAll());
			
		resposta = JOptionPane.showInputDialog("Tecle <S> para continuar").toUpperCase().charAt(0);
		}while(resposta=='S');


	}

}
