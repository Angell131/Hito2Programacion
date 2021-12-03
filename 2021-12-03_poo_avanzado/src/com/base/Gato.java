package com.base;

public class Gato extends Animal {

	//override- sobreescritura: metodo de la clase hija se sobreescribe en la clase padre
	//firma del metodo java: nombre+ argumentos*NO el tipo de retorno
	public void correr() {
		System.out.println("gato corriendo");
	}
	//sobrecarga
	public String correr(String lugar) {//firma: nombre+argumentos=>diferentes argumentos
		return "el gato corre por el "+lugar;
	}
	
	
}
