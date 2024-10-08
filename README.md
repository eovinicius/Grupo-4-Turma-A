# Funções para Exibição de Mensagens em Estilo RPG

Este documento descreve as funções utilizadas para exibir mensagens em um console, simulando um efeito de digitação.

## Código

```java
public static void exibirMensagem(String mensagem) {
    try {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(10); // Atraso de 10 milissegundos entre os caracteres
        }
        System.out.println(); // Adiciona uma nova linha após a mensagem
    } catch (InterruptedException e) {
        e.printStackTrace(); // Tratamento de exceção
    }
}

// Limpa o console
public static void limparConsole() {
    System.out.print("\033[H\033[2J"); // Sequência ANSI para limpar o console
    System.out.flush(); // Atualiza a saída
}
