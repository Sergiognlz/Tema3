package boletinstring;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
	 * espacios en blanco tiene. Recuerda probar la función en un main.
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
		System.out.println(cuentaEspacios(frase));
	}
	static int cuentaEspacios(String frase) {
		//creamos variable espacios
		int espacios=0;
		//creamos un for para recorrer la palabra
		for(int i=0;i<frase.length();i++) {
			//cuando el carácter de la posición actual sea un espacio en blanco
			if(frase.charAt(i)==' ') {
				//contador espacios se incrementa
				espacios++;
			}
		}
		//devolvemos el número de espacios
		return espacios;
	}
}
