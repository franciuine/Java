public class Circulo extends Formas{
	
	public Circulo(int r){
		this.r = r;
	}
	
	public double Circunferencia(){
		return(2*pi*r);
	}
	
	public double Area(){
		return (pi * Math.pow(r,2));
	}
}
