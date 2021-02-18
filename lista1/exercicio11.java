package lista1;

/*11) Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/Nrecursivamente.*/

public class exercicio11 {
	public static void main(String[] args) {
		int ten = 10;
		recursiveSerie(ten - ten, ten);
	}

	static int recursiveSerie(int initialValue, int value) {
		System.out.println("1/ " + initialValue);
		if(initialValue == value) {
			return value;
		}
	
		return recursiveSerie(initialValue + 1, value);
	}
}
