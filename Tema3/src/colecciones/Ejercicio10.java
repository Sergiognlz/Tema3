package colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Realiza una aplicación donde se registren nombres de productos y su precio.
	 * Lleva a cabo el siguiente menú: PRODUCTOS 1. Alta de producto 2. Baja de
	 * producto 4. Listar existencias 0. Salir El orden en el que se almacenan los
	 * productos no importa.
	 */

	public static void main(String[] args) {
		// creamos variable mapa
		HashMap<String, Double> listaProductos = new HashMap<>();
		// variable producto
		String producto;
		// variable precio
		double precio;
		// variable opción
		int opcion;
		// objeto Scanner
		Scanner sc = new Scanner(System.in);

		// do while para repetir menú hasta que elijamos la opción salir
		do {
			// mostramos menú
			System.out.println("PRODUCTOS");
			System.out.println();
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Lista de existencias");
			System.out.println("0. Salir");
			System.out.println();

			// pedimos opcion al usuario
			System.out.println("Elige una opción");
			// guardamos opción
			opcion = sc.nextInt();
			//limpiamos buffer
			sc.nextLine();

			// hacemos switch para el menú
			switch (opcion) {
			// caso 1 Alta producto
			case 1 -> {
				// pedimos producto
				System.out.println("Introduce el producto a añadir");
				// guardamos
				producto = sc.nextLine();
				// pedimos precio
				System.out.println("Introduce precio del producto");
				// guardamos precio
				precio = sc.nextDouble();
				// añadimos producto y precio al mapa
				listaProductos.put(producto, precio);
			}
			// baja producto
			case 2 -> {
				// pedimos producto a eliminar
				System.out.println("Introduce producto a dar de baja");
				// guardamos
				producto = sc.nextLine();
				// eliminamos producto del mapa
				listaProductos.remove(producto);
			}
			// caso 3 mostrar existencias
			case 3 -> {
				// creo un for each para recorrer el mapa
				for (String productos : listaProductos.keySet()) {
					// muestro claves y valores del mapa
					System.out.println(productos + " : " + listaProductos.get(productos) + " euros");
					System.out.println();
				}

			}
			// caso 0 salir del programa
			case 0 -> {
				// mensaje saliendo
				System.out.println("Saliendo del programa");
			}
			// en caso de introducir una opción que no existe
			default -> {
				// mensaje de error
				System.err.println("La opción introducida no existe");
			}
			}
		
		} while (opcion != 0);
		// cerramos escaner
		sc.close();
	}
}
