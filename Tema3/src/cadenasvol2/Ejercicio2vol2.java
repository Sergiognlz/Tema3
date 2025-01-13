package cadenasvol2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2vol2 {
	/*
	 * VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor
	 * alfabéticamente que la contraseña, debe mostrar una cadena con los caracteres
	 * acertados en sus lugares respectivos y asteriscos en los no acertados.
	 */

	public static void main(String[] args) {

		// creamos variable contraseña
		String contraseña;
		// variable jugador
		String palabraJugador;
		// varabla palabraJugadorTabla
		char palabraJugadorTabla[];
		// creamos contraseña tabla cifrada
		char contraseñaCifradaTabla[];
		// creamos booleanos de salida para cuando acierte la contraseña
		boolean acierto = false;
		// creamos objeto Scanner
		Scanner sc = new Scanner(System.in);

		// pedimos la contraseña al jugador 1
		System.out.println("Introduce la contraseña jugador 1");
		// guardamos contraseña
		contraseña = sc.next();
		// inicializamos la tabla
		contraseñaCifradaTabla = new char[contraseña.length()];
		// recorremos la contraseña con un for
		for (int i = 0; i < contraseña.length(); i++) {
			// y por cada iteración concatenamos con un asterisco
			contraseñaCifradaTabla[i] = '*';
		}
		// mensaje de jugador 2
		System.out.println("Jugador 2 acierta la contraseña");
		// guardamos la palabra del jugador
		palabraJugador = sc.next();
		// convertimos palabraJugador en array
		palabraJugadorTabla = palabraJugador.toCharArray();

		// while para que no deje de pedir contraseña hasta que la acierte
		while (!acierto) {

			// si el jugador 2 acierta la contraseña... (comparamos con el método equals
			if (palabraJugador.equals(contraseña)) {
				// booleano acierto será true
				acierto = true;
				// si no acierta
			} else {

				// for para recorrer la contraseña
				for (int i = 0; i <palabraJugador.length(); i++) {
					// cuando el carácter de la contraseña coincida con el carácter de la cadena
					if (contraseña.charAt(i) == palabraJugador.charAt(i)) {
						// sustituimos los asteriscos por el caracter de la palabra del jugador
						contraseñaCifradaTabla[i] = palabraJugadorTabla[i];
					}
				}
				// mostramos contraseña cifrada
				System.out.println(Arrays.toString(contraseñaCifradaTabla));
				// mesanje vuelve a intentarlo
				System.out.println("Vuelve a intentarlo");
				// guardamos la palabra del jugador
				palabraJugador = sc.next();
				// convertimos palabraJugador en array
				palabraJugadorTabla = palabraJugador.toCharArray();
			}

		}

		// mensaje de fin de partida
		System.out.println("Enhorabuena. Has acertado");
		// cerramos escaner
		sc.close();
	}

}
