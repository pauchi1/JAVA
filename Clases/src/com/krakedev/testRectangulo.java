package com.krakedev;

public class testRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5, 4);
		
		r1.setAltura(5);
		r1.setBase(4);
		
		System.out.println("========================= Primer rectangulo =========================");
		int resultadoArea = r1.calcularArea();
		System.out.println("Resultado rectangulo 1: "+ resultadoArea);
		int resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado del perímetro 1: "+ resultadoPerimetro);
		
		Rectangulo r2 = new Rectangulo(8, 2);
		
		r2.setAltura(8);
		r2.setBase(2);
		
		System.out.println("========================= Segundo rectangulo =========================");
		int resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: "+ resultadoArea2);
		int resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Resultado del perímetro 2: "+ resultadoPerimetro2);
		
	}

}
