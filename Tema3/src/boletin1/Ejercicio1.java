package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	/*
	 * Crea una tabla de enteros de longitud 10 que se inicializará con números
	 * aleatorios comprendidos entre 1 y 100.
	 */
	public static void main(String[] args) {

		// creamos una tabla donde guardar los números

		int tabla[] = new int[10];

//creamos objeto random
		Random rand = new Random();

		// creamos un for para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			//cuando la posición vale i, se le asigna el valor random del 1 al 100
			tabla[i] = rand.nextInt(1, 101);
		}
		System.out.println(Arrays.toString(tabla));
	
	}
}
