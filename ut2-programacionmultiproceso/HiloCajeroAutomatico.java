// Clase CuentaBancaria
// Definición de la cuenta con un saldo inicial y de las operaciones para ingresar dinero (método ingresarDinero)
// y sacar dinero (método sacarDinero) de la cuenta
class CuentaBancaria {
    int saldo = 1000;

     void sacarDinero (String nombre, int importe)
    {
        if (saldo >= importe) {
            System.out.println(nombre + " sacó de la cuenta " + importe +"€");
            saldo = saldo - importe;
            System.out.println("Saldo actual cuenta= "+saldo +"€");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {

            System.out.println(nombre + " no puede sacar " + importe +"€ -> NO HAY SALDO SUFICIENTE");
            System.out.println("Saldo actual cuenta= "+saldo +"€");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
     void ingresarDinero (String nombre, int importe)
    {
        System.out.println(nombre + " ingresó en la cuenta "+ importe +"€");
        saldo = saldo + importe;
        System.out.println("Saldo actual cuenta= "+saldo +"€");

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//Clase HiloSacarDinero
class HiloSacarDinero extends Thread {

    private CuentaBancaria cuenta;
    private String nombre;
    private int cantidad;

    // Constructor de esta clase
    HiloSacarDinero(CuentaBancaria micuenta, String nombre, int cantidad)
    {
        this.cuenta = micuenta;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    // método run() para el hilo
    public void run() {
        cuenta.sacarDinero(nombre,cantidad);
    }
}


// Clase HiloIngresarDinero
class HiloIngresarDinero extends Thread {
    private CuentaBancaria cuenta;
    private String nombre;
    private int cantidad;

    HiloIngresarDinero (CuentaBancaria micuenta, String nombre, int cantidad)
    {
        // La palabra clave "this" se refiere a la propia instancia actual
        this.cuenta = micuenta;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    // método run() para el hilo
    public void run() {
        cuenta.ingresarDinero(nombre,cantidad);
    }
}

// Clase Principal
public class HiloCajeroAutomatico {
    // Metodo Main
    public static void main(String[] args)
    {

        // Creación de un objeto de la clase CuentaBancaria
        CuentaBancaria micuenta= new CuentaBancaria();

        //Creación de los hilos
        HiloSacarDinero t1 = new HiloSacarDinero(micuenta, "Padre", 200);
        HiloSacarDinero t2 = new HiloSacarDinero(micuenta, "Madre", 400);
        HiloIngresarDinero t3 = new HiloIngresarDinero(micuenta, "Hijo1", 300);
        HiloSacarDinero t4  = new HiloSacarDinero(micuenta, "Hijo2", 800);
        HiloSacarDinero t5  = new HiloSacarDinero(micuenta, "Abuelo", 600);

        // Inicio de los hilos creados anteriormente
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
