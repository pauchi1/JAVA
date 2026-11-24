package com.krakedev;

public class Vehículo {

	private String marca;
	private String modelo;
	private String anio;
	private Double valor;
	
	public Vehículo() {
		
	}
	
	public Vehículo(String marca) {
		this.marca = marca;
	}
	
	
	public Vehículo(String marca, String modelo, String anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
