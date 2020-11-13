public class FilaCirc{
	
	private static final int tam = 10;
	private int fila[] = new int[tam];
	private int ini, fim, dado;
	
	
	public void Insere(int x){
		if(fim == tam){
			System.err.println("Fila cheia!");
		}
		else{
			fila[fim++] = x; //insere no final da fila
		}		
	}
    
    public int Retira(){
		if(fim == ini){
			return fila[ini]; //fila só tem um elemento
		}
		else{
			int x = fila[ini];
            ini = (ini + 1) % tam;
            System.out.println("Retorna: " + x);
            return x;
        }		
	}
	
	public void Imprime(){
		for (int x = 0; x < tam; x++){
			System.out.println(fila[x] + " ");
		}
	}
}
