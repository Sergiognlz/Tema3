package cadenasvol2;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
	 * siguiente: el primer jugador introduce la contraseña; a continuación, el
	 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
	 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
	 * contraseña.
	 */

	public static void main(String[] args) {

		// creamos variable contraseña
		String contraseña;
		// variable jugador
		String palabraJugador;
		// creamos booleanos de salida para cuando acierte la contraseña
		boolean acierto = false;
		// creamos objeto Scanner
		Scanner sc = new Scanner(System.in);

		// pedimos la contraseña al jugador 1
		System.out.println("Introduce la contraseña jugador 1");
		// guardamos contraseña
		contraseña = sc.next();

		// mensaje de jugador 2
		System.out.println("Jugador 2 acierta la contraseña");
		// guardamos la palabra del jugador
		palabraJugador = sc.next();
		
		// while para que no deje de pedir contraseña hasta que la acierte
		while (!acierto) {

	
			// si el jugador 2 acierta la contraseña... (comparamos con el método equals
			if (palabraJugador.equals(contraseña)) {
				// booleano acierto será true
				acierto = true;
				// si no acierta
			} else {
				// si la palabra del jugador2 es menor que la contraseña
				if (palabraJugador.length() < contraseña.length()) {
					// mensaje de que es menor
					System.out.println("La palabra introducida es menor que la contraseña");

					// si la palabra del jugador2 es mayor que la contraseña
				} else if (palabraJugador.length() > contraseña.length()) {
					// mensaje de que es mayor
					System.out.println("La palabra introducida es mayor que la contraseña");

				}

				System.out.println("Vuelve a intentarlo");
				// guardamos la palabra del jugador
				palabraJugador = sc.next();
			}
			// si acierta saldrá del bucle
		}
		// mensaje de fin de partida
		System.out.println("Enhorabuena. Has acertado");
		// cerramos escaner
		sc.close();
	}

}
