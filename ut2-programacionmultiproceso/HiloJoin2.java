//El método join() suele utilizarse para mantener un orden en la secuencia de los hilos. 
//Así, podemos arrancar una secuencia de hilos llamando a join() para que cada uno finalice
//en el orden que hemos marcado según la llamada a join().

//public final void join()throws InterruptedException
// Parámetros: ninguno
// Return: no devuelve ningún valor
// Exception:
// InterruptedException: esta excepción se dispara si cualquier thread interrumpe al thread actual

public class HiloJoin2 extends Thread  
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
        HiloJoin2 t1 = new HiloJoin2();    
        HiloJoin2 t2 = new HiloJoin2();    
        HiloJoin2 t3 = new HiloJoin2();   
        HiloJoin2 t4 = new HiloJoin2();  

        // Inicio de ejecución de los thread t2 y t3
         
        t2.start();   
        t3.start();   
        
        
        // t1 y t4 comenzarán cuando hayan finalizado/muerto t2 y t3
        try  
        {    
            t2.join();   
            t3.join();   
        }catch(Exception e){System.out.println(e);}    
        
        // Inicio de ejecución de los thread t2 y t3
        t1.start();   
        t4.start();
 
    }  
}   