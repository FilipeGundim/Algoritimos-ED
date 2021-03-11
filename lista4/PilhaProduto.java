package lista4;

public class PilhaProduto {
	private int lenght;
	private int top = -1;
	private Produto[] pilha;

	public PilhaProduto(int lenght) {
		// endereço de memória
		this.lenght = lenght;
		this.pilha = new Produto[lenght];
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

	public void push(Produto value) {
		if (this.isFull() == false) {
			this.top += 1;
			this.pilha[this.top] = value;
		}
	}

	public Produto pop() {
		@SuppressWarnings("null")
		Produto valueToBeRemoved = (Produto) null;
		if(this.isEmpty() == false) {
			valueToBeRemoved = this.pilha[this.top];
			return valueToBeRemoved;
		} else {
			return valueToBeRemoved;
		}	
	}
	
	public void showProduct() {
		for (int i = this.lenght; i >= this.top; i --) {
			System.out.println(this.pilha[i]);
		}
	}
}
