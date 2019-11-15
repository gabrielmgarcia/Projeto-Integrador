package Projeto;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;;

public class ProjetoScript {

    static int dado(int a) {

        a = 1 + (int) (Math.random() * 6);
        return a;

    }
    static int dadoTresLados(int a) {

        a = 1 + (int) (Math.random() * 3);
        return a;

    }

    public static void EscolhaRaca(String raca) {

        if (raca.equalsIgnoreCase("1")) {

            JOptionPane.showMessageDialog(null, "Você escolheu 'Humano' ");

            JOptionPane.showMessageDialog(null,
                    "Facção “Vermelha” \n\n" + "Humanos movidos pelo dinheiro, os comandantes dessa facção buscam \n"
                    + "pelo domínio absoluto para controlar todos pontos econômicos \n"
                    + "do planeta “-B” para buscar melhorias tecnológicas em suas naves.");
        } else {

            JOptionPane.showMessageDialog(null, "Você escolheu 'Extraterrestre' ");

            JOptionPane.showMessageDialog(null,
                    "Facção “Azul”\n\n" + "Extraterrestes ligados aos seus valores, os líderes querem \n"
                    + "retomar o poder completo do planeta e dar \n"
                    + "continuidade ao trabalho feito por seus ancestrais. ");
        }
    }

    public static void EscolhaHumano(String Humano) {

        if (Humano.equalsIgnoreCase("1")) {

            JOptionPane.showMessageDialog(null, "Humano - Cientista\r\n\r\n"
                    + "Após perder sua família na guerra, decidiu juntar-se a um lado para acabar com a infindável guerra.");

            JOptionPane.showMessageDialog(null,
                    "Atributos \n" + "Forca = +1\n" + "Agilidade = +2\r\n" + "Resistência = -1");

        } else {

            JOptionPane.showMessageDialog(null, "Humano-Engenheiro\r\n\r\n"
                    + "Um gênio incompreendido cujo desejo é se tornar o mais renomado estrategista da galáxia.");

            JOptionPane.showMessageDialog(null,
                    "Atributos \n" + "Forca = +1\n" + "Agilidade = -1\n" + "Resistência = +2");
        }

    }

    public static void EscolhaET(String ET) {

        if (ET.equalsIgnoreCase("1")) {

            JOptionPane.showMessageDialog(null, "Extraterrestre - Caçador\r\n\r\n"
                    + "Criatura especialista em rastreamento e combates a longa distância.");

            JOptionPane.showMessageDialog(null,
                    "Atributos \n" + "Forca = +2\n" + "Agilidade = +1\n" + "Resistência = -1");
        } else {

            JOptionPane.showMessageDialog(null,
                    "Extraterrestre - Mercenário\r\n\n" + "Criatura corrupta sedenta por riquezas.");

            JOptionPane.showMessageDialog(null,
                    "Atributos \n" + "Forca = +2\n" + "Agilidade = -2\n" + "Resistência = +1");
        }
    }

