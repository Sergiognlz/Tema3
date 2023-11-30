package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio9.Calculadora;

public class Ejercicio10 {
	/*
	 * Realiza un programa que lea una fecha introduciendo el día, mes y año por
	 * separado y nos diga si la fecha es correcta o no. Supondremos que todos los
	 * meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
	 * devuelva si es correcta o no.
	 */
	public static void main(String[] args) {
		//creamos variables donde guardaremos los valores mes, día y año.
		int dia=0, mes=0, año=0;
		boolean seguir=true;
		boolean solucion=false;
		//creamos escanner
		Scanner sc=new Scanner(System.in);
		
		//creamos do while con try catch para verificar que los valores sean válidos
		do {
			try {
				//pedimos los días al usuario
				System.out.println("Introduce el día.");
				//guardamos el valor
				dia=sc.nextInt();
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
		//repetimos para los meses
		do {
			try {
				//pedimos los meses al usuario
				System.out.println("Introduce el mes.");
				//guardamos el valor
				mes=sc.nextInt();
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
		//repetimos para año
		do {
			try {
				//pedimos los días al usuario
				System.out.println("Introduce el año.");
				//guardamos el valor
				año=sc.nextInt();
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
		
		
		solucion=Calendario.calendario(dia, mes, año);
		
		if(solucion) {
			System.out.println("La fecha es correcta.");
		}else {
			System.out.println("La fecha es incorrecta.");
		}
		
		sc.close();
		}
	}

