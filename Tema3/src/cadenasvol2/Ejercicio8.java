package cadenasvol2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Implementa un programa que lea una frase y muestre todas sus palabras
	 * ordenadas de forma alfabética. Suponemos que cada palabra de la frase se
	 * separa de otra por un único espacio.
	 */
	public static void main(String[] args) {
		//creamos variable frase
		String frase;
		//variable fraseTabla
		String fraseTabla[];
		//obejto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario frase
		System.out.println("Introduce una frase");
		//guardamos la frase
		frase=sc.nextLine();
		
		//convertimos la frase en array con frase.split
		fraseTabla=frase.split(" ");
		
		//ordenamos la tabla con el método array.sort
		Arrays.sort(fraseTabla);
		//unimos la tabla en la frase separadas por espacios en blancos
		frase=String.join(" ", fraseTabla);
		//imprimimos el resultado
		System.out.println(frase);
		//cerramos escaner
		sc.close();
	}
	
}
