import java.util.Random;

public class Bubble extends Thread{
	private static int limite=0;
	private static Random a[] = new Random[100];
	private static Random aux = new Random();

	public void run(){
		Busca();
	}
	
	private void Busca(){
		System.out.println("Iniciando thread...");
		for(int x=limite; x<limite+19; x++){
			for(int y=x+1; y<limite+20; y++){
				if(a[x] > a[y]){
					aux = a[x];
					a[x] = a[y];
					a[y] = aux;
				}
			}
		}
	}
	}
	
	public static void main(String[] args){
		
		for(int i=0; i<100; i++){
			a[i] = new Random();
		}
			
		Thread t0 = new Bubble();
		t0.start();
		limite = limite + 20;
		
		Thread t1 = new Bubble();
		t1.start();
		limite = limite + 20;
		
		Thread t2 = new Bubble();
		t2.start();
		limite = limite + 20;
		
		Thread t3 = new Bubble();
		t3.start();
		limite = limite + 20;
				
		Thread t4 = new Bubble();
		t4.start();
		limite = limite + 20;
	}
}
