package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	/*
	 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
	 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
	 * pantalla.
	 */
	
	public static void main(String[] args) {
		//creamos tabla tamaño 30
		int tabla[]=new int[30];
		//creamos objeto random
		Random rand=new Random();
		
		//for para rellenar la tabla
		for(int i=0;i<tabla.length;i++) {
			//método fill para rellenar con random entre 1 y 9
			tabla[i]= rand.nextInt(1,10);
		}

		//método sort para ordenar
		Arrays.sort(tabla);
		//método to string para mostrar por consola
		System.out.println(Arrays.toString(tabla));
	}
}
