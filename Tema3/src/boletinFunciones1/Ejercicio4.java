package boletinFunciones1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Escribe la función: int buscar(int t[], int clave), que busca de forma
	 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
	 * qué posición lo encuentra; y en caso contrario, devolverá -1.
	 */
	public static void main(String[] args) {
		// creamos variable tabla
		int t[] = new int[100];
		// creamos una tabla auxiliar para volcar la que nos devuelve
		int pos = 0;
		// creamos variable valor
		int clave = 0;
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
		System.out.println("Introduce un valor a buscar en la tabla");
		// guardamos el valor
		clave = sc.nextInt();
		// llamamos a la funcion e imprimimos el resultado
		System.out.println(buscarTodos(t, clave));

	}

	public static int buscarTodos(int t[], int valor) {
		// variable donde guardar la posición cuando la encontremos
		int pos = 0;
		// creo booleano nEnc para cuando no lo encuentre
		boolean nEnc = false;
		// necesitamos un booleano para cuando lo encuentre salir del while
		boolean enc = false;
		// vamos a crear un while para que recorra la tabla hasta que lo encuentre
		while (!enc) {
			// cuando el valor de la tabla sea igual al valor que buscamos entrará en el if
			if (t[pos] == valor) {
				// y cambiará el booleano encontrado a true
				enc = true;
			} else if (pos == (t.length - 1)) {
				// y cambiará el booleano encontrado a true
				enc = true;
				// pero nEnc pasará a ser true, ya que ha terminado de buscar sin encontrarlo
				nEnc = true;
			} else {
				// en caso de no encontrarlo incrementará la posición y lo intentará encontrar
				// de nuevo
				pos++;
			}
		}
		// si no lo ha encontrado entrará en el if
		if (nEnc) {
			// y la posición pasará a ser -1
			pos = -1;
		}
		// devolvemos tabla con los encontrados
		return (pos);
	}
}