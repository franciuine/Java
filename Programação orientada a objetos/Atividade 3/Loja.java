public class Loja {
	public static void main(String[] args){
		Produto lista[] = new Produto[5];
		String impressao;
	  
		lista[0] = new Livro ("Harry Potter", 20, "JK Rowling");
		lista[1] = new CD ("Trench", 40, 13);
		lista[2] = new Livro ("1984", 20, "George Orwell");
		lista[3] = new DVD ("Meninas Malvadas", 30, 90);
		lista[4] = new CD ("X&Y", 40, 10);
		
		for(int x=0; x<5; x++){
			impressao = lista[x].toString();
			System.out.println(impressao);
		}
  }
}
