package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza un programa que escriba la tabla de multiplicar de un número
	 * introducido por teclado. Para ello implementa una función que reciba como
	 * parámetro un número entero y muestre por pantalla la tabla de multiplicar de
	 * dicho número.
	 */
	//creamos la variable donde guardaremos el número introducido por el usuario
	public static void main(String[] args) {
		//varibale para guardar el número
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
	
	Tabla.tabla(num);
	
	sc.close();
}
}
