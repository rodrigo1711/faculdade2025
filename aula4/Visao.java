package view;

import java.util.Scanner;

public class Visao {
    private Scanner scanner;

    public Visao() {
        this.scanner = new Scanner(System.in);
    }

    public String obterNome() {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