    public static void main(String[] args) {
    	  Object  itensMochila;
        String nick;
        String raca;
        String TipoHumano;
        String TipoET;
        String dado2;
        String somaAtributos;
        String opcao = null;
        String escolha;
        int totalSoma2;
        int totalSoma;

        do {
            // menu do jogo
            opcao = JOptionPane.showInputDialog(null, "Bem-vindo ao Jogo “Batalha estelar”\n\n\r"
                    + "Digite:\n\r1 - Instruções\n\r2 - Jogar\n\r3 - Créditos\n\r4 - Sair\n\r");
            if (opcao == null) {
                System.exit(0);
            }

            switch (opcao) {

                case "1":
                    // instruções do jogo
                	 JOptionPane.showMessageDialog(null, "1-	Suas ações são baseadas na soma de seus atributos multiplicado pelo número\n "
	                            + "tirado no dado o número resultante dessa multiplicação é o dano aplicado no inimigo.\r\n" + 
	                              "\r\n" + 
                           	  "2-	Em alguma determinada situação do jogo você será obrigado a escolher entre dois\n "
                           	  + "caminhos, sendo que em um deles você poderá adquirir mais atributos e o outro novas\n"
                           	  + "tecnologias e um modo de jogo diferenciado do padrão, também determinará o caráter do\n "
                           	  + "seu personagem o que será muito importante no decorrer do jogo.\r\n" + 
	                              "\r\n" + 
                                 "3-	Você começará com uma nave padrão e dependendo da raça e classe que escolher isso\n"
                                 + "determinará o quanto mais de atributos essa nave irá receber ou o quanto será retirado\n"
                                 + "também, as batalhas vão deixando sua nave cada vez mais fraca, então é importante tomar\n "
                                 + "cuidado para que sua vida não chegue a zero, caso isso aconteça, será o fim de jogo, algumas\n"
                                 + "batalhas diferenciadas contão também com outras características que caso cheguem a zero \n"
                                 + "será o fim de jogo.\r\n" + 
	                              "\r\n","Como Jogar:",JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    // começo do jogo
                    do {

                        nick = JOptionPane.showInputDialog("Digite seu nick: ");

                        if (nick == null) {
                            System.exit(0);
                        }

                    } while (nick.equalsIgnoreCase(""));

                    JOptionPane.showMessageDialog(null, "Bem vindo " + nick + "!!!");
                    JOptionPane.showMessageDialog(null,
                            "Atributos de sua nave " + nick + "! você já começa com:\n"
                            + "5-Força \n5-Agilidade \n5-Resistência  \n"
                            + "Obs: Não se esqueça de anotar os ganhos e perdas de atributos\n"
                            + "isto será essencial no seu desenvolvimento!!!");
                    // escolha de raça
                    do {
                        raca = JOptionPane
                                .showInputDialog("Digite qual opção desejada:  \n 1-Humano: \n 2-Extraterrestre:");

                        if (raca == null) {
                            System.exit(0);
                        }

                    } while (!raca.equalsIgnoreCase("1") && !raca.equalsIgnoreCase("2"));

                    EscolhaRaca(raca);

                    if (raca.equalsIgnoreCase("1")) {

                        // escolha de classe da raça humano
                        do {
                            TipoHumano = JOptionPane
                                    .showInputDialog("Digite qual opção desejada:  \n 1-Cientista: \n 2-Engenheiro:");

                            if (TipoHumano == null) {
                                System.exit(0);
                            }

                        } while (!TipoHumano.equalsIgnoreCase("1") && !TipoHumano.equalsIgnoreCase("2"));

                        EscolhaHumano(TipoHumano);

                    } else {

                        // escolha de classe da raça extraterreste
                        do {
                            TipoET = JOptionPane
                                    .showInputDialog("Digite qual opção desejada:  \n 1-Caçador: \n 2-Mercenario:");

                            if (TipoET == null) {
                                System.exit(0);
                            }

                        } while (!TipoET.equalsIgnoreCase("1") && !TipoET.equalsIgnoreCase("2"));

                        EscolhaET(TipoET);

                    }

                    // introdução da história
               Path caminho = Paths.get("C:/Users/Gabriel/Desktop/Arquivos Projeto/teste.txt");   
                    try {
                    	byte[] texto = Files.readAllBytes(caminho);
                    	String leitura = new String(texto);
                    	  JOptionPane.showMessageDialog(null,
                                  nick + leitura);                   	
                    } catch(Exception e) {
                    	
                    }
                  

                    JOptionPane.showMessageDialog(null,
                            "Você desperta do que parecia ser um sono profundo, porém percebe que esta deitado no chão \n"
                            + "onde parece ser um deserto, não faz a menor ideia do que está acontecendo, logo se depara de que \n"
                            + "sua cabeça está sangrando, você então estanca o sangramento, não fazendo ideia nem de qual era \n"
                            + "seu próprio nome, você procura em seus bolsos qualquer coisa que o faça lembrar, enfim encontra \n"
                            + "um documento, nele está escrito seu nome " + nick
                            + ", junto deste documento se encontra um "
                            + "emblema \nnele está escrito “General das forças armadas -b-b-b”.");

                    JOptionPane.showMessageDialog(null,
                            "Após uma longa caminhada pelo deserto, você finalmente avista o que parece ser um nave, \n"
                            + "junto dela  uma pessoa, com as vestimentas parecidas com a sua, ao se aproximar esta \npessoa fica "
                            + "totalmente espantada, ele o chama de general, e diz que todos no planeta \nachavam que você estava "
                            + "morto, completamente confuso você explica que não se \nlembra de nada, e pede para que possa lhe "
                            + "lembrar sobre tudo o que estava acontecendo!");

                    JOptionPane.showMessageDialog(null,
                            "Após lembrar-se de seu passado, vocês saem para voltar ao planeta, logo após levantar \n"
                            + "voo, você avista um planeta completamente destruído, e ao se distraírem com ele, a nave é atingida \n"
                            + "por algo, e seu companheiro é obrigado a fazer um pouso forçado, ao olhar o que os atingiu, havia \n"
                            + "uma nave que efetuou mais alguns disparos, por sorte a nave não teve grandes estragos, e ainda \n"
                            + "está funcionando, ao ver que é uma nave inimiga, você então sai com o objetivo de destruí-la... ");

                    int countBatalha01 = 0;
                    int dado3 = 0;

                    do {
                        do {
                            dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                            if (dado2 == null) {
                                System.exit(0);
                            }

                        } while (!dado2.equalsIgnoreCase("1"));
                        dado3 = Integer.parseInt(dado2);
                        dado3 = dado(dado3);

                        do {
                            somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");

                            if (somaAtributos == null) {
                                System.exit(0);
                            }

                        } while (somaAtributos.equalsIgnoreCase(""));

                        totalSoma = Integer.parseInt(somaAtributos);

                        switch (dado3) {

                            case 1:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada. \nVocê teve que recuar. (agilidade-1)");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVocê teve que recuar. (resistência-1)");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Ataque crítico, você adquiriu uma nova tecnologia, defesa contra misseis (resistência+1)");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Ataque crítico, você adquiriu uma nova tecnologia, motor(agilidade+1)");
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Ataque crítico, você adquiriu uma nova tecnologia, escudo (resistência+1)");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Dano de " + (dado3 + totalSoma)
                                        + " Ataque crítico, você adquiriu uma nova tecnologia, metralhadora (força+2)");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, " morreu");
                                break;
                        }

                        countBatalha01++;

                    } while ((dado3 == 1 || dado3 == 2) && countBatalha01 != 3);

                    if (dado3 > 2) {
                        JOptionPane.showMessageDialog(null,
                                "Você destruiu a nave inimiga com sucesso e continuou sua jornada!");
                    } else if (countBatalha01 == 3) {
                        JOptionPane.showMessageDialog(null,
                                "Você não sobreviveu ao ataque da nave inimiga e morreu \n\n Fim de jogo!");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Você não conseguiu destruir a nave inimiga, rode o dado outra vez!");
                    }

                    JOptionPane.showMessageDialog(null,
                            "Logo após a batalha sua nave está no limite e você precisa arrumá-la antes de levantar \n"
                            + "voo novamente!");

