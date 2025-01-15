package cadenasvol2;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
	 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
	 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
	 * minúsculas, mostrando siempre la codificación en minúsculas. Un ejemplo: la
	 * palabra «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
	 * codificador, en el que se implemente la función: char codifica(char
	 * conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado
	 * según los conjuntos 1 y 2 que se le pasan.
	 */
	public static void main(String[] args) {
		// variable frase
		String frase;
		//frase codificada
		String fraseCod="";
		// variable carácter c
		char c;
		// codigo 1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// codigo 2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// escaner
		Scanner sc = new Scanner(System.in);
		//pedimos frase
		System.out.println("Introduce una frase");
		//guardamos frase
		frase=sc.nextLine().toLowerCase();
		//recorremos frase
		for(int i=0;i<frase.length();i++) {
			//asignamos a c el valor del caracter de la frase
			c=frase.charAt(i);
			//llamamos a la función y la guardamos en c
			c=codifica(conjunto1,conjunto2,c);
			//concatenamos en frase codificada
			fraseCod+=c;
		}
		//mostramos frase codificada
		System.out.println(fraseCod);
		
		//cerramos escaner
		sc.close();
		
	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {
		// carácter codificado
		char cCod=c;
//recorremos el conjunto
		for (int i = 0; i < conjunto1.length; i++) {
			//si el carácter pasado se encuentra en conjunto1
			if (c == conjunto1[i]) {
				//carácter codificado será el equivalente al conjunto2
				cCod=conjunto2[i];
			}
		}

		// devolvemos carácter codificado
		return cCod;
	}
}
