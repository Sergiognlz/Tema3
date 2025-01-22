package pruebaexamen;

import java.util.Random;

public class ExamenCripto {
	// variable global tabla bidimensional abecedario
	static char abecedario[][] = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' } };
	// variable global tabla frases con las que vamos a jugar
	static String frases[] = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };

	// variable global que almacenará la frase con la que jugaremos
	static String fraseReal;
	// variable global que almacenará la frase codificada con la que jugaremos
	static String fraseCodificada;
	// creamos objeto random
	static Random rand = new Random();

	public static void main(String[] args) {

	}

	// función que desordenará la tabla abecedario
	static void desordenaAbecedario() {
		// variable fila aleatoria
		int filaAl;
		// variable columna aleatoria
		int columAl;
		// variable auxiliar donde guardar la letra para usarla después
		char aux;

		// creamos for para recorrer las filas
		for (int i = 0; i < abecedario.length; i++) {
			// for para recorrer las columnas
			for (int j = 0; j < abecedario[i].length; j++) {
				// generamos una fila aleatoria
				filaAl = rand.nextInt(0, abecedario.length);
				// generamos una columna aleatoria
				columAl = rand.nextInt(0, abecedario[0].length);
				// guardamos en auxiliar el valor que tiene la posición actual de la tabla
				aux = abecedario[i][j];
				// asignamos a esa posición el valor de una posición aleatoria
				abecedario[i][j] = abecedario[filaAl][columAl];
				// y por último damos a la posición aleatoria el valor guardado en auxiliar
				abecedario[filaAl][columAl] = aux;
			}
		}

	}
	// función que selecciona una frase al azar de la tabla y la guarda en fraseReal
	static void eligeFrase() {
		//asignamos a frase real una aleatoria de la tabla
		fraseReal=frases[rand.nextInt(0,frases.length)];
		
	}
	//función que codifica la fraseReal y la guarda en fraseCodificada
	static void codificaFrase() {
		
		//recorremos abecedario con un for para filas
		for(int i=0;i<abecedario.length;i++) {
			//otro for para columnas
			for(int j=0;j<abecedario[i].length;j++) {
				
			
			}
			
		}
		
		
	}

}
