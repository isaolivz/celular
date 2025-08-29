public class Iphone implements ReprodutorMusical, AparelhoTelefonico,NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica...");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s...", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acionando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando pagina...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiznado pagina");
    }
}
