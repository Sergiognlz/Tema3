package colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {
	/*
	 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
	 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
	 * para almacenar las parejas de palabras. 
	 * El programa mostrará un menú con dos
	 * opciones: 
	 * Inserta palabra. Debe solicitar una palabra en español y su
	 * traducción al inglés.
	 *  Busca palabra. Pregunta por una palabra en español y
	 * devuelve su traducción en inglés. 
	 * Salir. Termina el programa.
	 */
	public static void main(String[] args) {
		//creamos treemap
		TreeMap<String, String>diccionario=new TreeMap<>();
		//creamos variable palabra español
		String palabraEspañol;
		//creamos variable palabra Inglés
		String palabraIngles;
		//variable opción
		int opcion;
		
		
		
		//objeto escanner
		Scanner sc=new Scanner(System.in);
		
		do {
	
		
		//mostramos menú
		System.out.println("Diccionario Español-Inglés");
		System.out.println("Menú:");
		System.out.println("1. Inserta palabra");
		System.out.println("2. Busca palabra");
		System.out.println("0. Salir");
		
		//guardamos la opción elegida
		opcion=sc.nextInt();
	
		
		//switch con las opciones
		switch(opcion) {
		
		//cuando la opción introducida es 1
		case 1->{
			//pedimos palabra en español
			System.out.println("Introduce palabra en español");
			//guardamos palabra español
			palabraEspañol=sc.next();
			//pedimos significado en inglés
			System.out.println("Introduce su traducción al inglés");
			//guardamos palabra inglés
			palabraIngles=sc.next();
			
			//insertamos clave-valor
			diccionario.put(palabraEspañol, palabraIngles);
			
		}
		//cuando es 2
		case 2->{
			//pedimos palabra a buscar
			System.out.println("Introduce palabra en español a buscar para buscar su significado en inglés");
			//guardamos la palabra
			palabraEspañol=sc.next();
			//llamamos al método get y buscamos la palabra
			diccionario.get(palabraEspañol);
		}
		//cuando es 0
		case 0->{
			//mensaje de salida
			System.out.println("Saliendo del programa");
		}
		//si no es ninguna da las otras
		default->{
			//mensaje de error
			System.err.println("La opción introducida");
			
		}
		}
		//
		}while(opcion!=0);
		
		sc.close();
	}
	
}
