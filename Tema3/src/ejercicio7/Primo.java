package ejercicio7;

public class Primo {

	public static boolean primo(int num) { 
		boolean esPrimo=true;
		if(num==1) {
			esPrimo=false;
		}else {
	for(int i=2;i<Math.sqrt(num);i++) {
		if (num%i==0) {
			esPrimo=false;
		}
	}
	}
	return esPrimo;
}
}