package colecciones2;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio6 {
	/*
	 * Libreta de direcciones. Crea una aplicación que relacione nombres de personas
	 * con sus números de teléfono. Hoy en día no es raro que una misma persona
	 * tenga varios númeos de teléfono: el de su casa, el móvil, el de la oficina,
	 * etc. Para ello, cada persona tendrá una lista de teléfonos. Crea un menú con
	 * las siguientes opciones que permita al usuario realizar las siguientes
	 * acciones: 1. Añadir persona. 2. Añadir teléfono a una persona dada. 3.
	 * Mostrar los bteléfonos de una persona. 4. Eliminar teléfono de una persona.
	 * 5. Eliminar una persona. 6. Salir
	 */
	public static void main(String[] args) {
		// creamos mapa direcciones
		TreeMap<String, Set<Integer>> libreta = new TreeMap<>();
		// creamos conjunto números
		Set<Integer> numeros;
		// variable nombre
		String nombre;
		// variable número
		int num;
		// variable opción
		int opcion;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// do while para mostrar menú
		do {
		System.out.println();
		System.out.println("LIBRETA DE CONTACTOS");
		System.out.println();
		System.out.println("MENÚ: ");
		System.out.println("1. Añadir persona");
		System.out.println("2. Añadir número");
		System.out.println("3. Mostrar teléfonos de una persona");
		System.out.println("4. Eliminar teléfono de una persona");
		System.out.println("5. Elimina una persona");
		System.out.println("6 . Salir");
		System.out.println();
		// pedimos la opción
		System.out.println("Introduce la opción");
		// guardamos opción
		opcion = sc.nextInt();
		// limpiamos buffer
		sc.nextLine();

		// switch con menú
		switch (opcion) {
		// case 1 añadir persona
		case 1 -> {
			// pedimos persona usuario
			System.out.println("Introduce el nombre de la persona a añadir");
			// guardamos
			nombre = sc.nextLine();
			// comprobamos si ya existe en el mapa
			if (libreta.containsKey(nombre)) {
				// mensaje de error
				System.out.println("El nombre de la persona introducida ya existe en la libreta");
				// en caso de que no exista
			} else {
				// creamos conjunto vacío previamente declarado
				numeros = new HashSet<>();
				// añade el nombre y el conjunto vacío
				libreta.put(nombre, numeros);
				// mensaje de proceso existoso
				System.out.println("El contacto se ha añadido con éxito");
			}
		}
		// caso 2 añadir número
		case 2 -> {
			// pedimos persona usuario
			System.out.println("Introduce el nombre de la persona que desea añadir un número");
			// guardamos
			nombre = sc.nextLine();
			// comprobamos si ya existe en el mapa
			if (libreta.containsKey(nombre)) {
				// pedimos número a usuario
				System.out.println("Introduce el número a añadir");
				// guardamos el número
				num = sc.nextInt();
				// asignamos al conjunto números el conjunto de ese nombre en concreto
				numeros = libreta.get(nombre);

				// intentamos añadir el número al conjunto del mapa
				if (numeros.add(num)) {
					// si lo consigue
					System.out.println("Se ha añadido correctamente");
					// si no lo ha podido añadir porque ya existía
				} else {
					// mensaje error
					System.out.println("El número que intenta añadir ya existe para ese contacto");
				}

				// en caso de que no exista
			} else {
				// mensaje de error
				System.out.println("El nombre de la persona introducida ya existe en la libreta");
				// creamos conjunto previamente declarado

			}
		}
		// case 3 mostrar telefonos persona
		case 3 -> {
			// pedimos persona usuario
			System.out.println("Introduce el nombre de la persona que desea mostrar números");
			// guardamos
			nombre = sc.nextLine();
			// comprobamos si ya existe en el mapa
			if (libreta.containsKey(nombre)) {
				// asignamos al conjunto números el conjunto de ese nombre en concreto
				numeros = libreta.get(nombre);
				// mostramos números
				System.out.println(numeros);

				// en caso de que no exista
			} else {
				// mensaje error
				System.out.println("El nombre del contacto introducido no existe");
			}

		}
		// caso 4 eliminar teléfono persona
		case 4 -> {
			// pedimos persona usuario
			System.out.println("Introduce el nombre de la persona que desea eliminar número de teléfono");
			// guardamos
			nombre = sc.nextLine();
			// comprobamos si ya existe en el mapa
			if (libreta.containsKey(nombre)) {
				// asignamos al conjunto números el conjunto de ese nombre en concreto
				numeros = libreta.get(nombre);
				// pedimos número a eliminar
				System.out.println("Introduce el número que desea eliminar");
				// guardamos número
				num = sc.nextInt();

				// eliminamos el número si se encuentra en el conjunto
				if (numeros.remove(num)) {
					// mensaje de operación realizada
					System.out.println("La operación se ha realizado con éxito");
					// en caso que no exista el número
				} else {
					// mensaje de número no encontrado
					System.out.println("El número que intenta borrar no existe");
				}

				// en caso de que no exista
			} else {
				// mensaje error
				System.out.println("El nombre del contacto introducido no existe");
			}
		}
		// caso 5 Elimina la persona del mapa
		case 5 -> {
			// pedimos persona usuario
			System.out.println("Introduce el nombre del contacto que desea eliminar");
			// guardamos
			nombre = sc.nextLine();
			// comprobamos si ya existe en el mapa
			if (libreta.containsKey(nombre)) {
				// eliminamos la clave
				libreta.remove(nombre);
				//mensaje éxito
				System.out.println("La operación se ha realizado con éxito");
				// en caso de que no exista
			} else {
				// mensaje error
				System.out.println("El nombre del contacto introducido no existe");
			}

		}
		// caso 6 salir
		case 6 -> {
			// mensaje saliendo
			System.out.println("Saliendo del programa");
		}
		// default
		default -> {
			// mensaje de error
			System.err.println("La opción introducida no existe");
		}
		}
		//cuando la opción sea 6 saldrá del bucle
		}while(opcion!=6);
		
		// mensaje fin de programa
		System.out.println("FIN DE PROGRAMA");
		// cerramos escaner
		sc.close();
	}
}
