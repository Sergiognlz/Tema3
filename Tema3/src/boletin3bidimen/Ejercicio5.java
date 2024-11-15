package boletin3bidimen;

import java.util.Random;

public class Ejercicio5 {
	/*
	 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
	 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
	 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
	 * filas y columnas, igual que si de una hoja de cálculo se tratara. La suma
	 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben
	 * mostrarse dichas sumas parciales sería:
	 */
	public static void main(String[] args) {
		// creamos tabla
		int tabla[][] = new int[4][5];
		// variable suma columna
		int sumaCol = 0;
		// variable suma fila
		int sumaFil = 0;
		// variable suma total
		int sumaTot = 0;
		// creamos objetos random
		Random rand = new Random();

		// for para rellenar
		for (int i = 0; i < tabla.length; i++) {
			sumaFil = 0;
			for (int j = 0; j < tabla[0].length; j++) {
				// rellenamos
				tabla[i][j] = rand.nextInt(100, 1000);
				sumaFil += tabla[i][j];
				System.out.print(tabla[i][j] + "\t");
			}
		
			sumaTot += sumaFil;
			System.out.print(sumaFil);
			System.out.println();

		}
		// for para mostrar
		for (int j = 0; j < tabla[0].length; j++) {
			sumaCol = 0;

			for (int i = 0; i < tabla.length; i++) {
				sumaCol += tabla[i][j];
			}
			
			System.out.print(sumaCol+"\t");
		;

		}
	
		System.out.print(+sumaTot);
	}
}
