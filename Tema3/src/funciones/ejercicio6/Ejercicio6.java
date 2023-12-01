package funciones.ejercicio6;

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
		double altura = 0, radio = 0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		

		// vamos a crear 4 bucles con try catch para comprobar que los valores de las
		// variables introducidas están en el rango deseado.
		

do {
	try {
		//pedimos una opción
		System.out.println("Introduce 1 para calcular el área de un cilindro.");
		System.out.println("Introduce 2 para calcular el volumen de un cilindro.");
		//guardamos la opción
		opcion=sc.nextInt();
	}catch(InputMismatchException e) {
		//mensaje de error
		System.out.println("El valor introducido no es válido.");
		//limpiamos escaner.
		sc.nextLine();
	}
}while(opcion!=1&&opcion!=2);

// creamos un try catch para comprobar que el número es correcto
do {
	try {
		// pedimos el primer número
		System.out.println("Introduce la altura del cilindro.");
		// leemos el número.
		altura = sc.nextDouble();
		// reinicie el valor.
	} catch (InputMismatchException e) {
		// mensaje de error
		System.out.println("El valor introducido no es válido.");
		// limpiamos el escaner
		sc.nextLine();
	}
} while (altura<=0);

do {
	// creamos otro try catch para el segundo número
	try {
		// pedimos segundo número
		System.out.println("Introduce el radio del cilindro.");
		// leemos el segundo número
		 radio= sc.nextDouble();
	} catch (InputMismatchException e) {
		// mensaje error
		System.out.println("El valor introducido no es válido.");
		// limpiamos escaner
		sc.nextLine();
	}
} while (radio<=0);

if(opcion==1) {
//imprimimos pantalla
System.out.println("El área del cilindro es: " +(Opcion.opcion(altura, radio, opcion))+" cm2");
}else {
	System.out.println("El volumen del cilindro es: "+(Opcion.opcion(altura, radio, opcion))+" cm2");
}


sc.close();
	}
}
