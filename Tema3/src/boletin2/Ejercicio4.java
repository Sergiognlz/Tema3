package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
	 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
	 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
	 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
	 * más alta a la más baja).
	 */
	public static void main(String[] args) {
		// creamos dos tablas
		int tabla1[] = new int[8];
		int tabla2[] = new int[8];
		// creamos una variable para usar como incremento del índice
		int ind = 0;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// creamos un for para recorrer la tabla 1
		for (int i = 0; i < tabla1.length; i++) {
			// creamos un do while para controlar los valores de entrada
			do {
				// pedimos puntuación al usuario
				System.out.println("Introduce la puntuación del jugador " + (i+1));
				// guardamos el valor
				tabla1[i] = sc.nextInt();
			} while (tabla1[i]<1000||tabla1[i]>2800);
		}
		// ordenamos la tabla 1
		Arrays.sort(tabla1);
		// una vez ordenada creamos otro for para recorrer la tabla2
		for (int j = (tabla1.length - 1); j >= 0; j--) {
			tabla2[j] = tabla1[ind];
			ind++;

		}
		// mostramos tabla por pantalla
		System.out.println(Arrays.toString(tabla2));
		//cerramos escaner
		sc.close();
	}

}
