import java.util.InputMismatchException;
import java.util.Scanner;

public class cosasguiris {
	/*
	 * The size of the panel will be 3 x3.There are two players who will play by
	 * turns.The first player to get 3 of his/her marks in a
	 * 
	 * row (up, down, across, or diagonally) is the winner. When all 9 squares are
	 * full, the game is over. If no player has 3 marks in a row, the game ends in a
	 * tie.
	 */
	//creamos escaner a nivel de clase
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// creamos tabla bidimensional
		char tablero[][] = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
		// variable filas
		int filas;
		// variable columnas
		int columnas;
		//variable jugador
		int turno=1;
		//asignamos valor a filas
		filas=comprobarValor("filas");
		//asignaomos valor a columnas
		columnas=comprobarValor("columnas");
		//mostramos tablero
		mostrarTablero(tablero);

	}
//función que muestra el tablero
	static void mostrarTablero(char tablero[][]){
		
		//creamos for para recorrer filas
		for(int i=0;i<tablero.length;i++) {
			//recorremos columnas
			for(int j=0;j<tablero[i].length;j++) {
				//imprimimos valor
				System.out.print(tablero[i][j]+" ");
			}
			//salto de línea
			System.out.println();
		}
		
		
	}
		//funcion para comprobar los valores de las filas y columnas
	static int comprobarValor(String posicion) {
		//variable donde guardar el número 
		int num=0;
		//booleano de control de try catch
		boolean error=false;
		//do while para repetir la comprobación
		do {
			//try donde hacemos la pregunta
			try {
				//preguntamos posición al usuario
				System.out.println("Introduce la posición de "+posicion);
				//guardamos el valor
				num=sc.nextInt();
				//aserción para controlar el valor deseado
				assert num>=0&&num<3:"El valor introducido debe estar entre 0 y 2";
				//si todo se cumple error será false y saldrá del bucle
				error=false;
				//catch error de aserción
			}catch(AssertionError e) {
				//mensaje de error
				System.out.println(e.getMessage());
				//si entra aquí error será true y repetirá bucle
				error=true;
			}catch(InputMismatchException e) {
				//mensaje de error
				System.err.println("El valor introducido no válido");
				//si entra aquí error será true y repetirá bucle
			error=true;
				//este bloque se realizará siempre
			}finally {
				//limpiamos escaner
				sc.nextLine();
			}
			//fin del bucle y comprobación
		}while(error);
		
		//devolvemos el número
		return num;
	}
	
	static char[][] rellenarTablero(int filas, int columnas, char tablero[][], int turno){
		
	
			
			if(turno%2==0) {
				tablero[filas][columnas]='X';
			}else {
				tablero[filas][columnas]='O';
			}
			
			
		
		
		
		
		//devolver tablero
		return tablero;
	}
	
	
}
