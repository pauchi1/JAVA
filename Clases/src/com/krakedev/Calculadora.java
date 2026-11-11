package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		int resultado = a + b;
		return resultado;
		
	}
	
	public int restar(int a, int b) {
		
		int resultado = a - b;
		return resultado;
		
	}
	
	public double multiplicar(double a, double b) {
		
		double resultado = a * b;
		return resultado;
		
	}
	
	public double dividir(double a, double b) {
		
		double resultado = a / b;
		return resultado;
		
	}
	
	public double promediar(double n1, double n2, double n3){
		
		double resultado = (n1 + n2 + n3) / 3;
		return resultado;
		
	}
	
public void mostrarResultado() {
		
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
		
	}
	
}
