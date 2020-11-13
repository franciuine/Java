public class Produto{
	
	protected String nome;
	protected float preco;
	
	public Produto(String nome, float preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return ("\n| Nome: " + nome + "\n| Preço: R$ " + preco);
	}
}
