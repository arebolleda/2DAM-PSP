
public class HiloR2Ejecutar {
	public static void main(String[] args) {
		//Primer hilo
		HiloR1	hilo1 = new HiloR1();
		new Thread(hilo1).start();

		//Segundo hilo
		HiloR1 hilo2 = new HiloR1();
		Thread hilo = new Thread(hilo2);
		hilo.start(); 
		
		//Tercer Hilo
		new Thread(new HiloR1()).start();
	}
}//HiloR2Ejecutar
