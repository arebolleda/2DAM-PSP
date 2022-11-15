public class HiloJoinR1Main {
	public static void main(String[] args) {
		//Primer hilo
		HiloJoin1R	hilo1 = new HiloJoin1R(5000,"+");
        HiloJoin1R	hilo2 = new HiloJoin1R(10000,"-");
        HiloJoin1R	hilo3 = new HiloJoin1R(3000,"+");
        HiloJoin1R	hilo4 = new HiloJoin1R(5000,"-");


		new Thread(hilo1).start();
        new Thread(hilo2).start();
        new Thread(hilo3).start();
        new Thread(hilo4).start();

        try  
        {    
            new Thread(hilo1).join();   
           
        }catch(Exception e){System.out.println(e);}    


		
	}
}//Hilo1REjecutar