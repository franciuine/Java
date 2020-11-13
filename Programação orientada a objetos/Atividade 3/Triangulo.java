public class Triangulo extends Formas{
	
	private int c;
	private int h;
	
	public Triangulo(int a, int b, int c, int h){
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	
	public double Perimetro(){
		return(a+b+c);
	}
	
	public double Area(){
		return((a*h)/2);
	}
}
