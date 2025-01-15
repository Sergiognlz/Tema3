package cadenasvol2;

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
		// variable frase
		String frase;
		// variable booleana dialecto
		boolean dialecto;
		//constante prefijo
		final String PREFIJO = "Javalín, javalón";
		// constante sufijo
		final String SUFIJO = "javalén, len, len";
		// frase traducida
		String fraseTraducida;
		// objeto escaner
		Scanner sc = new Scanner(System.in);

		// pedimos al usuario frase
		System.out.println("Introduce una frase");
		// guardamos la frase
		frase = sc.nextLine();
		// dialecto será true si empieza por el prefijo o acaba por el mismo
		dialecto = frase.startsWith(PREFIJO) || frase.endsWith(SUFIJO);
		// si está escrito en el dialecto...
		if (dialecto) {
			fraseTraducida=frase;
			//reemplazamos prefijo por espacio en blanco
			fraseTraducida = fraseTraducida.replace(PREFIJO, "");
			//reemplazamos sufijo por espacio en blanco
			fraseTraducida = fraseTraducida.replace(SUFIJO, "");
			// mostrará un mensaje para informar de ello
			System.out.println("Está escrito en el dialecto de retrasados");
			System.out.println();
			System.out.println("Se traduce como:" + fraseTraducida);
		}else {
			//si no está escrito en lenguaje de retrasados...
		System.out.println("No está escrito en lenguaje de retrasados");
		}
		//cerramos escaner
		sc.close();
	}
}
