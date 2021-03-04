package lista3;

public class Pilha {
	private int lenght;
	private int top = -1;
	private int[] pilha;

	public Pilha(int lenght) {
		this.lenght = lenght;
		this.pilha = new int[lenght];
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

	public void push(int value) {
		if (this.isFull() == false) {
			this.top += 1;
			this.pilha[this.top] = value;
		}
	}

	public int pop() {
		@SuppressWarnings("null")
		int valueToBeRemoved = (Integer) null;
		if(this.isEmpty() == false) {
			valueToBeRemoved = this.pilha[this.top];
			return valueToBeRemoved;
		} else {
			return valueToBeRemoved;
		}	
	}
}
