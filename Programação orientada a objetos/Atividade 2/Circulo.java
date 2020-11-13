public class Circulo{
	
	private Centro c = new Centro();
	private int r;
	private double pi = 3.141592653589793;
	private double area;
	
	public Circulo(int r){
		this.r = r;
	}
	
	public Circulo(int r, int x, int y){
		this.r = r;
		c.DefineCentro(x, y);
	}
	
	public void setR(int r){
		this.r = r;
	}
	
	public int getR(){
		return this.r;
	}
	
	public void Infla(int rr){
		r += rr;
	}
	
	public void Desinfla(int rr){
		r -= rr;
	}
	
	public void MoveCentro(int x, int y){
		c.DefineCentro(x, y);
	}
	
	public double CalculaArea(){
		area = pi * (Math.pow(r,2));
		return area;		
	}
}
