package boletinstring;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Implementa un programa que lea una frase y muestre todas sus palabras
	 * ordenadas de forma alfabética. Suponemos que cada palabra de la frase se
	 * separa de otra por un único espacio.
	 */
	public static void main(String[] args) {
		// creamos variable frase
		String frase;
		// creamos variable tablaFrase
		String tablaFrase[];
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos frase al usuario
		System.out.println("Introduce una frase");
		// guardamos la frase
		frase = sc.nextLine();
		// convertimos la frase a array de String que guarda cada palabra de la frase en
		// una posición del array
		tablaFrase = frase.split(" ");
		// ordenamos con el método arrays.sort
		Arrays.sort(tablaFrase);
		// usamos el método String.join para guardar en frase el contenido del array
		// tablaFrase con espacios entre los valores
		frase = String.join(" ", tablaFrase);
		//imprimimos resultado
		System.out.println(frase);

		// cerramos escaner
		sc.close();
	}

}