#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main(void)
{
  int  fp;
  int  p,  bytesleidos;
  char buffer[10];

   p=mkfifo("FIFO2",  S_IFIFO|0666);//permiso  de  lecture y escritura
	
  while (1)
  {
	fp = open("FIFO2", 0);
	bytesleidos=read(fp,buffer,1) ; 
	printf("OBTENIENDO  Informacion...");
	while 	(bytesleidos!=0)
	{
	   printf("%c",buffer[0]); 
	   bytesleidos=read(fp,buffer,1)	;//leo  otro  byte
	}
	close(fp); 
  }  
return(0); 
}

