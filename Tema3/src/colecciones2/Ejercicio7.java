package colecciones2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio7 {
	/*
	 * Clasificación de palabras: Crea un mapa cuya clave sea un número y su valor
	 * sea un conjunto de palabras, de forma que se clasifiquen las palabras por su
	 * longitud, es decir, en el conjunto con clave 3 se almacenarán palabras de
	 * longitud 3, en el conjunto de clave 4 se almacenarán palabras de longitud 4,
	 * y así sucesivamente.
	 */
	public static void main(String[] args) {
		// creamos mapa
		TreeMap<Integer, Set<String>> clasPal = new TreeMap<>();
		// creamos lista
		Set<String> palabras;
		// variable longitud palabra;
		int longPal;
		// variable palabra;
		String palabra;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		System.out.println();
		// pedimos palabra al usuario
		System.out.println("Introduce palabras para almacenarlas. Introduce FIN para salir");
		// guardamos palabra
		palabra = sc.next();

		// cuando introducimos FIN salimos del bucle
		while (!palabra.equalsIgnoreCase("FIN")) {
			// medimos la palabra
			longPal = palabra.length();
			// comprobamos si se encuentra en el mapa
			if (clasPal.containsKey(longPal)) {
				// guardamos conjunto en palabras
				palabras = clasPal.get(longPal);
				// insertamos palabra en conjunto palabras
				palabras.add(palabra);
				// mensaje éxito
				System.out.println("La palabra se ha añadido con éxito");

				// en caso de que no se encuentre
			} else {
				// crea el conjunto
				palabras = new HashSet<>();
				// añadimos la pala
				palabras.add(palabra);
				// insertamos longitud y conjunto palabras
				clasPal.put(longPal, palabras);
				// mensaje de éxito
				System.out.println("Se ha creado la longitud y se ha añadido la palabra correctamente");
			}

			System.out.println();
			// pedimos palabra al usuario
			System.out.println("Introduce palabras para almacenarlas. Introduce FIN para salir");
			// guardamos palabra
			palabra = sc.next();

		}
		System.out.println();
		// mostramos resultados
		System.out.println(clasPal);
		System.out.println();
		// mensaje fin de programa
		System.out.println("Fin de programa");
		// cerramos escaner
		sc.close();
	}
}
