package com.krakedev;

public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 5;
		r1.base = 4;
		
		System.out.println("========================= Primer rectangulo =========================");
		int resultadoArea = r1.calcularArea();
		System.out.println("Resultado rectangulo 1: "+ resultadoArea);
		int resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado del perímetro 1: "+ resultadoPerimetro);
		
		Rectangulo r2 = new Rectangulo();
		
		r2.altura = 8;
		r2.base = 2;
		
		System.out.println("========================= Segundo rectangulo =========================");
		int resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: "+ resultadoArea2);
		int resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Resultado del perímetro 2: "+ resultadoPerimetro2);
		
		
		
	}

}
