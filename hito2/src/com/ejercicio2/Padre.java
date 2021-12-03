package com.ejercicio2;

public abstract class Padre {
	String nombre;
	int edad;
	//constructor
	public Padre(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
	//getter-setter

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String saludar() {
		System.out.println("Hola, yo soy el padre");
		return "Yo soy "+nombre;
	}
	
}
