package boletin1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
	 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
	 * en qué posiciones del array aparece N.
	 */

	public static void main(String[] args) {

		// creamos variable tabla
		int tabla[] = new int[100];
		// creamos variable num
		int num;
		//creamos variable posición
		int pos=0;
		//creamos un contador para saber cuantas veces aparece un número
		int cont=0;
		//creamos un booleano enc
		boolean enc=false;
		// creamos objeto escáner
		Scanner sc = new Scanner(System.in);
		// creamos objeto Random
		Random rand = new Random();

		// creamos for para rellenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			// asignamos a la posición de la tabla un valor aleatorio entre 1 y 100
			tabla[i] = rand.nextInt(1, 101);
		}
		// pedimos al usuario un valor n
		System.out.println("Introduce un número para comprobar si se encuentra en la tabla");
		// guardamos el valor introducido
		num = sc.nextInt();
		// creamos un for para leer la tabla y buscar el número
		for (int j = 0; j < tabla.length; j++) {
			// cuando el número sea igual al valor almacenado en la posición que recorre
			// entrará al if
			if (tabla[j] == num) {
				//pondrá el booleano econtrado a true
				enc=true;
				//y asignará a posición el valor donde se encuentr
				pos=j;
				//además contamos cuantas veces aparece
				cont++;
			
			}
		}
		//si lo encuentra imprimirá un mensaje y si no otro.
		if(enc) {
			// imprimiendo el mensaje de la posición donde se encuentra el número
			System.out.println("El número aparece "+cont+" vez/veces en la posición " + pos);
		}else {
			// nos indicará que no se encuentra en la tabla
			System.out.println("El número no se encuentra en la tabla");
		}
	
		//cerramos escaner
		sc.close();
	}

}
