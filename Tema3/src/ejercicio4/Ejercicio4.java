package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Crear una función que devuelva un tipo booleano que indique si el carácter
	 * que se pasa como parámetro de entrada corresponde con una vocal. Diseña un
	 * método main() que pruebe el funcionamiento de dicha función.
	 */
	public static void main(String[] args) {
		// creamos variable donde guardar la letra
		char letra;
		// creamos boleano de confirmación del valor
		boolean flag = true;
		// creamos escaner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// pedimos el primer número
				System.out.println("Introduce una letra.");
				// leemos el número.
				letra=sc.next().charAt(0);
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

	

		sc.close();
	}
}
