package lista1;

public class exercicio4 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		matriz = loadsWithRandomValues(matriz);
		showPositiveValuesBetweenRange(matriz, 1, 100);
		showNumbersDividedByEight(matriz);
		showOddNumbersDivisibleByTree(matriz);
		showLargestNumberFactorial(matriz);
	}

	static int[][] loadsWithRandomValues(int[][] mat) {
		int value;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				value = 1 + (int) (Math.random() * 100);
				mat[j][i] = value;
			}
		}
		return mat;
	}

	static void showPositiveValuesBetweenRange(int[][] mat, int startAt, int endAt) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (mat[j][i] > 1 && mat[j][i] <= 100) {
					value += mat[j][i];
				}
			}
		}
		System.out.println(value);
	}

	static void showNumbersDividedByEight(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if ((mat[j][i] / 8) == 0) {
					value += 1;
				}
			}
		}
		System.out.println(value);
	}

	static void showOddNumbersDivisibleByTree(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (((mat[j][i] % 2) != 0) && (mat[j][i] / 3) == 1) {
					value += 1;
				}
			}
		}
		System.out.println(value);
	}

	static void showLargestNumberFactorial(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (mat[j][i] > value) {
					value = mat[j][i];
				}
			}
		}
		System.out.println(getFacotedValue(value));
	}

	static int getFacotedValue(int value) {
		int fat = 1;
		for (int i = 2; i <= value; i++) {
			fat *= i;
		}
		return fat;
	}

}
