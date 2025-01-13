package pruebaexamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prueba2 {
	// vamos a hacer un juego de buscar tesoros

	// creamos scaner a nivel clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// creamos tabla bidimensional para el tablero oculto
		char tableroOculto[][] = new char[8][8];
		// creamos table bidimensional para el tablero relleno
		char tableroRelleno[][] = new char[8][8];
		// variable letra
		char letra;
		// variable fila
		int fila;
		// variable columna
		int columna;
		// creamos variable para guardar la letra A
		char letraA = 'A';
		// variable barcos
		int barcos = 0;
		// variable contador para los turnos
		int cont = 1;
		// variable jugaror
		int jugador;
		// variable barcos impactados por jugador 1
		int contBarcos1 = 0;
		// variable barcos impactador por jugador 2
		int contBarcos2 = 0;

		// rellenamos el tablero llamando a la función rellenaTablero
		tableroRelleno = rellenaTablero(tableroRelleno);

		System.out.println();
		System.out.println();

		while (barcos < 10) {
			if (cont % 2 == 0) {
				jugador = 2;
			} else {
				jugador = 1;
			}
			mostrarTablero(tableroOculto);
			System.out.println();
			System.out.println("Jugador " + jugador + " es tu turno");
			// pedimos letra al usuario
			System.out.println("Introduce coordenadas columnas letra");
			// guardamos letra
			letra = sc.next().toUpperCase().charAt(0);
			// la fila será la letra menos la letraA
			columna = (letra - letraA);
			// pedimos las columnas
			System.out.println("Introduce coordenadas filas");
			// guardamos columnas
			fila = sc.nextInt();
			fila -= 1;
			tableroOculto[fila][columna] = tableroRelleno[fila][columna];
			System.out.println();
		

			// si hay un barco en el la posición elegida
			if (tableroOculto[fila][columna] == 'B') {
				barcos++;
				if (jugador == 1) {
					contBarcos1++;
				} else {
					contBarcos2++;
				}
			}
			cont++;
		}
		if(contBarcos1>contBarcos2) {
			System.out.println("Jugador 1 gana");
		}else if(contBarcos1<contBarcos2) {
			System.out.println("Jugador 2 gana");
		}else {
			System.out.println("Empate");
		}
		// cerramos escaner
		sc.close();
	}

	// variable que imprimirá el tablero
	static void mostrarTablero(char tablero[][]) {
		// creamos variable para guardar la letra A
		char letraA = 'A';
		// variable letra que cambiará
		char letra;
		// creamos un contador para las coodenadas de las filas
		int cont = 1;
		// recorremos las filas para imprimir el encabezado
		for (int i = 0; i < tablero.length; i++) {

			// letra será el valor de letraA más i y casteamos a char para que funcione
			letra = (char) (letraA + i);
			// imprimimos tabulador más la letra
			System.out.print("\t" + letra);

		}

		// for para recorrer filas
		for (int i = 0; i < tablero.length; i++) {
			// salto de línea
			System.out.println();
			// imprimimos contador más tabulador para imprimir las coodenadas verticales
			System.out.print(cont + "\t");
			// for para recorrer las columnas
			for (int j = 0; j < tablero[i].length; j++) {
				// imprimimos los valores del tablero más tabulador para ordenarlo
				System.out.print(tablero[i][j] + "\t");
			}
			// incrementamos el contador para que la cifra cambie
			cont++;
		}

	}

	static char[][] rellenaTablero(char tableroRelleno[][]) {
		// creamos objeto random
		Random rand = new Random();
		// variable fila aleatoria
		int filAl;
		// variable columna aleatoria
		int columAl;

		// recorremos la tabla
		for (int i = 0; i < tableroRelleno.length; i++) {
			// rellenamos con 0
			Arrays.fill(tableroRelleno[i], '0');
		}

		// contamos hasta 10 bombas para rellenar el tablero de bombas
		for (int bomba = 0; bomba < 10; bomba++) {
			// do while para repetir la generación de aleatorios si ya hay una bomba en ese
			// lugar
			do {
				// generamos fila aleatoria
				filAl = rand.nextInt(0, 8);
				// generamos columna aleatoria
				columAl = rand.nextInt(0, 8);
				// mientras en la posición generada haya una bomba se seguirá repitiendo el
				// proceso
			} while (tableroRelleno[filAl][columAl] == 'B');
			// si no hay bombas pone bomba
			tableroRelleno[filAl][columAl] = 'B';
		}

		// devolvemos el tablero
		return tableroRelleno;
	}

}
