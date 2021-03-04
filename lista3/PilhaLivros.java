package lista3;

public class PilhaLivros {
	private int lenght;
	private int top = -1;
	private Livro[] dados;

	public PilhaLivros(int lenght) {
		this.lenght = lenght;
		this.dados = new Livro[lenght];
	}

	public boolean isFull() {
		if (this.top == this.lenght) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (this.top == -1) {
			return true;
		}
		return false;
	}

	public void push(Livro value) {
		if (this.isFull() == false) {
			value.setTitle("opa" );
			value.setQuantity(this.top);
			this.top += 1;
			this.dados[this.top] = value;
		}
	}

	public Livro pop() {
		@SuppressWarnings("null")
		Livro valueToBeRemoved = (Livro) null;
		if (this.isEmpty() == false) {
			valueToBeRemoved = this.dados[this.top];
			this.top -= 1;
			return valueToBeRemoved;
		} else {
			return valueToBeRemoved;
		}
	}
	
	public void showLivros () {
		for (int i = 0; i<= this.top; i++) {
			System.out.println(this.dados[i]);
		}
	}

}
