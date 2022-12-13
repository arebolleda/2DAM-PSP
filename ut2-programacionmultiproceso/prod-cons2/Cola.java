public class Cola {
    private int numero;
    private boolean disponible = false; 

    //métodos sincronizados -> productor y consumidor no podrán acceder simultáneamente al objeto Cola COMPARTIDO
    // Mientras el productor esté cambiando valor en la cola el consumidor no puede recogerlo y viceversa
    
    // Necesaria COORDINACIÓN !!! 
    //  * cuando el productor ponga número en la cola -> avisará al consumidor. Prodcutor deberá esperar cola esté vacía para generar nuevo dato
    //  * cuando el consumidor recoga número de cola -> avisará al productor cola está vacía. Consumidor debe esparar a que cola tenga datos
    
    // COORDINACIÓN uso métodos wait(), notify() y notifyAll(). Sólo pueden usarse desde métodos sincronizados o dentro bloque sincronizado
    
    // *wait(): un hilo que llama al método wait() de un objeto queda suspendido hasta que otro hilo llame a notify()-notifyAll() del mismo objeto
    // *notify(): despierta o activa a uno de los hilos que realizó llamada a wait(). Si varios hilos esperan, solo uno de ellos será elegido para continuar (elección aleatoria)
    // *notify(): despierta o activa a todos hilos estén esperando el objeto
    
    
    public synchronized int get() {
         // Queda a la espera hasta que la cola se llene ("mientras cola vacía espero en wait()")
    	  while (!disponible) {
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  //Una vez hay valor disponible se devuelve
    	  disponible = false;
    	  notify();
    	  return numero;
    	}


    public synchronized void put(int valor) {
     // Queda a la espera hasta que la cola se vacíe ("mientras haya datos en la cola espero en wait()")
    	  while (disponible){
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  numero = valor;
    	  disponible = true;
    	  notify();
    	}


    
}
