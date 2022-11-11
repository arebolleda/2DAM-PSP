//Clase que extiende Thread
// Variable contador que se incrementa de 5 en 5 en el método run()

//Método getContador() -> obtiene el valor de la variable contador

//Método pararHilo() -> para el hilo a través de una condición

class HiloPrioridad1 extends Thread {
    private int contador = 0;
    private boolean stopHilo= false; 
    
    public HiloPrioridad1(String nombre) {
          super(nombre);		
    }
    public int getContador()  {
           return contador;
    }  
    public void pararHilo()  {
            stopHilo = true;         
    }  
    public void run() {
      while (!stopHilo) {
          try {
                Thread.sleep(2);
              } catch (Exception e) { }
              contador=contador+5;      	
      } 
      System.out.println("Fin hilo  "+ this.getName());
      
    }//
  }  