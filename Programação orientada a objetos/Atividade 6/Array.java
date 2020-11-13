import java.util.Scanner;

public class Array extends Thread{
	private static int limite=0;
	private static int a[] = new int[100];
	private static int k, count=0;

	public void run(){
		Busca();
	}
	
	private void Busca(){
		System.out.println("Iniciando thread...");
			for(int i=limite; i<limite+20; i++){
				if(a[i]==k){
					System.out.println("| Encontrado na posição [" + i + "]");
				}
			}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("| Buscar:\n| ");
		k = input.nextInt();
		
		for(int i=0; i<100; i++){
			a[i]=count;
			count++;
		}
			
		Thread t0 = new Array();
		t0.start();
		limite = limite + 20;
		
		Thread t1 = new Array();
		t1.start();
		limite = limite + 20;
		
		Thread t2 = new Array();
		t2.start();
		limite = limite + 20;
		
		Thread t3 = new Array();
		t3.start();
		limite = limite + 20;
				
		Thread t4 = new Array();
		t4.start();
		limite = limite + 20;
	}
}
