package boletinFunciones1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Implementa la función: int[] suma(int t[], int numElementos), que crea y
	 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
	 * de t. Veamos un ejemplo, sea t=[10, 1, 5, 8, 9, 2]. Si los elementos de t se
	 * agrupan de 3 en 3, se harán las sumas:
	 */
	public static void main(String[] args) {
		// variable tabla t
		int t[] = new int[10];
		// variable numElementos
		int numElementos;
		//creamos tabla auxiliar donde guardar lo que devuelve la función
		int tSol[];
		// creamos objeto escaner
		Scanner sc = new Scanner(System.in);
		// creamos objeto random
		Random rand = new Random();

		// creamos la tabla t y la recorremos
		for (int i = 0; i < t.length; i++) {
			// rellenamos con valores aleatorios entre 1 y 100
			t[i] = rand.nextInt(1, 101);
		}
		// pedimos al usuario el número de elementos a sumar
		System.out.println("Introduce los elementos a sumar");
		// guardamos el valor
		numElementos = sc.nextInt();
		//llamamos a la funcion y la guardamos en la tabla solución
		tSol=suma(t,numElementos);
		//imprimimos la tabla
		System.out.println("Tabla Suma:" +Arrays.toString(tSol));
		System.out.println();
		System.out.println("Tabla Generada:" +Arrays.toString(t));
	}
	static int[] suma(int t[], int numElementos) {
		//creamos tabla suma para guardar los valores
		int tablaSuma[]=new int[t.length-(numElementos-1)];
		//creamos una variable para guardar cada suma independiente
		int suma=0;
		
		//for  para recorrer la tabla que hemos creado para almacenar la suma
		for(int i=0;i<tablaSuma.length;i++) {
			
			suma=0;
			
			//otro for para recorrer la tabla que pasamos y la recorremos tantas veces como numElementos
			for(int j=i;j<i+numElementos;j++) {
				//sumamos los valores que nos interesan
				suma+=t[j];
			}
			//asignamos a la tabla el valor de la suma final
			tablaSuma[i]=suma;
		}
		
		
		
		//devolvemos la tabla suma
		return tablaSuma;
	}
}
