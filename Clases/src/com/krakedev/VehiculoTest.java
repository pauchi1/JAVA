package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehículo V;
		V = new Vehículo();
		
		System.out.println("=============== Vehículo 1 : creado ===============");
		
		System.out.println("Anio: " + V.anio);
		System.out.println("Marca: " + V.marca);
		System.out.println("Modelo: " + V.modelo);
		
		System.out.println("=============== Vehículo 1 : valores asignados ===============");
		
		V.anio = "2012";
		V.marca = "Chevrolet";
		V.modelo = "Nuevo";
		
		System.out.println("Anio: " + V.anio);
		System.out.println("Marca: " + V.marca);
		System.out.println("Modelo: " + V.modelo);
		
		System.out.println("=============== Vehículo 2 : creado ===============");

		Vehículo V2 = new Vehículo();
		
		System.out.println("Anio: " + V2.anio);
		System.out.println("Marca: " + V2.marca);
		System.out.println("Modelo: " + V2.modelo);
		
		System.out.println("=============== Vehículo 2 : valores asignados ===============");
		
		V2.anio = "2018";
		V2.marca = "Nissan";
		V2.modelo = "Antiguo";
		
		System.out.println("Anio: " + V2.anio);
		System.out.println("Marca: " + V2.marca);
		System.out.println("Modelo: " + V2.modelo);
	}

}
