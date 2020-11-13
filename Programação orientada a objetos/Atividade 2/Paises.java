public class Paises{
	
	private String ISO;
	private String nome;
	private double populacao;
	private double area;
	
	public Paises(String ISO, String nome, double populacao, double area){
		this.ISO = ISO;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	
	public void setISO (String ISO){
		this.ISO = ISO;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public void setPopulacao (double populacao){
		this.populacao = populacao;
	}
	
	public void setArea (double area){
		this.area = area;
	}
	
	public String getISO(){
		return this.ISO;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getPopulacao(){
		return this.populacao;
	}
	
	public double getArea(){
		return this.area;
	}
	
	public double CalculaDensidade(){ //pessoas/km²
		return (populacao / area);
	}
	
}
