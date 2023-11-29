package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio6.Opcion;

public class Ejercicio9 {
	/*
	 * Diseñar la función calculadora(), a la que se le pasan dos números reales
	 * (operandos) y qué operación se desea realizar con ellos. Las operaciones
	 * disponibles son sumar, restar, multiplicar o dividir. Estas se especifican
	 * mediante un número: 1 para la suma, 2 para la resta, 3 para la multiplicación
	 * y 4 para la división. La función devolverá el resultado de la operación
	 * mediante un número real. Diseña un método main() que pruebe el funcionamiento
	 * de dicha función.
	 */
	public static void main(String[] args) {
		// creamos las variables que vamos a usar
		int opcion = 0;
		double n1 = 0, n2 = 0;
		boolean seguir=true;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

// creamos un try catch para comprobar que el número es correcto
		do {
			try {
				// pedimos el primer número
				System.out.println("Introduce el primer número.");
				// leemos el número.
				n1 = sc.nextDouble();
				seguir=false;
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				seguir=true;
			} finally {
				// limpiamos escaner
				sc.nextLine();
			}
		} while (seguir);

		do {
			// creamos otro try catch para el segundo número
			try {
				// pedimos segundo número
				System.out.println("Introduce el segundo número.");
				// leemos el segundo número
				n2 = sc.nextDouble();
				seguir=false;
			} catch (InputMismatchException e) {
				// mensaje error
				System.out.println("El valor introducido no es válido.");
				seguir=true;
			} finally {
				// limpiamos escaner
				sc.nextLine();
			}
		} while (seguir);

		do {
			try {
				// pedimos una opción
				System.out.println("Introduce una opción:");
				System.out.println("1. SUMA.");
				System.out.println("2. RESTA");
				System.out.println("3. MULTIPLICACIÓN.");
				System.out.println("4. DIVISIÓN.");
				// guardamos la opción
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				// mensaje de error
				System.out.println("El valor introducido no es válido.");
				// limpiamos escaner.
				sc.nextLine();
			}
		} while (opcion<1||opcion>4);
		
		//imprimimos pantalla con el resultado llamando a la función.
		System.out.println(Calculadora.calculadora(n1, n2, opcion));

		sc.close();
	}
}
