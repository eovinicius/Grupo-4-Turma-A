public class Main {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        try {
            game.iniciar();
        } catch (Exception e) {
            System.out.println("Erro inesperado, reiniciando o jogo...");
            game.iniciar();
        }
        
    }
}