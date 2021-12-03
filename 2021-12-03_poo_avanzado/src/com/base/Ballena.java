package com.base;

import com.operaciones.IOperaciones;

//java no soporta herencia multiple.python si
//java se puede heredar una superclass e implementar una interface a la vez
//en java existe implementacion multiple y la herencia es simple
public class Ballena extends Animal implements IOperaciones {
//todas las clases hijas sobreescriben metodos de la clase padre
	public void correr() {
		System.out.println("ballena corriendo");
	}
	
	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("la ballena nada boca arriba");
	}

	@Override
	public String respirar() {//si pones private te da un error
		// TODO Auto-generated method stub
		return "la ballena respira fuera del agua";
	}
	
	
	
	
	
}//cierra ballena
