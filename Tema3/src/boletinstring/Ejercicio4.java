package boletinstring;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Diseñar una función a la que se le pase una cadena de caracteres y la
	 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
	 * Recuerda probar la función en un main.
	 */
	public static void main(String[] args) {
		//creamos variable frase
		String frase;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos frase al usuario
		System.out.println("Introduce una frase");
		//guardamos la frase
		frase=sc.nextLine();
		
		//imprimimos el resultado de llamar a la función cuentaEspacios
		System.out.println(invertido(frase));
		//cerramos escaner
		sc.close();
	}
	static String invertido(String frase) {
		//creamos variable espacios
		String cadenaInvertida="";
		//creamos un for para recorrer la palabra desde el final hasta el principio
		for(int i=frase.length()-1;i>=0;i--) {
			//en cadenaInvertida concatenamos los carácteres encontrados
			cadenaInvertida+=frase.charAt(i);
	
		}
		//devolvemos la cadenaInvertida
		return cadenaInvertida;
	}
}