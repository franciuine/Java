public class Deque{
	
	private static final int tam = 10;
	private int deque[] = new int[tam];
	private int ini, fim, dado;
	
	public void InsereIni(int x){
		if(ini == (fim + 1) % tam)){
			System.out.println("Deque cheio!");
		}
		else{
			deque[ini] = x;
			ini = (ini - 1) % tam;
		}
	}
	
	public void InsereFim(int x){
		if(ini == (fim + 1) % tam)){
            System.out.println("Deque cheio!");
		}
		else{
			deque[fim] = ((fim + 1) % tam);
			deque[fim] = x;
		}
	}
	
	public void Imprime(){
		for (int x = 0; x < tam; x++){
			System.out.println(deque[x] + " ");
		}
	}
}
