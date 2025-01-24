package colecciones;

import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class Ejercicio8 {
	/*
	 * Implementa el control de acceso al área restringida de un programa. Los
	 * nombres de usuario con sus correspondientes contraseñas deben estar
	 * almacenados en una estructura de la clase HashMap. 
	 * El programa mostrará un menú con dos opciones: 
	 * 1. Registro. Debe pedir un nombre de usuario y una contraseña. A continuación, se almacenarán en el mapa. 
	 * 2. Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
	 * El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
	 * Salir. Termina el programa.
	 */
	public static void main(String[] args) {
		//creamos hashmap
		HashMap<String, String>usuariosRegistrados=new HashMap<>();
		//creamos variable usuario
		String usuario;
		//creamos variable contraseña
		String contraseña;
		//variable opción
		int opcion=0;
		//variable intentos
		int intentos=3; 
		//booleano salir
		boolean acceso=false;
		//booleano bloqueo
		boolean bloqueo=false;
		//objeto escanner
		Scanner sc=new Scanner(System.in);
		
		//creamos do while para que el menú se muestre por lo menos 1 vez
		do {
		//mientras el programa no se bloquee hará todo el proceso
		if(!bloqueo) {
		//mostramos menú
		System.out.println();
		System.out.println("Acceso Restringido. Usuario y Contraseña requeridas");
		System.out.println();
		System.out.println("Menú:");
		System.out.println("1. Registro");
		System.out.println("2. Acceder");
		System.out.println("0. Salir");
		
		
		//guardamos la opción elegida
		opcion=sc.nextInt();
		}
		
		//switch con las opciones
		switch(opcion) {
		
		//cuando la opción introducida es 1
		case 1->{
			//pedimos usuario
			System.out.println("Introduce Usuario");
			//guardamos usuario
			usuario=sc.next();
			//pedimos contraseña
			System.out.println("Introduce Contraseña");
			//guardamos contraseña
			contraseña=sc.next();
			
			//insertamos clave-valor
			usuariosRegistrados.put(usuario, contraseña);
			
		}
		//cuando es 2
		case 2->{
			//como el usuario tiene 3 intentos de acceso vamos a crear un do while con 3 iteraciones
			do {
			//pedimos palabra a buscar
			System.out.println("Introduce tu nombre Usuario");
			//guardamos la palabra
			usuario=sc.next();
			//pedimos contraseña
			System.out.println("Introduce tu Contraseña");
			//guardamos contraseña
			contraseña=sc.next();
			
			//el método get devulve el valor asociado a la clave Usuario y la comparamos con Contraseña. Si da true entrará al if
			if(usuariosRegistrados.containsKey(usuario)&& usuariosRegistrados.get(usuario).equals(contraseña)) {
				//y pondrá acceso a true
				acceso=true;
				//en caso contrario
			}else {
				//derementará los intentos
				intentos--;
			}
			//mostrará el número de intentos si falla
			if(!acceso) {
				//mensaje intentos
			System.out.println("número de intentos: "+intentos);
			System.out.println();
			}
			//cuando los intentos sean 0 o consiga acceso  saldrá del bucle
			}while(intentos>0&&!acceso);
			
			//una vez salga del bucle si ha conseguido acceso
			if(acceso) {
				System.out.println();
				//mensaje de acceso a área restringida
				System.out.println("Ha accedido al área restringida.");
				//el programa se bloqueará
				bloqueo=true;
				//y la opción pasará a ser 0
				opcion=0;
				//en caso de que se agoten los intentos
			}else {
				//mensaje de bloqueo
				System.err.println("Lo siento, no tiene acceso al área restringida. Se ha bloqueado su terminal");
				//el programa se bloqueará
				bloqueo=true;
				//y la opción pasará a ser 0
				opcion=0;
			}
			
		}
		//cuando es 0
		case 0->{
			//mensaje de salida
			System.out.println("Saliendo del programa");
		}
		//si no es ninguna da las otras
		default->{
			//mensaje de error
			System.err.println("La opción introducida no es válida");
			
		}
		}
		//
		}while(opcion!=0);
		
		//cerramos escaner
		sc.close();
	}
	
}
