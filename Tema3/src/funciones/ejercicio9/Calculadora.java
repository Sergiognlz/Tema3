package funciones.ejercicio9;

public class Calculadora {
	static public double calculadora(double n1, double n2, int opcion) {
		//creamos las variables de cada operación y otra auxiliar para guardar la solución.
		double suma, resta, multi, divi, solucion=0;
		suma = n1 + n2;
		resta = n1 - n2;
		multi = n1 * n2;
		divi = n1 / n2;
		//creamos un switch para cada operación
		switch (opcion) {
		case 1 -> {
			//igualamos la solución a la variable de la operación
			solucion = suma;
		}
		case 2->{
			solucion=resta;
		}
		case 3->{
			solucion=multi;
		}
		case 4->{
			solucion=divi;
		}
		}
//devolvemos la solución.
		return solucion;
	}
}
