package colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
	 * que se insertarán en una colección, de forma que se conserve el orden de
	 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
	 * pantalla.
	 */
	public static void main(String[] args) {
		//creamos LinkedHashSet
		LinkedHashSet<String> conjuntoNombres=new LinkedHashSet<String>();
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
