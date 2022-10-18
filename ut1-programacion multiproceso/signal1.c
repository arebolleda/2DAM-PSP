#include<stdio.h>
#include<unistd.h>
#include<signal.h>

//Función manejadora de la señal
void fun_signal(int signum){
  printf("\n Se ha pulsado Ctrl+C \n");
  signal(SIGINT,SIG_DFL);   // Se "re-arma" la señal con su acción por defecto
}

int main(){
  signal(SIGINT,fun_signal); // Register signal handler
  for(int i=1;;i++){    //Infinite loop
    printf("%d : Me voy a dormir ...\n",i);
    sleep(1);  // Delay for 1 second
  }
  return 0;
}