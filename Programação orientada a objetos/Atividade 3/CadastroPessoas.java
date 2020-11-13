public class CadastroPessoas {
	private int qtd;
	private Pessoa pess;
	
	public void Cadastra(Pessoa pess){
		this.pess = pess;
		qtd++;
	}
	
	public void ImprimeCadastro(){
		System.out.println("| Nome: " + pess.nome + "\n| Data de nascimento: " + pess.nascimento.dia + "/" + pess.nascimento.mes + "/" + pess.nascimento.ano);
	}
}
