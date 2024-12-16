package cosasguiris;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// variable letra que correspondrá a la A
		char letraA = 'A';
		// variable donde se guardará temporalmente la letra mientras recorra la cadena
		char letra;
		// variable donde se guardará la cadena
		String frase;
		// variable donde guardaremos la cadena una vez codificada
		String fraseCod = "";
	
		
		// creamos objeto examen
		Scanner sc = new Scanner(System.in);
		// pedimos frase al usuario
		System.out.println("Introduce frase");
		// guardamos frase
		frase = sc.nextLine();
		

		// for para recorrer la frase
		for (int i = 0; i < frase.length(); i++) {
			// guardamos el la letra en el char
			letra = frase.toUpperCase().charAt(i);
			// si la letra es Z...
			if (letra == 'Z') {
				// letra será A
				letra = 'A';
				// si hay un espacio
			} else if (letra == ' ') {
				// lo deja igual
				letra = ' ';
				// si hay un 9
			} else if (letra == '9') {
				// letra será 0
				letra = '0';

				// si no hay z
			} else {
				// pasamos a la siguiente letra
				letra = (char) (letra + 1);
			}
			// concatenamos la frase codificada
			fraseCod += letra;

		}
		System.out.println(fraseCod);
		sc.close();
	}

}