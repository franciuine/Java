public class Funcionario extends Pessoa{
	private float salario;
	
	public Funcionario (String nome, int dia, int mes, int ano, float salario){
		this.nome = nome;
		this.nascimento.dia = dia;
		this.nascimento.mes = mes;
		this.nascimento.ano = ano;
		this.salario = salario;
	}
	
	public double CalculaImposto(){
		return (salario * 0.03);
	}
	
	public void ImprimeDados(){
		System.out.println("| Nome: " + this.nome + "\n| Data de nascimento: " + this.nascimento.dia + "/" + this.nascimento.mes + "/" + this.nascimento.ano + "\n| Salário: " + this.salario);
	}
}
