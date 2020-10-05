package br.com.universidade.tela;

import javax.swing.JOptionPane;

public class Magica {

	//metodo para simplificar a funcao, semelhante ao alias
	// public static <tipo da variavel> <ALIAS para metodo>(<parametro><nome do parametro>);
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}

	public static boolean b(String msg) {
		return Boolean.parseBoolean(s(msg));
	}
	
}
