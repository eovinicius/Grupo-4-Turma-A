public class Game {
    public void Iniciar() throws InterruptedException {
        String opcao = System.console().readLine();
        switch (opcao) {
            case "0":
                Jogar();
                break;
            case "1":
                InterfaceInstrucoes();
                break;

            case "2":
                InterfaceCreditos();
                break;
            case "3":
                System.out.println("Jogo finalizado!");
                break;

            default:
                break;
        }
    }

    public void Jogar() throws InterruptedException {
        String nomeJogador;
        int armaEscolhida;
        int vida = 3;

        exibirMensagem(
                "O Reino de Algoritmópolis, uma terra outrora pacífica e conhecida por suas soluções elegantes e bem-estruturadas, foi abalada pelo caos. O Bug Supremo, entidade corrompida pelas falhas e ineficiências que surgem na lógica dos algoritmos, despertou das profundezas do código esquecido. Com seu exército de criaturas míticas, ele semeia o caos, invadindo o reino e causando erros fatais em sistemas críticos. O rei Syntaxius, mestre da lógica e soberano de Algoritmópolis, observava seu reino ruir aos poucos. As estruturas de dados que antes sustentavam o reino estavam comprometidas, e as funções essenciais do reino não eram mais confiáveis. Desesperado, Syntaxius convoca um herói para derrotar o Bug Supremo e restaurar a ordem em Algoritmópolis. Você, jovem programador, é a única esperança do reino. Qual é o seu nome?");

        nomeJogador = System.console().readLine().toUpperCase();
        exibirMensagem("O rei Syntaxius: " + nomeJogador
                + ", O Debugger eu convoco você para uma missão de extrema importância. O Bug Supremo despertou e está causando o caos em Algoritmópolis. Você é a única esperança do reino. Derrote o Bug Supremo e traga a paz de volta para o nosso reino!");
        exibirMensagem(
                "O rei Syntaxius: Antes de partir, você precisará de um equipamento adequado para enfrentar as criaturas do Bug Supremo. Escolha um item para levar consigo: ");

        do {
            exibirMensagem("1 - Espada de Ferro (Possui vantagem contra criaturas de ARRAYS)" + "\n "
                    + "2 - Cajado de Madeira (Possui vantagem contra criaturas de ESTRUTURAS DE REPETIÇÃO)" + "\n "
                    + "3 - Arco de Pinho (Possui vantagem contra criaturas de ESTRUTURAS DE DECISÃO)");

            armaEscolhida = Integer.parseInt(System.console().readLine());

            switch (armaEscolhida) {
                case 1:
                    exibirMensagem(
                            "Você escolheu a Espada de Ferro. Que ela seja afiada o suficiente para cortar os Arrays do Bug Supremo!");
                    break;
                case 2:
                    exibirMensagem(
                            "Você escolheu o Cajado de Madeira. Que ele seja resistente o suficiente para enfrentar as Estruturas de Repetição do Bug Supremo!");
                    break;
                case 3:
                    exibirMensagem(
                            "Você escolheu o Arco de Pinho. Que ele seja preciso o suficiente para acertar as Estruturas de Decisão do Bug Supremo!");
                    break;
                default:
                    exibirMensagem("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (armaEscolhida != 1 && armaEscolhida != 2 && armaEscolhida != 3 && armaEscolhida != 4);

        exibirMensagem(
                "Após isso, provando sua lealdade ao reino, você junta tudo que julga como necessário para esta missão, saindo logo na manhã do dia seguinte para ir em busca do ser que está colocando seu reino a beira do desmoranamento. ");

        exibirMensagem(
                "Após caminhar por quatro horas ininterruptas pelas vastas planícies de Algoritmópolis, você começa a notar que o terreno ao seu redor está mudando. Os dados, antes organizados em estruturas claras, começam a desmoronar, criando montanhas de informações sem ordem. Quando começa a prestar mais atenção nos dados que estão desorganizados ao seu redor, percebe que se tratam de dados relacioados a repetições. Depois de alguns poucos minutos em uma grande desordem chega uma criatura mística gigantesca, o Dragão dos Loops e, para sua surpresa, apesar de se tratar de uma criatura, ele fala: ");
    }

    public void InterfaceCreditos() {

    }

    public void InterfaceInstrucoes() {

    }

    public void PerguntasArray() {

    }

    public void PerguntasCondicionais() {

    }

    public void PerguntasLoops() {

    }

    public void LimpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void ThreadSleep() {

    }

    public void exibirMensagem(String mensagem) throws InterruptedException {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(10);
        }
        System.console().readLine();
    }

    public void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
