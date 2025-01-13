package cadenasvol2;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Diseñar una función a la que se le pase una cadena de caracteres y la
	 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
	 * Recuerda probar la función en un main.
	 */
	
	public static void main(String[] args) {
		//variable frase
		String frase;
		//variable frase invertida
		String fraseInvertida;
		//objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos frase al usuario
		System.out.println("Introduce una frase para invertirla");
		//guardamos frase
		frase=sc.nextLine();
		
		//llamamos a la función y lo guardamos en fraseInvertida
		fraseInvertida=invierteCadena(frase);
		//mostramos fraseInvertida por consola
		System.out.println(fraseInvertida);
		
		//cerramos escaner
		sc. close();
		
	}
	
	static String invierteCadena(String frase) {
		//variable frase invertida 
		String fraseInvertida="";
		
		//recorremos la cadena desde su fin hasta su origen
		for(int i=(frase.length()-1);i>=0;i--) {
			//nos quedamos con el carácter en la posición i y lo concatenamos a la cadena fraseInvertida
			fraseInvertida+=frase.charAt(i);
			
		}
		
		//devolvemos fraseInvertida
		return fraseInvertida;
	}
	
	
}
