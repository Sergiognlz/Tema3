package boletinFunciones2;

public class Ejercicio5 {
	/*
	 * Realizar una función: int[][] gira90(int tablaInicio[][]), que dada una
	 * matriz de NxN (mismo número de filas y columnas), devuelve la tablaInicio
	 * girada 90º:
	 */
	public static void main(String[] args) {
		//creamos la tabla que pasaremos a la función
				int tablaInicio[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
				
				
				//recorremos las filas de la tabla que hemos llamado
				for(int i=0;i<gira90(tablaInicio).length;i++) {
					//recorremos las columnas de la tabla que hemos llamado
					for(int j=0;j<gira90(tablaInicio)[i].length;j++) {
						//imprimimos los valores de la tabla que llamamos sin retorno de carro
						System.out.print(gira90(tablaInicio)[i][j]+"\t");
					}
					//retorno de carro para que la imprima bonito
					System.out.println();
				}	
				
				
	}
	static int[][] gira90(int tablaInicio[][]){
		//creamos variable donde guardaremos la tabla que devolveremos
		int gira90[][]=new int[tablaInicio.length][tablaInicio.length];
		
		//for para recorrer filas normalment
		for(int i=0;i<tablaInicio.length;i++) {
			//for para recorrer columnas normalmente
			for(int j=0;j<tablaInicio[i].length;j++) {
				//rellenamos la tabla gira90 con esta fórmula mística que ha desarrollado Juanlu
				gira90[j][(gira90.length-1)-i]=tablaInicio[i][j];
			}
		}
		
		
		
		//devolvemos la tabla
		return gira90;
	}
}
