package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	/*
	 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
	 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
	 * (ordenada) con los 6 números de la combinación ganadora. La combinación
	 * ganadora debe establecerse en el momento de crear la tabla. El programa
	 * devolverá el número de aciertos.
	 */
	public static void main(String[] args) {
		// creamos las dos tablas
		int tabla1[] = new int[6];
		int tabla2[] = { 4, 8, 15, 16, 23, 42 };
		//variable posición
		int pos;
		// variable contador para los aciertos
		int cont = 0;
		//un contador para controlar los números de la tabla
		int i=0;
		//variable para saber si el número está en la tabla
		int busqueda;
		//guardamos el número aleatorio
		int numAleatorio;
		// creamos objeto random
		Random rand = new Random();

		// mensaje de información
		System.out.println("Vamos a jugar a la lotería");
		// creamos un while para que no salga del bucle hasta que consiga insertar 6 números en la tabla1
		while(i<6) {
			// asignamos valores aleatorios a la tabla entre 1 y 49
			numAleatorio = rand.nextInt(1, 50);
			//ordenamos la tabla para poder hacer búsquedas ordenadas
			Arrays.sort(tabla1);
			//buscamos el número generado aleatorio en la tabla
			busqueda=Arrays.binarySearch(tabla1, numAleatorio);
			//si devuelve un número menor que 0, significa que no se encuentra en la tabla
			if(busqueda<0) {
				//por lo tanto asignamos el valor
				tabla1[0]=numAleatorio;
				//incremetamos la variable i para saber que tenemos un número correcto en la tabla
				i++;
			}
		}
		

		// creamos un for para comparar los valores de las tablas
		for (int j = 0; j < tabla1.length; j++) {

			pos = Arrays.binarySearch(tabla1, tabla2[j]);
			if (pos > 0) {
				cont++;

			}
		}
		// mostramos el resultado por pantalla
		System.out.println("Boleto Premiado: " + Arrays.toString(tabla2));
		System.out.println("Boleto jugado: " + Arrays.toString(tabla1));
		System.out.println("Cantidad de aciertos: " + cont);

	}
}
