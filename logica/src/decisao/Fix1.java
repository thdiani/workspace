package decisao;

import javax.swing.JOptionPane;

public class Fix1 {

	
	public static void main(String[] args) {
		String tipo = JOptionPane.showInputDialog("Forma:").toUpperCase();
		if (tipo.equals("RETANGULO")) {
			float base = Float.parseFloat(JOptionPane.showInputDialog("base:"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("altura:"));
			float areaRetangulo = (float) (base * altura);
			System.out.println("Area do Retangulo: " + areaRetangulo);		
			
		}else if (tipo.equals("CIRCULO")) {
			float raio = Float.parseFloat(JOptionPane.showInputDialog("raio:"));
			float areaCirculo = (float) (raio * raio * 3.14);
			System.out.println("Area do Circulo: " + areaCirculo);			
		}
	
		
	
		
	}

}
