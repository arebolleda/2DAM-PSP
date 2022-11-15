//El método join() suele utilizarse para mantener un orden en la secuencia de los hilos. 
//Así, podemos arrancar una secuencia de hilos llamando a join() para que cada uno finalice
//en el orden que hemos marcado según la llamada a join().

//public void join(long millis) throws InterruptedException 
// Parámetros: millis -> tiempo máximo (en milisegundos) sistema espera a que el thread acabe. Si no acaba en ese tiempo devuelve el control al thread llamante
// Return: no devuelve ningún valor
// Exception:
// InterruptedException: esta excepción se dispara si cualquier thread interrumpe al thread actual

public class HiloJoin3 extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=25; i++)  
        {    
            System.out.println("Soy el thread con id "+getId()+"-"+i);    
        }    
    }    
    public static void main(String args[])  
    {   
        // Se crean los hilos
        HiloJoin3 t1 = new HiloJoin3();    
        HiloJoin3 t2 = new HiloJoin3();    
        HiloJoin3 t3 = new HiloJoin3();   
        HiloJoin3 t4 = new HiloJoin3();  

        // Inicio de ejecución del thread t1
         
        t1.start();   
                
        
        // t2, t3 y t4 comenzarán cuando hayan finalizado/muerto t1
        try  
        {    
            t1.join(3000);   
           
        }catch(Exception e){System.out.println(e);}    
        
        // Inicio de ejecución de los thread t2 y t3
        t2.start();   
        t4.start();
        t3.start();
 
    }  
}   