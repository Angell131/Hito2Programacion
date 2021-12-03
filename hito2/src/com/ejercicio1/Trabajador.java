package com.ejercicio1;

public class Trabajador {
	String nombre;
	String ciudad;
	int salarioBruto;
	boolean contratoTemporal;
	//constructor
	public Trabajador(String nombre, String ciudad, int salarioBruto, boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}
	//getter-setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public boolean isContratoTemporal() {
		return contratoTemporal;
	}
	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
	//sobreescritura
	@Override
	public String toString() {
		return "trabajador [nombre=" + nombre + ", ciudad=" + ciudad + ", salarioBruto=" + salarioBruto
				+ ", contratoTemporal=" + contratoTemporal + "]";
	}
	
}
