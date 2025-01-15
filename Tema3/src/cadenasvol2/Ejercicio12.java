package cadenasvol2;

import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
	 * imprimir tanto la palabra como el número de caracteres de la misma.
	 */
	public static void main(String[] args) {
	//variable frase
		String frase;
		//varible fraseTabla
		String fraseTabla[];
		//variable mayor
		int mayor=0;
		//variable palabra
		String palabra="";
		//objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos frase al usuario
		System.out.println("Introduce una frase");
		//guardamos frase
		frase=sc.nextLine();
		//convertimos frase a tabla
		fraseTabla=frase.split(" ");
		
		//recorremos la tabla
		for(int i=0;i<fraseTabla.length;i++) {
			//recorremos cada palabra
			for(int j=0;j<fraseTabla[i].length();j++) {
				//si la longitud de la palabra es mayor que el valor "mayor"
				if(mayor<fraseTabla[i].length()) {
					//el nuevo mayor será la longitud de dicha palabra
					mayor=fraseTabla[i].length();
					//palabra será la que tenga mayor longitud
					palabra=fraseTabla[i];
				}
				
			}
			
		}
		//imprimimos resultado
		System.out.println("La palabra mayor es "+palabra+", y su longitud es "+mayor);
		
		//cerramos escaner
		sc.close();
	}
}
