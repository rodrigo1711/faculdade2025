package controller;

import model.Usuario;
import view.Visao;

public class Controlador {
    private Usuario modelo;
    private Visao visao;

    public Controlador(Usuario modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void processarNome() {
        String nome = visao.obterNome();
        modelo.setNome(nome);
        visao.mostrarMensagem("Olá, " + modelo.getNome() + "!");
    }
}
