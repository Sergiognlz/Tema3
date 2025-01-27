package colecciones2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Realiza un programa que cree una lista de nombres de personas vacía. A
	 * continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada
	 * por el usuario el programa debe realizar la operación concreta: 1 Añadir
	 * nuevo nombre a la lista. 2. Elimina un nombre específico. 3. Ordena la lista
	 * alfabéticamente. 4. Busca si un nombre específico está en la lista. 5. Salir.
	 */
	public static void main(String[] args) {
		// creamos HashSet para que no se repitan y no estén ordenados
		LinkedList<String> personas = new LinkedList<>();
		// variable nombre
		String nombre;
		// variable opción
		int opcion;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// creamos do while para que repita el menú hasta que elijamos salir
		do {
			// mostramos menú
			System.out.println();
			System.out.println("MENÚ:");
			System.out.println();
			System.out.println("1. Añadir nuevo nombre a la lista");
			System.out.println("2. Eliminar un nombre específico");
			System.out.println("3. Ordena la lista alfabéticamente");
			System.out.println("4. Busca si un nombre específico está en la lista");
			System.out.println("5. Salir");
			System.out.println();
			// pedimos opción
			System.out.println("Introduce opción");
			// guardamos opción
			opcion = sc.nextInt();

			// switch con cada caso
			switch (opcion) {
			// caso 1 añadir nuevo nombre
			case 1 -> {
				// pedimos nombre al usuario
				System.out.println("Introduce el nombre a añadir");
				// guardamos nombre
				nombre = sc.nextLine();
				// si el nombre ya está en la lista
				if (personas.contains(nombre)) {
					// mensaje de nombre repetido
					System.out.println("El nombre introducido ya está en la lista");
					// sino está...
				} else {
					// lo inserta
					personas.add(nombre);
				}
			}
			//elimina el nombre
			case 2 -> {
				// pedimos nombre al usuario
				System.out.println("Introduce el nombre a añadir");
				// guardamos nombre
				nombre = sc.nextLine();
				// si el nombre ya está en la lista
				if (personas.contains(nombre)) {
				//lo borrará
					personas.remove(nombre);
					// sino está...
				} else {
					//mensaje de el nombre no está en la lista
					System.out.println("El nombre no se encuentra en la lista");
				}
			}
			//ordenar lista
			case 3->{
				//ordenamos alfabéticamente usando la clase collections.sort
				Collections.sort(personas);
				
			}
			//busca si un nombre está en la lista
			case 4->{
				// pedimos nombre al usuario
				System.out.println("Introduce el nombre a añadir");
				// guardamos nombre
				nombre = sc.nextLine();
				// si el nombre ya está en la lista
				if (personas.contains(nombre)) {
					//mensaje de nombre está en la lista
					System.out.println("El nombre se encuentra en la lista");
						// sino está...
					} else {
						//mensaje de el nombre no está en la lista
						System.out.println("El nombre no se encuentra en la lista");
					}
			}
			//salir
			case 5->{
				//saliendo del programa
				System.out.println("Saliendo del programa");
			}
			//si es cualquier otro número
			default->{
				//mensaje de error
				System.err.println("La opción introducida es errónea");
			}
			}

		} while (opcion != 5);
		
		System.out.println();
		//fin de programa
		System.out.println("FIN DE PROGRAMA");
		//cerramos escaner
		sc.close();
	}
}
