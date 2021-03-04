package lista3;

public class FilaLivro {

	private Livro[] vetor;
	private int size;

	public FilaLivro() {
		this.size = 0;
		this.vetor = new Livro[100];
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

	public void addAtBeginning(Livro value) {
		value.setQuantity(size);
		value.setTitle("opa");
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

	public void addAtEnd(Livro value) {
		value.setQuantity(size);
		value.setTitle("opa");
		if (isFull()) {
			throw new RuntimeException("full list");
		} else {
			this.vetor[this.size] = value;
			this.size += 1;
		}
	}

	public void addInAnyPosition(int position, Livro value) {
		value.setQuantity(size);
		value.setTitle("opa");
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
			this.vetor[this.size - 1] = (Livro) null;
			this.size -= 1;
		}
	}

	public void removeInAnyPosition(int position, Livro value) {
		int i;
		if (isEmpty()) {
			throw new RuntimeException("cant implement method");
		} else if (position == this.size) {
			this.vetor[position - 1] = value;
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

	public Livro scrollAndConcatenate() {
		Livro concatenatedValue = null;
		if (isEmpty()) {
			throw new RuntimeException("cant implement method");
		} else {
			for (int i = 0; 1 < this.size; i++) {
				concatenatedValue = this.vetor[i];
			}
			return concatenatedValue;
		}
	}
}
