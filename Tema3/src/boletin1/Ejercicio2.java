package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Diseñar un programa que solicite al usuario 5 números decimales y los
	 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
	 * números como para almacenarlos en la tabla. A continuación, en un bucle
	 * distinto, mostrar por consola los números en el mismo orden en el que se han
	 * introducido.
	 */
	public static void main(String[] args) {
		//creamos tabla
		double tabla[]=new double[5];
		//creamos escanner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario por pantalla los 5 números
		System.out.println("Introduce 5 números decimales");
		//for para recorrer la tabla
		for(int i=0;i<tabla.length;i++) {
		
			//pedimos al usuario por pantalla los 5 números
			System.out.println("Introduce un número decimal para el valor "+(i+1));
			//guardamos el valor

			tabla[i]=sc.nextDouble();
		}
		//mostramos por pantalla el resultado
		System.out.println(Arrays.toString(tabla));
		//cerramos escaner
		sc.close();
	}
}
