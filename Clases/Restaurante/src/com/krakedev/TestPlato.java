package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato PlatoA = new Plato();
		Plato PlatoB = new Plato();
		Plato PlatoC = new Plato();
		
		System.out.println("========================= Plato A : agregado =========================");
		System.out.println("Nombre: " + PlatoA.nombre);
		System.out.println("Tipo: "+ PlatoA.tipo);
		System.out.println("Precio: $"+ PlatoA.precio);
		System.out.println("disponible: "+ PlatoA.disponible);
		
		PlatoA.nombre = "encebollado sin cebolla";
		PlatoA.tipo = "Plato fuerte";
		PlatoA.precio = (float) 5.00;
		PlatoA.disponible = true;
		
		System.out.println("========================= Plato A : valor asignado =========================");
		System.out.println("Nombre: " + PlatoA.nombre);
		System.out.println("Tipo: "+ PlatoA.tipo);
		System.out.println("Precio: $"+ PlatoA.precio);
		System.out.println("disponible: "+ PlatoA.disponible);
		
		System.out.println("========================= Plato B : agregado =========================");
		System.out.println("Nombre: " + PlatoB.nombre);
		System.out.println("Tipo: "+ PlatoB.tipo);
		System.out.println("Precio: $"+ PlatoB.precio);
		System.out.println("disponible: "+ PlatoB.disponible);
		
		PlatoB.nombre = "Pastel de chocolate con chocolate";
		PlatoB.tipo = "Postre";
		PlatoB.precio = (float) 2.50;
		PlatoB.disponible = false;
		
		System.out.println("========================= Plato B : valor asignado =========================");
		System.out.println("Nombre: " + PlatoB.nombre);
		System.out.println("Tipo: "+ PlatoB.tipo);
		System.out.println("Precio: $"+ PlatoB.precio);
		System.out.println("disponible: "+ PlatoB.disponible);
		
		System.out.println("========================= Plato C : agregado =========================");
		System.out.println("Nombre: " + PlatoC.nombre);
		System.out.println("Tipo: "+ PlatoC.tipo);
		System.out.println("Precio: $"+ PlatoC.precio);
		System.out.println("disponible: "+ PlatoC.disponible);
		
		PlatoC.nombre = "Migajas? de pan";
		PlatoC.tipo = "entrada";
		PlatoC.precio = (float) 0.10;
		PlatoC.disponible = false;
		
		System.out.println("========================= Plato C : valor asignado =========================");
		System.out.println("Nombre: " + PlatoC.nombre);
		System.out.println("Tipo: "+ PlatoC.tipo);
		System.out.println("Precio: $"+ PlatoC.precio);
		System.out.println("disponible: "+ PlatoC.disponible);


	}

}
