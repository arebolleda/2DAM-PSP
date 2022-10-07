#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

/* Programa genera proceso HUERFANO */
/*Cuando el proceso padre finaliza antes que el proceso hijo, el proceso hijo se convierte en un proceso huérfano. Estos procesos huérfanos son "recogidos" por el proceso init o (demonio systemd)*/

int main(void) {
    pid_t pid;
    
    pid = fork();
    
    // Proceso hijo
    if (pid == 0) {
        // bucle infinito en el proceso hijo
        while (1) {
            printf("Soy un proceso hijo y el pid de mi padre es = %d\n", getppid());
            // Se duerme 1 segundo
            sleep(1);
        }
    // proceso padre
    } else if (pid > 0) {
        printf("Soy el proceso padre con pid = %d\n", getpid());
        // Se duerme 10 segundos
        sleep(10);
        printf("El proceso padre termina\n");
        // Fin del proceso padre
    } 
    return 0;
}
