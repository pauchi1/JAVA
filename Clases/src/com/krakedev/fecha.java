package com.krakedev;

public class fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public fecha(int dia, int mes, int anio) {
		this.anio = anio;
		this.dia = dia;
		this.mes = mes;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	

}
