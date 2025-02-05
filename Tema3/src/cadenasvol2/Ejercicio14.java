package cadenasvol2;

import java.util.Scanner;

public class Ejercicio14 {
	/*
	 * Diseñar un algoritmo que lea del teclado una frase e indique, para las letras
	 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
	 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un
	 * ejemplo sería:
	 */
	public static void main(String[] args) {
		// variable frase
		String frase;
		// variable cadena abecedario
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		// variable contador de letras
		int contLetra = 0;
		// variable letra
		char letra;
		// variable letra auxiliar
		char letraAnterior = '0';
		// booleano distinta
		boolean distinta = false;

		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos frase al usuario
		System.out.println("Introduce una frase");
		// guardamos frase
		frase = sc.nextLine().toLowerCase();

		// creamos un for para recorrer la frase
		for (int i = 0; i < abecedario.length(); i++) {
			// y pone el contador a 0
			contLetra = 0;

			// inicializamos letra al carácter de la frase en la posición que recorre el for
			letra = abecedario.charAt(i);

			// dentro creamos otro for para recorrer de nuevo la frase
			for (int j = 0; j < frase.length(); j++) {
				// y comparamos letra con el caracter
				if (letra == frase.charAt(j)) {
					// si lo encuentra incrementa el contador
					contLetra++;

				}
			}
				// cuando acaba de buscar en el for interno comprueba si la letra actual es
				// igual a la anterior
				if (contLetra > 0) {
					// si es distinta imprime el resultado
					System.out.println("Letra " + letra + ": " + contLetra);
				}

			
		}

		// cerramos escaner
		sc.close();
	}
}
