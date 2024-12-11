package boletinstring;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
	 * completa separando las palabras introducidas con espacios en blanco. Terminar
	 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
	 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
	 * “fin” no aparecerá en la frase final
	 */
	public static void main(String[] args) {
		//creamos variable palabra
		String palabra;
		//creamos variable cadena
		String cadena="";
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario que introduzca una frase formada por palabras
		System.out.println("Introduce una palabra");
		//guardamos palabra
		palabra=sc.next();
		
		//creamos while que siga pidiendo palabras y concatenando hasta que reciba la palabra fin
		while(!(palabra.equalsIgnoreCase("FIN"))) {
			
			//concatenamos la palabra y la guardamos en la cadena
			cadena+=palabra+" ";
			//seguimos pidiendo palabras
			System.out.println("Introduce una palabra");
			//guardamos la palabra
			palabra=sc.next();
			
		}
		//imprimimos resultado
		System.out.println(cadena);
		//cerramos escaner
		sc.close();
	}
	
}
