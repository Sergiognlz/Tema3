package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Ejercicio3 {
	/*
	 * Realiza un programa que genere 30 números enteros aleatorios, con valores
	 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
	 * ordenada. Pinta la colección por consola una vez rellena.
	 */
	
	public static void main(String[] args) {
		//creamos lista
		ArrayList<Integer> numerosAleatorios=new ArrayList<>();
		//objeto random
		Random rand=new Random();
		
		//recorremos la lista durante 30 iteraciones
		for(int i=0;i<30;i++) {
			//insertamos valores aleatorios
			numerosAleatorios.add(rand.nextInt(1,11));
		}
		
		//ordenamos lista
		Collections.sort(numerosAleatorios);
		//imprimimos lista
		System.out.println(numerosAleatorios);
		
	}
}
