package ejercicio2;

public class Numeros {
	// recogemos los dos números en la función.
	static public void numeros(int n1, int n2) {

		// creamos if para recoger el caso en el que el primer número sea menor que el
		// segundo
		if (n1 < n2) {
			// creamos bucle que cuente desde el primer número hasta el segundo.
			for (int i = n1; i <= n2; i++) {
				//imprimimos por pantall los números
				System.out.println(i);
			}
		}
		// recogemos el caso en el que el segundo número sea mayor
		if (n1 > n2) {
			// creamos bucle que cuente desde el primer número hasta el segundo.
			for (int i = n1; i >= n2; i--) {
				//imprimimos por pantalla los números
				System.out.println(i);
			}
		}

	}
}
