package boletin3bidimen;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Escribe un programa que pida las dimensiones de una tabla bidimensional al
	 * usuario (número de filas y número de columnas). A continuación, crea dicha
	 * tabla bidimensional y rellénala de la siguiente forma: el elemento de la
	 * posición [i][j] debe contener el valor 10 * i + j. A continuación, muestra la
	 * tabla por consola.
	 */
	public static void main(String[] args) {
		//creamos tabla
		int tabla[][];
		//variables para filas y columnas
		int fila;
		int colum;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario las filas y las columnas
		System.out.println("Introduce filas");
		//guardamos valor
		fila=sc.nextInt();
		System.out.println("Introduce columnas");
		//guardamos valor
		colum=sc.nextInt();
		
		//damos tamaño a la tabla
		tabla=new int[fila][colum];
		
		//creamos for para rellenar la tabla
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				//rellenamos con valores
				tabla[i][j]=10*i+j;
			}
		}
		//creamos otro for para mostrar la tabla
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				//mostramos valores de tabla
				System.out.print(tabla[i][j]+"\t");
			}
			//saltamos línea
			System.out.println();
		}
		//cerramos escaner
		sc.close();
	}
}
