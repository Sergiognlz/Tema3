package boletinstring;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2vers2 {
	/*
	 * VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor
	 * alfabéticamente que la contraseña, debe mostrar una cadena con los caracteres
	 * acertados en sus lugares respectivos y asteriscos en los no acertados.
	 */
	public static void main(String[] args) {
		// creamos variable contraseña
		String contraseñaOculta;
		// creamos tabla contraseña oculta
		char tablaOculta[];
		// creamos variable contraseña
		String contraseñaVisible;
		// creamos tabla contraseña visible
		char tablaVisible[];
		// creamos variable palabra para los intentos de acertar del jugador 2
		String palabra;

		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al jugador uno la contraseña a adivinar
		System.out.println("Introduce la contraseña a adivinar");
		// guardamos la contraseñaOculta
		contraseñaOculta = sc.nextLine();
		// guardamos en la tabla el contenido convertido en array de la cadena
		// contraseñaOculta
		tablaOculta = contraseñaOculta.toCharArray();
		// inicializamos la tablaVisible a la longitud
		tablaVisible = new char[tablaOculta.length];

		// indicamos al jugar 2 que debe adivinar la contraseña
		System.out.println("Jugador 2, adivina la contraseña");
		// guardamos la palabra introducida
		palabra = sc.nextLine();

		// comprobamos medienta un while que ambas palabras no sean iguales
		while (!(palabra.equalsIgnoreCase(contraseñaOculta))) {
			// si no la acierta se muestra por consola el error
			System.out.println("La contraseña introducida es errónea");
			//recorremos la tablaOculta
			for (int i = 0; i < tablaOculta.length; i++) {
				//si el valor guardado en la posición de la tablaOculta coincide con el carácter de la palabra
				if (tablaOculta[i] == palabra.charAt(i)) {
					//guardará el valor de la tabla oculta en la tabla visible
					tablaVisible[i] = tablaOculta[i];
					//en caso de que no coincida
				} else {
					//imprimirá un asterisco
					tablaVisible[i] = '*';
				}
				
			}
			//imprimimos la tabla visible mediante un String.valueOf para que lo imprima como cadena
			System.out.println(String.valueOf(tablaVisible));
			// retorno de carro
			System.out.println();
			// volvemos a pedir al jugador que introduzca la contraseña
			System.out.println("Vuelve a intentarlo");
			// guardamos de nuevo
			palabra = sc.nextLine();
			// mensaje de fin de juego
			System.out.println("Has acertado la contraseña");
			// cerramos escaner
			sc.close();
		}
	}
}