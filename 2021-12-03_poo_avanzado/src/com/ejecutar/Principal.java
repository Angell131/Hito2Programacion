package com.ejecutar;

import com.base.Animal;
import com.base.Ballena;
import com.base.Gato;
import com.base.Perro;

//encapsulamiento:atributos private accesibles con getter y setter
//mod de acceso:public/private/protected/default
//sobrecarga: 2 metodos con diferente nº o tipo de atributos
//sobreescritura : clase hija con el mismo metodo que la padre
//herencia: extends- java herencia simple
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar la clase animal
		//en java siempre hay constructor por defecto
		//animal no la puedo instanciar por que es abstracta
		//Animal animal=new Animal();
		//String mensaje=animal.saltar();
		//System.out.println(mensaje);
		
		Perro perro =new Perro();
		perro.correr();
		float solucion=perro.calcular(1000);//llamo a un metodo con un parametro y lo pinto en consola
		System.out.println(solucion);
		float dato=perro.calcular(10, 5);
		System.out.println(dato);
		
		Gato gato=new Gato();
		gato.correr();
		
		//polimorfismo ejercicio 3
		Perro perro1=new Perro();
		Gato gato1=new Gato();
		Ballena ballena1=new Ballena();
		
		Animal[] zoo={gato1,perro1,ballena1};
		zoo[1].correr();//polimorfismo basado en herencia cambiando[]entre 0-1-2
		
		
		
		
	}

}
