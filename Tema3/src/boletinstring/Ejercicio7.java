package boletinstring;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
	 * devolver cuántas veces aparece la palabra en la frase.
	 */
	public static void main(String[] args) {
		// creamos variable frase
		String frase;
		// creamos variable palabra
		String palabra;
		// creamos variable contador
		int cont;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos frase al usuario
		System.out.println("Introduce una frase");
		// guardamos la frase
		frase = sc.nextLine();
		// pedimos palabra al usuario
		System.out.println("Introduce una palabra a buscar");
		// guardamos palabra
		palabra = sc.next();

		// guardamos en contador el resultado de llamar a la función buscaPalabra
		cont = buscaPalabra(frase, palabra);
		// imprimimos resultado
		System.out.println("La palabra se encuentra " + cont + " veces");
		// cerramos escaner
		sc.close();
	}

	static int buscaPalabra(String frase, String palabra) {
		// creamos variable contador
		int cont = 0;
		// creamos variable índice
		int indice = 0;
		// creamos variable posición
		int pos =frase.indexOf(palabra, indice); ;

		// creamos un while que repetirá hasta que el método de un número negativo(lo da
		// cuando no encuentra la palabra)
		while (pos > 0) {
			// si da positivo (lo encuentra) incrementamos contador
			cont++;
			// el nuevo índice
			indice = pos + palabra.length();
			// volvemos a inicializar posición usando el nuevo índice
			pos = frase.indexOf(palabra, indice);

		}

		// devolvemos contador
		return cont;
	}
}