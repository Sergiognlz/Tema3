package boletinFunciones2;

public class Ejercicio3 {
	/*
	 * Define una función que reciba una tabla bidimensional y devuelva un booleano
	 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
	 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
	 * matriz. Delfine un método main que llame a la función y muestre por pantalla
	 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
	 */
	public static void main(String[] args) {
		// creamos una bidimensional tabla
		int tabla[][] = new int[4][4];
		// int tabla[][] ={ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
		// 15, 16 } };
		// creamos booleano igual
		boolean igual = false;

		// guardamos en igual lo que nos devuelve la función
		igual = simetria(tabla);

		if (igual) {
			// la tabla será simétrica
			System.out.println("La tabla es asimétrica");
		} else {
			// no será simétrica
			System.out.println("La tabla es simétrica");
		}

	}

	static boolean simetria(int[][] tabla) {
		// creamos booleano que nos dirá si es simétrico
		boolean asimetrico = false;

		// recorremos la tabla bidimensional con un for para filas
		for (int i = 0; i < tabla.length; i++) {
			// for para columnas
			for (int j = 0; j < tabla[i].length; j++) {
				// comprobamos que la tabla no sea asimétrica
				if (tabla[i][j] != tabla[j][i]) {
					// si en algún momento se cumple que no sea simétrica el booleano pasará a true
					asimetrico = true;
				}
			}
		}

		// devolvemos booleano
		return asimetrico;
	}
}
