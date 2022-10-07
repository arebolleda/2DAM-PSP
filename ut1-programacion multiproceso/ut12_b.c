#include <unistd.h>
#include <stdio.h>
void main()
{
       printf("Ejemplo de uso de execv():");      
       
       //Array para almancenar los argumentos 
       char *args[]={"/bin/ls","-l",NULL};
       
       printf("Los archivos en el directorio son:\n");
       execv("/bin/ls", args);
       printf("¡¡¡ Esto no se ejecuta !!!\n");
}
