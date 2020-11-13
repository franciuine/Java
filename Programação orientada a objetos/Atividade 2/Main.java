import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Contador c = new Contador();
		int op;
		
		do{
			System.out.println("| 1- Zerar       |");
			System.out.println("| 2- Incrementar |");
			System.out.println("| 3- Imprimir    |");
			System.out.println("| 0- Sair        |");
			op = input.nextInt();
		
			switch(op){
				case 1:
					c.Zera();
					break;
				case 2:
					c.Incrementa();
					break;
				case 3:
					c.Imprime();
					break;
				case 0: 
					System.exit(0);
					break;
				default:
					System.out.println("| OPÇÃO INVÁLIDA! |");
					break;
			}
		} while (op!=0);
	}
}
