package lista1;

/*3. Carregar um vetor [100] inteiros positivos ou negativos. Classificar este vetor em ordem crescente e apresentar os valores.*/

public class exercicio3 {
	public static void main(String[] args) {
		int[] vetor = new int[100];

		for (int i = 0; i <= vetor.length; i++) {
			vetor[i] = 1 + (int) (Math.random() * 100);
		}

		System.out.println(order(vetor));
	}

	static int[] order(int[] vetor) {
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < 4; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return vetor;
	}

}
