package funciones.ejercicio6;

public class Opcion {
static public double opcion(double altura, double radio, int opcion) {
	
	double area=0;
	double volumen=0;
	double solucion=0;
	volumen= Math.PI*(radio*radio)* altura;
	
	//creamos un switch para cada opción.
	switch(opcion) {
	//caso 1 área
	case 1->{
		area= 2*Math.PI*radio*(altura + radio);
	solucion=area;
	}

	case 2->{
		volumen= Math.PI*(radio*radio)* altura;
		solucion=volumen;
	}

	}
	
	return solucion;
}

}
