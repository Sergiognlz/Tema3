package ejercicio6;

public class AreaVolumen {
static public double area(double altura, double radio) {
	double area=0;
	area= 2*Math.PI*radio*(altura + radio);
	
	return area;
}

static public double volumen(double altura, double radio) {
	double volumen=0;
	volumen= Math.PI*(radio*radio)* altura;
	return volumen;
}
}
