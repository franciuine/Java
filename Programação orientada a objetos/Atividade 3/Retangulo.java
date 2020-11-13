public class Retangulo extends Formas{
	
	public Retangulo(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public double Perimetro(){
		return((2*a) + (2*b));
	}
	
	public double Area(){
		return (a * b);
	}
}

