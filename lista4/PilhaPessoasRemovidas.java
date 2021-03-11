package lista4;

public class PilhaPessoasRemovidas {
	private int lenght;
	private int top = -1;
	private Pessoa[] pilha;

	public PilhaPessoasRemovidas(int lenght) {
		this.lenght = lenght;
		this.pilha = new Pessoa[lenght];
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

	public void push(Pessoa value) {
		if (this.isFull() == false) {
			this.top += 1;
			this.pilha[this.top] = value;
		}
	}

	public Pessoa pop() {
		@SuppressWarnings("null")
		Pessoa valueToBeRemoved = (Pessoa) null;
		if(this.isEmpty() == false) {
			valueToBeRemoved = this.pilha[this.top];
			return valueToBeRemoved;
		} else {
			return valueToBeRemoved;
		}	
	}
}
