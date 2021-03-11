package lista4;

public class ListaPessoas {
	private Pessoa[] vetor;
	private int size;
	private PilhaPessoasRemovidas pilha;

	public ListaPessoas() {
		this.size = 0;
		this.vetor = new Pessoa[100];
		this.pilha = new PilhaPessoasRemovidas(100);
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (this.size == this.vetor.length) {
			return true;
		}
		return false;
	}

	public void addAtBeginning(Pessoa value) {
		if (isFull()) {
			throw new RuntimeException("full list");
		} else {
			for (int i = this.size; i < 0; i--) {
				this.vetor[i] = this.vetor[i - 1];
			}
			this.vetor[0] = value;
			this.size += 1;
		}
	}

	public void addAtEnd(Pessoa value) {
		if (isFull()) {
			throw new RuntimeException("full list");
		} else {
			this.vetor[this.size] = value;
			this.size += 1;
		}
	}

	public void addInAnyPosition(int position, Pessoa value) {
		int i;
		if (isFull()) {
			throw new RuntimeException("cant implement method");
		} else if (isEmpty()) {
			this.vetor[position] = value;
		} else {
			for (i = this.size; i != position; i--) {
				if (i != 0) {
					this.vetor[i] = this.vetor[i - 1];
				}
			}
			this.vetor[i] = value;
			this.size += 1;
		}
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("cant implement method");
		} else {
			this.pilha.push(this.vetor[0]);
			for (int i = 0; i < this.size; i++) {
				this.vetor[i] = this.vetor[i + 1];
			}
			this.size -= 1;
		}
	}

	@SuppressWarnings("null")
	public void removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("cant implement method");
		} else {
			this.pilha.push(this.vetor[this.size]);
			this.vetor[this.size - 1] = (Pessoa) null;
			this.size -= 1;
		}
	}

	public void removeInAnyPosition(int position, Pessoa value) {
		int i;
		if (isEmpty()) {
			throw new RuntimeException("cant implement method");
		} else if (position == this.size) {
			this.vetor[position - 1] = value;
			this.pilha.push(value);
		} else {
			for (i = 0; i != position; i++) {
				if (i > 0) {
					this.vetor[i] = this.vetor[i + 1];
				}
			}
			this.vetor[i] = value;
			this.size -= 1;
		}

	}
	
	public void showPeople() {
		for (int i = 0; i <= this.size; i ++) {
			System.out.println(this.vetor[i]);
		}
	}
}
