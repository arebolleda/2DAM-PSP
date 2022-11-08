//Clase Hilo2 extiende Thread

public class Hilo2 extends Thread {
	
	// definición del constructor
	public Hilo2(String nombre) {
		super(nombre);
		System.out.println("Creando HILO:" + getName());
	}

	// metodo run -> funcionalidad del hilo: muestra el hilo que se está ejecutando
	// y el valor de un contador i
	public void run() {
		for (int i=1; i<=5; i++) 
			System.out.println("Hilo:" + getName() + " Valor del contador i = " + i);
	}

	// Método main -> crea 3 hilos
	// Pertenece a la clase Hilo2

	public static void main(String[] args) {
		Hilo2 h1 = new Hilo2("Hilo 1");
		Hilo2 h2 = new Hilo2("Hilo 2");
		Hilo2 h3 = new Hilo2("Hilo 3");
			
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}// main
	
}// Hilo2
