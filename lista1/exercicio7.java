package lista1;
/*7) Realize recursivamentea soma de todos os números de 1 a 100.*/
public class exercicio7 {
	public static void main(String[] args) {
		int one = 1;
		recursiveSum(one);
	}

	static int recursiveSum(int value) {
		if (value == 100) {
			return 100;
		}
		return recursiveSum(value + 1);
	}
}
