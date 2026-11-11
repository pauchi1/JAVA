package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		System.out.println("========================= Restaurante 1 : agregado =========================");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("direccion: "+ rest1.direccion);
		System.out.println("calificacion: "+ rest1.calificacion);
		
		rest1.nombre = "restaurante chapala";
		rest1.direccion = "calle carnicería";
		rest1.calificacion = (float) 5;
		
		System.out.println("========================= Restaurante 1 : valor asignado =========================");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("direccion: "+ rest1.direccion);
		System.out.println("calificacion: "+ rest1.calificacion);
		
		System.out.println("========================= Restaurante 2 : agregado =========================");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("direccion: "+ rest2.direccion);
		System.out.println("calificacion: "+ rest2.calificacion);
		
		rest2.nombre = "restaurante yucateca";
		rest2.direccion = "calle eloy";
		rest2.calificacion = (float) 4.5;
		
		System.out.println("========================= Restaurante 1 : valor asignado =========================");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("direccion: "+ rest2.direccion);
		System.out.println("calificacion: "+ rest2.calificacion);
		
	}

}
