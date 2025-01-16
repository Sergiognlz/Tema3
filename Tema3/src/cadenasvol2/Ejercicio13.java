package cadenasvol2;

import java.util.Scanner;

public class Ejercicio13 {
	/*
	 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
	 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
	 * mora. Construir una función que recibe dos palabras por parámetro e indique
	 * si son anagramas una de otra.
	 */
	public static void main(String[] args) {
		// variable palabra1
		String palabra1;
		// variable palabra2
		String palabra2;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos palabra 1 al usuario
		System.out.println("Introduce una palabra");
		// guardamos palabra1
		palabra1 = sc.next().toLowerCase();
		// pedimos palabra2
		System.out.println("Introduce una segunda palabra para comprobar si es anagrama de la primera");
		// guardamos palabra2
		palabra2 = sc.next().toLowerCase();

		// cerramos escaner
		sc.close();
	}

	static boolean anagrama(String palabra1, String palabra2) {
		// variable booleana anagrama inicializada a true
		boolean anagrama = true;
		// variable contador para recorrer la palabra
		int cont = 0;

		// creamos un while para recorrer palabra1 mientras anagrama sea true
		while (anagrama && cont < palabra1.length()) {
			// se hace una búsqueda en la palabra 1 de los caracteres de la 2, y si no lo
			// encuentra dará un número negativo, por lo que entrará al if
			if (palabra1.indexOf(palabra2.charAt(cont)) < 0) {
				// y no será anagrama
				anagrama = false;

			}
			// hacemos lo mismo pero con la palabra2 buscando los caracteres de la 1
			if (palabra2.indexOf(palabra1.charAt(cont)) < 0) {
				// y no será anagrama
				anagrama = false;

			}

			// incrementamos contador
			cont++;
		}

		// devolvemos anagrama
		return anagrama;
	}
}
