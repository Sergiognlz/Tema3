package boletin2;

import java.util.Arrays;

public class Ejercicio7 {
	/*
	 * Crea un programa que cree un array de tipo entero e introduzca la siguiente
	 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
	 * introducir 10 diez veces el 10, y luego la muestre por pantalla. En esta
	 * ocasión has de utilizar Arrays.fill().
	 */
	public static void main(String[] args) {
		//creamos tabla
		int tabla[]=new int[55];
		//variable inicio
		int ini=0;
		//variable fin
		int fin=1;
		
		//creamos for para recorrer la tabla hasta el 10 para que imprima números hasta el 10
		
		for(int i=1;i<=10;i++) {
			//usamos la clase fill para rellenar
		Arrays.fill(tabla, ini,fin ,i);
		//el inicio será donde acabe el siguiente relleno
		ini=fin;
		//el fin será i +1
		fin+=(i+1);
		
		}
		//imprimimos tabla
		System.out.println(Arrays.toString(tabla));
	}
}
