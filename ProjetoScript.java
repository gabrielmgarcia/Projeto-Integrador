package CopoScriptTeste;



import javax.swing.JOptionPane;;

public class ProjetoScript {
	static int dado(int a) {	
		
		a = 1 +(int) (Math.random() * 6);
		return a;
			
	}

	public static void EscolhaRaca(String raca) {

		if (raca.equalsIgnoreCase("1")) {

			JOptionPane.showMessageDialog(null, "Voc� escolheu 'Humano' ");

			JOptionPane.showMessageDialog(null,
					"Fac��o �Vermelha� \n\n" + "Humanos movidos pelo dinheiro, os comandantes dessa fac��o buscam \n"
							+ "pelo dom�nio absoluto para controlar todos pontos econ�micos \n"
							+ "do planeta �-B� para buscar melhorias tecnol�gicas em suas naves.");
		}

		else {

			JOptionPane.showMessageDialog(null, "Voc� escolheu 'Extraterrestre' ");

			JOptionPane.showMessageDialog(null,
					"Fac��o �Azul�\n\n" + "Extraterrestes ligados aos seus valores, os l�deres querem \n"
							+ "retomar o poder completo do planeta e dar \n"
							+ "continuidade ao trabalho feito por seus ancestrais. ");
		}
	}
	
public static void EscolhaHumano(String Humano) {

		
		if(Humano.equalsIgnoreCase("1")) {
			
   			JOptionPane.showMessageDialog( null, "Humano - Cientista\r\n\r\n"
   					+ "Ap�s perder sua fam�lia na guerra, decidiu juntar-se a um lado para acabar com a infind�vel guerra.");
		
   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
				    "Forca = +1\n" + 
			  		"Agilidade = +2\r\n" + 
			  		"Resist�ncia = -1");
		  
   		}
   		else {
		 
   			JOptionPane.showMessageDialog( null, "Humano-Engenheiro\r\n\r\n"
   					+ "Um g�nio incompreendido cujo desejo � se tornar o mais renomado estrategista da gal�xia.");
		  
   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
			  		"Forca = +1\n" + 
			  		"Agilidade = -1\n" + 
			  		"Resist�ncia = +2");
   		}	

	}
	
public static void EscolhaET(String ET) {

	
	if(ET.equalsIgnoreCase("1")) {
		
		JOptionPane.showMessageDialog( null, "Extraterrestre - Ca�ador\r\n\r\n"
	
				+ "Criatura especialista em rastreamento e combates a longa dist�ncia.");
		
		JOptionPane.showMessageDialog( null, "Atributos \n" + 
		    "Forca = +2\n" + 
	  		"Agilidade = +1\n" + 
	  		"Resist�ncia = -1");
	}
	else {
		
		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercen�rio\r\n\n"
   				+ "Criatura corrupta sedenta por riquezas.");
   		
   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
			    "Forca = +2\n" + 
		  		"Agilidade = -2\n" + 
		  		"Resist�ncia = +1");
	}
}
	
