package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
	 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
	 * Luego muestra el array por pantalla.
	 */
	public static void main(String[] args) {

	//creamos tabla
		int tabla[];
		//variable tamaño
		int tamaño;
		//variable valor
		int valor;
		//creamos objeto scanner
		Scanner sc=new Scanner(System.in);
		
		//pedimos tamaño al usuario
		System.out.println("Introduce un tamaño para la tabla");
		//guardamos el valor
		tamaño=sc.nextInt();
		//pedimos valor al usuario
		System.out.println("Introduce un valor para rellenar la tabla");
		//guardamos el valor
		valor=sc.nextInt();
		//asignamos el valor tamaño al tamaño de la tabla
		tabla=new int[tamaño];
		//rellenamos la tabla con el método fill
		Arrays.fill(tabla, valor);
		//mostramos la tabla mediente un método toString
		System.out.println(Arrays.toString(tabla));
		//cerramos escaner
		sc.close();
		
	}
}
