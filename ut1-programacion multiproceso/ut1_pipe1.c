#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h> 

void main(){

     int fd[2]; 
     char buffer[30];
     pid_t pid;
    
     // Creamos el pipe
     pipe(fd); 
     
     //Se crea un proceso hijo
     pid = fork();

     if (pid==0)
     
     {
                close(fd[0]); // Cierra el descriptor de lectura
                printf("El hijo escribe en el PIPE \n");
                write(fd[1], "Hola padre", 10); 
                
     
     }
     
     else
     
     {
                close(fd[1]); // Cierra el descriptor de lectura
                wait(NULL);
                printf("El padre lee el PIPE\n");
                read(fd[0],buffer, 10);  
                printf("\t Mensaje leído del pipe: %s \n", buffer);
    
     }
     
        
}
