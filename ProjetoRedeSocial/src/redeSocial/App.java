package redeSocial;

public class App {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        usuario1.nome = "Ana";
        usuario1.idade = 17;
        usuario1.cidade = "Valença";

        usuario1.mostrarPerfil();
    }
}