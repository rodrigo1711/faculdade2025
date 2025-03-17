#ifndef MINHA_STRUCT_H
#define MINHA_STRUCT_H

struct Pessoa;
struct Pessoa*nova_Pessoa(void); // tipo um método construtor

char* getNome(struct Pessoa* nvPessoa); //definindo função que retorna um ponteiro do tipo char
int getIdade(struct Pessoa* nvPessoa); //definindo função que retorna um ponteiro do tipo int
char getProfissao(struct Pessoa* nvPessoa); //ponteiro char

int setNome(struct Pessoa* nvPessoa, char* nvNome);
int setProfissao(struct Pessoa* nvPessoa, int*nvIdade);
int setIdade(struct Pessoa* nvPessoa, int*nvIdade);
#endif  //minha struct_H
//perceba a semalhança quando comparado a uma classe, mas é uma struct, estruturando algo
