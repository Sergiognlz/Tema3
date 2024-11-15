package boletinFunciones1;

public class Ejercicio1 {
	/*
	 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
	 * la suma de todos los valores almacenados en la tabla. Prueba el
	 * comportamiento de la función en un método main.
	 */
	public static void main(String[] args) {
		//creamos tabla
		int tabla[]= {1,2,3,4,5,6,7,8,9,10};
		
		//imprimimos lo que devuleve la función
		System.out.println(suma(tabla));
	}
	//creamos la función suma
	public static int suma(int tabla[]) {
		//variable donde guardar la suma
		int suma=0;
		//recorremos la tabla para sumar
		for(int i=0;i<tabla.length;i++) {
			//almacenamos la suma
			suma+=tabla[i];
		}
		//devolvemos la suma
		return(suma);
	}
}
