package boletinstring;

import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
	 * imprimir tanto la palabra como el número de caracteres de la misma.
	 */
	
	public static void main(String[] args) {
		//creamos variable frase
		String frase;
		//creamos tabla frase
		String tabla[];
		//creamos variable palabraMayor
		String palabraMayor="";
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos la frase
		System.out.println("Introduce una frase");
		//guardamos la frase
		frase=sc.nextLine();
		
		//separamos palabras  mediante el método split y lo guardamos en la tabla
		tabla=frase.split(" ");
		
		//recorremos el array de palabras
		for(int i=0;i<tabla.length;i++) {
			//si la longitud de la palabra recogida en la posición del array es mayor que la palabraMayor actual
			if(tabla[i].length()>=palabraMayor.length()) {
				//guardamos la nueva palabra mayor
				palabraMayor=tabla[i];
			}
		}
		//imprimimos la palabra mayor actual
		System.out.println(palabraMayor);
		//impriimos longitud de la palabra mayor
		System.out.println(palabraMayor.length());
		//cerramos escaner
		sc.close();
	}
}
