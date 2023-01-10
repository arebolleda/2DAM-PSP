//Clase InetAdress -> abstracción representa una IP
// *Subclase Inet4Address para direcciones IPv4
// *Subclase Inet6Address para direcciones IPv6
import java.net.*;

public class InetAddress2 {
	  public static void main(String[] args) {
	   
	   System.out.println("========================================================");
	   System.out.println("Info URL: ");
	   try {
 
		InetAddress dir = InetAddress.getByName("www.google.es");
		System.out.println("\tMetodo getByName():  " + dir);
		System.out.println("\tMetodo getHostName(): "+ dir.getHostName());
		System.out.println("\tMetodo getHostAddress(): "+ dir.getHostAddress());
		System.out.println("\tMetodo toString(): " + dir.toString());
		System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());		
		
        // Array de tipo InetAddress con todas las direcciones IP 
	     //asignadas a google.es
	     System.out.println("\tDIRECCIONES IP PARA: " + dir.getHostName());
	     InetAddress[] direcciones = 
	                   InetAddress.getAllByName(dir.getHostName());
	     for (int i = 0; i < direcciones.length; i++)
	          System.out.println("\t\t"+direcciones[i].toString());
        
        InetAddress dir2 = InetAddress.getLocalHost();
		System.out.println("\tMetodo getLocalHost(): " + dir2);
			
	     
	  } catch (UnknownHostException e1) {e1.printStackTrace();	  }
	  
	  System.out.println("========================================================");
	}

}//fin



