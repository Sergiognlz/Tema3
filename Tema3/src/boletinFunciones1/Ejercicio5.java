package boletinFunciones1;

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
		// creamos variable valor
		int valor = 0;
		// creamos objeto random
		Random rand = new Random();
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);
		// rellenamos con un for la tabla
		for (int i = 0; i < t.length; i++) {
			t[i] = rand.nextInt(1, 101);
		}
		// pedimos valor
		System.out.println("Introduce un valor");
		// guardamos el valor
		valor = sc.nextInt();
		// llamamos a la funcion e imprimimos el resultado
		System.out.println(buscarTodos(t, valor));

	}

	public static int[] buscarTodos(int t[], int valor) {
		//creamos variable que nos sirve para saber la cuantas veces se encuentra el valor dentro de la tabla t
		int enc = 0;
		//creamos la tabla donde guardaremos las posiciones
		int tabla[];
		//for para recorrer la tabla
		for (int i = 0; i < t.length; i++) {
			// if para buscar el número
			if (t[i] == valor) {
				enc++;
			}
		}
		//inicializamos la tabla 
		tabla= new int[enc];
		// for para recorrer la tabla
		for (int i = 0; i < t.length; i++) {
			// if para buscar el número
			if (t[i] == valor) {
				// cuando el valor de la tabla t sea el mismo que la variable valor, guardamos
				// esa posición en la tabla "tabla"
				tabla[i] = i;
			}
		}
		//devolvemos tabla
		return (tabla);
	}
}
