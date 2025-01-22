package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {
	/*
	 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
	 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
	 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
	 * entre 5 y 10 elementos ambos inclusive.
	 */
	public static void main(String[] args) {
		//creamos lista de enteros
		ArrayList<Integer> enterosAleatorios=new ArrayList<>();
		//variable tamaño
		int tamaño;
		//variable suma
		int suma=0;
		//variable media
		double media;
		//variable máximo
		int max;
		//variable mínimo
		int min;
		//variable número aleatorio
		int numAl;
		//creamos objeto random
		Random rand=new Random();
		//asignamos un valor aleatorio a tamaño entre el rango deseado
		tamaño=rand.nextInt(5,11);
		
		//recorremos la lista
		for(int i=0;i<tamaño;i++) {
			//generamos un número aleatorio
			numAl=rand.nextInt(0,101);
			//insertamos valores aleatorios entre 0 y 100
			enterosAleatorios.add(numAl);
			//concatenamos la los números para calcular la suma de los números
			suma+=numAl;
			
			}
			//calculamos media casteamos a double;
			media=(double)suma/tamaño;
			//Buscamos máximo con el método Collections.max
			max=Collections.max(enterosAleatorios);
			//Buscamos mínimo con el método Collections.min
			min=Collections.min(enterosAleatorios);
			
			//imprimimos suma
			System.out.println("Suma números: "+suma);
			//imprimimos media
			System.out.println("Media números: "+media);
			//imprimimos máximo
			System.out.println("Máximo números: "+max);
			//imprimimos mínimos
			System.out.println("Mínimo números: "+min);
			
		}
		
		
	}

