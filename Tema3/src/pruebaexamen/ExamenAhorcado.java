package pruebaexamen;

import java.util.Random;
import java.util.Scanner;

public class ExamenAhorcado {

	// variable global tabla donde guardamos las palabras aleatorias
	static String palabra[] = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "brazo",
			"familia" };
	// constante global número de intentos que tendrá el jugador
	static int NUMINTENTOS = 7;
//variable donde guardaremos la palabra a acertar
	static String palabraSecreta;
//variable global donde se almacenará la pista del juego
	static String palabraPista = "";
//variable global donde se amacenarán las letras usadas pero que no se encuentran en la palabra
	static String noAcertadas = "";
//objeto escaner global
	static Scanner sc = new Scanner(System.in);
//objeto random global
	static Random rand = new Random();

	public static void main(String[] args) {

	}

//almacena en palabraSecreta una palabra aleatoria de la tabla palabra
	static void generaPalabra() {
		// asignamos palabra aleatoria
		palabraSecreta = palabra[rand.nextInt(0, palabra.length)];
	}

//menú del juego
	static int menu() {
		// variable opción
		int opcion;
		// do while para controlar el rango
		do {
			// menú
			System.out.println("Seleccione una de las siguientes opciones:");
			System.out.println("1. Introducir letra");
			System.out.println("2. Introducir palabra");
			// guardamos opción
			opcion = sc.nextInt();
			// mientras opción este fuera de rango seguirá pidiendola
		} while (opcion < 1 || opcion > 2);

		// devolvemos opción
		return opcion;

	}

	// comprueba si la letra está en palabra a acertar. Si está actualiza
	// palabraPista con las posciones acertadas. En caso contrario añade a no
	// acertadas
	static void compruebaLetra(char letra) {
		// variable posición
		int pos = palabraSecreta.indexOf(letra);

		// si la posición en menor que 0, es decir, que no encuentra la letra en la
		// cadena palabraSecreta...
		if (pos < 0) {
			// concantena la letra a la cadena vacía noAcertadas
			noAcertadas += letra;
			// en caso de que si la encuentre...
		} else {
			// do while para repetir para que cambie la cadena palabraPista mientras
			// encuentre la letra en la palabraSecreta
			do {

				// asignamos a palabra pista concatenando el substring de la cadena palabraPista
				// desde la posición 0 hasta la posición en la que ha encontrado la letra + la
				// letra+ la substring de la cadena palabraPista desde la posición +1 hasta el
				// final
				palabraPista = palabraPista.substring(0, pos) + letra
						+ palabraPista.substring(pos + 1, palabraPista.length());
				// si la encuentra encontrada será true

				// sino la encuentra

				// volvemos a inicializar posición esta vez a la posición actual +1
				pos = palabraSecreta.indexOf(letra, pos + 1);
				// cuando no encunetre la letra en la palabraSecreta saldrá del bucle
			} while (pos >= 0);
		}
	}

	// función que inicializa palabraPista
	static void iniPista() {
		// recorremos palabraSecreta
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// y concatenamos tantos guiones como longitud tenga la palabra
			palabraPista += '-';
		}

	}

}
