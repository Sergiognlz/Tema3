package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Diseña la función eco() a la que se le pasa como parámetro de entrada un
	 * número n, y muestra por pantalla n veces el mensaje “Eco…”. Desde el método
	 * main() lee un número introducido por el usuario por teclado y pasa este
	 * número como parámetro en la llamada a la función.
	 */

	public static void main(String[] args) {
//creamos la variable donde guardaremos el número introducido por el usuario
		int num=0;
		// creamos escanner
		Scanner sc = new Scanner(System.in);
		//creamos la comprobación del número y sus excepciones
		do {
			try {
				//pedimos un número
				System.out.println("Introduce un número.");
				//guardamos el número
				num=sc.nextInt();
				
				//creamos excepción
			}catch(InputMismatchException e){
				//mensaje de error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			}
		}while(num<=0);
		
		//llevamos la variable número a la función
		Eco.eco(num);
		
		
		sc.close();
	}
}
