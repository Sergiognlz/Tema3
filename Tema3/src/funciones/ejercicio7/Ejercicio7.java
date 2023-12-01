package funciones.ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Diseña una función con el siguiente prototipo: boolean esPrimo(int n) La
	 * función debe devolver true si n es primo y false en caso contrario. Diseña un
	 * método main() que pruebe el funcionamiento de dicha función.
	 */
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
		
		System.out.println(Primo.primo(num));
		
		
		
		sc.close();
	}
	
}
