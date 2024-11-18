package boletinFunciones1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
	 * devuelve una tabla con todos los índices de los elementos donde se encuentra
	 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
	 * t, la función devolverá una tabla vacía.
	 */

	public static void main(String[] args) {
		//creamos variable tabla
		int t[]=new int [100];
		//creamos variable valor
		int valor=0;
		//creamos objeto random
		Random rand=new Random();
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		//rellenamos con un for la tabla
		for(int i=0;i<t.length;i++) {
			t[i]=rand.nextInt(1,101);
		}
		
	}
	public static int[] buscarTodos(int t [], int valor) {
		int tabla[]=new int[t.length];
		
		
		return (tabla);
	}
}
