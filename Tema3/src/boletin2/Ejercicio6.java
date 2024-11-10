package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	/*
	 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
	 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
	 * (ordenada) con los 6 números de la combinación ganadora. La combinación
	 * ganadora debe establecerse en el momento de crear la tabla. El programa
	 * devolverá el número de aciertos.
	 */
	public static void main(String[] args) {
		// creamos las dos tablas
		int tabla1[] = new int[6];
		int tabla2[] = { 4, 8, 15, 16, 23, 42 };
		// variable contador para los aciertos
		int cont = 0;
		// creamos objeto random
		Random rand = new Random();

		// mensaje de información
		System.out.println("Vamos a jugar a la lotería");
		// creamos un for para recorrer la tabla1
		for (int i = 0; i < tabla1.length; i++) {
			// asignamos valores aleatorios a la tabla entre 1 y 49
			tabla1[i] = rand.nextInt(1, 50);
		}
		// creamos un for para comparar los valores de las tablas
		for (int j = 0; j < tabla1.length; j++) {
			// comparamos los valores de las dos tablas
			if (tabla1[j] == tabla2[j]) {
				// incremento contador
				cont++;
			}
		}
		//mostramos el resultado por pantalla
		System.out.println("Cantidad de aciertos: "+cont);
		
	}
}
