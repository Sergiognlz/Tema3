package atributos.ejercicio1;

public class Operaciones {

	double num1, num2, suma, resta, multi, divi, max, min;

	public Operaciones(double num1, double num2) {

		this.num1 = num1;
		this.num2 = num2;

	}

	public double suma() {
		suma = num1 + num2;
		return suma;

	}

	public double resta() {
		resta = num1 - num2;
		return resta;

	}

	public double multi() {
		multi = num1 * num2;
		return multi;
	}

	public double divi() {
		divi = num1 / num2;
		if (num2 == 0) {
			divi = 0;
			return divi;
		} else {
			divi = num1 / num2;
			;
		}
		return divi;
	}

	public double max() {
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		return max;
	}

	public double min() {
		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}
		return min;
	}

}
