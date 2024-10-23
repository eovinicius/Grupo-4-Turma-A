import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
    public void iniciar() throws InterruptedException {
        while (true) {
            limpaConsole();
            System.out.println("Menu:");
            System.out.println("0 - Jogar");
            System.out.println("1 - Instruções");
            System.out.println("2 - Créditos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = System.console().readLine();
            switch (opcao) {
                case "0":
                    jogar();
                    break;
                case "1":
                    instrucoes();
                    break;
                case "2":
                    creditos();
                    break;
                case "3":
                    print("Jogo finalizado!");
                    return;
                default:
                    print("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void jogar() throws InterruptedException, RuntimeException {
        String nomeJogador;
        String armaEscolhida;
        int vida = 3;
        double vidaDragao = 3;
        double vidaGuardiao = 3;
        casteloInicio();
        print(
                "O Reino de Algoritmópolis, uma terra outrora pacífica e conhecida por suas soluções elegantes e bem-estruturadas, foi abalada pelo caos. O Bug Supremo, entidade corrompida pelas falhas e ineficiências que surgem na lógica dos algoritmos, despertou das profundezas do código esquecido. Com seu exército de criaturas míticas, ele semeia o caos, invadindo o reino e causando erros fatais em sistemas críticos. O rei Syntaxius, mestre da lógica e soberano de Algoritmópolis, observava seu reino ruir aos poucos. As estruturas de dados que antes sustentavam o reino estavam comprometidas, e as funções essenciais do reino não eram mais confiáveis. Desesperado, Syntaxius convoca um herói para derrotar o Bug Supremo e restaurar a ordem em Algoritmópolis. Você, jovem programador, é a única esperança do reino.",
                "Qual é o seu nome? ");

        nomeJogador = System.console().readLine().toUpperCase();
        print("O rei Syntaxius: " + nomeJogador
                + ", O Debugger eu convoco você para uma missão de extrema importância. O Bug Supremo despertou e está causando o caos em Algoritmópolis. Você é a única esperança do reino. Derrote o Bug Supremo e traga a paz de volta para o nosso reino!");
        print(
                "O rei Syntaxius: Antes de partir, você precisará de um equipamento adequado para enfrentar as criaturas do Bug Supremo. Escolha um item para levar consigo: ");

        do {
            print("1 - Espada de Ferro (Vantagem contra criaturas de ARRAYS)\n" +
                    "2 - Cajado de Madeira (Vantagem contra criaturas de ESTRUTURAS DE REPETIÇÃO)\n" +
                    "3 - Arco de Pinho (Vantagem contra criaturas de ESTRUTURAS DE DECISÃO)",
                    "Escolha um item para levar consigo: ");

            armaEscolhida = System.console().readLine();

            switch (armaEscolhida) {
                case "1":
                    print(
                            "Você escolheu a Espada de Ferro. Que ela seja afiada o suficiente para cortar as criaturas de Arrays do Bug Supremo!");
                    break;
                case "2":
                    print(
                            "Você escolheu o Cajado de Madeira. Que ele seja resistente o suficiente para enfrentar as criaturas de Estruturas de Repetição do Bug Supremo!");
                    break;
                case "3":
                    print(
                            "Você escolheu o Arco de Pinho. Que ele seja preciso o suficiente para acertar as criaturas de Estruturas de Decisão do Bug Supremo!");
                    break;
                default:
                    print("Opção inválida. Escolha novamente.");
                    break;
            }

        } while (!(armaEscolhida.equals("1") || armaEscolhida.equals("2") || armaEscolhida.equals("3")));

        print(
                "Após isso, provando sua lealdade ao reino, você junta tudo que julga como necessário para esta missão, saindo logo na manhã do dia seguinte para ir em busca do ser que está colocando seu reino a beira do desmoranamento. ");

        print(
                "Após caminhar por quatro horas ininterruptas pelas vastas planícies de Algoritmópolis, você começa a notar que o terreno ao seu redor está mudando. Os dados, antes organizados em estruturas claras, começam a desmoronar, criando montanhas de informações sem ordem. Quando começa a prestar mais atenção nos dados que estão desorganizados ao seu redor, percebe que se tratam de dados relacioados a repetições. Depois de alguns poucos minutos em uma grande desordem chega uma criatura mística gigantesca, o Dragão dos Loops e, para sua surpresa, apesar de se tratar de uma criatura, ele fala: ");

        print(
                "Dragão dos Arrays: Seus olhos brilham com o caos de índices infinitos enquanto suas garras afiadas procuram destruir toda lógica. Prepare-se, pois cada erro será punido com um ataque fatal!");

        print(
                "Vendo que está vindo uma grande rajada de fogo em sua direção você tenta desviar e contra-atacar com um golpe: ");

        // logica da batalha
        do {
            boolean eCorreta = perguntasArray();
            if (!eCorreta) {
                print("Voce tomou o golpe");
                vida--;
            } else if (armaEscolhida.equals("1")) {
                print("Voce acertou o golpe");
                vidaDragao = vidaDragao - 1.5;
            } else {
                print("Voce acertou o golpe");
                vidaDragao = vidaDragao - 1;
            }
        } while (vida > 0 && vidaDragao > 0);

        if (vida == 0) {
            print("Voce morreu");
            return;
        }

        print(
                "Depois de ter conseguido derrotar uma das poderosas criaturas que o bug supremo controlava, você decide tirar o restante do dia para descansar, pois ela te levou a sua exaustão, de maneira na qual isso acaba se tornando necessário.");

        print(
                "No dia seguinte, você segue sua jornada, que perdura durante 3 dias, que é quando você encontra um local similar a cavernas, com 3 diferentes entradas, onde existe uma mensagem em cada uma se deseja acabar com o reino de algoritmólis entre aqui, na outra se deseja encontrar o bug supremo entre aqui e na última se esta em busca de mais poder, entre aqui. Logo, depois de alguns segundos raciocinando, você percebe que existe uma possibilidade de que todas as entradas sejam apenas condicionais que te levem ao mesmo lugar, o Guardião das condicionais. Mas como se tratava apenas de um pensamento, você entra na caverna com a mensagem de encontrar o Bug Supremo, logo depois de entrar, você percebe que estava certo e já encontra diretamente o tão temido guardião das condicionais, é quando você percebe que é comum que todas as criaturas controladas pelo Bug Supremo conseguem falar:");

        print("Guardião das Condicionais: Eu sou o divisor de caminhos, a bifurcação eterna que decide destinos. Muitos caíram ao tentar entender minhas ramificações, presos em loops sem fim ou em decisões erradas. Se você deseja passar, Debugger, precisará provar que conhece a lógica por trás de cada escolha. Uma condição errada... e sua jornada terminará aqui!");

        print("O Guardião ergue seus braços, que parecem se dividir como múltiplos \"ifs\" e \"elses\", cada movimento emanando uma aura de complexidade crescente.");

        print("Ele lança uma onda de energia obscurecida por operadores lógicos confusos, fazendo com que suas percepções vacilem. Você vê ilusões de múltiplos caminhos e sente que, se não resolver rapidamente as condições corretas, poderá ficar preso em uma série de decisões sem retorno.");

        print("O Guardião continua:\n" +
                "\"Escolha com sabedoria. Verdadeiro ou falso, sim ou não... Cada resposta pode mudar o curso do seu destino.\"");

        do {
            boolean eCorreta = perguntasCondicionais();
            if (!eCorreta) {
                print("Você tomou o golpe!");
                vida--;
            } else if (armaEscolhida.equals("3")) {
                print("Você acertou um golpe crítico!");
                vidaGuardiao = vidaGuardiao - 1.5;
            } else {
                print("Você acertou o golpe!");
                vidaGuardiao = vidaGuardiao - 1;
            }

        } while (vida > 0 && vidaGuardiao > 0);

        if (vida == 0) {
            print("Você morreu.");
            return;
        }

        print("Após derrotar o Guardião das Condicionais, seu corpo massivo se desfaz em linhas de código dispersas, como se cada condição e decisão errada que ele representava estivesse sendo desfeita. A caverna ao seu redor começa a tremer, mas, ao invés de desmoronar, ela se reorganiza em padrões lógicos. Símbolos de if, else, e switch se alinham, como se as escolhas certas tivessem destrancado um novo caminho.\n"
                +
                "\n" +
                "Uma passagem secreta surge, iluminada por símbolos que parecem representar repetições: o símbolo de um loop infinito pisca suavemente, junto de ícones de laços for, while e do-while. Você avança com cautela, sentindo que algo perigoso o espera.");

        print("A passagem leva você a uma vasta câmara, onde o ar parece denso e o tempo, distorcido. Em todos os cantos, frases de código se repetem ininterruptamente, formando ecos perturbadores. À sua frente, uma presença colossal desperta: o Senhor dos Loops Eternos.\n"
                +
                "\n" +
                "Essa criatura é uma personificação do caos que surge de loops descontrolados. Seus braços são como serpentes, girando em círculos e entrelaçando-se, simulando ciclos que não conseguem parar. Seus olhos brilham com variáveis mal-inicializadas e laços sem condição de parada.");
        print("Senhor dos Loops Eternos:\n" +
                "\"Eu sou o ciclo interminável, a repetição sem fim que consome a lógica e aprisiona o tempo! Quem ousa me interromper?\"\n");

        print("Ele ergue suas mãos gigantescas, e o ar ao seu redor começa a girar em padrões hipnóticos, como um loop infinito prestes a sair de controle.\n");
    }

    public void creditos() throws InterruptedException {

        print(
                "Esse jogo foi desenvolvido no primeiro semestre do curso de Analise e Desenvolvimento de Sistemas\n" +
                        "Para ajudar estudantes na area com dificuldade no aprendizado\n" +
                        "Feito na disciplina Projeto Integrador e Logica de Programacao cujo professor Eduardo Takeo");

        print(
                "Pelos alunos: \n" +
                        "Gabriel Lins\n" +
                        "Gustavo Patriota\n" +
                        "Lucas Freitas\n" +
                        "Renan Telo\n" +
                        "Vinicius Oliveira");

    }

    public void instrucoes() throws InterruptedException {
        String opcao = "";
        limpaConsole();

        print("Este é um jogo de RPG, onde você irá poder escolher seu nome, sua classe, " +
                "e a partir de algumas escolhas o jogo pode tomar rumos diferentes a cada vez que for jogado. " +
                "Seguem abaixo as principais instruções do jogo:\n\n" +
                "Instrução número 1:\n" +
                "\nAs mensagens serão demonstradas caractere por caractere. " +
                "A todo momento que acabar os caracteres a serem demonstrados, pressione ENTER para continuar. " +
                "(Realize o teste agora de como isso irá funcionar)");
        print("Instrução número 2:\n" +
                "\nA escolha do seu nome não interfere em nada no jogo, " +
                "mas a da sua classe sim, ela será baseada na arma que você escolher. " +
                "Cada uma delas dará algum benefício (isso será apresentado no próprio jogo), " +
                "que pode facilitar certas partes do jogo e manter outras mais difíceis.");
        print("Instrução número 3:\n" +
                "\nDurante o desenvolvimento do jogo, você irá enfrentar criaturas místicas. " +
                "Durante esses combates, você irá atacar e será atacado pela criatura. " +
                "Um desvio ou acerto de ataque será contabilizado a partir de desafios propostos sobre a matéria 'Algoritmos e Programação I'. "
                +
                "Caso acerte a questão, irá dar certo para você; caso erre, irá dar certo para a criatura.");
        print("Instrução número 4:\n" +
                "\nSobre as questões, serão dois tipos: perguntas com alternativas e perguntas dissertativas. " +
                "As dissertativas exigirão que você escreva, complete ou corrija algumas partes de códigos em Java " +
                "(linguagem utilizada na matéria escolhida neste semestre).");
        print("Instrução número 5:\n" +
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
            print(
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
                    jogar();
                    break;
                case "2":
                    iniciar();
                    break;
                case "3":
                    instrucoes();
                    break;
                case "4":
                    System.out.println("Jogo finalizado.");
                    break;
                default:
                    print(
                            "A opção que você digitou não estava dentre as possíveis para escolha, ao pressionar ENTER você será redirecionado para a tela com as opções.");
                    break;
            }
        } while (!(opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")));

    }

    public boolean perguntasArray() throws InterruptedException {
        Random random = new Random();
        int perguntaAleatoria = 0;
        String pergunta = "";
        ArrayList<String> Alternativas = new ArrayList<String>();
        String AlternativaCerta = "";
        perguntaAleatoria = random.nextInt(10) + 1;

        switch (perguntaAleatoria) {
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
                AlternativaCerta = "[Caneta, Borracha]";
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

    public boolean validaPergunta(String pergunta, ArrayList<String> Alternativas, String AlternativaCerta)
            throws InterruptedException {
        Collections.shuffle(Alternativas);

        if (Alternativas.get(0).equals(AlternativaCerta)) {
            AlternativaCerta = "a";
        } else if (Alternativas.get(1).equals(AlternativaCerta)) {
            AlternativaCerta = "b";
        } else if (Alternativas.get(2).equals(AlternativaCerta)) {
            AlternativaCerta = "c";
        } else if (Alternativas.get(3).equals(AlternativaCerta)) {
            AlternativaCerta = "d";
        } else if (Alternativas.get(4).equals(AlternativaCerta)) {
            AlternativaCerta = "e";
        }

        print(pergunta + "\n\nA - " + Alternativas.get(0) + "\n" +
                "B - " + Alternativas.get(1) + "\n" +
                "C - " + Alternativas.get(2) + "\n" +
                "D - " + Alternativas.get(3) + "\n" +
                "E - " + Alternativas.get(4), "Digite agora a alternativa que você acha que é correta:\n\n");

        String alternativaEscolhida = System.console().readLine();

        if (alternativaEscolhida.toLowerCase().equals(AlternativaCerta)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean perguntasCondicionais() throws InterruptedException {
        Random random = new Random();
        int perguntaAleatoria = 0;
        String pergunta = "";
        ArrayList<String> Alternativas = new ArrayList<String>();
        String AlternativaCerta = "";
        perguntaAleatoria = random.nextInt(10) + 1;

        switch (perguntaAleatoria) {
            case 1:
                pergunta = "Qual a saída do código abaixo:?\n" +
                        "boolean eFimDeSemana = true;\n" +
                        "boolean eFeriado = false;\n" +
                        "if (eFimDeeSemana || eFeriado) {\n" +
                        "    System.out.println(\"Dia de descanso\");\n" +
                        "} else {\n" +
                        "    System.out.println(\"Dia de trabalho\");\n" +
                        "}";
                Alternativas.add("Dia de descanso");
                Alternativas.add("Dia de trabalho");
                Alternativas.add("Nenhuma saída");
                Alternativas.add("O programa gera um erro de compilação");
                Alternativas.add("Dia de feriado;");
                AlternativaCerta = "O programa gera um erro de compilação";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 2:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "int a = 5;\n" +
                        "int b = 15;\n" +
                        "if (a < b) {\n" +
                        "    if (b % a == 0) {\n" +
                        "        System.out.println(\"B é múltiplo de A\");\n" +
                        "    } else {\n" +
                        "        System.out.println(\"B não é múltiplo de A\");\n" +
                        "    }\n" +
                        "} else {\n" +
                        "    System.out.println(\"A não é menor que B\");\n" +
                        "}";

                Alternativas.add("B é múltiplo de A");
                Alternativas.add("B não é múltiplo de A");
                Alternativas.add("A não é menor que B");
                Alternativas.add("Nenhuma saída");
                Alternativas.add("A é igual a B");
                AlternativaCerta = "B é múltiplo de A";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 3:
                pergunta = "Qual a saída do código abaixo?\n" +
                        "\n" +
                        "int num1 = 12;\n" +
                        "int num2 = 18;\n" +
                        "if (num1 % 2 == 0 && num2 % 2 == 0) {\n" +
                        "    System.out.println(\"Ambos são pares\");\n" +
                        "} else if (num1 % 2 != 0 && num2 % 2 != 0) {\n" +
                        "    System.out.println(\"Ambos são ímpares\");\n" +
                        "} else {\n" +
                        "    System.out.println(\"Um é par e o outro é ímpar\");\n" +
                        "}";

                Alternativas.add("Ambos são pares.");
                Alternativas.add("Ambos são ímpares.");
                Alternativas.add("Um é par e o outro é ímpar.");
                Alternativas.add("Nenhuma saída.");
                Alternativas.add("O programa gera um erro.");
                AlternativaCerta = "Ambos são pares.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 4:
                pergunta = "Qual a saída do código abaixo:\n" +
                        "int idade = 30;\n" +
                        "String categoria;\n" +
                        "if (idade < 13) {\n" +
                        "    categoria = \"Criança\";\n" +
                        "} else if (idade < 18) {\n" +
                        "    categoria = \"Adolescente\";\n" +
                        "} else if (idade < 60) {\n" +
                        "    categoria = \"Adulto\";\n" +
                        "} else {\n" +
                        "    categoria = \"Idoso\";\n" +
                        "}\n" +
                        "System.out.println(\"Categoria: \" + categoria);";

                Alternativas.add("Categoria: Criança.");
                Alternativas.add("Categoria: Adolescente.");
                Alternativas.add("Categoria: Adulto.");
                Alternativas.add("Categoria: Idoso.");
                Alternativas.add("Categoria: Nenhuma saída.");
                AlternativaCerta = "Categoria: Adulto.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 5:
                pergunta = "Qual a diferença entre if, else if e else em Java??\n";

                Alternativas
                        .add("if é usado para uma única condição, else if para múltiplas e else é sempre necessário.");
                Alternativas.add(
                        "if é sempre executado, else if é executado se if for falso, e else não pode ter condições.");
                Alternativas.add(
                        "if testa a primeira condição, else if para condições adicionais e else é para o caso final.");
                Alternativas.add(
                        "if pode ser usado apenas com números, else if apenas com strings, e else não pode ser usado com booleanos.");
                Alternativas.add(
                        "if deve ser sempre o último bloco, else if deve ser o primeiro e else não pode existir sem if.");
                AlternativaCerta = "if testa a primeira condição, else if para condições adicionais e else é para o caso final.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 6:
                pergunta = "Como você pode usar uma expressão booleana em uma condição if?\n";

                Alternativas.add("Você deve usar apenas números.");
                Alternativas.add("As expressões booleanas não podem ser usadas em if.");
                Alternativas.add("Você pode usá-las diretamente nas condições.");
                Alternativas.add("Você deve convertê-las em strings primeiro.");
                Alternativas.add("Você só pode usá-las em laços for.");
                AlternativaCerta = "Você pode usá-las diretamente nas condições.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 7:
                pergunta = "Qual é uma limitação do switch em Java?\n";

                Alternativas.add("Ele pode ser usado apenas com números.");
                Alternativas.add("Ele não pode ter default.");
                Alternativas.add("Ele não pode ser usado com strings.");
                Alternativas.add("Ele só pode avaliar uma expressão de tipo int, char, ou String.");
                Alternativas.add("Ele não permite break.");
                AlternativaCerta = "Ele só pode avaliar uma expressão de tipo int, char, ou String.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 8:
                pergunta = "Como usar condicionais aninhadas em Java?\n";

                Alternativas.add("Elas não são suportadas em Java.");
                Alternativas.add("Elas devem ser usadas apenas com switch.");
                Alternativas.add("Você pode usá-las quando uma condição depende de outra.");
                Alternativas.add("Elas são sempre mais lentas do que if simples.");
                Alternativas.add("Elas podem ser usadas apenas em métodos.");
                AlternativaCerta = "Você pode usá-las quando uma condição depende de outra.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 9:
                pergunta = "Qual a saída do código abaixo:\n" +
                        "int  x = 12;\n" +
                        "int y = 20;\n" +
                        "if (x % 2 == 0) {\n" +
                        "    if (y % 3 == 0) {\n" +
                        "System.out.println(\"X é par e Y é múltiplo de 3\");\n" +
                        "} else {\n" +
                        "    System.out.println(\"X é par e Y não é múltiplo de 3\");\n" +
                        " }\n" +
                        " } else {;\n" +
                        "System.out.println(\"X é ímpar\");\n" +
                        "}";

                Alternativas.add("X é ímpar;");
                Alternativas.add("X é par e Y é múltiplo de 3;");
                Alternativas.add("X é par e Y não é múltiplo de 3;");
                Alternativas.add("Nenhuma saída;");
                Alternativas.add("Y é par;");
                AlternativaCerta = "X é par e Y não é múltiplo de 3;";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 10:
                pergunta = "Qual a saída do código abaixo:\n" +
                        "int a = 5;\n" +
                        "int b = 10;\n" +
                        "int c = 15;\n" +
                        "String resultado;\n" +
                        "if (a < b && b < c) {\n" +
                        "    resultado = \"A menor que B e B menor que C\";\n" +
                        "} else if (a > b && b > c) {\n" +
                        "    resultado = \"A maior que B e B maior que C\";\n" +
                        "} else if (a == b || b == c) {\n" +
                        "    resultado = \"A é igual a B ou B é igual a C\";\n" +
                        "} else {\n" +
                        "    resultado = \"Nenhuma das condições\";\n" +
                        "}\n" +
                        "System.out.println(resultado);\n";

                Alternativas.add("A menor que B e B menor que C.");
                Alternativas.add("A maior que B e B maior que C.");
                Alternativas.add("Erro de compilação.");
                Alternativas.add("A é igual a B ou B é igual a C.");
                Alternativas.add("Nenhuma das condições.");
                AlternativaCerta = "A menor que B e B menor que C.";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);
        }
        return false;
    }

    public boolean perguntasLoops() throws InterruptedException {
        Random random = new Random();
        int perguntaAleatoria = 0;
        String pergunta = "";
        ArrayList<String> Alternativas = new ArrayList<String>();
        String AlternativaCerta = "";
        perguntaAleatoria = random.nextInt(10) + 1;

        switch (perguntaAleatoria) {
            case 1:
                pergunta = "Qual é a saída do seguinte código?\n" +

                        "for (int i = 0; i < 5; i++) {\n" +
                        "   System.out.print(i + \" \");\n" +
                        "}\n" +
                        Alternativas.add(" 0 1 2 3 4");
                Alternativas.add("1 2 3 4 5");
                Alternativas.add("0 1 2 3 4 5");
                Alternativas.add("1 2 3 4");
                Alternativas.add("0 1 2 3 4 5 6");
                AlternativaCerta = " 0 1 2 3 4";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 2:
                pergunta = "Qual estrutura de loop é mais adequada para iterar sobre todos os elementos de um array?\n"
                        +

                        Alternativas.add("for");
                Alternativas.add("while");
                Alternativas.add("do-while");
                Alternativas.add("for-each");
                Alternativas.add("if");
                AlternativaCerta = "for-each";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 3:
                pergunta = "Qual é o resultado do seguinte código?\n" +

                        "int sum = 0;\n" +
                        "for (int i = 1; i <= 5; i++) {\n" +
                        "sum += i;\n" +
                        "}\n" +
                        "System.out.println(sum);\n" +

                        Alternativas.add("5");
                Alternativas.add("10");
                Alternativas.add("15");
                Alternativas.add("20");
                Alternativas.add("25");
                AlternativaCerta = "15";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 4:
                pergunta = "O que acontece se a condição de um loop while nunca for verdadeira?\n" +

                        Alternativas.add("O loop executa uma vez");
                Alternativas.add("O loop entra em um loop infinito");
                Alternativas.add("O loop não é executado");
                Alternativas.add("O loop executa indefinidamente");
                Alternativas.add("O loop gera um erro de compilação");
                AlternativaCerta = "O loop não é executado";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 5:
                pergunta = "Qual é a saída do seguinte código?\n" +

                        "int count = 0;\n" +
                        "while (count < 3) {\n" +
                        "System.out.println(\"Hello\");\n" +
                        "count++;\n" +
                        "}\n" +

                        Alternativas.add("Hello Hello Hello");
                Alternativas.add("Hello Hello");
                Alternativas.add("Hello");
                Alternativas.add("Hello Hello Hello Hello");
                Alternativas.add("Nenhuma saída");
                AlternativaCerta = "Hello Hello Hello";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 6:
                pergunta = "O que o seguinte trecho de código imprime?\n" +

                        "for (int i = 0; i < 10; i += 2) {\n" +
                        "System.out.print(i + \" \");\n" +
                        "}\n" +

                        Alternativas.add("0 1 2 3 4 5 6 7 8 9");
                Alternativas.add("0 2 4 6 8");
                Alternativas.add("1 3 5 7 9");
                Alternativas.add("0 1 3 5 7 9");
                Alternativas.add("1 2 3 4 5");
                AlternativaCerta = "0 2 4 6 8";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 7:
                pergunta = "O que ocorre se você usar um break dentro de um loop for?\n";

                Alternativas.add("O loop continua até a última iteração");
                Alternativas.add("O loop é encerrado imediatamente");
                Alternativas.add("O loop reinicia a contagem");
                Alternativas.add("O loop entra em um erro");
                Alternativas.add(" O loop ignora a iteração atual");
                AlternativaCerta = " O loop é encerrado imediatamente ";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 8:
                pergunta = "Qual é a saída do seguinte código?\n" +

                        "for (int i = 0; i < 3; i++) {\n" +
                        "   for (int j = 0; j < 2; j++) {\n" +
                        "   System.out.print(i + j + \" \");\n" +
                        " }\n" +
                        "}\n" +

                        Alternativas.add("0 1 1 2 2 3");
                Alternativas.add(" 0 1 1 2 2 3 3 4");
                Alternativas.add("0 1 2 3 4");
                Alternativas.add("0 1 0 1 1 2");
                Alternativas.add("Nenhuma saída");
                AlternativaCerta = "0 1 1 2 2 3";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 9:
                pergunta = "O que o seguinte código fará?\n" +
                        "int i = 0;\n" +
                        "do {\n" +
                        "System.out.print(i + \" \");\n" +
                        "i++;\n" +
                        "} while (i < 5);\n" +

                        Alternativas.add("Imprime 0 1 2 3 4");
                Alternativas.add("Imprime 1 2 3 4 5");
                Alternativas.add("Imprime 0 1 2 3 4 5");
                Alternativas.add("Imprime 1 2 3 4");
                Alternativas.add("Não imprime nada");
                AlternativaCerta = "Imprime 0 1 2 3 4";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);

            case 10:
                pergunta = "Qual é o propósito do comando continue em um loop?\n" +

                        Alternativas.add("Encerrar o loop");
                Alternativas.add("Ignorar a iteração atual e continuar com a próxima");
                Alternativas.add("Reiniciar o loop");
                Alternativas.add("Interromper a execução do programa");
                Alternativas.add("Criar um novo loop");
                AlternativaCerta = "Ignorar a iteração atual e continuar com a próxima";
                return validaPergunta(pergunta, Alternativas, AlternativaCerta);
        }
        return false;
    }

    public void perguntasBossFinal() {

    }

    public void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void print(String mensagem) throws InterruptedException {
        limpaConsole();
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            System.out.flush();
            Thread.sleep(5);
        }
        System.out.println("\n");
        System.console().readLine();
    }

    public void print(String mensagem, String pergunta) throws InterruptedException {
        limpaConsole();
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

    public void dragaoArray() {

    }

    public void guardiaoCondicional() throws InterruptedException {
        print(
                "            ###1##         #######           \n" +
                        "         ###111##           ##111####        \n" +
                        "      ####1111###            ###1111###1     \n" +
                        "     ###1111####             ####11111###    \n " +
                        "   ###11#1#1####   ##    ##  #####1#1#1###1  \n " +
                        "  ###11#1#11#####  ########  #####1#1##11##1 \n " +
                        " ###11##1#11######  ###### #######1##1##1### \n " +
                        "####1##11##1######################1##1###1###\n " +
                        "###11##11##1#####################1###1###1###\n " +
                        "###1####1###1###################11###1###11##\n " +
                        " ##11###1####1##################1###1####1###\n " +
                        " ###1####1##########################1####1##1\n " +
                        "  ##1########  ###############  ########1### \n " +
                        "   ##1### ##       ########      ##########  \n " +
                        "    ####            ######           ####    \n " +
                        "      ###          ###  ###          ##      \n " +
                        "       ###         #      #         ###      \n ");
    }

    public void dragaoLoops() {

    }

    public void casteloInicio() throws InterruptedException {
        print(
                "                                  |>>>                              \n" +
                        "                                  |                                 \n" +
                        "                    |>>>      _  _|_  _         |>>>                \n" +
                        "                    |        |;| |;| |;|        |                   \n" +
                        "                _  _|_  _    \\\\.    .  /    _  _|_  _               \n" +
                        "               |;|_|;|_|;|    \\\\:. ,  /    |;|_|;|_|;|              \n" +
                        "               \\\\..      /    ||;   . |    \\\\.    .  /              \n" +
                        "                \\\\.  ,  /     ||:  .  |     \\\\:  .  /               \n" +
                        "                 ||:   |_   _ ||_ . _ | _   _||:   |                \n" +
                        "                 ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |                \n" +
                        "                 ||:   ||.    .     .      . ||:  .|                \n" +
                        "                 ||: . || .     . .   .  ,   ||:   |       \\,/      \n" +
                        "                 ||:   ||:  ,  _______   .   ||: , |            /`\\ \n" +
                        "                 ||:   || .   /+++++++\\    . ||:   |                \n" +
                        "                 ||:   ||.    |+++++++| .    ||: . |                \n" +
                        "              __ ||: . ||: ,  |+++++++|.  . _||_   |                \n" +
                        "     ____--`~    '--~~__|.    |+++++__|----~    ~`---,              \n" +
                        "-~--~                   ~---__|,--~'                  ~~----_____-~'\n");
    }

    public void vocePerdeu() throws InterruptedException{
        print(" __      ______   _____ ______   _____  ______ _____  _____  ______ _    _ \n" +
        " \\ \\    / / __ \\ / ____|  ____| |  __ \\|  ____|  __ \\|  __ \\|  ____| |  | |\n" +
        "  \\ \\  / / |  | | |    | |__    | |__) | |__  | |__) | |  | | |__  | |  | |\n" +
        "   \\ \\/ /| |  | | |    |  __|   |  ___/|  __| |  _  /| |  | |  __| | |  | |\n" +
        "    \\  / | |__| | |____| |____  | |    | |____| | \\ \\| |__| | |____| |__| |\n" +
        "     \\/   \\____/ \\_____|______| |_|    |______|_|  \\_\\_____/|______|\\____/ \n" +
        "                                                                          \n" +
        "                                                                          ");
        
    }

    public void voceGanhou() throws InterruptedException{

    }
}