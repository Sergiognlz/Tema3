package colecciones2;

import java.util.TreeMap;

public class Ejercicio3 {
	/*
	 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
	 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
	 * muestre el conteo por pantalla. Usa la implementación más apropiada:
	 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad"
	 * . Pista: se puede utilizar el método estático isLetter de la clase Character.
	 */
	public static void main(String[] args) {
		// creamos treeMap
		TreeMap<Character, Integer> letras = new TreeMap<>();
		// variable cadena texto
		String hobbit = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		// variable letra
		char letra;
		
		// la ponemos en minúscula
		hobbit = hobbit.toLowerCase();
		// recorremos la frase del hobbit
		for (int i = 0; i < hobbit.length(); i++) {
			// en cada iteración asignamos a letra el valor recorrido
			letra = hobbit.charAt(i);
			// si la letra es un carácter que sea una letra real...
			if (Character.isLetter(letra)) {
				// busca la letra en la cadena
				if (letras.containsKey(letra)) {
					// si la encuentra reemplaza el valor añadiendo +1 al valor actual
					letras.put(letra, letras.get(letra) + 1);
					// si no...
				} else {
					// pone el valor a 1
					letras.put(letra, 1);
				}
			}
		}
		// mostramos las letras encontradas
		System.out.println(letras);
	}
}
