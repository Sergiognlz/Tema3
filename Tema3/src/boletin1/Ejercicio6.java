package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
	 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
	 * números junto con la palabra “par” o “impar” según proceda.
	 */
	public static void main(String[] args) {
		//creamos una tabla
		int tabla[]=new int[8];
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//creamos un for para recorrer la tabla
		for(int i=0;i<tabla.length;i++) {
			//pedimos números al usuario
			System.out.println("Introduce un número para la posición "+(i+1));
			//guardamos el valor
			tabla[i]=sc.nextInt();
		}
		
		//un for each para mostrar los pares 
		for(int num:tabla) {
			//mostramos tabla
			System.out.print(num);
			//ternario con par o impar
			System.out.println(num%2==0?" Par":" Impar");
		}
		//cerramos escaner
		sc.close();
	}

}
