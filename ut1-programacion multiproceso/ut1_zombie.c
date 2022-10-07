#include <unistd.h>
#include <stdio.h>
#include <string.h>

/* Programa genera procesos ZOMBIES */

/*Cuando los procesos hijos finalizan, pero el padre NO termina se convierten en estados zombies. En ocasiones el programa padre si ha terminado pero el sistema no libera el PCB del proceso padre, por lo que el sistema clasifica al proceso/s hijo/s como zombie/s*/

int main() {
  
  pid_t pid;
  
  int n=2;

  // El proceso padre genera 2 procesos hijos
   while (n > 0)
   {
    pid = fork();
    if (pid==0) break;
    n--;
    }

  // proceso hijo
  if (pid == 0) {
    printf("proceso hijo pid = %d ; proceso padre pid = %d\n", getpid(), getppid());
    return 0;  // El proceso hijo finalizado
  }
    /* El proceso padre está en un bucle infinito y el proceso hijo no se ha "reciclado".
       Si el proceso padre no termina, el proceso hijo será en un proceso zombie
    */
  while(1) {
    sleep(3);
    printf("Soy el proceso padre con pid= %d\n", getpid());
  }
  return 0;
}
