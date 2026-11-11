package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1 = c1.sumar(4, 2);
		System.out.println("resultado de suma: " + r1);
		
		int r2 = c1.restar(4, 2);
		System.out.println("resultado de la resta: " + r2);
		
		double r3 = c1.multiplicar(10, 5);
		System.out.println("resultado de la multiplicación: "+ r3);
		
		double r4 = c1.dividir(10, 2);
		System.out.println("resultado de la división: "+ r4);
		
		double r5 = c1.promediar(10, 8, 9);
		System.out.println("resultado del promedio: "+ r5);
		
		c1.mostrarResultado();
		
	}

}
