package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Crear una lista de números enteros positivos introducidos por consola hasta
	 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
	 * por pantalla los índices de los elementos de valor par.
	 */
	
	public static void main(String[] args) {
		//creamos lista números positivos
		ArrayList <Integer> numPositivos = new ArrayList<>();
		//creamos variable número
		int num;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario un número positivo
		System.out.println("Introduce un número positivo para guardarlo en lista. Introduce un número negativo para salir");
		//guardamos número
		num=sc.nextInt();
		//while que se repita mientras el usuario no introduzca un número negativo
		while(num>0) {
			//insertamos número en la lista
		numPositivos.add(num);	
		//pedimos al usuario un número positivo
		System.out.println("Introduce un número positivo para guardarlo en lista. Introduce un número negativo para salir");
		//guardamos número
		num=sc.nextInt();
			
		}
		//recorremos la lista
		for(int i=0;i<numPositivos.size();i++) {
			
			//cuando los valores recogidos en la lista sean pares...
			if(numPositivos.get(i)%2==0) {
				//imprime el índice más un espacio
				System.out.println(i+" ");
			}
			
		}
		//cerramos escaner
		sc.close();
		
	}
}