                    JOptionPane.showMessageDialog(null,
                            "Então você sai em busca de possíveis ferramentas entre os escombros da nave inimiga abatida, \n"
                            + "logo sem ao menos perceber você está cercado por habitantes locais, que o agradecem e contam sobre \n"
                            + "a terrível história que levou a destruição daquele planeta... \n"
                            + "Aparentemente existe uma raça que se considera superior as outras, e que está dominando planetas \n"
                            + "e escravizando a população, extremamente perturbado com o que você acaba de ouvir, você promete a \n"
                            + "esses habitantes que fará algo sobre isso... \n"
                            + "Então seus aliados lhe contam sobre o coliseu, onde o líder inimigo usa o pressuposto de que isso os \n"
                            + "tornará mais fortes, assim ele sempre oferece uma alta recompensa para quem vencer este torneio, \n"
                            + "que é a devolução do planeta para a raça vencedora");

                    // JOptionPane.showMessageDialog( null,"");
                    do {

                        escolha = JOptionPane.showInputDialog(null, "Você pode:\r\n\n"
                                + "1 - Entrar nesse torneio, tentar a sorte e vencer todos os desafios, porém... \n"
                                + "Pode ser um caminho sem volta, por conta do imenso perigo!\r\n\n"
                                + "2 - Você pode investigar mais a fundo sobre essa raça inimiga e tentar destruir \n"
                                + "a sua influência!\r\n\n");

                        if (escolha == null) {
                            System.exit(0);
                        }

                    } while ((escolha.equalsIgnoreCase("1") && escolha.equalsIgnoreCase("2")) || escolha.equalsIgnoreCase(""));

                    // int countBatalha02 = 0;
                    if (escolha.equalsIgnoreCase("1")) {

                        // começo historia coliseu
                        JOptionPane.showMessageDialog(null, "Chegando ao coliseu você é barrado por guardas. Você faz o \n"
                                + "contato com eles informando que deseja falar com o seu líder... que deseja lutar no coliseu \n"
                                + "após isso eles te conduzem ao líder, então após aceitar o desafio o líder dos “nome da raça” \n"
                                + "convoca seus melhores guerreiros para enfrentar você em 4 batalhas.");

                        JOptionPane.showMessageDialog(null,
                                "Lembre-se de que sua nave tem ponto de vida e combustivel limitado, errar não é uma opção...");
                        JOptionPane.showMessageDialog(null,
                                "O primeiro guerreiro é um oficial de brigada, sua nave é bem robusta, mas em compensação não é muito ágil.");

                        int Perso[] = {100, 100};
                        int vIni1[] = {150};

                        JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + "\nCombustivel = " + Perso[1]
                                + "\nPontos de vida do inimigo = " + vIni1[0]);

