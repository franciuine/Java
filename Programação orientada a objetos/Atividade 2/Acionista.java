public class Acionista{
	private String cliente;
	private int cotas;
	private static float valor;
	
	public Acionista(String cliente, int cotas){
		this.cliente = cliente;
		this.cotas = cotas;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public void setCotas(int cotas){
		this.cotas = cotas;
	}
	
	public static void setValor(float val){
		valor = val;
	}
	
	public String getCliente(){
		return this.cliente;
	}
	
	public int getCotas(){
		return this.cotas;
	}
	
	public float getValor(){
		return this.valor;
	}
	
	public String toString() {
		return "| Total: " + valor * cotas;
	}
}
