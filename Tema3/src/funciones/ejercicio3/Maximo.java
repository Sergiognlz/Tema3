package funciones.ejercicio3;

public class Maximo {
static public int maximo(int n1, int n2) {
	//declaramos variable donde guardaremos cual es mayor
	int maximo;
	//creamos condicional para cuando el primero es mayor
	if (n1>n2) {
		//declaramos que el mayor es el primero.
		maximo=n1;
		//creamos condicional para cuando el segundo número sea el mayor
	}else if(n1<n2) {
		//declaramos que el mayor es el segundo
		maximo=n2;
		//condicional en caso de que sean iguales 
	}else {
		//si son iguales da igualamos el máximo al primer número
		maximo=n1;
	}
	//devolvemos la variable máximo.
	return(maximo);
}
}
