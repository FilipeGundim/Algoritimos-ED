package lista1;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int digitedNumber = scanner.nextInt();
			recursiveFactorial(digitedNumber);
		}
	}

	static int recursiveFactorial(int value) {
		if (value <= 1) {
			return 0;
		}
		return recursiveFactorial(value - 1) * value;
	}
}
