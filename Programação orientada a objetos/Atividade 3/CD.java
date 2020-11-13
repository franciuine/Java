public class CD extends Produto{
	
	private int faixas;
	
	public CD(String nome, float preco, int faixas){
		super(nome, preco);
		this.faixas = faixas;
	}
	
	@Override
		
	public String toString() {
		return ("\n| Nome: " + nome + "\n| Preço: R$ " + preco + "\n| Nº de faixas: " + faixas);
	}
}
