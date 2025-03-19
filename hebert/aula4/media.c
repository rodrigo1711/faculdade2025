#include <stdio.h>
 
int main (){
      float n1, n2, med;
      printf ("Digite o valor para a nota 1: ");
      scanf ("%f", &n1);
      printf ("Digite o valor para a nota 2: ");
      scanf ("%f", &n2);
      
      med = (n1+n2) /2;
      printf("a media é: %.2f\n" ,med);
      
      if (med >= 6){
          printf("aprovado");
      }
          else if (med >=5){
              printf("recuperação");
          }
          else{
              printf("reprovado");
          }
     return 0; 
}
