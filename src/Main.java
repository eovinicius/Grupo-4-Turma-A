public class Main {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        try {
            game.iniciar();
        } catch (Exception e) {
            game.limpaConsole();
            System.out.println("Erro inesperado, reiniciando o jogo aguarde...");
            Thread.sleep(3000);
            game.iniciar();
        }

    }
}