package boletinstring;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Realizar una función que reciba una frase como parámetro de entrada y nos
	 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
	 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
	 * espacios. Un ejemplo de frase palíndroma es: “Dabale arroz a la zorra el
	 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
	 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
	 * sin tildes.
	 */
		public static void main(String[] args) {
			//creamos variable frase
			String frase;
			//creamos objeto escaner
			Scanner sc=new Scanner(System.in);
			
			//pedimos frase al usuario
			System.out.println("Introduce una frase");
			//guardamos la frase
			frase=sc.nextLine();
			
			//imprimimos el resultado de llamar a la función cuentaEspacios
			System.out.println(palindroma(frase));
			//cerramos escaner
			sc.close();
		}
		static boolean palindroma(String frase) {
			//creamos variable booleana
			boolean palin=false;
			//creamos variable espacios
			String cadenaInvertida="";
		
			//creamos un for para recorrer la palabra desde el final hasta el principio
			for(int i=frase.length()-1;i>=0;i--) {
				//en cadenaInvertida concatenamos los carácteres encontrados
				cadenaInvertida+=frase.charAt(i);
		
			}
			// quitamos espacios de frase
			frase=frase.replace(" " , "");
			//quitamos espacios de cadenaInvertida
			cadenaInvertida=cadenaInvertida.replace(" ","");
			//si las cadenas son iguales
			if(cadenaInvertida.equalsIgnoreCase(frase)) {
				//será palindroma
				palin=true;
				
		
			}
		
			//devolvemos la palin
			return palin;
		}
	}