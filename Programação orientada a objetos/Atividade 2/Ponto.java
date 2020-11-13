public class Ponto{
	
	private int x, y;
	
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Ponto(){
		this.x = 0;
		this.y = 0;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}

	public void Move(int mx, int my){
		this.x += mx;
		this.y += my;
	}
	
	public String toString() {
		return ("\n| x = "+ this.x + "\n| y = " + this.y);
	}
}
