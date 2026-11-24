package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1 = c1.sumar(4, 2);
		System.out.println("resultado de suma: " + r1);
		
		double r2 = c1.restar(4, 2);
		System.out.println("resultado de la resta: " + r2);
		
		double r3 = c1.multiplicar(10, 5);
		System.out.println("resultado de la multiplicación: "+ r3);
		
		double r4 = c1.dividir(10, 2);
		System.out.println("resultado de la división: "+ r4);
		
		double r5 = c1.promediar(10, 8, 9);
		System.out.println("resultado del promedio: "+ r5);
		
		c1.mostrarResultado();
		
		Calculadora c2 = new Calculadora();
		
		double re2 = c2.restar(100.5, 40.5);
		System.out.println("resultado de la resta: "+ re2);
		
		double Descuento = c2.calcularDescuento(15.0 , 200.0);
		System.out.println("el valor del descuento es: "+ Descuento);
	}

}
