package colecciones;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {
	/*
	 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
	 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
	 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
	 * mostrará la colección resultante por pantalla.
	 */

	public static void main(String[] args) {
		// creamos conjunto treeSet
		TreeSet<Integer> numAleatorios = new TreeSet<>();

		// objeto random
		Random rand = new Random();

		// Insertará valores hasta que lo haga 20 veces
		while (numAleatorios.size() < 20) {
			// generamos un valor aleatorio y lo guardamos en número. Como es un conjunto,
			// los números que ya existan en el conjunto no lo insertará
			numAleatorios.add(rand.nextInt(0, 101));

		}
		//imprimimos resultado
		System.out.println(numAleatorios);
	}
}
