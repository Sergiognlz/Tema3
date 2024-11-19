package boletinFunciones2;

import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
	/*
	 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
	 * debe devolver un array de dos posiciones que contenga el mínimo en la
	 * posición 0 y el máximo en la posición 1. Define un método main que rellene un
	 * array de 6 filas por 10 columnas con números enteros positivos comprendidos
	 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
	 * con este array y mostrar por consola los valores mínimo y máximo de la tabla.
	 */
	public static void main(String[] args) {
		//creamos una tabla bidimensional de 6 x 10
		int tabla[][]=new int[6][10];
		//creamos objeto random
		Random rand=new Random();
		
		//creamos for para recorrer las filas de la tabla
		for(int i=0;i<tabla.length;i++) {
			//otro for para recorrer las columnas
			for(int j=0;j<tabla[i].length;j++) {
				//rellenamos con números aleatorios entre 0 y 1000
				tabla[i][j]=rand.nextInt(0,1001);
			}
			
			
		}
		System.out.println(Arrays.toString(maxMin(tabla)));
	}
	
	static int[] maxMin(int[][]tabla) {
		//creamos tabla para guardar el max y el min
		int maxMin[]=new int[2];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		//for para recorrer las filas de la tabla bidimensional
		for(int i=0;i<tabla.length;i++) {
			//for interno para columnas
			for(int j=0;j<tabla[i].length;j++) {
				if(tabla[i][j]<min) {
					min=tabla[i][j];
				}
				if(tabla[i][j]>max) {
					max=tabla[i][j];
				}
			
			}
		}
		maxMin[0]=min;
		maxMin[1]=max;
		
		
		//devolvemos tabla max min
		return maxMin;
		
	}
	
	
	
}
