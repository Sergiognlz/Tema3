package colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {
	/*
	 * Implementa una aplicación donde ir registrando el número de veces que ha
	 * salido cada número del euromillón. Para ello tendrás que usar dos
	 * colecciones, una para los números y otra para las estrellas. Al usuario se le
	 * debe pedir que introduzca primero los 5 números y a continuación las 2
	 * estrellas del último sorteo. El programa comprobará si ya se encuentra el
	 * número correspondiente en la colección, si no está, lo añadirá y le pondrá el
	 * valor 1. Si ya está, incrementará en 1 su valor. Las colecciones no pueden
	 * tener repetidos y deben estar ordenadas.
	 */

	public static void main(String[] args) {
		// creamos mapa números
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		// creamos mapa estrellas
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		//variable número
		int num;
		//objeto escanner
		Scanner sc=new Scanner(System.in);
		//variable repetición
		int repet=0;
		
		//for para iterar 5 veces y guardar 5 números en el mapa
		for(int i=0;i<5;i++) {
		//pedimos números al usuario
		System.out.println("Introduce un número");
		//guardamos número
		num=sc.nextInt();
			
		//mientras el número no esté en el rango que buscamos 1-50 seguirá repitiendo
		do {
			//si ya se encuentra en el mapa...
		if(numeros.containsKey(num)) {
			//reemplazamos el valor de número asignándole el valor actual + 1
			numeros.put(num, (numeros.get(num)+1));
			//si no está...
		}else {
			//lo añade con valor 1 porque se encuentra 1 vez
			numeros.put(num, 1);
		}
		//se repite mientras los números no sean correctos
		}while(num<1||num>50);
		
		}
		
		//para el mapa estrellas iteramos 2 veces
		for(int i=0;i<2;i++) {
			//pedimos números al usuario
			System.out.println("Introduce una estrella");
			//guardamos número
			num=sc.nextInt();
				
		//mientras el número no esté en el rango que buscamos 1-12 seguirá repitiendo
		do {
			//si ya se encuentra en el mapa...
		if(estrellas.containsKey(num)) {
			//reemplazamos el valor de número asignándole el valor actual + 1
			estrellas.put(num, (estrellas.get(num)+1));
			//si no está...
		}else {
			//lo añade con valor 1 porque se encuentra 1 vez
			estrellas.put(num, 1);
		}
		//se repite mientras los números no sean correctos
		}while(num<1||num>12);
		
		}
		System.out.println("Números: ");
		System.out.println(numeros);
		System.out.println("Estrellas: ");
		System.out.println(estrellas);
		
		//cerramos escaner
		sc.close();
	}
}
