package com.krakedev.test;

import com.krakedev.Vehículo;

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
		
		System.out.println("=============== Vehículo 3 : valores asignados ===============");
		
		Vehículo V3 = new Vehículo("Toyota", "reciente", "2010");
		
		System.out.println("Anio: " + V3.getAnio());
		System.out.println("Marca: " + V3.getMarca());
		System.out.println("Modelo: " + V3.getModelo());
		
		System.out.println("=============== Vehículo 4 : valores asignados ===============");
		
		Vehículo V4 = new Vehículo("Lamborjini", "el top de tops", "2024");
		
		System.out.println("Anio: " + V4.getAnio());
		System.out.println("Marca: " + V4.getMarca());
		System.out.println("Modelo: " + V4.getModelo());
		
	}

	
}
