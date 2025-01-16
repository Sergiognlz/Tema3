package cadenasvol2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * Implementar el juego del anagrama, que consiste en que un jugador escribe una
	 * palabra o frase, y la aplicación muestra un anagrama (transposición de los
	 * caracteres) del texto introducido generado al azar. A continuación otro
	 * jugador tiene que acertar cuál es el texto original. La aplicación no debe
	 * permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por
	 * ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista
	 * un anagrama al azar: “etcloda”. Crea una función que realice la desordenación
	 * del texto.
	 */

	public static void main(String[] args) {
		// variable palabra jugador 1
		String palabra1;
		// variable palabraCodificada
		String palabraDesordenada = "";
		// variable palabra jugador 2
		String palabra2;
		// variable auxiliar
		char aux;
		// variable índice aleatorio
		int indAlt;
		// objeto escaner
		Scanner sc = new Scanner(System.in);
		// objeto random
		Random rand = new Random();

		do {
			// pedimos palabra al jugador 1
			System.out.println("Introduce una palabra");
			// guardamos palabra
			palabra1 = sc.next().toLowerCase();
			// mientras la palabra sea cadena vacía seguirá preguntando
		} while (palabra1 == "");
		
		//guardamos la palabra1 en palabra desordenada para desordenarla
		palabraDesordenada=palabra1;
		// for para recorrer la palabra
		for (int i = 0; i < palabraDesordenada.length(); i++) {
			// guardamos el carácter en la posición i en la variable auxiliar
			aux = palabraDesordenada.charAt(i);
			// generamos índice aleatorio
			indAlt = rand.nextInt(0, palabraDesordenada.length());

			// reemplazamos el carácter en posición i por el carácter en posición aleatoria
			palabraDesordenada=palabraDesordenada.replace(palabraDesordenada.charAt(i), palabraDesordenada.charAt(indAlt));
			//y remplazamos el valor en la posición aleatoria por el que se encontraba en la posición i
			palabraDesordenada=palabraDesordenada.replace(palabraDesordenada.charAt(indAlt),aux);

		}
		//imprimimos cadena desordenada
		System.out.println(palabraDesordenada);

		// cerramos escaner
		sc.close();
	}
}
