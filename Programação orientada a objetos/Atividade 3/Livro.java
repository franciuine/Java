public class Livro extends Produto{
	
	private String autor;
	
	public Livro(String nome, float preco, String autor){
		super(nome, preco);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return ("\n| Nome: " + nome + "\n| Preço: R$ " + preco + "\n| Autor: " + autor);
	}
}
