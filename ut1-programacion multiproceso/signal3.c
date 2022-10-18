#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>

/* gestión de señales en proceso padre       */
void manejador( int numsenal )
{
 printf("Hijo recibe señal número..%d\n", numsenal);
 
}

int main()
{
  int pid_hijo;  
  pid_hijo = fork(); //creamos hijo   
  
  switch(pid_hijo)
  {
     case -1:
          printf( "Error al crear el proceso hijo...\n");
          exit( -1 );        
     case 0:   //HIJO     	         
          signal(SIGUSR1, manejador); //Función manejadora de la señal
          pause();
          break;    
     default: //PADRE envia 2 señales
          sleep(1);
          kill(pid_hijo, SIGUSR1);//ENVIA SEÑAL AL HIJO 
          sleep(1);
          break;
  } 
  return 0;
}
