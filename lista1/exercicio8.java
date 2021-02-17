package lista1;

/*8) Realize recursivamentea soma de todos os números pares de 1 a 200*/

public class exercicio8 {
	public static void main(String[] args) {
		int one = 1;
		recursiveSum(one);
	}

	static int recursiveSum(int value) {
		System.out.println(value);
		if (value == 200) {
			return 200;
		} else if (value % 2 == 0) {
			return recursiveSum(value + 2);
		}
		return recursiveSum(value + 1);
	}
}
