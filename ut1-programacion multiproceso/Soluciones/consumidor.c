#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <ctype.h>

// Solucion Junior Reyes
int main(void)
{
  int  fp;
  int  p,  bytesleidos;
  char buffer[10];
  char letra;

   p=mkfifo ("FIFODAM",  S_IFIFO|0666);    //permiso  de  lecture y escritura
	// Aqui lo abre
  while (1)
  {
	fp = open("FIFODAM", 0);
	bytesleidos=read(fp,buffer,1) ; 
	printf("OBTENIENDO  Informacion...");
	

	// Aqui lee el fichero
	while 	(bytesleidos!=0)
	{
	   printf("%c",buffer[0]);
	   if (isalpha(buffer[0]))
	    {

	    	printf( " Esto es una letra\n" );

	    } 
	    else if(isdigit(buffer[0])){
	    	printf(" Esto es un numero\n");
	    }
	    else {
	    	printf("No es ni letra ni numero");
	    }
	   bytesleidos=read(fp,buffer,1)	;//leo  otro  byte


	}
	close(fp); 
  }  
return(0); 
}