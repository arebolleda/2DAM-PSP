//El método join() suele utilizarse para mantener un orden en la secuencia de los hilos. 
//Así, podemos arrancar una secuencia de hilos llamando a join() para que cada uno finalice
//en el orden que hemos marcado según la llamada a join().

//public final void join()throws InterruptedException
// Parámetros: ninguno
// Return: no devuelve ningún valor
// Exception:
// InterruptedException: esta excepción se dispara si cualquier thread interrumpe al thread actual

public class HiloJoin1 extends Thread  
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
        HiloJoin1 t1 = new HiloJoin1();    
        HiloJoin1 t2 = new HiloJoin1();    
        HiloJoin1 t3 = new HiloJoin1();   

        // Inicio de ejecución del thread t1 
        t1.start();   
        
        
        // t1 invoca a join -> el siguiente hilo comenzará cuando t1 haya finalizado/muerto
        try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);}    
        
        // Inicio de ejecución de los thread t2 y t3
        t2.start();   
        t3.start();    
    }  
}   