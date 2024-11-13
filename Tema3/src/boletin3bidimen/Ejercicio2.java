package boletin3bidimen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
	 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
	 * notas por teclado y luego el programa mostrará la tabla con las notas. A
	 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
	 */
	public static void main(String[] args) {

		// creamos tabla donde guardar las notas
		double tabla[][] = new double[4][5];
		// variable notas  medias
		double media=0;
		double max;
		double min;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//creamos bucle for para pedir las notas por teclado
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				//pedimos la usuario la nota
				System.out.println("Introduce la nota del Alumno "+(i+1)+" y de la asignatura "+(j+1));
				//guardamos el valor
				tabla[i][j]=sc.nextDouble();
			}
		}
		//otros dos for para mostrarlas
		for(int i=0;i<tabla.length;i++) {
			//reinicializamos los valores a sus valores base
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			media=0;
			//mostramos nombre del alumno
			System.out.print("Alumno "+ (i+1)+" --> ");
			//recorremos la tabla
			for(int j=0;j<tabla[0].length;j++) {
				
				//mostramos la tabla
				System.out.print(tabla[i][j]+" ");
				//si el valor introducido es menor que el mínimo, lo sustituye
				if(min>tabla[i][j]) {
					min=tabla[i][j];
				}
				//si el valor introducido es mayor que el máximo, lo sustituye
				if(max<tabla[i][j]) {
					max=tabla[i][j];
				}
				//sumamos todos los valores para calcular la media
				media+=tabla[i][j];
			}
			//calculamos la media final
			media=media/5;
			//mostramos los resultados
			System.out.print(" Nota Media: "+media+" | ");
			System.out.print(" Nota Máxima: "+max+" | ");
			System.out.print(" Nota Mínima: "+min+" | ");
			System.out.println();
		}
		
		//cerramos escaner
		sc.close();
	}
}
