package com.ejercicio1;

import com.ejercicio1.Trabajador;

public class Ejercicio1main {

	public static void main(String[] args) {
		
		Trabajador trabajador1 =new Trabajador("Caramelo", "Albacete", 10000, true);
		System.out.println(trabajador1.getNombre());//select / read
		System.out.println(trabajador1.toString());
	}

}
