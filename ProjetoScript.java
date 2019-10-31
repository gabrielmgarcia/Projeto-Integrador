package CopoScriptTeste;

import java.util.Scanner;

import javax.swing.JOptionPane;;

public class ProjetoScript {
	static int dado(int a) {	
		
		a = 1 +(int) (Math.random() * 6);
		return a;
			
	}

	static void MenuInicial(){
	
		
	
	}
	

	public static void main(String[] args) {
		
		String nick;
		String raca;
		String TipoHumano;
		String TipoET;
		String dado2;
		String somaAtributos;
		String opcao;
		
		do {
			
			opcao = JOptionPane.showInputDialog("Bem-vindo ao Jogo “Batalha estelar”\n\n\r"
					+ "Digite:\n\r1 - Instruções\n\r2 - Jogar\n\r3 - Créditos\n\r4 - Sair\n\r");
			
			
		
			switch(opcao) {
		
			case "1":
			
				JOptionPane.showMessageDialog(null, "Como jogar:\r\n\n" + 
					"1 - Nosso RPG consiste em um desenvolvimento da nave, os personagens são utilizados\n\r"
					+ "para dar diferentes características a ela, por parte dos atributos que podem tanto ser \n\r"
					+ "adicionados quanto retirados.\r\n\n" + 
					"2 - Você deve escolher entre as raças Humano ou Extraterrestre, dentre essas duas raças \n\r"
					+ "você também escolherá entre 4 classes, duas delas são humanos e as outras duas são \n\r"
					+ "extraterrestres.\r\n" + 
					"");
			break;
		
		case "2":	
		
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");				
	    JOptionPane.showMessageDialog( null, "Bem vindo " + nick + "!!!" );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave " + nick + "! você já começa com:\n"
	    		+ "2-Força \n2-Agilidade \n2-Resistência \n"
	    		+ "Obs: Não se esqueça de anotar os ganhos e perdas de atributos\n"
	    		+ "isto será essencial no seu desenvolvimento!!!" );
	    
	    do {
	    raca = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Humano: \n 2-Extraterrestre:");
	    
	    
	   		if(raca.equalsIgnoreCase("1")) {
	   			do {
	   			JOptionPane.showMessageDialog( null, "Você escolheu 'Humano' ");
	   	  
	   			JOptionPane.showMessageDialog( null, "Facção “Vermelha” \n\n" + 
				"Humanos movidos pelo dinheiro, os comandantes dessa facção buscam \n"
				+ "pelo domínio absoluto para controlar todos pontos econômicos \n"
				+ "do planeta “-B” para buscar melhorias tecnológicas em suas naves.");
		
	   	  
	   	TipoHumano = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Cientista: \n 2-Engenheiro:");
	   
	   	
	   		if(TipoHumano.equalsIgnoreCase("1")) {
			
	   			JOptionPane.showMessageDialog( null, "Humano - Cientista\r\n\r\n"
	   					+ "Após perder sua família na guerra, decidiu juntar-se a um lado para acabar com a infindável guerra.");
			
	   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +1\n" + 
				  		"Agilidade = +2\r\n" + 
				  		"Resistência = -1");
			  
	   		   }
	   			else if(TipoHumano.equalsIgnoreCase("2")) {
			 
	   			JOptionPane.showMessageDialog( null, "Humano-Engenheiro\r\n\r\n"
	   					+ "Um gênio incompreendido cujo desejo é se tornar o mais renomado estrategista da galáxia.");
			  
	   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
				  		"Forca = +1\n" + 
				  		"Agilidade = -1\n" + 
				  		"Resistência = +2");
			  
	   		     }
	   			else {
	   				JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );		
	   		      }
	   			}while(!TipoHumano.equalsIgnoreCase("1") && !TipoHumano.equalsIgnoreCase("2"));
		
	   		}
	   		else if(raca.equalsIgnoreCase("2")) {
	   			do {
	   			JOptionPane.showMessageDialog( null, "Você escolheu 'Extraterrestre' ");
	   		
	   			JOptionPane.showMessageDialog( null, "Facção “Azul”\n\n" + 
					"Extraterrestes ligados aos seus valores, os líderes querem \n"
					+ "retomar o poder completo do planeta e dar \n"
					+ "continuidade ao trabalho feito por seus ancestrais. " );
	   		
	   			TipoET = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Caçador: \n 2-Mercenario:");
		  
	   			if(TipoET.equalsIgnoreCase("1")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Caçador\r\n\r\n"
		   				+ "Criatura especialista em rastreamento e combates a longa distância.");
		   		
		   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +2\n" + 
				  		"Agilidade = +1\n" + 
				  		"Resistência = -1");
	   			}
	   			else if(TipoET.equalsIgnoreCase("2")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercenário\r\n\n"
		   				+ "Criatura corrupta sedenta por riquezas.");
		   		
		   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +2\n" + 
				  		"Agilidade = -2\n" + 
				  		"Resistência = +1");
	   			}
	   			else {
		   		JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );		
	   			}
	   			
	   			}while(!TipoET.equalsIgnoreCase("1") && !TipoET.equalsIgnoreCase("2"));
	   		 }
	   		else {
	   			JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );			 
	   		}
	   	
	   		
	    }while(!raca.equalsIgnoreCase("1") && !raca.equalsIgnoreCase("2"));
	   	
	   	JOptionPane.showMessageDialog( null, nick +" era habitante do planeta “-B -B -B” porém\r\n" 
	   			+ "uma grande guerra entre duas facções, que buscavam o poder\r\n" 
	   			+ "absoluto, acabou com a destruição do planeta por completo. \r\n"
	   			+ "Agora ele viaja pela galáxia buscando trazer a paz aos planetas que \r\n"
	   			+ "estão em guerra para que os inocentes não acabem pagando pela\r\n" 
	   			+ "ignorância de seus comandantes.");
		
	     int countBatalha01 = 0;
		 int dado3 = 0;
		 
		 
			 JOptionPane.showMessageDialog( null, "Você desperta do que parecia ser um sono profundo, porém percebe que esta deitado no chão \n"
			 		+ "onde parece ser um deserto, não faz a menor ideia do que está acontecendo, logo se depara de que \n"
			 		+ "sua cabeça está sangrando, você então estanca o sangramento, não fazendo ideia nem de qual era \n"
			 		+ "seu próprio nome, você procura em seus bolsos qualquer coisa que o faça lembrar, enfim encontra \n"
			 		+ "um documento, nele está escrito seu nome "+ nick +", junto deste documento se encontra um "
			 		+ "emblema \nnele está escrito “General das forças armadas -b-b-b”.");
			 
			 JOptionPane.showMessageDialog( null, "Após uma longa caminhada pelo deserto, você finalmente avista o que parece ser um nave, \n"
			 		+ "junto dela  uma pessoa, com as vestimentas parecidas com a sua, ao se aproximar esta \npessoa fica "
			 		+ "totalmente espantada, ele o chama de general, e diz que todos no planeta \nachavam que você estava "
			 		+ "morto, completamente confuso você explica que não se \nlembra de nada, e pede para que possa lhe "
			 		+ "lembrar sobre tudo o que estava acontecendo!");
			 
			 JOptionPane.showMessageDialog( null, "Após lembrar-se de seu passado, vocês saem para voltar ao planeta, logo após levantar \n"
			 		+ "voo, você avista um planeta completamente destruído, e ao se distraírem com ele, a nave é atingida \n"
			 		+ "por algo, e seu companheiro é obrigado a fazer um pouso forçado, ao olhar o que os atingiu, havia \n"
			 		+ "uma nave que efetuou mais alguns disparos, por sorte a nave não teve grandes estragos, e ainda \n"
			 		+ "está funcionando, ao ver que é uma nave inimiga, você então sai com o objetivo de destruí-la... ");
		
			 do {
			 
			 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			 dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			 int totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			 	case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada. \nVocê teve que recuar. (agilidade-1)" );		
				break;
			 	case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVocê teve que recuar. (resistência-1)" );		
				break;
			 	case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, defesa contra misseis (resistência+2)" );		
				break;
			 	case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			 	case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, escudo (resistência+1)" );		
				break;
			 	case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, metralhadora (força+1)" );		
				break;

			 	default: JOptionPane.showMessageDialog( null, " morreu" );	
				break;	
			 }
			 
			 countBatalha01++;
			
			 }while((dado3 == 1 || dado3 == 2) && countBatalha01 != 3 );
			
		 if(dado3 > 2) {
			 JOptionPane.showMessageDialog( null,"Você destruiu a nave inimiga com sucesso e continuou sua jornada!" );		
		 }
				 
		 else if(countBatalha01 == 3) {
			 JOptionPane.showMessageDialog( null,"Você não sobreviveu ao ataque da nave inimiga e morreu \n\n Fim de jogo!" );
			 break;
		 }
		 else {
			 JOptionPane.showMessageDialog( null,"Você não conseguiu destruir a nave inimiga, rode o dado outra vez!" );
		 }
		 
		 JOptionPane.showMessageDialog( null,"Logo após a batalha sua nave está no limite e você precisa arrumá-la antes de levantar \n"
		 		+ "voo novamente!" );
		 
		 JOptionPane.showMessageDialog( null,"Então você sai em busca de possíveis ferramentas entre os escombros da nave inimiga abatida, \n"
		 		+ "logo sem ao menos perceber você está cercado por habitantes locais, que o agradecem e contam sobre \n"
		 		+ "a terrível história que levou a destruição daquele planeta... \n"
		 		+ "Aparentemente existe uma raça que se considera superior as outras, e que está dominando planetas \n"
		 		+ "e escravizando a população, extremamente perturbado com o que você acaba de ouvir, você promete a \n"
		 		+ "esses habitantes que fará algo sobre isso... \n"
		 		+ "Então seus aliados lhe contam sobre o coliseu, onde o líder inimigo usa o pressuposto de que isso os \n"
		 		+ "tornará mais fortes, assim ele sempre oferece uma alta recompensa para quem vencer este torneio, \n"
		 		+ "que é a devolução do planeta para a raça vencedora");
		 
		 //JOptionPane.showMessageDialog( null,"");
		 String escolha = JOptionPane.showInputDialog( null,"Você pode:\r\n\n" + 
		 		"1 - Entrar nesse torneio, tentar a sorte e vencer todos os desafios, porém... \n"
		 		+ "Pode ser um caminho sem volta, por conta do imenso perigo!\r\n\n" + 
		 		"2 - Você pode investigar mais a fundo sobre essa raça inimiga e tentar destruir \n"
		 		+ "a sua influência!\r\n\n");
		 
		 int countBatalha02 = 0;
		 
		 if (escolha.equalsIgnoreCase("1")) {
			 
			 JOptionPane.showMessageDialog( null,"E que comecem os jogos");
			 
			 do {
				 
				 
				 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
				 dado3 = Integer.parseInt(dado2);
				 dado3 = dado(dado3);
				 
				 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
				 int totalSoma = Integer.parseInt(somaAtributos);
				
				 switch (dado3) {
				
				 	case 1:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada. \nVocê teve que recuar. (agilidade-1)" );		
					break;
				 	case 2:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVocê teve que recuar. (resistência-1)" );		
					break;
				 	case 3:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, defesa contra misseis (resistência+2)" );		
					break;
				 	case 4:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, motor(agilidade+1)" );		
					break;
				 	case 5:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, escudo (resistência+1)" );		
					break;
				 	case 6:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, metralhadora (força+1)" );		
					break;

				 	default: JOptionPane.showMessageDialog( null, " morreu" );	
					break;	
				 }
				 
				 countBatalha02++;
				
				 }while((dado3 == 1 || dado3 == 2 || dado3 == 3) && countBatalha02 !=2 );
			 
			 if(dado3 > 3) {
				 JOptionPane.showMessageDialog( null,"Você derrotou o primeiro inimigo!" );		
			 }
					 
			 else if (countBatalha02 == 2) {
				 JOptionPane.showMessageDialog( null,"Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!" );
				 break;
			 }
			 else {
				 
				 JOptionPane.showMessageDialog( null,"Você não conseguiu destruir a nave inimiga, rode o dado outra vez!" );
			 }
			 
			 
		 }
		 
		 else {
			 
			 JOptionPane.showMessageDialog( null,"Você continua a sua saga pela busca de informações do inimigo");
			 JOptionPane.showMessageDialog( null,"Entre os habitantes, havia um que por não concordar com os métodos feitos \n "
			 		+ "pelo seu líder, acabou mudando de lado, e em sua fuga levou consigo alguns documentos, ele o entrega \n"
			 		+ "esses documentos, que são um mapa, nele está especificado uma rota que mostrava um caminho para o \n"
			 		+ "centro das forças inimigas.... E junto com esse documento também está um dispositivo feito por ele \n"
			 		+ "que corta o sinal de comunicação entre os guardas com o resto do planeta!");
			 
			 JOptionPane.showMessageDialog( null,"Sua missão é se infiltrar e descobrir mais sobre os inimigos!");
		 }
		 
		 JOptionPane.showMessageDialog( null,"Agora você conseguiu a paz.");

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
		
		}while(!opcao.equalsIgnoreCase("4"));
	}

}