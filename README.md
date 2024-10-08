    ---------------------------------------------------------------------------------------------------

//deixar mais lento a mensagem

public static void exibirMensagem(String mensagem) {
        try {
            limparConsole();
            for (char caractere : mensagem.toCharArray()) {
                System.out.print(caractere);
                System.out.flush();
                Thread.sleep(10); 
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ---------------------------------------------------------------------------------------------------

    //limpa o console

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }