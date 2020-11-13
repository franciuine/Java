public class Quadrado extends Formas{
	
	public Quadrado(int a){
		this.a = a;
	}
	
	public double Perimetro(){
		return(4*a);
	}
	
	public double Area(){
		return (Math.pow(a,2));
	}
}
