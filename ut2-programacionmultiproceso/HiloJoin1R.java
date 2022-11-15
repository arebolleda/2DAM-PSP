public class HiloJoin1R implements Runnable {

   
    private int numero=1000;
    private int numveces;
    private String operacion;

    public HiloJoin1R(int numveces, String operacion)
    {
        this.numveces=numveces;
        this.operacion=operacion;
    }

    public int incrementar (int numveces)
    {
        for (int i=1; i<=numveces;i++)
             numero++;
        return numero;
    }

    public int decrementar (int numveces)
    {
        for (int i=1; i<=numveces;i++)
            numero--;
        return numero;
    }

    //método run -> funcionalidad del hilo
	public void run() {
		
        int resultado=0;

        if (operacion=="+") resultado=incrementar(numveces);
        else if (operacion=="-") resultado=decrementar(numveces);
        
        System.out.println(" Numero = "+ resultado);
	}
}