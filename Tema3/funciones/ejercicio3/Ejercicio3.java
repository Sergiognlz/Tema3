package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio2.Numeros;

public class Ejercicio3 {
	/*
	 * Diseñar una función que recibe como parámetros dos números enteros y devuelve
	 * el máximo de ambos. Diseña también una función main() que lea los dos números
	 * de teclado (los pida al usuario) y llame a la función. Desde el método main()
	 * se debe recoger el valor devuelto por la función en una variable y mostrar el
	 * valor de dicha variable por pantalla..
	 */
	public static void main(String[] args) {
		// creamos las variables para los dos números
		int n1 = 0, n2 = 0;
		// creamos booleano para comprobar que el numero sea entero.
		boolean flag = true;
		// creamos escanner
		Scanner sc = new Scanner(System.in);

		// creamos un try catch para comprobar que el número es correcto
		do {
			try {
				// pedimos el primer número
				System.out.println("Introduce el primer número.");
				// leemos el número.
				n1 = sc.nextInt();
				// declaramos como false la variable flag para cada vez que entre en el bucle se
				// reinicie el valor.
				flag = false;
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				// limpiamos el escaner
				sc.nextLine();
				// declaramos la variable como true para que si salta el error repita el bucle.
				flag = true;
			}
		} while (flag);

		do {
			// creamos otro try catch para el segundo número
			try {
				// pedimos segundo número
				System.out.println("Introduce el segundo número");
				// leemos el segundo número
				n2 = sc.nextInt();
				flag = false;
			} catch (InputMismatchException e) {
				// mensaje error
				System.out.println("El valor introducido no es válido.");
				// limpiamos escaner
				sc.nextLine();
				flag = true;
			}
		} while (flag);

		// llamamos a la función e imprimimos en la pantalla.
		System.out.println(Maximo.maximo(n1, n2));

		// cerramos escaner
		sc.close();

	}

}
