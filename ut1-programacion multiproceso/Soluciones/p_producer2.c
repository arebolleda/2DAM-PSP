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
   char letra[]= "0";

	// Proceso produce una letra
    fp = open("FIFODAM",O_WRONLY);

   write(fp,letra,strlen(letra)-1);
   close(fp);
   return 0;
}