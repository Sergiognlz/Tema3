package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego lo recorra para calcular la suma de todos los números y,
	 * además, averiguar el máximo y mínimo y mostrarlos por pantalla.
	 */

	public static void main(String[] args) {

		//creamos una tabla 
		double tabla[]=new double[10];
		//creamos variable suma total
		double suma=0;
		//creamos variable mayor y menor
		double mayor=Double.MIN_VALUE;
		double menor=Double.MAX_VALUE;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//creamos for para recorrer la tabla
		for(int i=0;i<tabla.length;i++) {
			//pedimos número al usuario
			System.out.println("Introduce un número para la posición "+(i+1));
			//guardamos el valor
			tabla[i]=sc.nextDouble();
			
		}
		//creamos un for each para leer los números y sumarlos
		for(double num:tabla) {
			//sumamos al total el número almacenado en cada posición
			suma+=num;
			//si el numero leido es mayor que el valor de Mayor 
			if(num>=mayor) {
				//asignamos a mayor el valor del número
				mayor=num;
			}
			//si el número leido es menor que Menor
			if(num<=menor) {
				//asignmaos a menor el valor del número
				menor=num;
			}
		}
		//mostramos suma
		System.out.println("Suma: "+suma);
		//mostramos mayor
		System.out.println("Máximo: "+mayor);
		//mostramos menor
		System.out.println("Mínimo: "+menor);
		//cerramos escaner
		sc.close();
	}
}