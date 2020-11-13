public class Rica extends Pessoa{

	private double dinheiro;
	
	public Rica(String nome, int idade, double dinheiro){
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public void FazCompras(){
		System.out.println("Dinheiro disponível: R$ " + dinheiro);
	}
}
