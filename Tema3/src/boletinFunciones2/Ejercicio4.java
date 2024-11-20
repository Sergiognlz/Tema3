package boletinFunciones2;

public class Ejercicio4 {
	/*
	 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
	 * una tabla bidimensional. La función devolverá true si la matriz introducida
	 * corresponde a una matriz mágica, que es aquella donde la suma de los
	 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
	 * contrario devolverá false.
	 */
	public static void main(String[] args) {
		// creamos tabla bidimensional
		int tabla[][] = new int[3][3];
		//int tabla[][]= {{1,2,3,},{5,6,7,},{9,10,11}};
		boolean magic;
		
		//guardamos el booleano que devolvemos en este booleano
		magic=esMagica(tabla);
		
		//if para imprimir que según si es mágico o no
		if(magic) {
			//imprimimos es mágico
			System.out.println("Es Mágico... but magic is heresy");
		}else {
			//imprimimos que no lo es
			System.out.println("No es Mágico...  but innocence proof nothing");
		}
		
		
		

	}

	static boolean esMagica(int tabla[][]) {
		// creamos boleano mágico
		boolean magic = true;
		// variable para guardar la suma
		int sumaFila;
		// variable suma columna
		int sumaColum;
		// variable suma Esperada
		int sumaEsp = 0;

		// for para comprobar la primera fila
		for (int j = 0; j < tabla[0].length; j++) {
			// sumamos la fila
			sumaEsp += tabla[0][j];
		}

		// verificamos la suma de cada fila
		for (int i = 0; i < tabla.length; i++) {
			// inicializamos sumaFila a 0
			sumaFila = 0;
			// recorremos columnas
			for (int j = 0; j < tabla[i].length; j++) {
				//sumamos 
				sumaFila += tabla[i][j];
			}
			//comprueba la suma de la fila con la suma esperada
			if (sumaFila != sumaEsp) {
				//no será mágico
				magic = false;
			}
		}
		// reinicializamos a 0 suma Esperada
		sumaEsp = 0;
		// verificamos la suma de cada fila
		for (int j = 0; j < tabla[0].length; j++) {
			// inicializamos sumaFila a 0
			sumaColum = 0;
			// recorremos columnas
			for (int i = 0; i < tabla.length; i++) {
				sumaColum += tabla[i][j];
			}
			//comprobamos que la suma de las columnas sea diferente de la suma esperada
			if (sumaColum != sumaEsp) {
				//no será mágico
				magic = false;
			}
		}

		// devolvemos booleano
		return magic;
	}
}
