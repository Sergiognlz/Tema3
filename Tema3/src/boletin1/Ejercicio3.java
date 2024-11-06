package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Escribe un programa que lea 10 números por teclado, los almacene en una
	 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
	 * introduce es el último en mostrarse.
	 */

	public static void main(String[] args) {
		// creamos tabla
		int tabla[] = new int[10];
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// for para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// pedimos número al usuario
			System.out.println("Introduce un valor para la posición " + (i + 1));
			// guardamos el valor
			tabla[i] = sc.nextInt();
		}
		// creamos otro for para recorrer la tabla de manera inversa
		// damos el valor a j de la longitud de la tabla menos 1 porque las posiciones
		// de la tabla van de 0 a 9
		for (int j = tabla.length - 1; j >= 0; j--) {
			// mostramos los valores
			System.out.println(tabla[j]);
		}
		//cerramos escaner
		sc.close();

	}
}
