package boletinJuegos;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Realiza una función que reciba como parámetro una tabla bidimensional de
	 * enteros y un valor. Debe devolver un booleano indicando si dicho valor se
	 * encuentra en la tabla o no.
	 */
	public static void main(String[] args) {
		// variable tabla bidimensional
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// variable valor
		int valor;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos valor
		System.out.println("Introduce un valor");
		// guardamos valor
		valor = sc.nextInt();

		// llamamos a la función y comprobamos con un if
		if (buscaTabla(tabla, valor)) {
			//imprimimos que se encuentra el valor
			System.out.println("El valor introducido se encuentra en la tabla");
		}else {
			//imprimimos que no se encuentra el valor
			System.out.println("El valor introducido no se encuentra en la tabla");
		}

	}

	static boolean buscaTabla(int[][] tabla, int valor) {
		// variable booleano encontrado
		boolean enc = false;
		// variable filas
		int fila = 0;
		// variable columna
		int colum = 0;

		// Como es una búsqueda usamos dos whiles(ya que es una tabla bidimensional) uno
		// para las filas y otro para las columnas
		// recorremos filas
		while (!enc&&fila<tabla.length) {
			// recorremos columnas
			while (!enc&&colum<tabla[fila].length) {
				// comprobamos que el valor de la tabla sea el que buscam os
				if (tabla[fila][colum] == valor) {
					// de ser así lo habrá encontrado y cambiamos el booleano
					enc = true;
				}
				// incrementamos las columnas
				colum++;
			}
			// incrementamos las filas
			fila++;
		}

		// devolvemos booleano
		return enc;
	}

}
