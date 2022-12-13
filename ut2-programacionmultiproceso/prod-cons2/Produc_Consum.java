public class Produc_Consum {
  public static void main(String[] args) {  
    
    Cola cola = new Cola();
	
    Productor prod = new Productor(cola, 1);	
	  Consumidor cons = new Consumidor(cola, 1);
	
    prod.start();
	  cons.start();

  }
}