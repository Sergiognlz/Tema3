package colecciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
	 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
	 * la lista mezclada por pantalla.
	 */
	public static void main(String[] args) {
		//creamos arrayList
		ArrayList<Integer> numeros1=new ArrayList<>();
		//creamos arrayList
		ArrayList<Integer> numeros2=new ArrayList<>();
		//variable numero
		int num;
		//objeto Escaner
		Scanner sc=new Scanner(System.in);
		
		//recorremos la lista y rellenamos con números
		for(int i=0;i<10;i++) {
			//introducimos números
			num=(i+1);
			//añadimos números
			numeros1.add(num);
		}
	
		
		//hacemos una copia de la cadena 
		numeros2=(ArrayList<Integer>)numeros1.clone();
	
		//dedordenamos con el método shuffle
		Collections.shuffle(numeros2);
		
		//mostramos ambas listas
		System.out.println("Lista original: "+numeros1);
		System.out.println();
		System.out.println("Lista desordenada: "+numeros2);
		
		//cerramos escaner
		sc.close();
	}
}
