package boletinFunciones1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
	/*
	 * Diseñar la función:
	 * int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.
	 */
	public static void main(String[] args) {
		//creamos tabla
		int tabla[]=new int[25];
		//creamos objeto random
		Random rand=new Random();
		
		//recorremos la tabla para rellenarla
		for(int i=0;i<tabla.length;i++) {
			//rellenamos con valores aleatorios
			tabla[i]=rand.nextInt(1,100);
		}
		//imprimimos el valor máximo de la tabla
		System.out.println(maximo(tabla));
		
	}
	public static int maximo(int tabla[]) {
		//creamos variable max para guardar el valor máximo que devolveremos
		int max=0;
		//creamos una tabla auxiliar para no modificar la original
		int tabla2[]=tabla;
		//ordenamos la tabla auxiliar
		Arrays.sort(tabla2);
		//asignamos a max el último valor de la tabla
		max=tabla[tabla.length-1];
		//devolvemos el máximo
		return(max);
	}
}
