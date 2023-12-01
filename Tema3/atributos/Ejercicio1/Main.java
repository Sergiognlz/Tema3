package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	
	
}

public static int menu() {
	int opcion=0;
	do {
		try {
	System.out.println("1. SUMA");
	System.out.println("2. RESTA");
	System.out.println("3. MULTIPLICACIÓN");
	System.out.println("4. DIVISIÓN");
	System.out.println("5. MÁXIMO");
	System.out.println("6. MÍNIMO");
	System.out.println("0. SALIR");
	opcion=sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("El valor introducido no es válido.");
		}finally {
			sc.nextLine();
		}
		}while(opcion<0||opcion>6);
		if(opcion==0)
			System.out.println("Fin de la Aplicación.");
	return opcion;
}
public static double pideNumero() {
	double numero=0;
	boolean seguir=true;
	do {
	try {
		//pedimos  número al usuario
		System.out.println("Introduce un número.");
		//guardamos el valor
		numero=sc.nextDouble();
		//declaramos booleano como false para cuando el valor no se válido.
		seguir=false;
	}catch(InputMismatchException e) {
		//mensaje de error
		System.out.println("El valor introducido no es válido.");
		//declaramos valor true.
		seguir=true;
	}finally {
		//limpiamos escaner
		sc.nextLine();
	}
	}while(seguir);
	
	
	return numero;
}
}
