package ejercicio8;

import ejercicio7.Primo;

public class CuentaDivisores {
	/*
	 * Entrada: un número entero
	 * Salida: cantidad de divisores primos
	 * Nececitaremos una variable contador.
	 * Sumando la cantidad de divisores primos.
	 * Un bucle que va desde el 2 hasta el número incluido.
	 * Comprobar si estos números dividen al número y además es primo.
	 * y entonces cuento uno.
	 */
public static int numDivisoresPrimos(int numero) {
	int contador=0;
	boolean primo;
	for(int i=2; i<=numero; i++) {
		primo=Primo.primo(i);
		if(numero%i==0&& primo) {
			contador++;
		}
	}
	
	return contador;
}

}
