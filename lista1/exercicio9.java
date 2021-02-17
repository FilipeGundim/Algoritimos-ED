package lista1;

/*9) Realize recursivamentea soma de todos os números ímpares de 1 a 300*/

public class exercicio9 {
	public static void main(String[] args) {
		int one = 1;
		recursiveSum(one);
	}

	static int recursiveSum(int value) {
		System.out.println(value);
		if (value == 300) {
			return 300;
		} else if (value % 2 != 0) {
			return recursiveSum(value + 1);
		}
		return recursiveSum(value + 2);
	}
}
