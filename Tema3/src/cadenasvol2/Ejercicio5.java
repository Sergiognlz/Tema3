package cadenasvol2;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
	 * completa separando las palabras introducidas con espacios en blanco. Terminar
	 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
	 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
	 * “fin” no aparecerá en la frase final.
	 */
	public static void main(String[] args) {
		// creamos variable palabra
		String palabra;
		// creamos variable frase
		String frase = "";
		// creamos variable booleano fin
		boolean fin = false;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		while (!fin) {
			// pedimos al usuario que introduzca palabras
			System.out.println("Introduce palabras para formar una frase. Escribe \"fin\" para salir y mostrar frase.");
			// guardamos cadena en palabra
			palabra = sc.next();
			// con un if controlamos si la palabra introducida es "fin"
			if (palabra.equalsIgnoreCase("fin")) {
				// si lo es, booleano fin será true
				fin = true;
				// si no es fin...
			} else {
				// concatenará la palabra y un espacio a la frase para formarla correctamente
				frase += (palabra + " ");
			}
		}
		// una vez que el usuario introduzca "fin" mostraremos la frase por consola
		System.out.println(frase);

		// y cerramos escaner
		sc.close();

	}
}
