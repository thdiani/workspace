package decisao;

import javax.swing.JOptionPane;

public class Fix3 {

	
	public static void main(String[] args) {
		float capital = Float.parseFloat(JOptionPane.showInputDialog("Capital:"));
		float taxa = Float.parseFloat(JOptionPane.showInputDialog("Tx Juros:"));
		byte periodo = Byte.parseByte(JOptionPane.showInputDialog("Meses:"));
		
		double montante = (double)(capital*((1+taxa/100) * periodo));
		
		System.out.println("Valor: " + montante);			
		}
	
		
	
		
	}

