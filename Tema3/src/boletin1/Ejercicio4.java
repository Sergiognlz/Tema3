package boletin1;

import java.util.Arrays;

public class Ejercicio4 {
	/*
	 * Define un array de 12 números enteros con nombre num y asigna los valores
	 * según la tabla que se muestra a continuación. Muestra el contenido de todos
	 * los elementos del array por consola. ¿Qué sucede con los valores de los
	 * elementos que no han sido inicializados?
	 */
	
	public static void main(String[] args) {
		//creamos tabla num
		int num[]=new int[12];
		
		//asignamos los valores
		num[0]=39;
		num[1]=-2;
		num[4]=0;
		num[6]=14;
		num[8]=5;
		num[9]=120;
		
		//mostramos la tabla por pantalla
		System.out.println(Arrays.toString(num));
	}
}
