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
   char letra[]= "A";
	
    fp = open("FIFODAM",O_WRONLY);

   write(fp,letra,sizeof(letra)-2);
   close(fp);
   return 0;
}