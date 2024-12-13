package boletinstring;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Disponemos de la siguiente relación de letras mediante la cual es posible
	 * codificar un texto, convirtiendo cada letra del conjunto 1, en su
	 * correspondiente del conjunto 2. El resto de las letras no se modifican. Los
	 * conjuntos se utilizan tanto para codificar mayúsculas como minúsculas,
	 * mostrando siempre la codificación en minúsculas. Un ejemplo: la palabra
	 * «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
	 * codificador, en el que se implemente la función: char codifica(char
	 * conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado
	 * según los conjuntos 1 y 2 que se le pasan.
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
			cCod = codifica(conjunto1, conjunto2, c);
			// concatenamos en fraseCod
			fraseCod += cCod;

		}
		// imprimos resultado
		System.out.println(fraseCod);
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
