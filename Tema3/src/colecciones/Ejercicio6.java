package colecciones;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {
	/*
	 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
	 * el orden alfabético.
	 */
	public static void main(String[] args) {
		//creamos LinkedHashSet
		TreeSet<String> conjuntoNombres=new TreeSet<String>();
		//creamos variable nombre
		String nombre;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos nombres al usuario 
		System.out.println("Introduce nombres para guardar en conjunto. Introduce \"fin\" para salir y ver conjunto");
		//guardamos nombre
		nombre=sc.nextLine();
		//hasta que no introduzca fin seguirá pidiendo nombres y guardandolos 
		while(!nombre.equalsIgnoreCase("fin")) {
			//insertamos nombre
			conjuntoNombres.add(nombre);
			//pedimos nombres al usuario 
			System.out.println("Introduce nombres para guardar en conjunto. Introduce \"fin\" para salir y ver conjunto");
			//guardamos nombre
			nombre=sc.nextLine();
			
		}
		
		//mostramos lista
		System.out.println(conjuntoNombres);
		//cerramos escaner
		sc.close();
	}
}