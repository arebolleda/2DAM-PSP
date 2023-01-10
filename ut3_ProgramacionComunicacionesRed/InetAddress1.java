//Clase InetAdress -> abstracción representa una IP
// *Subclase Inet4Address para direcciones IPv4
// *Subclase Inet6Address para direcciones IPv6
import java.net.*;

public class InetAddress1 {
	  public static void main(String[] args) {
	   
	   System.out.println("========================================================");
	   System.out.println("Info máquina local: ");
	   try {
 
		InetAddress dir = InetAddress.getByName("localhost");
		System.out.println("\tMetodo getByName():  " + dir);
		System.out.println("\tMetodo getHostName(): "+ dir.getHostName());
		System.out.println("\tMetodo getHostAddress(): "+ dir.getHostAddress());
		System.out.println("\tMetodo toString(): " + dir.toString());
		System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());		
		InetAddress dir2 = InetAddress.getLocalHost();
		System.out.println("\tMetodo getLocalHost(): " + dir2);
			
	     
	  } catch (UnknownHostException e1) {e1.printStackTrace();	  }
	  
	  System.out.println("========================================================");
	}

}//fin



