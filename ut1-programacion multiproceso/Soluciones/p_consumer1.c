#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>
#include <ctype.h>


int main(void)
{
  int  fp;
  int  p,  bytesleidos;
  char buffer[1];
  

   p=mkfifo("FIFODAM",  S_IFIFO|0666);//permiso  de  lecture y escritura
	
  while (1)
  {
	fp = open("FIFODAM", O_RDONLY);
	bytesleidos=read(fp,buffer,sizeof(buffer)) ; 
	printf("OBTENIENDO  Informacion del buffer %s...",buffer);
	
       if (isdigit(buffer[0]))
        {
            printf("%c es un numero \n",buffer[0]); 
        }
       else
        {
            printf("%c es una letra \n",buffer[0]); 
        }
	
	
	close(fp); 
  }  
return(0); 
}