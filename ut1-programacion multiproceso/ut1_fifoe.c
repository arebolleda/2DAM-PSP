#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>

int  main()
{
   int  fp;
   char  saludo[]= "Un  saludo!!!\n";
	
    fp = open("FIFO2",1);

    printf("Mandando  informacion  al  FIFO...\n"); 
    write(fp,saludo,strlen(saludo));
   close(fp);
   return 0;
}

