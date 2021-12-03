package com.base;

public abstract class Animal {
	//no se puede instanciar una clase abstracta.no puedes hacer new
	
	//modificadores de acceso: public, protected
	public void correr() {
		System.out.println("animal corriendo");
	}
	//tipo de retorno de un método void, string
	public String saltar() {
		return "animal saltando";
	}
	protected void proteger() {
		System.out.println("animal protegido");
	}
	//metodo privado solo se usa en su clase
	//en amarillo por que no se esta usando
	private void comer() {
		System.out.println("comer en privado");
		
	}
}//cierra clase
