public class Primos extends Thread{
	private static int limite=0;
	private int div;

	public void run(){
		Numeros();
	}
	
	private void Numeros(){
		System.out.println("Iniciando thread...");
		for(int i=limite; i<limite+10000; i++){
			div = 0;
			for(int j=1; j<limite; j++){
				if(i % j == 0){
					div++;
				}
			}
			if(div == 2){
				System.out.println("| "+i);
			}
		}
	}
	
	public static void main(String[] args){
		Thread t0 = new Primos();
		t0.start();
		limite = limite + 10000;
		
		Thread t1 = new Primos();
		t1.start();
		limite = limite + 10000;
		
		Thread t2 = new Primos();
		t2.start();
		limite = limite + 10000;
		
		Thread t3 = new Primos();
		t3.start();
		limite = limite + 10000;
				
		Thread t4 = new Primos();
		t4.start();
		limite = limite + 10000;
		
		Thread t5 = new Primos();
		t5.start();
		limite = limite + 10000;
				
		Thread t6 = new Primos();
		t6.start();
		limite = limite + 10000;
		
		Thread t7 = new Primos();
		t7.start();
		limite = limite + 10000;
		
		Thread t8 = new Primos();
		t8.start();
		limite = limite + 10000;
		
		Thread t9 = new Primos();
		t9.start();
	}
}
