package boletinstring;

import java.util.Scanner;

public class Ejercicio2vers2 {
	/*
	 * VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor
	 * alfabéticamente que la contraseña, debe mostrar una cadena con los caracteres
	 * acertados en sus lugares respectivos y asteriscos en los no acertados.
	 */
	public static void main(String[] args) {
		//creamos variable contraseña
		String contraseñaOculta;
		//creamos variable contraseña
		String contraseñaVisible="";
		//creamos variable palabra para los intentos de acertar del jugador 2
		String palabra;
	
		//creamos objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al jugador uno la contraseña a adivinar
		System.out.println("Introduce la contraseña a adivinar");
		//guardamos la contraseñaOculta
		contraseñaOculta=sc.nextLine();
		//creamos un for para iterar tantas veces como la longitud de la contraseña introducida
		for(int i=0;i<contraseñaOculta.length();i++) {
			//y rellenamos tantos asteriscos como iteracciones
		contraseñaVisible+="*";
		}
				
		//indicamos al jugar 2 que debe adivinar la contraseña
		System.out.println("Jugador 2, adivina la contraseña");
		//guardamos la palabra introducida
		palabra=sc.nextLine();
		
	
		//comprobamos medienta un while que ambas palabras no sean iguales
		while(!(palabra.equalsIgnoreCase(contraseñaOculta))) {
			//si no la acierta se muestra por consola el error
			System.out.println("La contraseña introducida es errónea");
			
			for(int i=0;i<contraseñaOculta.length();i++) {
			
			if(contraseñaOculta.charAt(i)==palabra.charAt(i)) {
				
				contraseñaVisible+=contraseñaOculta.charAt(i);
			}else{
				
			}
			System.out.println(contraseñaVisible);
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
}