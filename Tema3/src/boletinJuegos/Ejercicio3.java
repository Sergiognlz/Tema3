package boletinJuegos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	/*
	 * Realiza una función que reciba como parámetro una tabla bidimensional de
	 * enteros y desordene esta misma tabla, es decir, se modifica la tabla de
	 * entrada, no se devuelve una nueva tabla.
	 */
	public static void main(String[] args) {
		// variable tabla bidimensional
				int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
				System.out.println(Arrays.deepToString(desordenaBi(tabla)));
			}

			static int[][] desordenaBi(int[][] tabla) { 
				// creamos variable auxiliar para guardar el valor que se intercambia
				int aux;
				// variable fila aleatoria
				int altFil;
				//variable columna aleatorioa
				int altCol;
				// creamos objeto random
				Random rand = new Random();

				// creamos un for para recorrer las filas de la tabla
				for (int i = 0; i < tabla.length; i++) {
					//otro for para recorrer las columnas de la tabla
					for(int j=0;j<tabla[i].length;j++) {
					// guardamos el valor de la tabla en un número auxiliar para usarlo despues
					aux = tabla[i][j];
					// generamos un índice aleatorio
					altFil = rand.nextInt(0, tabla.length);
					altCol=rand.nextInt(0,tabla[i].length);
					// asignamos el valor de la tabla uno aleatorio
					tabla[i][j] = tabla[altFil][altCol];
					// y a la posición aletaroia el nuevo valor
					tabla[altFil][altCol] = aux;
					}

				}

				// devolvemos tabla
				return tabla;
			}
		}
