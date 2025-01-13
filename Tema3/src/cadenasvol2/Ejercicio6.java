package cadenasvol2;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realizar una función que reciba una frase como parámetro de entrada y nos
	 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
	 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
	 * espacios. Un ejemplo de frase palíndroma es: “Dabale arroz a la zorra el
	 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
	 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
	 * sin tildes.
	 */
	public static void main(String[] args) {
		// creamos variable frase
		String frase = "";
		// variable booleano palindroma
		boolean palindroma = false;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos cadena al usuario
		System.out.println("Introduce una frase");
		// guardamos la frase
		frase = sc.nextLine().toLowerCase();
		//llamamamos a la función y guardamos lo que devulve en nuestro booleano
		palindroma = palindroma(frase);

		//si es palíndroma
		if(palindroma) {
			//mensaje de resultado
			System.out.println("Es palíndroma");
		//si no lo es
		}else {
			//mensaje de resultado
			System.out.println("No es palíndroma");
		}
		// cerramos escaner
		sc.close();
	}

	static boolean palindroma(String frase) {
		// creamos booleano palindroma
		boolean palindroma = true;
		// creamos variable fraseInvertida
		String fraseInvertida = "";
		// contador para evitar que salga de la cadena
		int cont = 0;
		// remplazamos los espacios blancos por cadena vacía
		frase=frase.replace(" ", "");

		// recorremos de manera inversa la frase con un for
		for (int i = frase.length() - 1; i >= 0; i--) {
			// concatenamos en fraseInvertida los caracteres de la frase del fin al
			// principio para invertirla
			fraseInvertida += frase.charAt(i);
		}
		// ahora comparamos cambas cadenas con un while que repetirá mientras la frase
		// sea palíndroma o recorra la cadena hasta el final
		while (palindroma && cont < frase.length()) {
			//comparamos los caracteres de ambas cadenas y si son iguales...
			if(frase.charAt(cont)==fraseInvertida.charAt(cont)){
			//incrementamos contador
				cont++;
				//en caso de no ser iguales...
			}else {
				//booleano palindroma será false
				palindroma=false;
			}
		}

		// devolvemos palindroma
		return palindroma;
	}
}
