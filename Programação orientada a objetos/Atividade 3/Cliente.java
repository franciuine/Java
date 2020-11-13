public class Cliente extends Pessoa{
	private int cod;
	
	public Cliente (String nome, int dia, int mes, int ano, int cod){
		this.nome = nome;
		this.nascimento.dia = dia;
		this.nascimento.mes = mes;
		this.nascimento.ano = ano;
		this.cod = cod;
	}
	
	public void ImprimeDados(){
		System.out.println("| Nome: " + this.nome + "\n| Data de nascimento: " + this.nascimento.dia + "/" + this.nascimento.mes + "/" + this.nascimento.ano + "\n| Código: " + this.cod);
	}
}
