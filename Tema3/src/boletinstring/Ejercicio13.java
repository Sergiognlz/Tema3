package boletinstring;

import java.util.Scanner;

public class Ejercicio13 {

	/*
	 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
	 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
	 * mora. Construir una función que recibe dos palabras por parámetro e indique
	 * si son anagramas una de otra.
	 */
	public static void main(String[] args) {
		//creamos variable palabra1
		String palabra1;
		//creamos variable palabra2
		String palabra2;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos palabra 1
		System.out.println("Introduce la primera palabra");
		//guardamos palabra1
		palabra1=sc.next();
		//pedimos palabra 2
		System.out.println("Introduce la segunda palabra");
		//guardamos  palabra2
		palabra2=sc.next();
		
		if(anagrama(palabra1, palabra2)) {
			
		}else {
			
		}
		
	}
	//función que compruebe que son anagramas
	static boolean anagrama(String palabra1,String palabra2) {
		boolean anagrama=false;
		
		//devolvemos booleano anagrama
		return anagrama;
	}
}
