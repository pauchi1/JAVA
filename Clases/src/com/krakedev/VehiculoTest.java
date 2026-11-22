package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehículo V;
		V = new Vehículo();
		
		System.out.println("=============== Vehículo 1 : creado ===============");
		
		System.out.println("Anio: " + V.getAnio());
		System.out.println("Marca: " + V.getMarca());
		System.out.println("Modelo: " + V.getModelo());
		
		System.out.println("=============== Vehículo 1 : valores asignados ===============");
		
		V.setAnio("2012");
		V.setMarca("Chevrolet");
		V.setModelo("nuevo");
		
		System.out.println("Anio: " + V.getAnio());
		System.out.println("Marca: " + V.getMarca());
		System.out.println("Modelo: " + V.getModelo());
		
		System.out.println("=============== Vehículo 2 : creado ===============");

		Vehículo V2 = new Vehículo();
		
		System.out.println("Anio: " + V2.getAnio());
		System.out.println("Marca: " + V2.getMarca());
		System.out.println("Modelo: " + V2.getModelo());
		
		System.out.println("=============== Vehículo 2 : valores asignados ===============");
		
		V.setAnio("2018");
		V.setMarca("Nissan");
		V.setModelo("Antiguo");
		
		System.out.println("Anio: " + V2.getAnio());
		System.out.println("Marca: " + V2.getMarca());
		System.out.println("Modelo: " + V2.getModelo());
	}

}
