package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realiza una función que calcule y muestre el área y el volumen de un
	 * cilindro, según se especifique. Para distinguir un caso de otro se le pasará
	 * como opción un número: 1 (para el área) o 2 (para el volumen). Además, hay
	 * que pasarle a la función el radio de la base y la altura del cilindro. Desde
	 * el método main(), habrá que solicitarle al usuario la opción (1 ó 2), el
	 * radio de la base y la altura del cilindro. A continuación, llamará a la
	 * función con estos parámetros. Las funciones para calcular el área y el
	 * volumen de un cilindro son: 1. área = 2 * radio * (altura + radio) 2. volumen
	 * = * radio2 * altura
	 */
	public static void main(String[] args) {
		// creamos las variables para las opciones 1 y 2, y los valores área y radio.
		int opcion=0;
		int area = 0, radio = 0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		

		// vamos a crear 4 bucles con try catch para comprobar que los valores de las
		// variables introducidas están en el rango deseado.
		

do {
	try {
		//pedimos una opción
		System.out.println("Introduce 1 para calcular el área o 2 para calcular el volumen de un cilindro.");
		//guardamos la opción
		opcion=sc.nextInt();
	}catch(InputMismatchException e) {
		//mensaje de error
		System.out.println("El valor introducido no es válido.");
		//limpiamos escaner.
		sc.nextLine();
	}
}while(opcion!=1||opcion!=2);
	}
}
