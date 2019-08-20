package entities;

public class Intercambio {
	
	private static final Double dolar = 4.03;
	private double real;
	
	public Intercambio(double real) {
		//Não passa dolar para o metodo construtor pois o mesmo é uma variavel static não vai ter alteração de valor.
		this.real = real;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public static Double getDolar() {
		return dolar;
	}
	
	public Double conversao() {
		
		return (real/dolar)-((real/dolar)*6/100);
		//Fez a conversao e aplicou 6% do IOF
		
	}
	
	@Override
	
	public String toString() {
		
		return "Value of dolar: "+dolar+" U$"
				+"\nReais: "+real+" R$"
				+"\nConverted value: "+conversao();
		
	}
	

}
