package colecciones2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {
	/*
	 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
	 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
	 * se dupliquen números en el caso de que se repitan y que garantice un orden
	 * basado en inserción. Luego, muestra los números únicos generados por
	 * pantalla.
	 */
	public static void main(String[] args) {
		// creamos treeSet
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		// variable número
		int num;
		// objeto random
		Random rand = new Random();
		// contador para las iteraciones
		int cont = 0;

		// while para que se repita hasta que inserte 10 números
		while (cont < 10) {
			// hacemos un do while para que repita el proceso de generar un número aleatorio
			// hasta que el número generado sea válido
			do {
				// generamos un número aleatorio entre 1-20
				num = rand.nextInt(1, 21);
				// llamamos al método contains para saber si ya se encuentra en el
				// conjunto(true) o no(false). Si es true repetirá el bucle
			} while (numeros.contains(num));
			//una vez salimos insertamos el número en el conjunto números
			numeros.add(num);
			//incrementamos contador
			cont++;
		}
		//mostramos conjunto números
		System.out.println(numeros);
		
	}

}