public static void main(String[] args) {
		
		
		String nick;
		String raca;
		String TipoHumano;
		String TipoET;
		String dado2;
		String somaAtributos;
		String opcao;
		int totalSoma2, adv01 = 100;
		
		
		do {
			
			opcao = JOptionPane.showInputDialog("Bem-vindo ao Jogo �Batalha estelar�\n\n\r"
					+ "Digite:\n\r1 - Instru��es\n\r2 - Jogar\n\r3 - Cr�ditos\n\r4 - Sair\n\r");
			
			
		
			switch(opcao) {
		
			case "1":
			
				JOptionPane.showMessageDialog(null, "Como jogar:\r\n\n" + 
					"1 - Nosso RPG consiste em um desenvolvimento da nave, os personagens s�o utilizados\n\r"
					+ "para dar diferentes caracter�sticas a ela, por parte dos atributos que podem tanto ser \n\r"
					+ "adicionados quanto retirados.\r\n\n" + 
					"2 - Voc� deve escolher entre as ra�as Humano ou Extraterrestre, dentre essas duas ra�as \n\r"
					+ "voc� tamb�m escolher� entre 4 classes, duas delas s�o humanos e as outras duas s�o \n\r"
					+ "extraterrestres.\r\n" + 
					"");
			break;
		
		case "2":	
		
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");	
		
	    JOptionPane.showMessageDialog( null, "Bem vindo " + nick + "!!!" );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave " + nick + "! voc� j� come�a com:\n"
	    		+ "10-For�a \n 10-Agilidade \n10-Resist�ncia \n pontos de vide-100 \n"
	    		+ "Obs: N�o se esque�a de anotar os ganhos e perdas de atributos\n"
	    		+ "isto ser� essencial no seu desenvolvimento!!!" );
	    
		do {
		    raca = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Humano: \n 2-Extraterrestre:");
		    
		}while(!raca.equalsIgnoreCase("1") && !raca.equalsIgnoreCase("2"));
		    
		EscolhaRaca(raca);
		    
	    if(raca.equalsIgnoreCase("1")){
	    	
	    	do {
	    		TipoHumano = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Cientista: \n 2-Engenheiro:");
		    
	    	}while(!TipoHumano.equalsIgnoreCase("1") && !TipoHumano.equalsIgnoreCase("2"));
	    
	    EscolhaHumano(TipoHumano);
	    
	    }
	    else {
	    	
	    	do {
	    		TipoET = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Ca�ador: \n 2-Mercenario:");
	    		
	    	}while(!TipoET.equalsIgnoreCase("1") && !TipoET.equalsIgnoreCase("2"));	
	    	
	    EscolhaET(TipoET);
	    
	    }
	   	
	   		
	 
	   	
	   	JOptionPane.showMessageDialog( null, nick +" era habitante do planeta �-B -B -B� por�m\r\n" 
	   			+ "uma grande guerra entre duas fac��es, que buscavam o poder\r\n" 
	   			+ "absoluto, acabou com a destrui��o do planeta por completo. \r\n"
	   			+ "Agora ele viaja pela gal�xia buscando trazer a paz aos planetas que \r\n"
	   			+ "est�o em guerra para que os inocentes n�o acabem pagando pela\r\n" 
	   			+ "ignor�ncia de seus comandantes.");
		
	     int countBatalha01 = 0;
		 int dado3 = 0;
		 
		 
			 JOptionPane.showMessageDialog( null, "Voc� desperta do que parecia ser um sono profundo, por�m percebe que esta deitado no ch�o \n"
			 		+ "onde parece ser um deserto, n�o faz a menor ideia do que est� acontecendo, logo se depara de que \n"
			 		+ "sua cabe�a est� sangrando, voc� ent�o estanca o sangramento, n�o fazendo ideia nem de qual era \n"
			 		+ "seu pr�prio nome, voc� procura em seus bolsos qualquer coisa que o fa�a lembrar, enfim encontra \n"
			 		+ "um documento, nele est� escrito seu nome "+ nick +", junto deste documento se encontra um "
			 		+ "emblema \nnele est� escrito �General das for�as armadas -b-b-b�.");
			 
			 JOptionPane.showMessageDialog( null, "Ap�s uma longa caminhada pelo deserto, voc� finalmente avista o que parece ser um nave, \n"
			 		+ "junto dela  uma pessoa, com as vestimentas parecidas com a sua, ao se aproximar esta \npessoa fica "
			 		+ "totalmente espantada, ele o chama de general, e diz que todos no planeta \nachavam que voc� estava "
			 		+ "morto, completamente confuso voc� explica que n�o se \nlembra de nada, e pede para que possa lhe "
			 		+ "lembrar sobre tudo o que estava acontecendo!");
			 
			 JOptionPane.showMessageDialog( null, "Ap�s lembrar-se de seu passado, voc�s saem para voltar ao planeta, logo ap�s levantar \n"
			 		+ "voo, voc� avista um planeta completamente destru�do, e ao se distra�rem com ele, a nave � atingida \n"
			 		+ "por algo, e seu companheiro � obrigado a fazer um pouso for�ado, ao olhar o que os atingiu, havia \n"
			 		+ "uma nave que efetuou mais alguns disparos, por sorte a nave n�o teve grandes estragos, e ainda \n"
			 		+ "est� funcionando, ao ver que � uma nave inimiga, voc� ent�o sai com o objetivo de destru�-la... ");
		
			 do {
			 
			 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			 dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			 int totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			 	case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada. \nVoc� teve que recuar. (agilidade-1)" );		
				break;
			 	case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVoc� teve que recuar. (resist�ncia-1)" );		
				break;
			 	case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, defesa contra misseis (resist�ncia+1)" );		
				break;
			 	case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			 	case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, escudo (resist�ncia+1)" );		
				break;
			 	case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, metralhadora (for�a+2)" );		
				break;

			 	default: JOptionPane.showMessageDialog( null, " morreu" );	
				break;	
			 }
			 
			 countBatalha01++;
			
			 }while((dado3 == 1 || dado3 == 2) && countBatalha01 != 3 );
			
		 if(dado3 > 2) {
			 JOptionPane.showMessageDialog( null,"Voc� destruiu a nave inimiga com sucesso e continuou sua jornada!" );		
		 }
				 
		 else if(countBatalha01 == 3) {
			 JOptionPane.showMessageDialog( null,"Voc� n�o sobreviveu ao ataque da nave inimiga e morreu \n\n Fim de jogo!" );
			 break;
		 }
		 else {
			 JOptionPane.showMessageDialog( null,"Voc� n�o conseguiu destruir a nave inimiga, rode o dado outra vez!" );
		 }
		 
		 JOptionPane.showMessageDialog( null,"Logo ap�s a batalha sua nave est� no limite e voc� precisa arrum�-la antes de levantar \n"
		 		+ "voo novamente!" );
		 
		 JOptionPane.showMessageDialog( null,"Ent�o voc� sai em busca de poss�veis ferramentas entre os escombros da nave inimiga abatida, \n"
		 		+ "logo sem ao menos perceber voc� est� cercado por habitantes locais, que o agradecem e contam sobre \n"
		 		+ "a terr�vel hist�ria que levou a destrui��o daquele planeta... \n"
		 		+ "Aparentemente existe uma ra�a que se considera superior as outras, e que est� dominando planetas \n"
		 		+ "e escravizando a popula��o, extremamente perturbado com o que voc� acaba de ouvir, voc� promete a \n"
		 		+ "esses habitantes que far� algo sobre isso... \n"
		 		+ "Ent�o seus aliados lhe contam sobre o coliseu, onde o l�der inimigo usa o pressuposto de que isso os \n"
		 		+ "tornar� mais fortes, assim ele sempre oferece uma alta recompensa para quem vencer este torneio, \n"
		 		+ "que � a devolu��o do planeta para a ra�a vencedora");
		 
		 //JOptionPane.showMessageDialog( null,"");
		 String escolha = JOptionPane.showInputDialog( null,"Voc� pode:\r\n\n" + 
		 		"1 - Entrar nesse torneio, tentar a sorte e vencer todos os desafios, por�m... \n"
		 		+ "Pode ser um caminho sem volta, por conta do imenso perigo!\r\n\n" + 
		 		"2 - Voc� pode investigar mais a fundo sobre essa ra�a inimiga e tentar destruir \n"
		 		+ "a sua influ�ncia!\r\n\n");
		 
		 int countBatalha02 = 0;
		 
		 if (escolha.equalsIgnoreCase("1")) {
			 //come�o jogos
			 JOptionPane.showMessageDialog( null,"Chegando ao coliseu voc� � barrado por guardas. Voc� faz o \n"
			 		+ "contato com eles informando que deseja falar com o seu l�der... que deseja lutar no coliseu \n"
			 		+ " ap�s isso eles te conduzem ao l�der, ent�o ap�s aceitar o desafio o l�der dos �nome da ra�a� \n"
			 		+ "convoca seus melhores guerreiros para enfrentar voc� em 4 batalhas.");
			 
				JOptionPane.showMessageDialog( null,"Lembre-se de que sua nave tem ponto de vida  e combustivel limitado, errar n�o � uma op��o..." );
				JOptionPane.showMessageDialog( null,"o inimigo possui 100 pontos de vida! " );
			 
				
				 int v []= {100, 100};
				 
				// L�o otario
					 JOptionPane.showMessageDialog(null, "pontos de vida = " + v[0] + "\nCombustivel =" + v[1]);			
				 
			 do {
										 
				 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
				 dado3 = Integer.parseInt(dado2);
				 dado3 = dado(dado3);
				 
				 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
				 int totalSoma = Integer.parseInt(somaAtributos);
				 
				 totalSoma2 = dado3 * totalSoma;
				 
				 
				 switch (dado3) {
				 
				
				 	case 1:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada." );		
					break;
				 	case 2:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada." );		
					break;
				 	case 3:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Dano insuficiente " );		
					break;
				 	case 4:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Aataque forte " );		
					break;
				 	case 5:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Ataque cr�tico " );		
					break;
				 	case 6:
					JOptionPane.showMessageDialog( null,"Dano de "+ totalSoma2 + " Ataque cr�tico " );		
					break;

				 	default: JOptionPane.showMessageDialog( null, " morreu" );	
					break;	
				 }
				 
				 countBatalha02++;
				 v[0]-=5;
				 v[1]-=5;
			
				 adv01 -= totalSoma2;
				System.out.println(adv01);
					
						 JOptionPane.showMessageDialog(null, "pontos de vida = " + v[0] + " \n Combustivel = " + v[1]);
					 
				
				 // saida com o vetor??
						 
				 }while(adv01 >0 && countBatalha02 !=3);
			 
			 
			 if(adv01 <= 0) {
				 JOptionPane.showMessageDialog( null,"Voc� derrotou o primeiro inimigo!" );		
			 }
					 
			 else if (countBatalha02 == 3) {
				 JOptionPane.showMessageDialog( null,"Voc� n�o sobreviveu ao ataque e sua nave foi destru�da \n\nFim de jogo!" );
				 break;
			 }
			 else {
				 
				 JOptionPane.showMessageDialog( null,"Voc� n�o conseguiu destruir a nave inimiga, rode o dado outra vez!" );
			 }
			 
			 //final jogos
		 }
		 
		 else {
			 
			 JOptionPane.showMessageDialog( null,"Voc� continua a sua saga pela busca de informa��es do inimigo");
			 JOptionPane.showMessageDialog( null,"Entre os habitantes, havia um que por n�o concordar com os m�todos feitos \n "
			 		+ "pelo seu l�der, acabou mudando de lado, e em sua fuga levou consigo alguns documentos, ele o entrega \n"
			 		+ "esses documentos, que s�o um mapa, nele est� especificado uma rota que mostrava um caminho para o \n"
			 		+ "centro das for�as inimigas.... E junto com esse documento tamb�m est� um dispositivo feito por ele \n"
			 		+ "que corta o sinal de comunica��o entre os guardas com o resto do planeta!");
			 
			 JOptionPane.showMessageDialog( null,"Sua miss�o � se infiltrar e descobrir mais sobre os inimigos!");
			 JOptionPane.showMessageDialog( null,"Voc� sai em sua jornada, e a informa��o obtida � de que os guardas s�o guardi�es \n"
			 									+ " eles s�o a patente mais alta da divis�o de defesa do ex�rcito inimigo, n�o ser� \n"
			 									+ "f�cil derrota-los...  ");
			 JOptionPane.showMessageDialog( null,"Ao se aproximar deles, voc� ativa o dispositivo para cortar o sinal, por�m logo � notado... \n "
			 									+ "para o seu azar s�o duas naves guardando a entrada!! e cada nave tem 20 pontos de vida");
			
			 
	   do {
				  
				 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
				 dado3 = Integer.parseInt(dado2);
				 dado3 = dado(dado3);
				 
				 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
				 int totalSoma = Integer.parseInt(somaAtributos);
				int dano = dado3 + totalSoma;
				 switch (dado3) {
				 // decidir as opcoes **come�o**
				 
				 	case 1:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada. \nVoc� teve que recuar. (agilidade-1)" );		
					break;
				 	case 2:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVoc� teve que recuar. (resist�ncia-1)" );		
					break;
				 	case 3:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, defesa contra misseis (resist�ncia+2)" );		
					break;
				 	case 4:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, motor(agilidade+1)" );		
					break;
				 	case 5:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, escudo (resist�ncia+1)" );		
					break;
				 	case 6:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano) + " Ataque cr�tico, voc� adquiriu uma nova tecnologia, metralhadora (for�a+1)" );		
					break;

				 	default: JOptionPane.showMessageDialog( null, " morreu" );	
					break;	
				 }
				 
				 countBatalha02++;
				
				 }while((dado3 == 1 || dado3 == 2 || dado3 == 3) && countBatalha02 !=2 );
			 
			 if(dado3 > 3) {
				 JOptionPane.showMessageDialog( null,"Voc� derrotou o primeiro inimigo!" );		
			 }
					 
			 else if (countBatalha02 == 2) {
				 JOptionPane.showMessageDialog( null,"Voc� n�o sobreviveu ao ataque e sua nave foi destru�da \n\nFim de jogo!" );
				 break;
			 }
			 else {
				 
				 JOptionPane.showMessageDialog( null,"Voc� n�o conseguiu destruir a nave inimiga, rode o dado outra vez!" );
			 }
			 
			 // ** fim **
		 }
		 
		 JOptionPane.showMessageDialog( null,"Agora voc� conseguiu a paz.");

		break; 
		 
		case "3":
			
			JOptionPane.showMessageDialog(null, "Feito por Gabriel Moraes e Leonardo Alves fodase");
		break;
		
		case "4":
			
			JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
		break; 
		 
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
		break;	
		}
		
		}while(!opcao.equalsIgnoreCase("4"));
	}

}