package boletinstring;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
	 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
	 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
	 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
	 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
	 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
	 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
	 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
	 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
	 */

	public static void main(String[] args) {
		// creamos variable frase
		String frase;
		// creamos variable tablaFrase
		String tablaFrase[];
		// creamos booleano empieza
		boolean empieza = false;
		// creamos booleano termina
		boolean termina = false;
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos frase al usuario
		System.out.println("Introduce una frase");
		// guardamos la frase
		frase = sc.nextLine();
		// realizamos un método startsWiith para saber si empieza por javalin javalon
		empieza = frase.startsWith("Javalín, javalón");
		// realizamos un método endsWith para saber si acaba por la vaina esa
		termina = frase.endsWith("javalén, len, len");
		// si empieza por la vaina
		if (empieza) {
			// machacamos la frase quitando las 15 primeras posiciones con el método
			// substring
			frase = frase.substring(17);
		}
		//si termina por la vaina
		if (termina) {
			//machacamos la frase quedándonos con la frase hasta la posición de las últimas 16 posiciones
			frase = frase.substring(0, (frase.length() - 17));
		}

		// imprimimos resultado
		System.out.println(frase);

		// cerramos escaner
		sc.close();
	}

}