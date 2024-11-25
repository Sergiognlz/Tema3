package boletinJuegos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
	/*
	 * Realiza una función que reciba como parámetro una tabla unidimensional de
	 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
	 * entrada, no se devuelve una nueva tabla.
	 */
	public static void main(String[] args) {
		// variable tabla
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println(Arrays.toString(desordena(tabla)));
	}

	static int[] desordena(int[] tabla) { 
		// creamos variable auxiliar para guardar el valor que se intercambia
		int aux;
		// variable indice aleatorio
		int altInd;
		// creamos objeto random
		Random rand = new Random();

		// creamos un for para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// guardamos el valor de la tabla en un número auxiliar para usarlo despues
			aux = tabla[i];
			// generamos un índice aleatorio
			altInd = rand.nextInt(0, tabla.length);
			// asignamos el valor de la tabla uno aleatorio
			tabla[i] = tabla[altInd];
			// y a la posición aletaroia el nuevo valor
			tabla[altInd] = aux;

		}

		// devolvemos tabla
		return tabla;
	}
}
