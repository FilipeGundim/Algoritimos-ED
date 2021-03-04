package lista3;

public class main {
	public static void main(String[] args) {
		PilhaLivros livros = new PilhaLivros(10);
		livros.push(new Livro());
		livros.showLivros();
		livros.pop();
		livros.showLivros();
	}
}
