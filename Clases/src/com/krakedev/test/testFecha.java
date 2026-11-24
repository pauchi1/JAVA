package com.krakedev.test;

import com.krakedev.fecha;

public class testFecha {

	public static void main(String[] args) {
		
		fecha f1 = new fecha(2026, 4, 1);
		
		System.out.println("anio: "+ f1.getAnio());
		System.out.println("mes: "+ f1.getMes());
		System.out.println("dia: "+ f1.getDia());

	}

}
