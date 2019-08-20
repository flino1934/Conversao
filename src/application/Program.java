package application;

import javax.swing.JOptionPane;

import entities.Intercambio;

public class Program {

	public static void main(String[] args) {
		
		double real = Double.parseDouble(JOptionPane.showInputDialog("Enter the value in reais"));
		Intercambio i = new Intercambio(real);
		
		System.out.println(i);

	}

}
