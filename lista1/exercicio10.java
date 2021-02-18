package lista1;

/*10) Receba um número inteiro. Calcule e mostre a série de Fibonacci recursivamenteaté o número recebido
*/
public class exercicio10 {
	public static void main(String[] args) {
		int ten = 10;
		recursiveFibonnaci(ten, ten);
	}

	static int recursiveFibonnaci(int initialValue, int value) {
		System.out.println(value);
		if (initialValue == 0 || value == 1) {
			return value;
		}
		return recursiveFibonnaci(initialValue - 1, initialValue + value -1);
	}
}
