package com.ejercicio2;

public class Hija extends Padre {

	
	public Hija(String nombre, int edad) {
		super(nombre, edad);
		this.nombre=nombre;
		this.edad=edad;
		// TODO Auto-generated constructor stub
	}

	public String saludar() {
			System.out.println("Hola, yo soy la hija");
			return "Yo soy "+nombre;}
		// TODO Auto-generated constructor stub
	}


