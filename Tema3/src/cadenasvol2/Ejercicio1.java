package cadenasvol2;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
	 * decir, la que contiene menos caracteres.
	 */
	public static void main(String[] args) {
		
		//creamos variable frase 1
		String frase1;
		//creamos variable frase 2
		String frase2;
		//creamos objeto scanner
		Scanner sc=new Scanner (System.in);
		
		//pedimos al usuario la primera frase
		System.out.println("Introduce la frase 1");
		//guardamos frase
		frase1=sc.nextLine();
		//pedimos segunda frase
		System.out.println("Introduce la frase 2");
		//guardamos frase
		frase2=sc.nextLine();
		
		//comparamos las longitudes de las cadenas con .lenth
		
		if(frase1.length()<frase2.length()) {
		//si frase2 es mayor que frase1
			System.out.println("Frase2 es mayor");
		}else if(frase1.length()>frase2.length()) {
			//si frase1 es mayor
			System.out.println("Frase1 es mayor");
		}else {
			System.out.println("Ambas son igual de largas");
		}
		//cerramos escaner
		sc.close();
	}
	
	
}
