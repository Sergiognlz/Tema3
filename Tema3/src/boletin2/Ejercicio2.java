package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
	 * primeros en un array y los 10 últimos en otro array. Por último, comparará
	 * ambos arrays y le dirá al usuario si son iguales o no.
	 */
	public static void main(String[] args) {
		// creamos tabla 1
		int tabla1[] = new int[10];
		// tabla 2
		int tabla2[] = new int[10];
		// variable numero
		int num;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// creamos un for para recorrer las dos tablas
		for (int i = 0; i < tabla1.length; i++) {
			// pedimos número al usuario
			System.out.println("Introduce el número de la posición " + (i + 1)+" de la tabla 1");
			// guardamos valor
			num = sc.nextInt();
			// asignamos valores a tabla1
			tabla1[i] = num;
		}
		for (int j = 0; j < tabla2.length; j++) {
			// pedimos número al usuario
			System.out.println("Introduce el número de la posición " + (j + 1)+" de la tabla 2");
			// guardamos valor
			num = sc.nextInt();
			// asignamos valores a tabla1
			tabla2[j] = num;
		}
		// con un if comparamos las tablas
		if (Arrays.equals(tabla1, tabla2)) {
			// mensaje son iguales
			System.out.println("Las tablas son iguales");
			// en caso contrario
		} else {
			// no son iguales
			System.out.println("Las tablas no son iguales");
		}

		// cerramos escaner
		sc.close();
	}
}
