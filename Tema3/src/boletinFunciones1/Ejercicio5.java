package boletinFunciones1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
	 * devuelve una tabla con todos los índices de los elementos donde se encuentra
	 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
	 * t, la función devolverá una tabla vacía.
	 */

	public static void main(String[] args) {
		// creamos variable tabla
		int t[] = new int[100];
		// creamos una tabla auxiliar para volcar la que nos devuelve
		int tEnc[] = new int[0];
		// creamos variable valor
		int valor = 0;
		// creamos objeto random
		Random rand = new Random();
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);
		// rellenamos con un for la tabla
		for (int i = 0; i < t.length; i++) {
			// generamos un número aleatorio entre 1 y 100
			t[i] = rand.nextInt(1, 101);
		}
		// pedimos valor
		System.out.println("Introduce un valor");
		// guardamos el valor
		valor = sc.nextInt();
		// llamamos a la funcion e imprimimos el resultado

		// guardamos lo que nos devuelve la función en una tabla
		tEnc = buscarTodos(t, valor);
		// imprimimos la tabla de con las posiciónes encontradas
		System.out.println(Arrays.toString(tEnc));
		// esto solo lo hacemos para comprobar que el ejercicio está bien, no es
		// necesario
		Arrays.sort(t);
		System.out.println(Arrays.toString(t));
	}

	public static int[] buscarTodos(int t[], int valor) {
		// creamos variable que nos sirve para saber la cuantas veces se encuentra el
		// valor dentro de la tabla t
		int enc = 0;
		// creamos la tabla donde guardaremos las posiciones
		int tabla[];
		// tenemos que crear un variable que cuente las posiciones de la nueva tabla.
		// Probablemente no sea necesaria pero no me funciona sin ella
		int j = 0;
		// for para recorrer la tabla
		for (int i = 0; i < t.length; i++) {
			// if para buscar el número
			if (t[i] == valor) {
				//contamos las veces que encontramos el valor en la tabla
				enc++;
			}
		}
		// inicializamos la tabla
		tabla = new int[enc];
		// for para recorrer la tabla
		for (int i = 0; i < t.length; i++) {
			// if para buscar el número
			if (t[i] == valor) {
				// cuando el valor de la tabla t sea el mismo que la variable valor, guardamos
				// esa posición en la tabla "tabla"
				tabla[j] = i;
				//incrementamos j para que avance en la tabla donde guardamos la posición de los encontrados
				j++;
			}

		}
		// devolvemos tabla con los encontrados
		return (tabla);
	}
}
