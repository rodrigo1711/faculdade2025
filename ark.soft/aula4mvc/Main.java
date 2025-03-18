import model.Usuario;
import view.Visao;
import controller.Controlador;

public class Main {
    public static void main(String[] args) {
        Usuario modelo = new Usuario();
        Visao visao = new Visao();
        Controlador controlador = new Controlador(modelo, visao);
        controlador.processarNome();
    }
}
