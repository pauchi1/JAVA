package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		
		c1.lado = 4;
		
		System.out.println("======================== Cuadrado #1 ========================");
		System.out.println("");
		double resultadoArea = c1.calcularArea();
		System.out.println("Area del cuadrado: " + resultadoArea);
		double resultadoPerimetro = c1.calcularPerimetro();
		System.out.println("Perimetro del cuadrado; " + resultadoPerimetro);
		System.out.println("");
		
		Cuadrado c2 = new Cuadrado();
		
		c2.lado = 5;
		
		System.out.println("======================== Cuadrado #2 ========================");
		System.out.println("");
		double resultadoArea2= c2.calcularArea();
		System.out.println("Area del cuadrado: " + resultadoArea2);
		double resultadoPerimetro2= c2.calcularPerimetro();
		System.out.println("Perimetro del cuadrado; " + resultadoPerimetro2);
		System.out.println("");
		
		
		Cuadrado c3= new Cuadrado();
		
		c3.lado = 2;
		
		System.out.println("======================== Cuadrado #3 ========================");
		System.out.println("");
		double resultadoArea3= c3.calcularArea();
		System.out.println("Area del cuadrado: " + resultadoArea3);
		double resultadoPerimetro3= c3.calcularPerimetro();
		System.out.println("Perimetro del cuadrado; " + resultadoPerimetro3);
		System.out.println("");
	}

}
