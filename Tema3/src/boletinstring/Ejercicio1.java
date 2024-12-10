package boletinstring;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
	 * decir, la que contiene menos caracteres.
	 */

	public static void main(String[] args) {
		// creamos variable cadena 1
		String cadena1;
		// creamos cadena 2
		String cadena2;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos la cadena al usuario
		System.out.println("Introduce la cadena 1");
		// guardamos el valor en cadena1
		cadena1 = sc.nextLine();

		// pedimos la cadena al usuario
		System.out.println("Introduce la cadena 2");
		// guardamos el valor en cadena2
		cadena2 = sc.nextLine();
		
		//creamos un if para cuando cadena1 es mayor que cadena 2
		if(cadena1.length()>cadena2.length()) {
			//imprimimos que cadena 2 es más corta
		System.out.println("Cadena 2 es más corta");
		//si cadena1 es menor que cadena2
		}else if(cadena1.length()<cadena2.length()) {
			//imprimimos que cadena 1 es más corta
			System.out.println("Cadena 1 es más corta");
			//en caso de que ninguna sea mayor que la otra
		}else {
			//imprimimos empate
			System.out.println("Las cadenas son iguales de tamaño");
		}
		// cerramos escaner
		sc.close();
	}
}
