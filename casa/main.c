#include <stdio.h>
#include "minha_struct.h"
#include <strings.h>

int main()
{
    struct Pessoa* Fabio;
    Fabio = nova_Pessoa();
    setNome(Fabio, "Fabio");
    setIdade(Fabio,30);
    setProfissao(Fabio, "programador");

    printf("nome:%s/n", getNome(Fabio));
    printf("Idade: %d/r" , getIdade(Fabio));
    printf("profissao: %d/r" , getProfissao(Fabio));


    return 0;
}