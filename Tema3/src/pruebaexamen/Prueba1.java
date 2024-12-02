package pruebaexamen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Prueba1 {
	/*
	 * Buscaminas. Crea el juego del buscaminas pero usando una matriz
	 * unidimensional. El programa le preguntará al usuario la posición a revelar.
	 * Si hay una mina en esa posición, el juego termina. Si no hay mina, el
	 * programa mostrará la pista para esa posición. Esta pista indica cuántas minas
	 * hay alrededor de esa posición. El programa comenzará con un array de 20
	 * posiciones y colocará 6 minas en diferentes posiciones, elegidas al azar.
	 * También inicializará la matriz con todas las pistas. Ejemplo:
	 * {0,1,*,1,1,*,*,2,*,1,0,0,0} Este panel estará oculto para el jugador y tendrá
	 * que adivinarlo.
	 */
	public static void main(String[] args) {
		// creamos tablero como tabla unidimensional
		char tableroOculto[] = new char[20];
		// creamos tabla tablero minado
		char tableroMinado[] = new char[20];
		// creamos variable donde guardar la posición que preguntaremos al usuario
		int posicion = 1;
		//contador para las minas
		int jugadas=0;
		// booleano para controlar si el jugador pierde
		boolean pierde = false;
		// booleano de control de entrada
		boolean error = false;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);
		// rellenamos tablero con guiones
		Arrays.fill(tableroOculto, ' ');
		// rellenamos la tabla llamando a la función que hace eso
		tableroMinado = rellenaTablero();

		// creamos un do while para repetir todo el proceso de relevar las casillas del
		// tablero
		do {
			// do while para repetir el proceso de pedir y guardar los valores de entrada
			// hasta que sean correctos
			do {
				// try para controlar los valores
				try {
					System.out.println();
					// mostramos tablero
					System.out.println("Tablero");
					System.out.println(Arrays.toString(tableroOculto));
					System.out.println();
					//System.out.println("Tablero minado");
					//System.out.println(Arrays.toString(tableroMinado));
					// retorno de carro para que se vea mejor
					System.out.println();
					// pedimos al usuario que introduzca una posición
					System.out.println("Introduce una posición (1-20)");
					// guardamos posición
					posicion = sc.nextInt();
					assert posicion > 0 && posicion <= 20 : "El valor introducido no se encuentra entre 1 y 20.";
					// aplicamos a posicion un -1 para que coincida con los índices de la tabla
					posicion -= 1;
					// si todo va bien error será false
					error = false;
				
					if(tableroOculto[posicion]!=' ') {
						System.out.println("Has introducido una posición ya revelada.");
						error=true;
					}
				
					// asignamos a la posición del tablero oculto la del tablero minado
					tableroOculto[posicion] = tableroMinado[posicion];
					// capturamos la aserción en caso de error
				} catch (AssertionError e) {
					// mensaje de error
					System.out.println(e.getMessage());
					// si salta una aserción error será true
					error = true;
					// capturamos el error en caso de introducir algo que no sea un entero
				} catch (InputMismatchException e) {
					// mensaje de error
					System.err.println("El valor introducido no es un número entero");
					// si salta un input exception error será true
					error = true;
					// bloque finally
				} finally {
					// limpiamos escaner
					sc.nextLine();
				}
				// en caso de que no haya error salimos del bucle
			} while (error);
	

			// controlamos que si revela una posición minada pierda
			if (tableroOculto[posicion] == '*') {
				// pierde será true
				pierde = true;
				// mensaje que informa que pierdes y se acaba el juego
				System.out.println("Fin del juego ¡Has perdido!");
				//espacio
				System.out.println();
			}
			//incrementamos jugadas para controlar que el jugador gane
			jugadas++;
		} while (!pierde&&jugadas!=14);
		System.out.println("Tablero");
		// espacio
		System.out.println();
		// mostramos tablero al final con la mina que has revelado
		System.out.println(Arrays.toString(tableroOculto));
		//espacio
		System.out.println();
		//si ha salido del bucle sin haber perdido habrá ganado
		if(!pierde) {
			//mensaje de fin del juego
			System.out.println("Fin del juego ¡Has ganado!");
		}
		// cerramos escaner
		sc.close();

	}

	// vamos a crear una función para rellenar el tablero
	static char[] rellenaTablero() {
		// creamos una tabla donde estarán las minas y las pistas
		char tableroMinado[] = new char[20];
		// variable donde guardamos la posición aleatoria
		int pos;
		// creamos objeto random
		Random rand = new Random();
		Arrays.fill(tableroMinado, '0');
		// for que recorrerá desde 0 a 6, con esto controlaremos que rellene la tabla
		// con 6 minas
		for (int i = 0; i < 6; i++) {
			// para controlar que no repita posiciones haremos un do while
			do {
				// generamos una posición aleatoria
				pos = rand.nextInt(1, 20);
				// cuando la posición generada albergue una mina, volverá a generar otra. En
				// caso contrario saldrá del bucle
			} while (tableroMinado[pos] == '*');
			// y asignará la mina en la posición
			tableroMinado[pos] = '*';
			//este if controla que no se salga por la izquierda de la tabla
			if (pos - 1 >= 0) {
				//switch para asignar los números de la pista a la tabla
				tableroMinado[pos - 1] = switch (tableroMinado[pos - 1]) {
				case '0' -> {
					yield '1';
				}
				case '1' -> {
					yield '2';
				}
				//en caso de encontrarse otra cosa (una mina)
				default -> {
					//deja el valor igual
					yield tableroMinado[pos - 1];
				}

				};

			}
			//este if controla que no se salga por la derecha de la tabla
			if (pos + 1 < tableroMinado.length) {
				//switch para asignar los números de la pista a la tabla
				tableroMinado[pos + 1] = switch (tableroMinado[pos + 1]) {
				case '0' -> {
					yield '1';
				}
				case '1' -> {
					yield '2';
				}
				//en caso de encontrarse otra cosa (una mina)
				default -> {
					//deja el valor igual
					yield tableroMinado[pos + 1];
				}

				};
			}

		}
		// devolvemos tabla tablero
		return tableroMinado;
	}

}
