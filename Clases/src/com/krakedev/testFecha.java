package com.krakedev;

public class testFecha {

	public static void main(String[] args) {
		
		fecha f1 = new fecha();
		
		f1.setAnio(2026);
		f1.setMes(4);
		f1.setDia(1);
		
		System.out.println("anio: "+ f1.getAnio());
		System.out.println("mes: "+ f1.getMes());
		System.out.println("dia: "+ f1.getDia());

	}

}
