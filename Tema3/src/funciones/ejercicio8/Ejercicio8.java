package ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//varibale para guardar el número
		int numero=0;
		int divisores;
		// creamos escanner
		Scanner sc = new Scanner(System.in);
		//creamos la comprobación del número y sus excepciones
		do {
			try {
				//pedimos un número
				System.out.println("Introduce un número.");
				//guardamos el número
				numero=sc.nextInt();
				
				//creamos excepción
			}catch(InputMismatchException e){
				//mensaje de error
				System.out.println("El valor introducido no es válido.");
				//limpiamos escaner
				sc.nextLine();
			}
		}while(numero<=0);
		
		divisores=CuentaDivisores.numDivisoresPrimos(numero);
		
		System.out.println("Numero de divisores: "+divisores);
			
		sc.close();
		}
				
		
		
	}

