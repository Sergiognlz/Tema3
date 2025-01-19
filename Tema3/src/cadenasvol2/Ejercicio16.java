package cadenasvol2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * Modificar el ejercicio anterior para que el programa indique al jugador 2, en
	 * cada intento, cuántas letras coinciden con el texto original.
	 */

	public static void main(String[] args) {
		// variable palabra jugador 1
		String palabra1 = "";
		// variable palabraCodificada
		String palabraDesordenada = "";
		// tabla desordenada
		char tablaDesordenada[];
		// variable palabra jugador 2
		String palabra2;
		// variable auxiliar
		char aux;
		// variable índice aleatorio
		int indAlt;
		// booleano para salir del bucle de acierto/fallo
		boolean acierto = false;
		// variable contador
		int cont = 0;
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

		// guardamos la palabra1 en palabra desordenada para desordenarla
		tablaDesordenada = palabra1.toCharArray();
		// for para recorrer la palabra
		for (int i = 0; i < tablaDesordenada.length; i++) {
			// guardamos el carácter en la posición i en la variable auxiliar
			aux = tablaDesordenada[i];
			// generamos índice aleatorio
			indAlt = rand.nextInt(0, tablaDesordenada.length);

			// reemplazamos el carácter en posición i por el carácter en posición aleatoria
			tablaDesordenada[i] = tablaDesordenada[indAlt];
			// y remplazamos el valor en la posición aleatoria por el que se encontraba en
			// la posición i
			tablaDesordenada[indAlt] = aux;

		}
		//convertimos tablaDesordenada en una cadena con el método valueOf
		palabraDesordenada = palabraDesordenada.valueOf(tablaDesordenada);

		// imprimimos cadena desordenada
		System.out.println("Jugador 2 averigua el anagrama de " + palabraDesordenada);
		//do while para repetir hasta que acierte
		do {
			// comparamos ambas
			// guardamos lo que introduce el jugador dos
			palabra2 = sc.next();
			// comprobamos si ha acertado
			if (palabra2.equalsIgnoreCase(palabra1)) {
				// mensaje de acierto
				System.out.println("¡Has acertado!");
				// acierto será true
				acierto = true;
				//en caso que no sean iguales
			} else {
				// si no hacierta se informa y se pregunta otra vez
				System.out.println("No has acertado");
				//si la longitud de ambas cadenas son iguales...
				if (palabra1.length() == palabra2.length()) {
					//recorre la primera hasta el final sin miedo a salirse
					for(int i=0;i<palabra1.length();i++) {
					//si los caracteres de ambas palabras coinciden...
					if (palabra2.charAt(i) == palabra1.charAt(i)) {
						//incrementa contador
						cont++;
					}
					}
					//mensaje de las letras que ha acertado
					System.out.println("Has acertado "+cont+" letras");
					//mensaje de pista
					System.out.println("Intentalo de nuevo. Pista: " + palabraDesordenada);
					//reinicio de contador
					cont=0;
					//en caso de que las palabras tengan longitudes distintas y se pueda salir al compararlas...
				} else {
					//no hará la comparación e informará al usuario de que tienen longitud distintas
					System.out.println("La palabra introducida no tiene la misma longitud que el anagrama a adivinar");
				}
			}

			// si acierta saldrá del programa
		} while (!acierto);
		// mensaje fin
		System.out.println("Fin programa");
		// cerramos escaner
		sc.close();
	}
}