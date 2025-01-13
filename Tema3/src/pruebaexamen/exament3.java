package pruebaexamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exament3 {
	//creamos escaner a nivel de clase
		static Scanner sc = new Scanner(System.in);

	//método main
		public static void main(String[] args) {
			// creamos variable fila
			int filas = 0;
			// creamos variable columnas
			int columnas = 0;
			// creamos la tabla tableroMaquina
			char tableroMaquina[][] = new char[filas][columnas];
			// creamos la tabla tableroJugador1
			char tableroJugador1[][] = new char[filas][columnas];
			// creamos la tabla tableroJugador2
			char tableroJugador2[][] = new char[filas][columnas];
			// creamos variable para el número de barquitos
			int numBarquitos;
			// booleano pasa turno
			boolean repiteTurno = true;
			// creamos contador jugador 1
			int contJug1 = 0;
			// creamos contador jugador 2
			int contJug2 = 0;
			// booleano
			boolean impacto = false;

			// introducimos juego
			System.out.println("Vamos a jugar a Hundir la Flota. Introduce las dimensiones del tablero");
			// pedimos filas
			System.out.println("Introduce filas");
			// guardamos filas
			filas = sc.nextInt();
			// pedimos columnas
			System.out.println("Introduce columnas");
			// guardamos columnas
			columnas = sc.nextInt();

			// el número de barquitos será igual a la raiz cuadrada redondeada de filas por
			// columnas
			numBarquitos = (int) Math.sqrt(filas * columnas);
			// inicializamos el tablero del jugador uno llamando a la función
			// correspondiente
			tableroJugador1 = inicializaTablero(filas, columnas);
			// inicializamos el tablero del jugador dos llamando a la función
			// correspondiente
			tableroJugador2 = inicializaTablero(filas, columnas);
			// inicializamos el tablero de la máquina
			tableroMaquina = creaTablero(filas, columnas);
			// generamos los barcos aleatoriamente
			generarBarquitos(tableroMaquina, numBarquitos);

			// controlaremos mediante un while que repita el proceso
			while (contJug1 < numBarquitos && contJug2 < numBarquitos) {

				// do while para repetir cada turno mientras no haya encontrado todos los barcos
				// o haya dado agua
				while (contJug1 < numBarquitos && repiteTurno) {

					// imprimimos mensaje de jugador
					System.out.println("Turno Jugador 1");
					// pintamos tablero
					pintaTablero(tableroJugador1);
					// impacto será true si ha encontrado un barco
					impacto = turnoJugador(tableroMaquina, tableroJugador1);
					// if para que cuando haya un impacto incremente el contador y repita turno
					if (impacto) {
						// incrementamos contador jugador 1
						contJug1++;
						// repite turno será true
						repiteTurno = true;
					} else {
						// si no encuentra barco, no repetirá turno
						repiteTurno = false;
					}
					// vuelve a pintar el tablero modificado
					pintaTablero(tableroJugador1);
					// cuando no encuentre barco pasará al siguiente turno
				}

				// inicializamos a false el booleano
				repiteTurno = true;
				// do while para repetir cada turno mientras no haya encontrado todos los barcos
				// o haya dado agua
				while (contJug1 < numBarquitos && repiteTurno && contJug2 < numBarquitos) {

					// imprimimos mensaje de jugador
					System.out.println("Turno Jugador 2");
					// pintamos tablero
					pintaTablero(tableroJugador2);
					// impacto será true si ha encontrado un barco
					impacto = turnoJugador(tableroMaquina, tableroJugador2);
					// if para que cuando haya un impacto incremente el contador y repita turno
					if (impacto) {
						// incrementamos contador jugador 2
						contJug2++;
						// si encuentra barco repite turno
						repiteTurno = true;
					} else {
						// si no encuentra barco, no repetirá turno
						repiteTurno = false;
					}
					// pintamos tablero de nuevo
					pintaTablero(tableroJugador2);
				}
				// reinicializamos el booleano a true
				repiteTurno = true;
			}
			// si el jugador 1 tiene más puntos
			if (contJug1 > contJug2) {
				// mensaje de jugador 1 gana
				System.out.println("Jugador 1 gana");
				// sino
			} else {
				// mensaje de jugador 2 gana
				System.out.println("Jugador 2 gana");
			}
			// cerramos escaner
			sc.close();
		}

		static char[][] inicializaTablero(int filas, int columnas) {
			// creamos tabla tablero
			char tablero[][] = new char[filas][columnas];

			// for para recorrer las filas
			for (int i = 0; i < tablero.length; i++) {
				// rellenamos el tablero con la clase array.fill
				Arrays.fill(tablero[i], '-');
			}
			// devolvemos tablero
			return tablero;
		}

		static char[][] creaTablero(int filas, int columnas) {
			// creamos tabla tablero
			char tablero[][] = new char[filas][columnas];

			// for para recorrer las filas
			for (int i = 0; i < tablero.length; i++) {
				// rellenamos el tablero con la clase array.fill
				Arrays.fill(tablero[i], 'A');
			}
			// devolvemos tablero
			return tablero;
		}

		static void generarBarquitos(char tableroMaquina[][], int numBarquitos) {
			// variable fila aleatoria
			int filaAleatoria;
			// variable columnas aleatoria
			int columnaAleatoria;
			// creamos objeto random
			Random rand = new Random();

			// for para generar tantos barcos como numBarquitos haya
			for (int i = 0; i < numBarquitos; i++) {

				// do while para que si se repite una posición busque otra
				do {
					// generamos una fila aleatoria entre 0 y la longitud en filas de la tabla
					filaAleatoria = rand.nextInt(0, tableroMaquina.length);
					// generamos una columna aleatoria entre 0 y la longitud del indice de la tabla
					columnaAleatoria = rand.nextInt(0, tableroMaquina[i].length);
					// mientras se encuentre barcos (B) repetirá el proceso
				} while (tableroMaquina[filaAleatoria][columnaAleatoria] == 'B');
				// si no encuentra barcos saldrá del do while y generará un barco en la casilla
				// vacía
				tableroMaquina[filaAleatoria][columnaAleatoria] = 'B';
			}
		}

		static void pintaTablero(char tableroJugador[][]) {
			// variable letra A
			char letraA = 'A';
			// variable letra que cambiará
			char letra;

			// for para pintar el encabezado
			for (int i = 0; i < tableroJugador.length; i++) {
				// imprimimos el encabezado numérico con un tabulador antes para generar el
				// espacio
				System.out.print("\t" + (i + 1));
			}
			// retorno de carro
			System.out.println();
			// for para recorrer la tabla
			for (int i = 0; i < tableroJugador.length; i++) {
				// letra será igual a letraA más la i y casteamos a char. Con esto conseguimos
				// que cambie a la siguiente letra
				letra = (char) (letraA + i);
				// imprimimos letra
				System.out.print(letra + "\t");
				// for para recorrer columnas
				for (int j = 0; j < tableroJugador[i].length; j++) {
					// imprimimos el contenido del tablero más tabulador para ordenar
					System.out.print(tableroJugador[i][j] + "\t");
				}
				// retorno de carro para controlar los espacios
				System.out.println();
			}
		}

		static boolean turnoJugador(char tableroMaquina[][], char tableroJugador[][]) {
			// creamos una booleana que nos dirá si hemos hecho impacto
			boolean impacto = false;
			// varable letraA
			char letraA = 'A';
			// variable letra que indicará el usuario
			char letra;
			// variable fila
			int fila;
			// variable columna que indicará el usuario
			int numero;

			//
			System.out.println("Introduce la jugada.");
			// pedimos que intruzca la letra
			System.out.println("Introduce la fila mediante una letra");
			// guardamos la letra
			letra = sc.next().toUpperCase().charAt(0);
			// pedimos al usuario el número de columna
			System.out.println("Introduce el número de la columna");
			// guardamos el número de columna
			numero = sc.nextInt();
			// asignamos el valor a de las filas en base a la letra
			fila = (letra - letraA);
			// aplicamos este modificador para que coincida con los ínidices de la tabla
			numero -= 1;
			// comprobamos si hay barcos en la posición indicada
			if (tableroMaquina[fila][numero] == 'B') {
				// si hay barco impacto será true
				impacto = true;
				// imprimiremos hundido
				System.out.println("HUNDIDO");
				// en caso contrario
			} else {
				// impacto será false
				impacto = false;
				// imprimiremos agua
				System.out.println("AGUA");
			}
			// asignamos para mostrar el valor en la tabla del jugador
			tableroJugador[fila][numero] = tableroMaquina[fila][numero];

			// devolvemos impacto
			return impacto;
		}

	}
