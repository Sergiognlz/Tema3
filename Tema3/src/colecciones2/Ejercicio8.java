package colecciones2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio8 {
	/*
	 * Lista de tareas: Implementa una aplicación que permita a los usuarios
	 * gestionar una lista de tareas. Las tareas deben estar agrupadas por
	 * categorías (por ejemplo, trabajo, personal). Usa un mapa donde la clave sea
	 * la categoría y el valor sea una lista de tareas. Debe permitir añadir,
	 * eliminar y listar tareas por categoría.
	 */
	public static void main(String[] args) {
		// creamos mapa
		HashMap<String, Set<String>> listaTareas = new HashMap<>();
		// creamos conjunto
		Set<String> tareas;
		// variable cadena categoría
		String categoria;
		// variable cadena tarea
		String tarea;
		// variable opción
		int opcion;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// do while para el menú
		do {
			// mostramos menú
			System.out.println();
			System.out.println("LISTA DE TAREAS");
			System.out.println();
			System.out.println("Menú:");
			System.out.println();
			System.out.println("1. Añadir tareas");
			System.out.println("2. Eliminar tareas");
			System.out.println("3. Listar tareas");
			System.out.println("0. Salir");
			System.out.println();
			// pedimos opción al usuario
			System.out.println("Introduce la opción ");
			// guardamos opción
			opcion = sc.nextInt();
			// limpiamos buffer
			sc.nextLine();

			// switch menú
			switch (opcion) {
			// caso 1
			case 1 -> {
				// pedimos categoria
				System.out.println("Introduce la categoría donde quieres añadir la tarea");
				// guardamos
				categoria = sc.nextLine();
				// pedimos tarea
				System.out.println("Introduce la tarea a añadir");
				// guardamos
				tarea = sc.nextLine();

				// comprobamos si la categoría existe
				if (listaTareas.containsKey(categoria)) {
					// creamos el conjunto tareas
					tareas = listaTareas.get(categoria);
					// comprobamos si la puede añadir porque no existe
					if (tareas.add(tarea)) {
						// mensaje de existo
						System.out.println("La tarea se ha añadido con éxito");

					} else {
						// mensaje de error
						System.out.println("La tarea que intenta añadir ya existe para esa categoría");
					}
					// sino
				} else {
					// creamos el conjunto tareas
					tareas = new HashSet<>();
					// añadimos la tarea al conjunto tareas
					tareas.add(tarea);
					// la creamos y añadimos
					listaTareas.put(categoria, tareas);
					// mensaje exito
					System.out.println("La categoría se ha creado con éxito y la tarea ha sido añadida");

				}

			}
			// caso 2 eliminar tareas
			case 2 -> {
				// pedimos la categoría
				System.out.println("Introduce la categoría de la que desea eliminar una tarea");
				// guardamos categoria
				categoria = sc.nextLine();
				// pedimos tarea a eliminar
				System.out.println("Introduce la tarea a eliminar");
				// guardamos tarea
				tarea = sc.nextLine();
				// comprobamos si la categoría existe
				if (listaTareas.containsKey(categoria)) {
					// buscamos la categoría en el mapa y lo guardamos en tareas
					tareas = listaTareas.get(categoria);
					// si existe eliminamos
					if (tareas.remove(tarea)) {
						// mensaje éxito
						System.out.println("La tarea ha sido eliminada con éxito");
						// en caso contrario
					} else {
						// mensaje error
						System.out.println("La tarea no existe para dicha categoría");
					}
					// si la categoría no existe
				} else {
					// mensaje error
					System.out.println("La categoría que ha introducido no existe");
				}

			}
			//caso 3 mostrar tareas de una categoría
			case 3->{
				// pedimos la categoría
				System.out.println("Introduce la categoría de la que desea eliminar una tarea");
				// guardamos categoria
				categoria = sc.nextLine();
				//si categoría existe en la lista de tareas
				if(listaTareas.containsKey(categoria)) {
					//buscamos la categoría y guardamos el conjunto de tareas
					tareas=listaTareas.get(categoria);
					System.out.println();
					//mostramos tareas
					System.out.println("Tareas para "+categoria+":" +tareas);
					
					//en caso de que no exista
				}else {
					//mensaje de no existe
					System.out.println("La categoría introducida no existe en la lista de tareas");
				}
			}
			//caso 0 saliendo
			case 0->{
				//mensaje saliendo
				System.out.println("Saliendo del programa");
			}
			//default
			default->{
				//mensaje error
				System.out.println("La opción introducida no existe");
			}
			}

			// mientras la opción elegida no sea 0 se repetirá
		} while (opcion != 0);
		//mensaje fin de programa
		System.out.println("FIN DE PROGRAMA");
		//cerramos escaner
		sc.close();
	}

}
