// Clase Hilo 3 no implementa método main()
// Se invocará desde otra clase
public class Hilo3  extends Thread{
	
	// Constructor
	public  Hilo3(String nombre) {
		super(nombre);
		System.out.println("Creando HILO:" + getName());
	}

	// Método run -> funcionalidad del hilo
	public void run() {
		for (int i=1; i<=5; i++) 
			System.out.println("Hilo: " + getName() + " Valor del contador i = " + i);
	}
}// Hilo3
