package boletinFunciones1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
	 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
	 * rellena con números pares aleatorios comprendidos entre 2 hasta fin
	 * inclusive.
	 */
	public static void main(String[] args) {

		// variable longitud de tabla
		int longitud;
		// variable longitud de los aleatorios. Genera números entre 2 y fin
		int fin=0;
		// creamos booleano error para el try catch
		boolean error = false;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos longitud
		System.out.println("Introduce la longitud de la tabla");
		// guardamos valor
		longitud = sc.nextInt();
		// pedimos fin y hacemos un try catch para comprobar que sea par
		do {
			try {
				// pedimos fin
				System.out.println("Introduce rango de números pares aleatorios");
				// guardamos valor
				fin = sc.nextInt();
				assert (fin> 0) : "El valor fin debe ser mayor de cero";
				error = false;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				error = true;
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto");
				error = true;
			} finally {
				sc.nextLine();
			}

		} while (error);
		
		//imprimos la tabla
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		//cerramos escaner
		sc.close();
	}

	public static int[] rellenaPares(int longitud, int fin) {
		//creamos una tabla
				int tabla[]=new int[longitud];
				//creamos auxiliar num
				int num;
				//creamos booleano para controlar la salida del do while
				boolean par=false;
		//creamos objeto random
		Random rand=new Random();
		//for para rellenar
		for(int i=0;i<longitud;i++) {
			do {
			//guardamos el número random
			num=rand.nextInt(2,fin+1);
			//par será false a menos que el número generado sea par
			par=false;
			//comprobamos que sea par
			if(num%2==0) {
				//lo guardamos en la tabla
				tabla[i]=num;
				//si es par, par será true
				par=true;
			}
			//y saldrá del bucle 
			}while(!par);
		}
		Arrays.sort(tabla);
		
		return (tabla);
	}
}
