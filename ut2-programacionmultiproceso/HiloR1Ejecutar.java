
public class HiloR1Ejecutar {
	public static void main(String[] args) {
		//Primer hilo
		HiloR1	hilo1 = new HiloR1();
		new Thread(hilo1).start();

		
	}
}//Hilo1REjecutar
