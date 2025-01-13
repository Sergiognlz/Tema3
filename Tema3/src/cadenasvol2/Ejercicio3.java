package cadenasvol2;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
	 * espacios en blanco tiene. Recuerda probar la función en un main.
	 */
	public static void main(String[] args) {
		// creamso variable frase
		String frase;
		// variable espacios
		int espacios;
		// objeto escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos frase 
		System.out.println("Introduce una frase para contar los espacios que tiene");
		//guardamos frase
		frase=sc.nextLine();
		//llamamos a la función y guardamos lo que devuelve en espacios
		espacios=cuentaEspacios(frase);
		//mostramos espacios
		System.out.println("La frase tiene "+espacios+" espacios");
		
		// cerramos escaner
		sc.close();
	}
	static int cuentaEspacios(String frase) {
		//variable espacios
		int espacios=0;
		
		//recorremos la frase con un for
		for(int i=0;i<frase.length();i++) {
			//cuando encuentre un espacio vacío...
			if(frase.charAt(i)==' ') {
				//incrementa espacios
				espacios++;
			}
		}
		
		
		//devolvemos espacios
		return espacios;
	}
}
