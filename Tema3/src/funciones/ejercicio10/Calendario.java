package ejercicio10;

public class Calendario {
static public boolean calendario(int dia, int mes, int año) {
	boolean solucion=true;
	
	if((dia<1||dia>30)||(mes<1||mes>12)) {
		solucion=false;
	
	}else {
		solucion=true;
	}
	
	
	return solucion;
}
}
