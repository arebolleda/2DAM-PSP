#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>

// Solucion Junior Reyes
int  main()
{
   int  fp;
   char  numero[]= "0123456789\n";
	
    fp = open("FIFODAM",1);

    printf("Mandando  informacion  al  FIFO...\n"); 
    write(fp,numero,strlen(numero));
   close(fp);
   return 0;
}