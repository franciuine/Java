public class Gerente extends Pessoa{ 

	private String area;
	private float salario;
	
	public Gerente (String nome, int dia, int mes, int ano, float salario, String area){
		this.nome = nome;
		this.nascimento.dia = dia;
		this.nascimento.mes = mes;
		this.nascimento.ano = ano;
		this.salario = salario;
		this.area = area;
	}
	
	public double CalculaImposto(){
		return (salario * 0.05);
	}
	
	public void ImprimeDados(){
		System.out.println("| Nome: " + this.nome + "\n| Data de nascimento: " + this.nascimento.dia + "/" + this.nascimento.mes + "/" + this.nascimento.ano + "\n| Salário: " + this.salario + "\n| Área: " + this.area);
	}
}
