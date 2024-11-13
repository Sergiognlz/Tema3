package boletin3bidimen;

public class Ejercicio4 {
	/*
	 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
	 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
	 * fila). Muestra la tabla por pantalla.
	 */
	public static void main(String[] args) {
		//creamos tabla
		int tabla[][]=new int[10][10];
		
		//for para rellenar
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				//insertamos valores
				tabla[i][j]=(i+1)*(j+1);
			}
		}
		
		//for para mostrar tabla
		for(int i=0;i<tabla.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				//mostramos tabla
				System.out.print((j+1)+"x"+(i+1)+"="+tabla[i][j]+"\t");
			}
			//espacio
			System.out.println();
		}
	}
}
