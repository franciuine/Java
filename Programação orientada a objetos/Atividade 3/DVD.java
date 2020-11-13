public class DVD extends Produto{
	
	private int duracao;
	
	public DVD(String nome, float preco, int duracao){
		super(nome, preco);
		this.duracao = duracao;
	}
	
	@Override
		
	public String toString() {
		return ("\n| Nome: " + nome + "\n| Preço: R$ " + preco + "\n| Duração: " + duracao + " min");
	}
}

