package cadenasvol2;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
	 * devolver cuántas veces aparece la palabra en la frase.
	 */

	public static void main(String[] args) {
		// variable frase
		String frase;
		// variable palabra
		String palabra;
		// variable veces
		int veces;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario frase
		System.out.println("Introduce una frase");
		// guardamos frase
		frase = sc.nextLine();
		// pedimos al usuario palabra
		System.out.println("Introduce una palabra");
		// guardamos palabra
		palabra = sc.next();

		// llamamos a la función y guardamos el resultado en veces
		veces = buscaPalabra(frase, palabra);
		// mensaje de resultado
		System.out.println("La palabra se repite en la frase " + veces + " veces");
		// cerramos escaner
		sc.close();
	}

	static int buscaPalabra(String frase, String palabra) {
		// variable veces
		int veces = 0;
		// variable que usaremos como índice de inicio de la búsqueda
		int inicio = 0;
		// creamos una variable de índice donde guardaremos el índice donde lo encuentra
		int indiceEncontrado;
		// recorremos la cadena hasta el final
		for (int i = 0; i < frase.length(); i++) {
			// realizamos búsquedas de substring y
			// guardamos en indiceEncontrado la posición en la que lo encuentra en cada
			// iteración
			indiceEncontrado = (frase.indexOf(palabra, inicio));
			// comprobamos que si lo ha encontrado alguna vez en alguna posición positiva(de
			// cero en adelante) entonces es que está en la frase
			if (indiceEncontrado >= 0) {
				// entonces incrementa veces
				veces++;
				// y establece el nuevo inicio que será el valor actual del índice donde la encontró más la
				// longitud de la palabra
				inicio = indiceEncontrado + palabra.length();

			}
		}

		// devolvemos veces
		return veces;
	}
}
