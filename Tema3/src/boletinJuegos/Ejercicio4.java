package boletinJuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Vamos a realizar varias operaciones básicas de ajedrez, concretamente las de
	 * las piezas Torre, Alfil, Dama y Caballo. Crea una función distinta para cada
	 * pieza. Todas las funciones van a recibir los mismos parámetros de entrada:
	 * posFila, posColumna y pieza. La pieza será de tipo char y podrá ser T de
	 * Torre, A de Alfil, D de Dama y C de Caballo. La función devolverá una tabla
	 * (que representa al tablero) marcando con una X aquellas casillas donde se
	 * puede mover dicha pieza. La posición inicial de la pieza se marcará con su
	 * letra correspondiente.
	 */
	//creamos objeto escaner a nivel de clase para poder usarlo en todas las funciones
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//creamos tabla bidimensional 8x8
		int tablero[][]=new int[8][8];
		//variable posición fila
		int posFila;
		//variable posición columna
		int posColumna;
		//variable pieza
		char pieza=' ';
	
		
		//llamamos a la función para pedir las posción de las filas
		posFila=controlE("fila");
		
	}
	static int controlE(String pregunta) {
		int num=0;
		//booleano de control de salida
		boolean error=false;
		//do while para controlar los valores entrada
		do {
			//try donde pedimos el número
			try {
				//pedimos el número al usuario
				System.out.println("Introduce la "+pregunta);
				//guardamos el valor 
				num=sc.nextInt();
				//aserción
				assert num>=0&&num<8:"El valor introducido no es válido. Introduce un valor entre 0 y 7";
				//cambiamos booleano a false
				error=false;
				//catch para capturar las assertion
			}catch(AssertionError e){
				//mensaje de error
				System.out.println(e.getMessage());
				error=true;
				//catch para capturar cadenas
			}catch(InputMismatchException e) {
				//mensaje de error
				System.err.println("El valor introducido no es correcto. Introduce un valor entre 0 y 7");
				error=true;
			}finally {
			//reiniciamos escaner
				sc.nextLine();
			}
			
			
		}while(error);
		//devolvemos el número
		return num;
	}
	
	
}
