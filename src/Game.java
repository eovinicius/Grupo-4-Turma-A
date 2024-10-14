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

    public void InterfaceInstrucoes() throws InterruptedException {
        int opcao = 0;
        LimpaConsole();

        exibirMensagem("Este é um jogo de RPG, onde você irá poder escolher seu nome, sua classe, " +
                "e a partir de algumas escolhas o jogo pode tomar rumos diferentes a cada vez que for jogado. " +
                "Seguem abaixo as principais instruções do jogo:\n\n" +
                "Instrução número 1:\n" +
                "\nAs mensagens serão demonstradas caractere por caractere. " +
                "A todo momento que acabar os caracteres a serem demonstrados, pressione ENTER para continuar. " +
                "(Realize o teste agora de como isso irá funcionar)");
        exibirMensagem("Instrução número 2:\n" +
                "\nA escolha do seu nome não interfere em nada no jogo, " +
                "mas a da sua classe sim, ela será baseada na arma que você escolher. " +
                "Cada uma delas dará algum benefício (isso será apresentado no próprio jogo), " +
                "que pode facilitar certas partes do jogo e manter outras mais difíceis.");
        exibirMensagem("Instrução número 3:\n" +
                "\nDurante o desenvolvimento do jogo, você irá enfrentar criaturas místicas. " +
                "Durante esses combates, você irá atacar e será atacado pela criatura. " +
                "Um desvio ou acerto de ataque será contabilizado a partir de desafios propostos sobre a matéria 'Algoritmos e Programação I'. "
                +
                "Caso acerte a questão, irá dar certo para você; caso erre, irá dar certo para a criatura.");
        exibirMensagem("Instrução número 4:\n" +
                "\nSobre as questões, serão dois tipos: perguntas com alternativas e perguntas dissertativas. " +
                "As dissertativas exigirão que você escreva, complete ou corrija algumas partes de códigos em Java " +
                "(linguagem utilizada na matéria escolhida neste semestre).");
        exibirMensagem("Instrução número 5:\n" +
                "\nMUITA ATENÇÃO COM LETRAS MAIÚSCULAS E MINÚSCULAS.\n" +
                "Nas questões alternativas você pode digitar uma letra maiúscula ou minúscula, exemplo 'd' ou 'D', " +
                "o resultado será igual.\n" +
                "Entretanto, em perguntas dissertativas, as questões serão relacionadas a código em Java " +
                "(como já foi informado na instrução 4), e, nesta linguagem de programação, os comandos precisam ser exatamente iguais, "
                +
                "inclusive letras maiúsculas e minúsculas.\n" +
                "Portanto, muita atenção ao responder uma questão dissertativa, você precisará responder exatamente " +
                "como colocaria em um código em uma IDE.");
        exibirMensagemComPergunta(
                "Agora que você já viu todas as instruções necessárias para jogar, você está pronto para iniciar este RPG.\n"
                        +
                        "O que você deseja fazer? Digite o número da opção desejada\n" +
                        "1 - Jogar o RPG\n" +
                        "2 - Voltar à interface inicial\n" +
                        "3 - Sair do jogo");
        
        do {
            opcao = Integer.parseInt(System.console().readLine());
            switch (opcao) {
            case 1:
                Jogar();
                break;
            case 2:
                Iniciar();
                break;
            case 3:
                System.out.println("Jogo finalizado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        } while (opcao < 1 && opcao > 3);
        
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

    public void exibirMensagemComPergunta(String mensagem) throws InterruptedException {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(10);
        }

    }

    public void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
