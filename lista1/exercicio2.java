package lista1;

/*2. Carregar um vetor [5] inteiro. Enviar cada elemento para uma função e esta irá retornar o seu fatorial que será armazenado em um outro vetor. Exibir os dados dos vetores*/

public class exercicio2 {
	public static void main(String[] args) {
		int[] vetor = loadsWithRandomValues(5);
		int[] factoredVetor = new int[5];

		for (int i = 0; i <= vetor.length; i++) {
			factoredVetor[i] = getFacotedValue(vetor[i]);
		}
		showResult(vetor, factoredVetor);
	}

	static int[] loadsWithRandomValues(int vetLenght) {
		int[] value = new int[vetLenght];
		for (int i = 0; i <= vetLenght; i++) {
			value[i] = 1 + (int) (Math.random() * 100);

		}
		return value;
	}

	static int getFacotedValue(int value) {
		int fat = 1;
		for (int i = 2; i <= value; i++) {
			fat *= i;
		}
		return fat;
	}

	static void showResult(int[] vet, int[] fatVet) {
		System.out.println(vet);
		System.out.println(fatVet);
	}
}
