package boletinJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Vamos a realizar varias operaciones básicas de ajedrez, concretamente las de
	 * las piezas Torre, Alfil, Dama y Caballo. Crea una función distinta para cada
	 * pieza. Todas las funciones van a recibir los mismos parámetros de entrada:
	 * posFila, posColumna y pieza. La pieza será de tipo char y podrá ser T de
	 * Torre, A de Alfil, D de Dama y C de Caballo. La función devolverá una tabla
	 * (que representa al tablero) marcando con una X aquellas casillas donde se
	 * puede mover dicha pieza. La posición inicial de la pieza se marcará con su
	 * letra correspondiente.
	 */
	// creamos objeto escaner a nivel de clase para poder usarlo en todas las
	// funciones
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos tabla bidimensional 8x8
		char tablero[][] = new char[8][8];
		// variable posición fila
		int posFila;
		// variable posición columna
		int posColumna;
		// variable pieza
		char pieza = ' ';
		// boolelano de control
		boolean error = false;

		// llamamos a la función para pedir las posción de las filas
		posFila = controlE("fila");

		// llamamos a la función para pedir la posición de las columnas
		posColumna = controlE("columna");

		// do while para controlar el valor de pieza
		do {
			try {
				System.out.println();
				// pedimos el valor de pieza
				System.out.println("Introduce la pieza: ");
				System.out.println("T. Torre");
				System.out.println("A. Alfil");
				System.out.println("D. Dama");
				System.out.println("C. Caballo");
				// guardamos pieza
				pieza = sc.nextLine().charAt(0);
				// esto es parecido al ignore case pero con carácteres
				pieza = Character.toUpperCase(pieza);
				// asserción
				assert pieza == 'T' || pieza == 'A' || pieza == 'D' || pieza == 'C'
						: "El valor introducido no es válido. Introduce T (Torre), A (Alfil), D (Dama) o C (Caballo)";
				// si todo va bien no hay error
				error = false;

			} catch (AssertionError e) {
				// mensaje de error
				System.out.println(e.getMessage());
				error = true;

			}

		} while (error);

		// swich para llamar a las funciones de cada pieza
		switch (pieza) {
		case 'T' -> {
			// llamamos a la función y la guardamos en la tabla tablero
			tablero = torre(posFila, posColumna, pieza);
		}
		case 'A' -> {
			// llamamos a la función y la guardamos en la tabla tablero
			tablero = alfil(posFila, posColumna, pieza);
		}
		case 'D' -> {
			// llamamos a la función y la guardamos en la tabla tablero
			tablero = dama(posFila, posColumna, pieza);
		}
		case 'C' -> {
			// llamamos a la función y la guardamos en la tabla tablero
						tablero = caballo(posFila, posColumna, pieza);
		}
		}
		// imprimimos tablero
		imprimeTablero(tablero);

	}

	// función imprime tablero
	static void imprimeTablero(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {

			// for para recorrer las columnas
			for (int j = 0; j < tablero[i].length; j++) {
				// if para imprimir la primera línea del tablero
				if (j == 0) {
					System.out.print("|");
				}
				// imprimimos tabla y le añadimos la línea del tablero
				System.out.print(tablero[i][j] + "|");

			}
			// retorno de carro
			System.out.println();
		}
	}

	// función Torre
	static char[][] torre(int posFila, int posColumna, char pieza) {
		// creamos tabla bidimensional 8x8
		char tablero[][] = new char[8][8];
		// creamos un for para recorrer las filas
		for (int i = 0; i < tablero.length; i++) {
			// for para recorrer las columnas
			for (int j = 0; j < tablero[i].length; j++) {
				// asignamos X a las filas
				tablero[posFila][j] = 'X';
				// asignamos X a las columnas
				tablero[i][posColumna] = 'X';

			}
		}
		// mostramos el carácter de la pieza en su posición
		tablero[posFila][posColumna] = pieza;
		// devolvemos tabla
		return tablero;
	}

	// función Alfil
	static char[][] alfil(int posFila, int posColumna, char pieza) {
		// creamos tabla bidimensional 8x8
		char tablero[][] = new char[8][8];
		// creamos un for para recorrer las filas
		for (int i = 0; i < tablero.length; i++) {
			if ((posColumna - posFila + i) < (tablero.length) && (posColumna - posFila + i) >= 0) {
				tablero[i][posColumna - posFila + i] = 'X';
			}

			if ((posColumna + posFila - i) < (tablero.length) && (posColumna + posFila - i) >= 0) {
				tablero[i][posColumna + posFila - i] = 'X';
			}

		}

		// mostramos el carácter de la pieza en su posición
		tablero[posFila][posColumna] = pieza;
		// devolvemos tabla
		return tablero;
	}

	// función Dama
	static char[][] dama(int posFila, int posColumna, char pieza) {
		// creamos tabla bidimensional 8x8
		char tablero[][] = new char[8][8];
		// creamos un for para recorrer las filas
		for (int i = 0; i < tablero.length; i++) {
			// for para recorrer las columnas
			for (int j = 0; j < tablero[i].length; j++) {
				// asignamos X a las filas
				tablero[posFila][j] = 'X';
				// asignamos X a las columnas
				tablero[i][posColumna] = 'X';
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			if ((posColumna - posFila + i) < (tablero.length) && (posColumna - posFila + i) >= 0) {
				tablero[i][posColumna - posFila + i] = 'X';
			}

			if ((posColumna + posFila - i) < (tablero.length) && (posColumna + posFila - i) >= 0) {
				tablero[i][posColumna + posFila - i] = 'X';
			}

		}
		// mostramos el carácter de la pieza en su posición
		tablero[posFila][posColumna] = pieza;
		// devolvemos tabla
		return tablero;
	}
	// función Caballo
		static char[][] caballo(int posFila, int posColumna, char pieza) {
			// creamos tabla bidimensional 8x8
			char tablero[][] = new char[8][8];
		
			if(posFila-2>=0&&posColumna+1<tablero[posFila].length) {
			tablero[posFila-2][posColumna +1]='X';
			}
			if(posFila-2>=0&&posColumna-1>=0) {
			tablero[posFila-2][posColumna -1]='X';
			}
			if(posFila-1>=0&&posColumna+2<tablero[posFila].length) {
			tablero[posFila-1][posColumna +2]='X';
			}
			if(posFila-1>=0&&posColumna-2>=0) {
			tablero[posFila-1][posColumna -2]='X';
			}
			if(posFila+1<tablero.length&&posColumna+2<tablero[posFila].length) {
			tablero[posFila+1][posColumna +2]='X';
			}
			if(posFila+1<tablero.length&&posColumna-2>=0) {
			tablero[posFila+1][posColumna -2]='X';
			}
			if(posFila+2<tablero.length&&posColumna+1<tablero[posFila].length) {
			tablero[posFila+2][posColumna +1]='X';
			}
			if(posFila+2<tablero.length&&posColumna-1>=0) {
			tablero[posFila+2][posColumna -1]='X';
			}
			// mostramos el carácter de la pieza en su posición
			tablero[posFila][posColumna] = pieza;
			return tablero;
		}


	// función de control de datos de entrada numéricos
	static int controlE(String pregunta) {
		int num = 0;
		// booleano de control de salida
		boolean error = false;
		// do while para controlar los valores entrada
		do {
			// try donde pedimos el número
			try {
				// pedimos el número al usuario
				System.out.println("Introduce la " + pregunta);
				// guardamos el valor
				num = sc.nextInt();
				// aserción
				assert num >= 0 && num < 8 : "El valor introducido no es válido. Introduce un valor entre 0 y 7";
				// cambiamos booleano a false
				error = false;
				// catch para capturar las assertion
			} catch (AssertionError e) {
				// mensaje de error
				System.out.println(e.getMessage());
				error = true;
				// catch para capturar cadenas
			} catch (InputMismatchException e) {
				// mensaje de error
				System.err.println("El valor introducido no es correcto. Introduce un valor entre 0 y 7");
				error = true;
			} finally {
				// reiniciamos escaner
				sc.nextLine();
			}

		} while (error);
		// devolvemos el número
		return num;
	}

}
