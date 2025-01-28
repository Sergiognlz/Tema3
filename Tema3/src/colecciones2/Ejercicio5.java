package colecciones2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Implementa una aplicación de gestión de series de TV que permita al usuario
	 * realizar las siguientes operaciones: 
	 * 1. Agregar serie: El usuario ingresa el nombre de la serie y su valoración, y se agrega al sistema. 
	 * 2. Buscar serie: El usuario ingresa el nombre de la serie que desea buscar, y el sistema muestra
	 * su valoración si existe. 
	 * 3. Eliminar serie: El usuario ingresa el nombre de la serie que desea eliminar, y el sistema la elimina de la lista de series.
	 * 4. Salir: Termina la ejecución del programa.
	 * 
	 *  El programa debe utilizar la
	 * estructura de datos adecuada para almacenar las series. Además, debe mostrar
	 * un menú de opciones y permitir al usuario realizar múltiples operaciones
	 * hasta que decida salir del programa.
	 */
	public static void main(String[] args) {
		//creamos hashmap
		HashMap<String, Double>series=new HashMap<>();
		//variable serie
		String serie;
		//variable puntuación
		double puntuacion;
		//variable opción
		int opcion;
		//objeto escaner
		Scanner sc=new Scanner(System.in);
		
		
		//do while para mostrar el menú hasta que salgamos con la opción 4
		do {
			//mostramos menú
			System.out.println();
			System.out.println("DIRECTORIO SERIES");
			System.out.println();
			System.out.println("MENÚ: ");
			System.out.println();
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir");
			System.out.println();
			//pedimos opción al usuario
			System.out.println("Introduce opción");
			//guardamos
			opcion=sc.nextInt();
			//limpiamos buffer
			sc.nextLine();
			
			//swtich para el menú
			switch(opcion) {
			//caso 1 insertar serie
			case 1->{
				//pedimos serie
				System.out.println("Introduce la serie a añadir");
				//guardamos serie
				serie=sc.nextLine();
				//si la serie ya se encuentra 
				if(series.containsKey(serie)) {
					//mensaje de error
					System.out.println("La serie ya se encuentra en el directorio");
					//si no estuviera
				}else {
					//preguntamos puntuación
					System.out.println("Introduce la puntuación");
					//guardamos puntuación
					puntuacion=sc.nextDouble();
					//añadimos al mapa
					series.put(serie, puntuacion);
				}
				}
			//caso 2 busca serie
			case 2->{
				//pedimos serie
				System.out.println("Introduce la serie a buscar");
				//guardamos
				serie=sc.nextLine();
				//comprobamos si se encuentra el mapa
				if(series.containsKey(serie)) {
					//mostramos serie
					System.out.println();
					System.out.println("Serie: "+serie+" -> Puntuación: "+series.get(serie)+" sobre 10");
					//si la serie no está
				}else {
					//mensaje de error
					System.out.println("La serie no se encuentra en el directorio");
				}
			}
			//caso 3 eliminar serie
			case 3->{
				//pedimos serie
				System.out.println("Introduce la serie a buscar");
				//guardamos
				serie=sc.nextLine();
				if(series.containsKey(serie)) {
					//eliminamos clave
					series.remove(serie);
					//mensaje de eliminación
					System.out.println("Se ha eliminado correctamente");
					//si la serie no está
				}else {
					//mensaje de error
					System.out.println("La serie no se encuentra en el directorio");
			
				}
			}
			//case 4 salir
			case 4->{
				//mensaje de saliendo
				System.out.println("Saliendo del programa");
			}
			//default
			default->{
				//mensaje de error
				System.err.println("La opción introducida no existe");
			}
			}
			//cuando la opción sea 4 saldrá del bucle
		}while(opcion!=4);
		
		//mensaje fin de programa
		System.out.println("FIN DE PROGRAMA");
		//cerramos escaner
		sc.close();
	}
	
}
