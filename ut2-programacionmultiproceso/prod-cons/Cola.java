public class Cola {
    private int numero;
    private boolean disponible = false; //permite indicar si hay número o no en la cola (inicialmente cola vacia)

    //método devuelve el número de la cola si está disponible ( disponible==true )
    public int get() {
	    if(disponible) {      //hay número en la cola
		disponible = false;   //como se va a consumir el número -> disponible=false
            return numero;    //se devuelve el número
	    }
          return -1;	//no hay n�mero disponible, cola vacía	
    }

    //método guarda el entero en atributo número (como está disponible para ser consumido -> disponible=true)
    public void put(int valor) {
        numero = valor;    //coloca valor en la cola 
        disponible = true; //disponible para consumir, cola llena	
    }
}
