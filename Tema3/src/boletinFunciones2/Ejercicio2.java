package boletinFunciones2;

import java.util.Arrays;

public class Ejercicio2 {
	/*
	 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
	 * array distinto su transposición:
	 * 1	2	3	4
	 * 5	6	7	8
	 * 9	10	11	12
	 * 13	14	15	16
	 */
	public static void main(String[] args) {
		//creamos la tabla que pasaremos a la función
		int tabla1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int tabla2[][]=new int[4][4];
		
		//llamamos a la función  y guardamos en tabla2
		tabla2=recorreColum(tabla1);
		
		//vamos a mostrar bien ordenadita la tabla que recibimos
		for(int i=0;i<tabla2.length;i++) {
			//for interno para las filas
			for(int j=0;j<tabla2[i].length;j++){
				//imprimimos la tabla2
				System.out.print(tabla2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(tabla2));
	}
	static int[][] recorreColum(int tabla1[][]) {
		//creamos la tabla donde volcaremos la tabla original
		int tabla2[][]=new int[tabla1.length][tabla1.length]; 
		
		//crearemos un for para recorrer la tabla por las columnas en vez de las filas
		for(int j=0;j<tabla1[0].length;j++) {
			//for interno para las filas
			for(int i=0;i<tabla1.length;i++){
				//asignamos a los valores de las posiciones de la tabla 2 a la tabla 1
				tabla2[i][j]=tabla1[j][i];
			}
			
		}
		//devolvemos la tabla 2
		return tabla2;
	}
}
