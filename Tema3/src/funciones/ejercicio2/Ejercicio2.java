package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Escribe una función a la que se le pasen dos enteros y muestre todos los
	 * números comprendidos entre ellos. Desde el método main() lee los dos números
	 * enteros, los cuales deben introducirlos el usuario, y pásalos como parámetros
	 * de entrada de la función.
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
				//declaramos la variable como true para que si salta el error repita el bucle.
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
		// llevamos los dos números a la función
		Numeros.numeros(n1, n2);

		// cerramos escaner
		sc.close();
	}

}
