public class Main {
	
  public static void main(String[] args){
	  Rica a = new Rica ("Juca", 35, 1000000);
	  Pobre b = new Pobre ("Maria", 22);
	  Miseravel c = new Miseravel ("Pedro", 25);
	  
	  a.FazCompras();
	  b.Trabalha();
	  c.Mendiga();
  }
 }
