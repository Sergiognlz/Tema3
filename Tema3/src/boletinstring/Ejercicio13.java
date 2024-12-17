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
		
		//llamamos a la función y si el booleano anagrama es true entrará
		if(anagrama(palabra1, palabra2)) {
			//e imprimirá el mensaje de que son anagrama
			System.out.println("Las palabras son anagrama una de otra");
			//si es falso...
		}else {
			//mensaje de no anagrama
			System.out.println("Las palabras no son anagrama");
		}
		//cerramos escaner
		sc.close();
	}
	//función que compruebe que son anagramas
	static boolean anagrama(String palabra1,String palabra2) {
		//booleano anagrama
		boolean anagrama=true;
		//variable índice
		int ind=0;
		//while que se repetirá mientra el no termine de recorrer palabra1 o el booleano anagrama sea false
		while(ind<palabra1.length()&&anagrama) {
			//cuando no encuentre la palabra devolverá un número negativo y entrará en el if
			if(palabra1.indexOf(palabra2.charAt(ind))<0) {
				//demostrando que no es un anagrama
				anagrama=false;
			}
			if(palabra2.indexOf(palabra1.charAt(ind))<0) {
				//demostrando que no es un anagrama
				anagrama=false;
			}
			//incrementamos el índice
			ind++;
		}
		
		//devolvemos booleano anagrama
		return anagrama;
	}
}
