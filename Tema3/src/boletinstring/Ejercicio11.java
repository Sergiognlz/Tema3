package boletinstring;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * Realizar un programa descodificador. La solución es tan sencilla como
	 * utilizar la función diseñada en el ejercicio anterior intercambiando los
	 * conjuntos entre sí.
	 */
	
	public static void main(String[] args) {
		// creamos tabla conjunto1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// creamos tabla conjunto2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// variable donde guardamos el carácter de la palabra
		char c;
		// variable carácter codificado
		char cCod;
		// variable frase
		String frase;
		// variable frase codificada
		String fraseCod = "";
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos frase al usuario
		System.out.println("Introduce una frase");
		// guardamamos frase
		frase = sc.nextLine().toLowerCase();
		// for para recorrer la palabra
		for (int i = 0; i < frase.length(); i++) {
			// guardamos el caracter en c
			c =frase.charAt(i);
			// llamamos a la función codifica y guardamos lo que devuelve en la variable
			// cCod
			cCod = codifica(conjunto2, conjunto1, c);
			// concatenamos en fraseCod
			fraseCod += cCod;

		}
		// imprimos resultado
		System.out.println(fraseCod);
		//cerramos escaner
		sc.close();
	}

	// creamos una función que codifique el carácter
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		// creamos variable cCodificado
		char cCodificado = c;
		// for para recorrer el conjunto uno
		for (int i = 0; i < conjunto1.length; i++) {
			// si el carácter está en la tabla conjunto 1
			if (c == conjunto1[i]) {
				// el carácter codificado será igual de la misma posición del conjunto2;
				cCodificado = conjunto2[i];
			}
		}
		// devuelve el carácter codificado
		return cCodificado;
	}
}