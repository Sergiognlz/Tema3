package boletinstring;

import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
	 * siguiente: el primer jugador introduce la contraseña; a continuación, el
	 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
	 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
	 * contraseña.
	 */
	
	public static void main(String[] args) {
		//creamos variable contraseña
		String contraseña;
		//creamos variable palabra para los intentos de acertar del jugador 2
		String palabra;
		//creamos la variable entera pista
		int pista;
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al jugador uno la contraseña a adivinar
		System.out.println("Introduce la contraseña a adivinar");
		//guardamos la contraseña
		contraseña=sc.nextLine();
		
		//indicamos al jugar 2 que debe adivinar la contraseña
		System.out.println("Jugador 2, adivina la contraseña");
		//guardamos la palabra introducida
		palabra=sc.nextLine();
		
	
		//comprobamos medienta un while que ambas palabras no sean iguales
		while(!(palabra.equalsIgnoreCase(contraseña))) {
			//asignamos el valor a pista llamando al método compareTo entre palabra y contreña
			pista=palabra.compareTo(contraseña);
			//si no la acierta se muestra por consola el error
			System.out.println("La contraseña introducida es errónea");
			//retorno de carro
			System.out.println();
			//con un if controlamos si la pista es mayor que 0
			if(pista>0) {
				//entonces la palabra introducida será mayor
				System.out.println("La palabra introducida es mayor que la contraseña");
				//si es menor que 0
			}else if(pista<0){
				//la palabra introducida será menor
				System.out.println("La palabra introducida es menor que la contraseña");
			}
			//retorno de carro
			System.out.println();
			//volvemos a pedir al jugador que introduzca la contraseña
			System.out.println("Vuelve a intentarlo");
			//guardamos de nuevo
			palabra=sc.nextLine();
		}
		//mensaje de fin de juego
		System.out.println("Has acertado la contraseña");
		//cerramos escaner
		sc.close();
	}
}
