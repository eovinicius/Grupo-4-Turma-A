import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Random;

public class Game {
    public void iniciar() throws InterruptedException {
        while (true) {
            limparConsole();
            System.out.println("Menu:");
            System.out.println("0 - Jogar");
            System.out.println("1 - Instruções");
            System.out.println("2 - Créditos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

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
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void Jogar() throws InterruptedException, RuntimeException {
        String nomeJogador;
        String armaEscolhida;
        int vida = 3;
        double vidaDragao = 3;

        Print(
                //"O Reino de Algoritmópolis, uma terra outrora pacífica e conhecida por suas soluções elegantes e bem-estruturadas, foi abalada pelo caos. O Bug Supremo, entidade corrompida pelas falhas e ineficiências que surgem na lógica dos algoritmos, despertou das profundezas do código esquecido. Com seu exército de criaturas míticas, ele semeia o caos, invadindo o reino e causando erros fatais em sistemas críticos. O rei Syntaxius, mestre da lógica e soberano de Algoritmópolis, observava seu reino ruir aos poucos. As estruturas de dados que antes sustentavam o reino estavam comprometidas, e as funções essenciais do reino não eram mais confiáveis. Desesperado, Syntaxius convoca um herói para derrotar o Bug Supremo e restaurar a ordem em Algoritmópolis. Você, jovem programador, é a única esperança do reino.",
                "Qual é o seu nome? ");

        nomeJogador = System.console().readLine().toUpperCase();
        Print("O rei Syntaxius: " + nomeJogador
                + ", O Debugger eu convoco você para uma missão de extrema importância. O Bug Supremo despertou e está causando o caos em Algoritmópolis. Você é a única esperança do reino. Derrote o Bug Supremo e traga a paz de volta para o nosso reino!");
        Print(
                "O rei Syntaxius: Antes de partir, você precisará de um equipamento adequado para enfrentar as criaturas do Bug Supremo. Escolha um item para levar consigo: ");

        do {
            Print("1 - Espada de Ferro (Vantagem contra criaturas de ARRAYS)\n" +
                    "2 - Cajado de Madeira (Vantagem contra criaturas de ESTRUTURAS DE REPETIÇÃO)\n" +
                    "3 - Arco de Pinho (Vantagem contra criaturas de ESTRUTURAS DE DECISÃO)",
                    "Escolha um item para levar consigo: ");

            armaEscolhida = System.console().readLine();

            switch (armaEscolhida) {
                case "1":
                    //Print(
                            //"Você escolheu a Espada de Ferro. Que ela seja afiada o suficiente para cortar as criaturas de Arrays do Bug Supremo!");
                    break;
                case "2":
                    //Print(
                           // "Você escolheu o Cajado de Madeira. Que ele seja resistente o suficiente para enfrentar as criaturas de Estruturas de Repetição do Bug Supremo!");
                    break;
                case "3":
                   // Print(
                           // "Você escolheu o Arco de Pinho. Que ele seja preciso o suficiente para acertar as criaturas de Estruturas de Decisão do Bug Supremo!");
                    break;
                default:
                    Print("Opção inválida. Escolha novamente.");
                    break;
            }

        } while (!(armaEscolhida.equals("1") || armaEscolhida.equals("2") || armaEscolhida.equals("3")));

        Print(
                "Após isso, provando sua lealdade ao reino, você junta tudo que julga como necessário para esta missão, saindo logo na manhã do dia seguinte para ir em busca do ser que está colocando seu reino a beira do desmoranamento. ");

        Print(
                "Após caminhar por quatro horas ininterruptas pelas vastas planícies de Algoritmópolis, você começa a notar que o terreno ao seu redor está mudando. Os dados, antes organizados em estruturas claras, começam a desmoronar, criando montanhas de informações sem ordem. Quando começa a prestar mais atenção nos dados que estão desorganizados ao seu redor, percebe que se tratam de dados relacioados a repetições. Depois de alguns poucos minutos em uma grande desordem chega uma criatura mística gigantesca, o Dragão dos Loops e, para sua surpresa, apesar de se tratar de uma criatura, ele fala: ");

        Print(
                "Dragão dos Arrays: Seus olhos brilham com o caos de índices infinitos enquanto suas garras afiadas procuram destruir toda lógica. Prepare-se, pois cada erro será punido com um ataque fatal!");

        Print(
                "Vendo que está vindo uma grande rajada de fogo em sua direção você tenta desviar e contra-atacar com um golpe: ");

        // logica da batalha
            do {
                boolean eCorreta = PerguntasArray();
                if (!eCorreta) {
                    Print("Voce tomou o golpe");
                    vida--;
                } else if (armaEscolhida.equals("1")) {
                    Print("Voce acertou o golpe");
                    vidaDragao = vidaDragao - 1.5;
                } else {
                    Print("Voce acertou o golpe");
                    vidaDragao = vidaDragao - 1;
                }
            }while (vida > 0 && vidaDragao > 0);

            if (vida == 0) {
                Print("Voce morreu");
                return;
            }

        Print(
                "Depois de ter conseguido derrotar uma das poderosas criaturas que o bug supremo controlava, você decide tirar o restante do dia para descansar, pois ela te levou a sua exaustão, de maneira na qual isso acaba se tornando necessário.");

        Print(
                "No dia seguinte, você segue sua jornada, que perdura durante 3 dias, que é quando você encontra um local similar a cavernas, com 3 diferentes entradas, onde existe uma mensagem em cada uma se deseja acabar com o reino de algoritmólis entre aqui, na outra se deseja encontrar o bug supremo entre aqui e na última se esta em busca de mais poder, entre aqui. Logo, depois de alguns segundos raciocinando, você percebe que existe uma possibilidade de que todas as entradas sejam apenas condicionais que te levem ao mesmo lugar, o Guardião das condicionais. Mas como se tratava apenas de um pensamento, você entra na caverna com a mensagem de encontrar o Bug Supremo, logo depois de entrar, você percebe que estava certo e já encontra diretamente o tão temido guardião das condicionais, é quando você percebe que é comum que todas as criaturas controladas pelo Bug Supremo conseguem falar:");
    }

    public void InterfaceCreditos() throws InterruptedException {

        Print(
                "Esse jogo foi desenvolvido no primeiro semestre do curso de Analise e Desenvolvimento de Sistemas\n" +
                        "Para ajudar estudantes na area com dificuldade no aprendizado\n" +
                        "Feito na diciplina Projeto Integrador e Logica de Programacao cujo professor Eduardo Takeo");

        Print(
                "Pelos alunos: \n" +
                        "Gabriel Lins\n" +
                        "Gustavo Patriota\n" +
                        "Lucas Freitas\n" +
                        "Renan Telo\n" +
                        "Vinicius Oliveira");

    }

    public void InterfaceInstrucoes() throws InterruptedException {
        String opcao = "";
        LimpaConsole();

        Print("Este é um jogo de RPG, onde você irá poder escolher seu nome, sua classe, " +
                "e a partir de algumas escolhas o jogo pode tomar rumos diferentes a cada vez que for jogado. " +
                "Seguem abaixo as principais instruções do jogo:\n\n" +
                "Instrução número 1:\n" +
                "\nAs mensagens serão demonstradas caractere por caractere. " +
                "A todo momento que acabar os caracteres a serem demonstrados, pressione ENTER para continuar. " +
                "(Realize o teste agora de como isso irá funcionar)");
        Print("Instrução número 2:\n" +
                "\nA escolha do seu nome não interfere em nada no jogo, " +
                "mas a da sua classe sim, ela será baseada na arma que você escolher. " +
                "Cada uma delas dará algum benefício (isso será apresentado no próprio jogo), " +
                "que pode facilitar certas partes do jogo e manter outras mais difíceis.");
        Print("Instrução número 3:\n" +
                "\nDurante o desenvolvimento do jogo, você irá enfrentar criaturas místicas. " +
                "Durante esses combates, você irá atacar e será atacado pela criatura. " +
                "Um desvio ou acerto de ataque será contabilizado a partir de desafios propostos sobre a matéria 'Algoritmos e Programação I'. "
                +
                "Caso acerte a questão, irá dar certo para você; caso erre, irá dar certo para a criatura.");
        Print("Instrução número 4:\n" +
                "\nSobre as questões, serão dois tipos: perguntas com alternativas e perguntas dissertativas. " +
                "As dissertativas exigirão que você escreva, complete ou corrija algumas partes de códigos em Java " +
                "(linguagem utilizada na matéria escolhida neste semestre).");
        Print("Instrução número 5:\n" +
                "\nMUITA ATENÇÃO COM LETRAS MAIÚSCULAS E MINÚSCULAS.\n" +
                "Nas questões alternativas você pode digitar uma letra maiúscula ou minúscula, exemplo 'd' ou 'D', " +
                "o resultado será igual.\n" +
                "Entretanto, em perguntas dissertativas, as questões serão relacionadas a código em Java " +
                "(como já foi informado na instrução 4), e, nesta linguagem de programação, os comandos precisam ser exatamente iguais, "
                +
                "inclusive letras maiúsculas e minúsculas.\n" +
                "Portanto, muita atenção ao responder uma questão dissertativa, você precisará responder exatamente " +
                "como colocaria em um código em uma IDE.");

        do {
            Print(
                    "Agora que você já viu todas as instruções necessárias para jogar, você está pronto para iniciar este RPG.\n"
                            +
                            "O que você deseja fazer? Digite o número da opção desejada\n" +
                            "1 - Jogar o RPG\n" +
                            "2 - Voltar à interface inicial\n" +
                            "3 - Rever as instruções\n" +
                            "4 - Sair do jogo\n\n");

            opcao = System.console().readLine();
            switch (opcao) {
                case "1":
                    Jogar();
                    break;
                case "2":
                    iniciar();
                    break;
                case "3":
                    InterfaceInstrucoes();
                    break;
                case "4":
                    System.out.println("Jogo finalizado.");
                    break;
                default:
                    Print(
                            "A opção que você digitou não estava dentre as possíveis para escolha, ao pressionar ENTER você será redirecionado para a tela com as opções.");
                    break;
            }
        } while (!(opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")));

    }

    public boolean PerguntasArray() throws InterruptedException{
        Random random = new Random();
        int perguntaAleatoria = 0;
        String pergunta = "";
        ArrayList<String> Alternativas = new ArrayList<String>();
        String AlternativaCerta = "";
        perguntaAleatoria = random.nextInt(10) + 1;

        switch(perguntaAleatoria){
            case 1:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "int[] arr = {10, 20, 30};\n" +
                        "System.out.println(arr[arr.length - 1]);";

                Alternativas.add("10");
                Alternativas.add("20");
                Alternativas.add("30");
                Alternativas.add("40");
                Alternativas.add("Erro de execução;");
                AlternativaCerta = "30";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);
                
            case 2:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "int[] arr = {1, 3, 5, 7};\n" +
                        "System.out.println(arr[0] + arr[2]);";

                Alternativas.add("1");
                Alternativas.add("4");
                Alternativas.add("6");
                Alternativas.add("8");
                Alternativas.add("10");
                AlternativaCerta = "6";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 3:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "int[] arr = {1, 3, 5, 7};\n" +
                        "String[] array = {\"1\",\"3\",\"5\",\"7\"}\n" +
                        "System.out.println(arr[0] + arr[2]);";

                Alternativas.add("1");
                Alternativas.add("4");
                Alternativas.add("6");
                Alternativas.add("8");
                Alternativas.add("Erro de compilacao");
                AlternativaCerta = "Erro de compilacao";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 4:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "String[] arr = {1, 3, 5, 7};\n" +
                        "String[] array = {\"1\",\"3\",\"5\",\"7\"};\n" +
                        "System.out.println(arr[0] + array[2]);";

                Alternativas.add("15");
                Alternativas.add("6");
                Alternativas.add("12");
                Alternativas.add("8");
                Alternativas.add("Erro de compilacao");
                AlternativaCerta = "6";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 5:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "List<String> items = new ArrayList<>();\n" +
                        "items.add(\"Caneta\");\n" +
                        "items.add(\"Lapis\");\n" +
                        "items.add(\"Borracha\");\n" +
                        "items.remove(1);\n" +
                        "System.out.println(items);";

                Alternativas.add("[Caneta, Lapis, Borracha]");
                Alternativas.add("[Caneta, Borracha]");
                Alternativas.add("[Lapis, Borracha]");
                Alternativas.add("[Caneta, Borracha, Lapis]");
                Alternativas.add("Lança uma IndexOutOfBoundsException");
                AlternativaCerta = "6";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 6:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "String[] animals = {\"gato\", \"cachorro\", \"passaro\"};" +
                        "System.out.println(Arrays.toString(animals));";

                Alternativas.add("gato cachorro passaro\n");
                Alternativas.add("gato, cachorro, passaro\n");
                Alternativas.add("[gato, cachorro, passaro]\n");
                Alternativas.add("[\"gato\", \"cachorro\", \"passaro\"]\n");
                Alternativas.add("Arrays.toString(animals)\n");
                AlternativaCerta = "[gato, cachorro, passaro]";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 7:
                pergunta = "Como você inicializa um array de inteiros com os valores 10, 20 e 30?\n";

                Alternativas.add("int[] arr = {10, 20, 30};");
                Alternativas.add("int[] arr = new int[3](10, 20, 30);");
                Alternativas.add("int[] arr = new int[3]{10, 20, 30};");
                Alternativas.add("int arr[] = (10, 20, 30);");
                Alternativas.add("int[] arr = {10, 20, 30}");
                AlternativaCerta = "int[] arr = {10, 20, 30};";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 8:
                pergunta = "Como acessar o terceiro elemento de um array chamado nums?\n";

                Alternativas.add("nums(3)");
                Alternativas.add("nums[3]");
                Alternativas.add("nums[2]");
                Alternativas.add("nums.get(2)");
                Alternativas.add("nums[4]");
                AlternativaCerta = "nums[2]";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 9:
                pergunta = "Qual a forma certa para declarar um array de inteiros em Java?\n";

                Alternativas.add("int[] arr = new int[5];");
                Alternativas.add("int arr = new [5]int;");
                Alternativas.add("int arr[] = new array(5);");
                Alternativas.add("array arr = new int[5];");
                Alternativas.add("ArrayList<Integer> array = new Array<Integer>;");
                AlternativaCerta = "int[] arr = new int[5];";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 10:
                pergunta = "O que acontece quando você tenta acessar um índice de array que está fora dos limites em Java?\n";

                Alternativas.add("O compilador gera um erro de compilação.");
                Alternativas.add("O valor padrão do tipo do array é retornado.");
                Alternativas.add("Uma ArrayIndexOutOfBoundsException é lançada em tempo de execução.");
                Alternativas.add("O programa é finalizado imediatamente sem exceções.");
                Alternativas.add("O array cria automaticamente um novo elemento para esse índice.");
                AlternativaCerta = "Uma ArrayIndexOutOfBoundsException é lançada em tempo de execução.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);
                
        }

        return false;
    }

    public boolean validaPergunta(String pergunta, ArrayList<String> Alternativas, String AlternativaCerta) throws InterruptedException{
            Collections.shuffle(Alternativas);

            if (Alternativas.get(0).equals(AlternativaCerta)){
                AlternativaCerta = "a";
            }   else if (Alternativas.get(1).equals(AlternativaCerta)){
                AlternativaCerta = "b";
            }   else if (Alternativas.get(2).equals(AlternativaCerta)){
                AlternativaCerta = "c";
            }   else if (Alternativas.get(3).equals(AlternativaCerta)){
                AlternativaCerta = "d";
            }   else if (Alternativas.get(4).equals(AlternativaCerta)){
                AlternativaCerta = "e";
            }
            
            Print(pergunta + "\n\nA - " + Alternativas.get(0) + "\n" +
                  "B - " + Alternativas.get(1) + "\n" +
                  "C - " + Alternativas.get(2) + "\n" +
                  "D - " + Alternativas.get(3) + "\n" +
                  "E - " + Alternativas.get(4), "Digite agora a alternativa que você acha que é correta:\n\n");
            
            String alternativaEscolhida = System.console().readLine();

            if (alternativaEscolhida.toLowerCase().equals(AlternativaCerta)){
                return true;
            } else {
                return false;
            }
        
    }

    public void PerguntasCondicionais() {

    }

    public void PerguntasLoops() {

    }

    public void LimpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void Print(String mensagem) throws InterruptedException {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(5);
        }
        System.out.println("\n");
        System.console().readLine();
    }

    public void Print(String mensagem, String pergunta) throws InterruptedException {
        limparConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(5);
        }
        System.out.println("\n");
        for (char caractere : pergunta.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(5);
        }
    }

    public void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}