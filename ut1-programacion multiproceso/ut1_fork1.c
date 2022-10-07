#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>

void main() {
  pid_t pid, Hijo_pid;
  
  int numero1=10;
  int numero2=20;
  
  pid = fork();

  if (pid == -1 ) //Ha ocurrido un error 
  {
    printf("No se ha podido crear el proceso hijo...");
    exit(-1);       
  }
  if (pid == 0 )  //Nos encontramos en Proceso hijo 
  {        
    printf("Soy el proceso hijo \n\t Mi PID es %d, El PID de mi padre es: %d.\n",  
            getpid(), getppid() );	
    printf("La variable numero1 vale %d en el proceso hijo heredada del padre",numero1);
    numero1=555;
    printf("La variable numero1 vale ahora en el proceso hijo %d",numero1);
    
  }
  else    //Nos encontramos en Proceso padre 
  { 
   Hijo_pid = wait(NULL); //espera la finalización del proceso hijo
   
   printf("Soy el proceso padre:\n\t Mi PID es %d, El PID de mi padre es: %d.\n\t Mi hijo: %d terminó.\n",  getpid(), getppid(), pid);          
    printf("La variable numero1 vale en el padre %d",numero1);
   }
   exit(0);
}

