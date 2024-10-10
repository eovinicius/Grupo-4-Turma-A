public class Utils {

    public void exibirMensagem(String mensagem) throws InterruptedException {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(120);
        }
        Thread.sleep(1000);
    }

    public void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}