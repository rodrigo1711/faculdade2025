#include "minha_struct.h"

#define MAX_NOME 20
#define MAX_PROFISSAO 20

struct Pessoa
{
    char* Nome;
    char* Profissao;
    int Idade;
};

struct Pessoa* nova_pessoa(void)
{
    struct Pessoa* nvPessoa;
    nvPessoa = malloc(sizeof(struct Pessoa));
    return nvPessoa;
}

int setNome(struct Pessoa* nvPessoa, char*nvNome)
{
    nvPessoa->Nome = nvNome;
    return 1;
}

char* getNome(struct Pessoa* nvPessoa)
{
    return nvPessoa->Nome;
}

int setProfissao(struct Pessoa* nvPessoa, char* nvProfissao)
{
    nvPessoa->Profissao = nvProfissao;
    return 1;
}

char* getProfissao(struct Pessoa* nvPessoa)
{
    return nvPessoa ->Profissao;
}

int setIdade(struct Pessoa* nvPessoa, int* nvIdade)
{
    nvPessoa->Idade = nvIdade;
    return 1;
}

int getIdade(struct Pessoa*nvPessoa)
{
    return nvPessoa->Idade;
}