                        do {
                            // primeira batalha do coliseu

                            do {
                                dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                            } while (!dado2.equalsIgnoreCase("1"));
                            dado3 = Integer.parseInt(dado2);
                            dado3 = dado(dado3);

                            do {
                                somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
                            } while (somaAtributos.equalsIgnoreCase(""));

                            totalSoma = Integer.parseInt(somaAtributos);

                            totalSoma2 = dado3 * totalSoma;

                            switch (dado3) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                            + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
                                    Perso[0] -= 5;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                            + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
                                    Perso[0] -= 5;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Dano insuficiente ");
                                    vIni1[0] -= totalSoma2;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque forte ");
                                    vIni1[0] -= totalSoma2;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                    vIni1[0] -= totalSoma2;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                    vIni1[0] -= totalSoma2;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, " morreu");
                                    break;
                            }

                            Perso[1] -= 5;

                            if (vIni1[0] < 0) {

                                vIni1[0] = 0;
                            }
                            if (Perso[0] < 0) {

                                Perso[0] = 0;
                            } else if (Perso[1] < 0) {

                                Perso[1] = 0;

                            }

                            JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + " \nCombustivel = " + Perso[1]
                                    + "\nPontos de vida do inimigo = " + vIni1[0]);

                        } while (vIni1[0] > 0 && Perso[0] > 0 && Perso[1] > 0);

                        if (vIni1[0] <= 0) {

                            int vIni2[] = {200};

                            JOptionPane.showMessageDialog(null, "Parabéns! Você derrotou o primeiro inimigo!");

                            JOptionPane.showMessageDialog(null,
                                    "O segundo guerreiro é um ex prisioneiro que foi capturado pelos \n"
                                    + "“nome da raça” e vem sendo treinado intensamente para aniquilar seus inimigos, \n"
                                    + "seu poder de fogo é muito grande.");

                            JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + "\nCombustivel = " + Perso[1]
                                    + "\nPontos de vida do inimigo = " + vIni2[0]);

                            do {
                                // segunda batalha do coliseu

                                do {
                                    dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                } while (!dado2.equalsIgnoreCase("1"));
                                dado3 = Integer.parseInt(dado2);
                                dado3 = dado(dado3);

                                do {
                                    somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
                                } while (somaAtributos.equalsIgnoreCase(""));

                                totalSoma = Integer.parseInt(somaAtributos);

                                totalSoma2 = dado3 * totalSoma;

                                switch (dado3) {

                                    case 1:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
                                        Perso[0] -= 7;
                                        break;
                                    case 2:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
                                        Perso[0] -= 7;
                                        break;
                                    case 3:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Dano insuficiente ");
                                        Perso[0] -= 7;
                                        break;
                                    case 4:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque forte ");
                                        vIni2[0] -= totalSoma2;
                                        break;
                                    case 5:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                        vIni2[0] -= totalSoma2;
                                        break;
                                    case 6:
                                        JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                        vIni2[0] -= totalSoma2;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, " morreu");
                                        break;
                                }
                                Perso[1] -= 7;

                                if (vIni2[0] < 0) {

                                    vIni2[0] = 0;
                                }
                                if (Perso[0] < 0) {

                                    Perso[0] = 0;
                                } else if (Perso[1] < 0) {

                                    Perso[1] = 0;

                                }

                                

                                JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + " \nCombustivel = " + Perso[1]
                                        + "\nPontos de vida do inimigo = " + vIni2[0]);

                            } while (vIni2[0] > 0 && Perso[0] > 0 && Perso[1] > 0);

                            if (vIni2[0] <= 0) {

                                int vIni3[] = {250};

                                JOptionPane.showMessageDialog(null, "Parabéns! Você derrotou o segundo inimigo!");

                                JOptionPane.showMessageDialog(null,
                                        "Seu terceiro oponente será um oficial de alto escalão, \n"
                                        + "ele já foi reconhecido várias vezes por sua eficiência em aniquilação \n"
                                        + "de seus inimigos.");

                                JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + "\nCombustivel = " + Perso[1]
                                        + "\nPontos de vida do inimigo = " + vIni3[0]);

                                do {
                                    // terceira batalha do coliseu

                                    do {
                                        dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                    } while (!dado2.equalsIgnoreCase("1"));
                                    dado3 = Integer.parseInt(dado2);
                                    dado3 = dado(dado3);

                                    do {
                                        somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
                                    } while (somaAtributos.equalsIgnoreCase(""));

                                    totalSoma = Integer.parseInt(somaAtributos);

                                    totalSoma2 = dado3 * totalSoma;

                                    switch (dado3) {

                                        case 1:
                                            JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                    + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
                                            Perso[0] -= 9;
                                            break;
                                        case 2:
                                            JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                    + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
                                            Perso[0] -= 9;
                                            break;
                                        case 3:
                                            JOptionPane.showMessageDialog(null,
                                                    "Dano de " + totalSoma2 + " Dano insuficiente ");
                                            Perso[0] -= 9;
                                            break;
                                        case 4:
                                            JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque forte ");
                                            vIni3[0] -= totalSoma2;
                                            break;
                                        case 5:
                                            JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                            vIni3[0] -= totalSoma2;
                                            break;
                                        case 6:
                                            JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
                                            vIni3[0] -= totalSoma2;
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null, " morreu");
                                            break;
                                    }
                                    Perso[1] -= 9;

                                    if (vIni3[0] < 0) {

                                        vIni3[0] = 0;
                                    }
                                    if (Perso[0] < 0) {

                                        Perso[0] = 0;
                                    } else if (Perso[1] < 0) {

                                        Perso[1] = 0;

                                    }

                                    

                                    JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + " \nCombustivel = "
                                            + Perso[1] + "\nPontos de vida do inimigo = " + vIni3[0]);

                                } while (vIni3[0] > 0 && Perso[0] > 0 && Perso[1] > 0);

                                if (vIni3[0] <= 0) {

                                    int vIni4[] = {300};

                                    JOptionPane.showMessageDialog(null, "Parabéns! Chegou ao último inimigo!");

                                    JOptionPane.showMessageDialog(null,
                                            "O Quarto oponente é o próprio líder dos “nome da raça” sua \n "
                                            + "nave é extremamente poderosa, sendo superior a todas as outras de sua raça.");

                                    JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + "\nCombustivel = "
                                            + Perso[1] + "\nPontos de vida do inimigo = " + vIni4[0]);

                                    do {
                                        // última batalha do coliseu

                                        do {
                                            dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                        } while (!dado2.equalsIgnoreCase("1"));
                                        dado3 = Integer.parseInt(dado2);
                                        dado3 = dado(dado3);

                                        do {
                                            somaAtributos = JOptionPane
                                                    .showInputDialog("Digite o total de seus atributos: ");
                                        } while (somaAtributos.equalsIgnoreCase(""));
                                        totalSoma = Integer.parseInt(somaAtributos);

                                        totalSoma2 = dado3 * totalSoma;

                                        switch (dado3) {

                                            case 1:
                                                JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                        + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
                                                Perso[0] -= 11;
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
                                                        + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
                                                Perso[0] -= 11;
                                                break;
                                            case 3:
                                                JOptionPane.showMessageDialog(null,
                                                        "Dano de " + totalSoma2 + " Dano insuficiente ");
                                                Perso[0] -= 11;
                                                break;
                                            case 4:
                                                JOptionPane.showMessageDialog(null,
                                                        "Dano de " + totalSoma2 + " Ataque forte ");
                                                vIni4[0] -= totalSoma2;
                                                break;
                                            case 5:
                                                JOptionPane.showMessageDialog(null,
                                                        "Dano de " + totalSoma2 + " Ataque crítico ");
                                                vIni4[0] -= totalSoma2;
                                                break;
                                            case 6:
                                                JOptionPane.showMessageDialog(null,
                                                        "Dano de " + totalSoma2 + " Ataque crítico ");
                                                vIni4[0] -= totalSoma2;
                                                break;

                                            default:
                                                JOptionPane.showMessageDialog(null, " morreu");
                                                break;
                                        }
                                        Perso[1] -= 11;

                                        if (vIni4[0] < 0) {

                                            vIni4[0] = 0;
                                        }
                                        if (Perso[0] < 0) {

                                            Perso[0] = 0;
                                        } else if (Perso[1] < 0) {

                                            Perso[1] = 0;

                                        }

                                        

                                        JOptionPane.showMessageDialog(null, "Pontos de vida = " + Perso[0] + " \nCombustivel = "
                                                + Perso[1] + "\nPontos de vida do inimigo = " + vIni4[0]);

                                    } while (vIni4[0] > 0 && Perso[0] > 0 && Perso[1] > 0);

                                    if (vIni4[0] <= 0) {

                                        JOptionPane.showMessageDialog(null, "Parabéns! Você passou pelo coliseu.");

                                    } else if (Perso[0] <= 0 || Perso[1] <= 0) {

                                        JOptionPane.showMessageDialog(null,
                                                "Você não sobreviveu à batalha e sua nave foi destruída. \n\nFim de jogo!");
                                        break;
                                    }

                                } else if (Perso[0] <= 0 || Perso[1] <= 0) {

                                    JOptionPane.showMessageDialog(null,
                                            "Você não sobreviveu à batalha e sua nave foi destruída. \n\nFim de jogo!");
                                    break;
                                }

                            } else if (Perso[0] <= 0 || Perso[1] <= 0) {

                                JOptionPane.showMessageDialog(null,
                                        "Você não sobreviveu à batalha e sua nave foi destruída. \n\nFim de jogo!");
                                break;
                            }

                        } else if (Perso[0] <= 0 || Perso[1] <= 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Você não sobreviveu à batalha e sua nave foi destruída. \n\nFim de jogo!");
                            break;
                        }

                        // final batalhas do coliseu
                    } else {
                        // segunda escolha busca por tecnologias **Começo**
                        JOptionPane.showMessageDialog(null,
                                "Você continua a sua saga pela busca de informações do inimigo");
                        JOptionPane.showMessageDialog(null,
                                "Entre os habitantes, havia um que por não concordar com os métodos feitos \n "
                                + "pelo seu líder, acabou mudando de lado, e em sua fuga levou consigo alguns documentos, ele o entrega \n"
                                + "esses documentos, que são um mapa, nele está especificado uma rota que mostrava um caminho para o \n"
                                + "centro das forças inimigas.... E junto com esse documento também está um dispositivo feito por ele \n"
                                + "que corta o sinal de comunicação entre os guardas com o resto do planeta!");

                        JOptionPane.showMessageDialog(null,
                                "Sua missão é se infiltrar e descobrir mais sobre os inimigos!\n"
                                + "\n"
                               + "Você sai em sua jornada, e a informação obtida é de que os guardas são guardiões \n"
                                + " eles são a patente mais alta da divisão de defesa do exército inimigo, não será \n"
                                + "fácil derrota-los...  ");
                        JOptionPane.showMessageDialog(null,
                                "Ao se aproximar , você ativa o dispositivo para cortar o sinal, porém logo é notado... \n "
                                + "a nave tem 100 pontos de vida");

                        // Pontos de vida do personagem e da nave inimiga
                        int vidaNave[] = {100};
                        int naveInimiga[] = {100};
                        JOptionPane.showMessageDialog(null, "Pontos de vida = " + vidaNave[0] + "\nNave inimiga = " + naveInimiga[0]);

                        do {

                            do {
                                dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                            } while (!dado2.equalsIgnoreCase("1"));
                            dado3 = Integer.parseInt(dado2);
                            dado3 = dado(dado3);

                            somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos ");
                            totalSoma = Integer.parseInt(somaAtributos);
                            int dano = dado3 * totalSoma;
                            switch (dado3) {
                                // decidir as opcoes **começo**

                                case 1:
                                    JOptionPane.showMessageDialog(null, "Dano de " + (dano - 5)
                                            + " Você errou o ataque!!");
                                    vidaNave[0] -= 15;
                                    naveInimiga[0] -= dano;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Dano de " + (dano - 5)
                                            + " ataque muito fraco!!");
                                    vidaNave[0] -= 15;
                                    naveInimiga[0] -= dano;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null,
                                            "Dano de " + dano + " Ataque forte!!");
                                    naveInimiga[0] -= dano;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Dano de " + dano
                                            + " Ataque forte!!");

                                    naveInimiga[0] -= dano;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null,
                                            "Dano de " + dano + " Ataque crítico!!");

                                    naveInimiga[0] -= dano;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null,
                                            "Dano de " + dano + " Ataque crítico!!");

                                    naveInimiga[0] -= dano;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, " morreu");
                                    break;

                            }

                            if (naveInimiga[0] < 0) {
                            	naveInimiga[0] = 0;
                                JOptionPane.showMessageDialog(null, " Pontos de vida = " + vidaNave[0]
                                        + "\nVida do inimigo = " + naveInimiga[0]);
                            } else {
                                JOptionPane.showMessageDialog(null, " Pontos de vida = " + vidaNave[0]
                                        + "\nVida do inimigo = " + naveInimiga[0]);
                            }

                        } while (naveInimiga[0] > 0 && vidaNave[0] > 0);

                        if (naveInimiga[0] <= 0) {
                            JOptionPane.showMessageDialog(null, "Você derrotou o inimigo!");
                            JOptionPane.showMessageDialog(null,
                                    "Você adquiriu uma arma de mão... uma pistola a lazer muito usada em batalhas terrestres");
                        } else if (vidaNave[0] <= 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!");
                            break;
                        } else {

                            JOptionPane.showMessageDialog(null,
                                    "Você não conseguiu destruir a nave inimiga, rode o dado outra vez!");
                        }

                        JOptionPane.showMessageDialog(null,
                                "Você está dentro do centro nervoso do quartel general dos inimigos, agora precisa reunir mais \n"
                                + "informação sobre eles, você esconde sua nave e está apenas com uma arma (com a qual ainda não \n"
                                + "possui muita habilidade) percebe então que esta sendo vigiado enquanto caminha, e uma espécie \n"
                                + "de ciclope da raça dos otaidi  entra em seu caminho... ele já sabe que você é um invasor, e puxa \n"
                                + "uma arma e atira contra você, por sua sorte ele também parece não ter uma boa mira....\n"
                                + "porém os ciclopes são extremamente altos e sua força física e vital são incomparaveis",
                                "Introdução", JOptionPane.INFORMATION_MESSAGE);

                        int vidaPersonagem[] = {100};
                        int vidaCiclope[] = {200};

                        JOptionPane.showMessageDialog(null,
                                "Sua vida =" + vidaPersonagem[0] + "\nVida Ciclope = " +  vidaCiclope[0], "Informações",
                                JOptionPane.INFORMATION_MESSAGE);

                        // segunda batalha ***começo***
                        int danoPistola = 15;
                        do {

                            do {
                                dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                            } while (!dado2.equalsIgnoreCase("1"));
                            dado3 = Integer.parseInt(dado2);
                            dado3 = dado(dado3);

                         
                            int dano = danoPistola * dado3;
                            switch (dado3) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, " Você errou o tiro, e sofreu um dano");
                                    vidaPersonagem[0] -= 15;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null,
                                            " Você errou o tiro quase o acertando, e sofreu um dano");
                                    vidaPersonagem[0] -= 10;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null,
                                            "Você acertou um tiro, mas ainda não atingiu um ponto vital \n" + "Dano de "
                                            + dano);
                                    vidaCiclope[0] -= dano;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null,
                                            "Você acertou um tiro, não atingiu um ponto vital mas passou muito próximo \n"
                                            + "Dano de " + dano);
                                    vidaCiclope[0] -= dano;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Você acertou um ponto vital\n" + "Dano de " + dano);

                                    vidaCiclope[0] -= dano;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null,
                                            "Você acertou um ponto vital, tirando um boa parte da vida do ciclope \n"
                                            + "Dano de " + dano);

                                    vidaCiclope[0] -= dano;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, " morreu");
                                    break;

                            }

                            if ( vidaCiclope[0] < 0) {
                            	 vidaCiclope[0] = 0;
                                JOptionPane.showMessageDialog(null, " Pontos de vida = " + vidaPersonagem[0]
                                        + "\nVida do inimigo = " +  vidaCiclope[0]);
                            } else {
                                JOptionPane.showMessageDialog(null, " Pontos de vida = " + vidaPersonagem[0]
                                        + "\nVida do inimigo = " +  vidaCiclope[0]);
                            }

                        } while ( vidaCiclope[0] > 0 && vidaPersonagem[0] > 0);

                        if ( vidaCiclope[0] <= 0) {
                            JOptionPane.showMessageDialog(null, "Você derrotou o inimigo!");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!");
                            break;
                        } 
                        
                        // segunda batalha ***fim***
                        String mochila [] = new String[4];
                       
                        JOptionPane.showMessageDialog(null,
                                "Você fica preocupado que está batalha tenha causado muito barulho, então rapidamente\n"
                                + "entra na sala mais próxima para não ser notado, e ao se virar da de cara com uma sala\n"
                                + " cheia de armamento e kits de primeiro socorros...Você vê uma mochila, porem ela só tem\n "
                                + "espaço para mais uma arma e 2 kits, você pega esses kits e uma sniper que sera muito util" + " ",
                                "Item", JOptionPane.INFORMATION_MESSAGE);
                        
                        JOptionPane.showMessageDialog( null,"A sniper só pode ser usada em ataques de longa distancia\n"
                        									+ "e só no primeiro ataque... seu ataque critico, pode até ser um HK"+ " ","OBs",JOptionPane.INFORMATION_MESSAGE );
                        
                    	for(int i = 0;i<mochila.length;i++) {
                     		
                     		
                     		if(mochila[i] == null) {
                     		mochila[i] = "'Vazio'";
                     	 		 
                     		}
                     		
                     	}
                        
                        mochila[0] = "Pistola";
                        mochila[1] ="Sniper";
                        mochila[2]= "kit de primeiros socorros";
                        mochila[3]= "kit de primeiros socorros";
                      
                                            
                          if(vidaPersonagem[0] <= 80) {
                        	  
                        	  escolha =  JOptionPane.showInputDialog("Você deseja verificar se ainda tem kit medico na mochila? \n Digite 'sim' ou 'não");
                        	 if(escolha.equalsIgnoreCase("sim")) {
                        		  itensMochila = JOptionPane.showInputDialog(null,"Mochila","Escolha", JOptionPane.INFORMATION_MESSAGE, 
                         	             null, mochila, mochila[0]); 
                        		  if(itensMochila.equals("kit de primeiros socorros")) {
                        			  vidaPersonagem[0] += 20;
                             		 mochila[3] = "'Vazio'"; 
                             		 JOptionPane.showMessageDialog(null, " Pontos de vida = " + vidaPersonagem[0]);
                             		 
                        		  }
                        		  
                        		  else {
                        			  JOptionPane.showMessageDialog(null, " Opção invalida" );
                        		  }                       		                         		
                        	 }           	  
                          }
                          
                          
                          JOptionPane.showMessageDialog( null,"Dois seguranças chegam ao local e você tem que elimina-los...\n"
                          		                            + "ecolha sua arma");
                         
                          itensMochila = JOptionPane.showInputDialog(null,"Mochila","Escolha", JOptionPane.INFORMATION_MESSAGE, 
                  	             null, mochila, mochila[0]); 
                          
                          int danoSniper = 30;
                          int vidaSegurancas[] = {100,100};
                          if(itensMochila.equals("Sniper")) {
                        	   JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                             		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                        		 do {
                                     dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                 } while (!dado2.equalsIgnoreCase("1"));
                                 dado3 = Integer.parseInt(dado2);
                                dado3 = dadoTresLados(dado3);
                                 
                              int dano = (dado3*danoSniper)+10;
                                                         
                              switch (dado3) {
                                                       
							case 1:
								  JOptionPane.showMessageDialog(null, " Você errou o tiro e os guardas revidaram ");
								  vidaPersonagem[0]-=10;
								  
								break;
							case 2:
								  JOptionPane.showMessageDialog(null, "Dano " +dano+ " Voce acertou o tiro porém não foi o suficiente para matalos");
								  vidaSegurancas[0]-=dano;
								  break;
							case 3:
								  JOptionPane.showMessageDialog(null, "Dano " +dano+ " Critico, voce matou o primeiro segurança");
								  vidaSegurancas[0]-=dano;
								  break;
								  
							default: System.out.println("erro1");
								
							}
                           JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                           	  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                            mochila[1] = "'Vazio'";
                              
                              if(vidaSegurancas[0] <=0) {
                            	  vidaSegurancas[0] = 0;
                            	  JOptionPane.showMessageDialog(null, "Você matou um segurança... resta apenas 1\n"
                            	  		+ "escolha sua arma");
                            	   itensMochila = JOptionPane.showInputDialog(null,"Mochila","Escolha", JOptionPane.INFORMATION_MESSAGE, 
                            	             null, mochila, mochila[0]); 
                            	   
                            	   if(itensMochila.equals("Pistola")) {
                            		   JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                      		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                            		   do {  
                            			 do {
                                             dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                         } while (!dado2.equalsIgnoreCase("1"));
                                         dado3 = Integer.parseInt(dado2);
                                         dado3 = dado(dado3);
                                         
                                      int danoBatalhaSegurancas = (dado3*danoPistola)+10;
                                  
                                      switch(dado3) {
                                      	
                                      case 1:
                                    	  JOptionPane.showMessageDialog(null, "Você errou o tiro e recebeu um dano");
                                    	  vidaPersonagem[0]-=15;
                                    	  break;
                                      case 2:
                                    	  JOptionPane.showMessageDialog(null, "Você acertou o segurança, porem ele contra-atacou");
                                    	  vidaPersonagem[0]-=10;
                                    	  vidaSegurancas[1]-=10;
                                    	  break;
                                      case 3:
                                    	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +"Moderado");
                                    	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                    	  break;
                                      case 4:
                                    	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +"forte");
                                    	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                    	  break;
                                      case 5:
                                    	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +"critico");
                                    	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                    	  break;
                                      case 6:
                                    	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +"Tiro na cabeça");
                                    	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                    	  break;
  
                                      }
                                   
                                      
                                      if(vidaSegurancas[1] <= 0) {
                                    		vidaSegurancas[1] = 0;
                                    		  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                              		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                    		
                                    	}
                                      else {
                                    	  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                          		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                      }
                                      
                                    }while(vidaSegurancas[1]>0 && vidaPersonagem[0]>0);
                                    	
                            		   if(vidaSegurancas[1] == 0) {
                            			   JOptionPane.showMessageDialog(null," Parabéns!!! Você matou o segurança");
                            			   
                            		   }
                            		   else {
                                           JOptionPane.showMessageDialog(null,
                                                   "Você não sobreviveu ao ataque \nFim de jogo!");
                                           break;
                                       } 
                            		   
                            	   }
                              }
                           
                            
                              else {
                            	  
                            	  
                            	  JOptionPane.showMessageDialog(null, "escola sua arma... ainda tem muita batalha pela frente");
                            	   itensMochila = JOptionPane.showInputDialog(null,"Mochila","Escolha", JOptionPane.INFORMATION_MESSAGE, 
                            	             null, mochila, mochila[0]); 
                            	   
                            	   
                            	   if(itensMochila.equals("Pistola")) {
                                   	   JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                        		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                              		   do {  
                              			 do {
                                               dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                           } while (!dado2.equalsIgnoreCase("1"));
                                           dado3 = Integer.parseInt(dado2);
                                           dado3 = dado(dado3);
                                           
                                        int danoBatalhaSegurancas = (dado3*danoPistola)+10;
                                    
                                        switch(dado3) {
                                        	
                                        case 1:
                                      	  JOptionPane.showMessageDialog(null, "Você errou o tiro e recebeu um dano");
                                      	  vidaPersonagem[0]-=15;
                                      	  break;
                                        case 2:
                                      	  JOptionPane.showMessageDialog(null, "Você acertou um dos seguranças, e os dois contra atacaram");
                                      	  vidaPersonagem[0]-=20;
                                      	  vidaSegurancas[0]-=10;
                                      	  break;
                                        case 3:
                                      	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Moderado");
                                      	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                                      	  break;
                                        case 4:
                                      	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" forte");
                                      	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                                      	  break;
                                        case 5:
                                      	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" critico");
                                      	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                                      	  break;
                                        case 6:
                                      	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Tiro na cabeça");
                                      	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                                      	  break;

                                        }
                                       
                                        
                                        if(vidaSegurancas[0] <= 0) {
                                      		vidaSegurancas[0] = 0;
                                      		  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                                		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                      		
                                      	}
                                        else {
                                      	  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                            		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                        }
                                        
                                      }while(vidaSegurancas[0]>0 && vidaPersonagem[0]>0);
                              		   
                              		   if(vidaSegurancas[0] == 0){
                              			  JOptionPane.showMessageDialog(null," Voce derrotou um dos seguranças, ainda falta um");
                              			   
                              		   }
                              		 else {
                                         JOptionPane.showMessageDialog(null,
                                                 "Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!");
                                         break;
                                     } 
                            		   do {  
                                			 do {
                                                 dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                             } while (!dado2.equalsIgnoreCase("1"));
                                             dado3 = Integer.parseInt(dado2);
                                             dado3 = dado(dado3);
                                             
                                          int danoBatalhaSegurancas = (dado3*danoPistola)+10;
                                      
                                          switch(dado3) {
                                          	
                                          case 1:
                                        	  JOptionPane.showMessageDialog(null, "Você errou o tiro e recebeu um dano");
                                        	  vidaPersonagem[0]-=15;
                                        	  break;
                                          case 2:
                                        	  JOptionPane.showMessageDialog(null, "Você acertou o segurança, porem ele contra-atacou");
                                        	  vidaPersonagem[0]-=10;
                                        	  vidaSegurancas[1]-=10;
                                        	  break;
                                          case 3:
                                        	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Moderado");
                                        	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                        	  break;
                                          case 4:
                                        	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" forte");
                                        	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                        	  break;
                                          case 5:
                                        	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" critico");
                                        	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                        	  break;
                                          case 6:
                                        	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Tiro na cabeça");
                                        	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                                        	  break;

                                          }
                                       
                                          
                                          if(vidaSegurancas[1] <= 0) {
                                        		vidaSegurancas[1] = 0;
                                        		  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                                  		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                        		
                                        	}
                                          else {
                                        	  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                              		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                                          }
                                          
                                        }while(vidaSegurancas[1]>0 && vidaPersonagem[0]>0);
                                        	
                                		   if(vidaSegurancas[1] == 0) {
                                			   JOptionPane.showMessageDialog(null," Parabéns!!! Você matou o segurança");
                                			   
                                		   }
                                		   else {
                                               JOptionPane.showMessageDialog(null,
                                                       "Você não sobreviveu ao ataque \nFim de jogo!");
                                               break;
                                           }    
                                      }
                              }

                          }
                          else if(itensMochila.equals("Pistola")) {
                       	   JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                            		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                  		   do {  
                  			 do {
                                   dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                               } while (!dado2.equalsIgnoreCase("1"));
                               dado3 = Integer.parseInt(dado2);
                               dado3 = dado(dado3);
                               
                            int danoBatalhaSegurancas = (dado3*danoPistola)+10;
                        
                            switch(dado3) {
                            	
                            case 1:
                          	  JOptionPane.showMessageDialog(null, "Você errou o tiro e recebeu um dano");
                          	  vidaPersonagem[0]-=15;
                          	  break;
                            case 2:
                          	  JOptionPane.showMessageDialog(null, "Você acertou um dos seguranças, e os dois contra atacaram");
                          	  vidaPersonagem[0]-=20;
                          	  vidaSegurancas[0]-=10;
                          	  break;
                            case 3:
                          	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Moderado");
                          	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                          	  break;
                            case 4:
                          	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" forte");
                          	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                          	  break;
                            case 5:
                          	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" critico");
                          	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                          	  break;
                            case 6:
                          	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Tiro na cabeça");
                          	  vidaSegurancas[0]-=danoBatalhaSegurancas;
                          	  break;

                            }
                           
                            
                            if(vidaSegurancas[0] <= 0) {
                          		vidaSegurancas[0] = 0;
                          		  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                    		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                          		
                          	}
                            else {
                          	  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                            }
                            
                          }while(vidaSegurancas[0]>0 && vidaPersonagem[0]>0);
                  		   
                  		   if(vidaSegurancas[0] == 0){
                  			  JOptionPane.showMessageDialog(null," Voce derrotou um dos seguranças, ainda falta um");
                  			   
                  		   }
                  		 else {
                             JOptionPane.showMessageDialog(null,
                                     "Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!");
                             break;
                         }
                		   do {  
                    			 do {
                                     dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

                                 } while (!dado2.equalsIgnoreCase("1"));
                                 dado3 = Integer.parseInt(dado2);
                                 dado3 = dado(dado3);
                                 
                              int danoBatalhaSegurancas = (dado3*danoPistola)+10;
                          
                              switch(dado3) {
                              	
                              case 1:
                            	  JOptionPane.showMessageDialog(null, "Você errou o tiro e recebeu um dano");
                            	  vidaPersonagem[0]-=15;
                            	  break;
                              case 2:
                            	  JOptionPane.showMessageDialog(null, "Você acertou o segurança, porem ele contra-atacou");
                            	  vidaPersonagem[0]-=10;
                            	  vidaSegurancas[1]-=10;
                            	  break;
                              case 3:
                            	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Moderado");
                            	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                            	  break;
                              case 4:
                            	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" forte");
                            	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                            	  break;
                              case 5:
                            	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" critico");
                            	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                            	  break;
                              case 6:
                            	  JOptionPane.showMessageDialog(null, "Dano de " + danoBatalhaSegurancas +" Tiro na cabeça");
                            	  vidaSegurancas[1]-=danoBatalhaSegurancas;
                            	  break;

                              }
                           
                              
                              if(vidaSegurancas[1] <= 0) {
                            		vidaSegurancas[1] = 0;
                            		  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                      		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                            		
                            	}
                              else {
                            	  JOptionPane.showMessageDialog(null,"Pontos de vida = " + vidaPersonagem[0] + "\nVida segurança 1 = " +vidaSegurancas[0]
                                  		  +"\n vida segurança 2 = " + vidaSegurancas[1]);
                              }
                              
                            }while(vidaSegurancas[1]>0 && vidaPersonagem[0]>0);
                            	
                    		   if(vidaSegurancas[1] == 0) {
                    			   JOptionPane.showMessageDialog(null," Parabéns!!! Você matou o segurança");
                    			   
                    		   }
                    		   else {
                                   JOptionPane.showMessageDialog(null,
                                           "Você não sobreviveu ao ataque \nFim de jogo!");
                                   break;
                               } 
               
                          }
                          
                          
                        // segunda escolha busca por tecnologias **fim**
                    }

                    JOptionPane.showMessageDialog(null, "Agora você conseguiu a paz.");

                    break;

                case "3":

                    JOptionPane.showMessageDialog(null, "Feito por Gabriel Moraes e Leonardo Alves fodase");
                    break;

                case "4":

                    JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        } while (!opcao.equalsIgnoreCase("4"));
    }

}
