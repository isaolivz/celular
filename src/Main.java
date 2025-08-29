//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Iphone iphone = new Iphone();

//funcionalidades do reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Canção de Simeão");

        //funcionalidades aparelho telefonico

        iphone.ligar("Mãe: 1193543632\n");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //funcionalidades do navegador internet

        iphone.exibirPagina("https:dio.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}