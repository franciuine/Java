import java.util.Scanner;

public class Main{
	
  public static void main(String[] args){
	  
    Scanner input = new Scanner(System.in);
    FilaCirc filac = new FilaCirc();
    
    filac.Insere(0); 
    filac.Insere(1);
    filac.Insere(2);
    filac.Insere(3);
    filac.Insere(4); 
    filac.Insere(5);
    filac.Insere(6);
    filac.Insere(7);
    filac.Insere(8);
    filac.Insere(9);
    filac.Imprime();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Retira();
    filac.Imprime();
  }
  
}
