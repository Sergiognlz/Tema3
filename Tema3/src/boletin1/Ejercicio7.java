package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
	 * un determinado año y las almacene en una tabla (una posición por mes). A
	 * continuación, se debe mostrar un diagrama de barras horizontales con esos
	 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
	 * cualquier otro carácter.
	 */
	
	public static void main(String[] args) {
		//creamos tabla
		int tabla[]=new int[12];
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//for para rellenar la tabla con las temperaturas
		for(int i=0;i<tabla.length;i++) {
		//pedimos número al usuario
		System.out.println("Introduce a la posición "+(i+1));
		//guardamos el valor en la posición
		tabla[i]=sc.nextInt();
		}
		
		//for each para imprimir los asteriscos
		for(int temp:tabla) {
	
			//otro for que haga tanta iteraciones como la temperatura
			for(int j=0;j<temp;j++) {
	
			//imprimimos asteriscos
				System.out.print("* ");
			}
			//imprimimos temperaturas
			System.out.println(temp);
		}
		sc.close();
	}
}
