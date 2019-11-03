package Projeto;

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
	String escolha;
	int totalSoma2;
	int totalSoma;
		//int  adv01 = 100;
		
		
		do {
			
			opcao = JOptionPane.showInputDialog(null, "Bem-vindo ao Jogo �Batalha estelar�\n\n\r"
					+ "Digite:\n\r1 - Instru��es\n\r2 - Jogar\n\r3 - Cr�ditos\n\r4 - Sair\n\r","Menu",JOptionPane.INFORMATION_MESSAGE);
			
			
		
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
		do {
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");	
		}while(nick.equalsIgnoreCase(""));
	    JOptionPane.showMessageDialog( null, "Bem vindo " + nick + "!!!" );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave " + nick + "! voc� j� come�a com:\n"
	    		+ "5-For�a \n 5-Agilidade \n5-Resist�ncia  \n"
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
				 do {
						dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

					} while (!dado2.equalsIgnoreCase("1"));
			 dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			  totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
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
		 do{
				
				escolha = JOptionPane.showInputDialog(null,
					"Voc� pode:\r\n\n"
							+ "1 - Entrar nesse torneio, tentar a sorte e vencer todos os desafios, por�m... \n"
							+ "Pode ser um caminho sem volta, por conta do imenso perigo!\r\n\n"
							+ "2 - Voc� pode investigar mais a fundo sobre essa ra�a inimiga e tentar destruir \n"
							+ "a sua influ�ncia!\r\n\n");
			}while(escolha.equalsIgnoreCase("1") && escolha.equalsIgnoreCase("2"));
		 
		// int countBatalha02 = 0;
		 
		 if (escolha.equalsIgnoreCase("1")) {

				// come�o historia coliseu

				JOptionPane.showMessageDialog(null, "Chegando ao coliseu voc� � barrado por guardas. Voc� faz o \n"
						+ "contato com eles informando que deseja falar com o seu l�der... que deseja lutar no coliseu \n"
						+ "ap�s isso eles te conduzem ao l�der, ent�o ap�s aceitar o desafio o l�der dos �nome da ra�a� \n"
						+ "convoca seus melhores guerreiros para enfrentar voc� em 4 batalhas.");

				JOptionPane.showMessageDialog(null,
						"Lembre-se de que sua nave tem ponto de vida e combustivel limitado, errar n�o � uma op��o...");
				JOptionPane.showMessageDialog(null,
						"O primeiro guerreiro � um oficial de brigada, sua nave � bem robusta, mas em compensa��o n�o � muito �gil.");
				JOptionPane.showMessageDialog(null, "O inimigo possui 100 pontos de vida! ");

				int v[] = { 100, 100 };
				int vIni1[] = { 100 };

				JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + "\nCombustivel = " + v[1]
						+ "\nPontos de vida do inimigo = " + vIni1[0]);

				do {
					// primeira batalha do coliseu

					do {
						dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

					} while (!dado2.equalsIgnoreCase("1"));
					dado3 = Integer.parseInt(dado2);
					dado3 = dado(dado3);

					do{
						somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
					}while(somaAtributos.equalsIgnoreCase(" "));
					
					totalSoma = Integer.parseInt(somaAtributos);

					totalSoma2 = dado3 * totalSoma;

					switch (dado3) {

					case 1:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
								+ " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada.");
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
								+ " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Dano insuficiente ");
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque forte ");
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
						break;

					default:
						JOptionPane.showMessageDialog(null, " morreu");
						break;
					}

					vIni1[0] -= totalSoma2;

					if (vIni1[0] > 0) {

						v[0] -= 5;

					}

					v[1] -= 5;

					JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + " \nCombustivel = " + v[1]
							+ "\nPontos de vida do inimigo = " + vIni1[0]);

				} while (vIni1[0] > 0 && v[0] > 0);

				if (vIni1[0] <= 0) {

					int vIni2[] = { 150 };

					JOptionPane.showMessageDialog(null, "Parab�ns! Voc� derrotou o primeiro inimigo!");

					JOptionPane.showMessageDialog(null,
							"O segundo guerreiro � um ex prisioneiro que foi capturado pelos \n"
									+ "�nome da ra�a� e vem sendo treinado intensamente para aniquilar seus inimigos, \n"
									+ "seu poder de fogo � muito grande.");

					JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + "\nCombustivel = " + v[1]
							+ "\nPontos de vida do inimigo = " + vIni2[0]);

					do {
						// segunda batalha do coliseu

						do {
							dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

						} while (!dado2.equalsIgnoreCase("1"));
						dado3 = Integer.parseInt(dado2);
						dado3 = dado(dado3);

						do{
							somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
						}while(somaAtributos.equalsIgnoreCase(" "));
						
						totalSoma = Integer.parseInt(somaAtributos);

						totalSoma2 = dado3 * totalSoma;

						switch (dado3) {

						case 1:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
									+ " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada.");
							break;
						case 2:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
									+ " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
							break;
						case 3:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Dano insuficiente ");
							break;
						case 4:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Aataque forte ");
							break;
						case 5:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
							break;
						case 6:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
							break;

						default:
							JOptionPane.showMessageDialog(null, " morreu");
							break;
						}

						vIni2[0] -= totalSoma2;

						if (vIni2[0] > 0) {

							v[0] -= 7;

						}

						v[1] -= 7;

						JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + " \nCombustivel = " + v[1]
								+ "\nPontos de vida do inimigo = " + vIni2[0]);

					} while (vIni2[0] > 0 && v[0] > 0);

					if (vIni2[0] <= 0) {

						int vIni3[] = { 200 };

						JOptionPane.showMessageDialog(null, "Parab�ns! Voc� derrotou o segundo inimigo!");

						JOptionPane.showMessageDialog(null,
								"Seu terceiro oponente ser� um oficial de alto escal�o, \n"
										+ "ele j� foi reconhecido v�rias vezes por sua efici�ncia em aniquila��o \n"
										+ "de seus inimigos.");

						JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + "\nCombustivel = " + v[1]
								+ "\nPontos de vida do inimigo = " + vIni3[0]);

						do {
							// terceira batalha do coliseu

							do {
								dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

							} while (!dado2.equalsIgnoreCase("1"));
							dado3 = Integer.parseInt(dado2);
							dado3 = dado(dado3);

							do{
								somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
							}while(somaAtributos.equalsIgnoreCase(" "));
							
							totalSoma = Integer.parseInt(somaAtributos);

							totalSoma2 = dado3 * totalSoma;

							switch (dado3) {

							case 1:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
										+ " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada.");
								break;
							case 2:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
										+ " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
								break;
							case 3:
								JOptionPane.showMessageDialog(null,
										"Dano de " + totalSoma2 + " Dano insuficiente ");
								break;
							case 4:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Aataque forte ");
								break;
							case 5:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
								break;
							case 6:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque cr�tico ");
								break;

							default:
								JOptionPane.showMessageDialog(null, " morreu");
								break;
							}

							vIni3[0] -= totalSoma2;

							if (vIni3[0] > 0) {

								v[0] -= 9;

							}

							v[1] -= 9;

							JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + " \nCombustivel = "
									+ v[1] + "\nPontos de vida do inimigo = " + vIni3[0]);

						} while (vIni3[0] > 0 && v[0] > 0);

						if (vIni3[0] <= 0) {

							int vIni4[] = { 250 };

							JOptionPane.showMessageDialog(null, "Parab�ns! Chegou ao �ltimo inimigo!");

							JOptionPane.showMessageDialog(null,
									"O Quarto oponente � o pr�prio l�der dos �nome da ra�a� sua \n "
											+ "nave � extremamente poderosa, sendo superior a todas as outras de sua ra�a.");

							JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + "\nCombustivel = "
									+ v[1] + "\nPontos de vida do inimigo = " + vIni4[0]);

							do {
								// �ltima batalha do coliseu

								do {
									dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

								} while (!dado2.equalsIgnoreCase("1"));
								dado3 = Integer.parseInt(dado2);
								dado3 = dado(dado3);

								do{
									somaAtributos = JOptionPane.showInputDialog("Digite o total de seus atributos: ");
								}while(somaAtributos.equalsIgnoreCase(" "));
									totalSoma = Integer.parseInt(somaAtributos);
									
								
								totalSoma2 = dado3 * totalSoma;

								switch (dado3) {

								case 1:
									JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
											+ " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada.");
									break;
								case 2:
									JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2
											+ " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada.");
									break;
								case 3:
									JOptionPane.showMessageDialog(null,
											"Dano de " + totalSoma2 + " Dano insuficiente ");
									break;
								case 4:
									JOptionPane.showMessageDialog(null,
											"Dano de " + totalSoma2 + " Aataque forte ");
									break;
								case 5:
									JOptionPane.showMessageDialog(null,
											"Dano de " + totalSoma2 + " Ataque cr�tico ");
									break;
								case 6:
									JOptionPane.showMessageDialog(null,
											"Dano de " + totalSoma2 + " Ataque cr�tico ");
									break;

								default:
									JOptionPane.showMessageDialog(null, " morreu");
									break;
								}

								vIni4[0] -= totalSoma2;

								if (vIni4[0] > 0) {

									v[0] -= 11;

								}

								v[1] -= 11;

								JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + " \nCombustivel = "
										+ v[1] + "\nPontos de vida do inimigo = " + vIni4[0]);

							} while (vIni4[0] > 0 && v[0] > 0);

							if (vIni4[0] <= 0) {

								JOptionPane.showMessageDialog(null, "Parab�ns! Voc� passou pelo coliseu");
							} else if (v[0] <= 0) {

								JOptionPane.showMessageDialog(null,
										"Voc� n�o sobreviveu � batalha e sua nave foi destru�da \n\nFim de jogo!");
								break;
							}

						} else if (v[0] <= 0) {

							JOptionPane.showMessageDialog(null,
									"Voc� n�o sobreviveu � batalha e sua nave foi destru�da \n\nFim de jogo!");
							break;
						}

					} else if (v[0] <= 0) {

						JOptionPane.showMessageDialog(null,
								"Voc� n�o sobreviveu � batalha e sua nave foi destru�da \n\nFim de jogo!");
						break;
					}

				}

				else if (v[0] <= 0) {
					JOptionPane.showMessageDialog(null,
							"Voc� n�o sobreviveu � batalha  e sua nave foi destru�da \n\nFim de jogo!");
					break;
				}

				// final batalhas do coliseu
			}
		 
		 else {
			 // segunda escolha busca por tecnologias **Come�o**
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
			 									+  "a nave tem 60 pontos de vida");
			
			 //Pontos de vida do personagem e da nave inimiga
			 int batalha01BuTec []= {100,60};
			 JOptionPane.showMessageDialog( null,"Pontos de vida = " + batalha01BuTec[0] );	
			 
			
	   do {
		   		
		   do {
				dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

			} while (!dado2.equalsIgnoreCase("1"));	
				 dado3 = Integer.parseInt(dado2);
				 dado3 = dado(dado3);
				 
				 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
				 totalSoma = Integer.parseInt(somaAtributos);
				int dano = dado3 * totalSoma;
				 switch (dado3) {
				 // decidir as opcoes **come�o**
				 
				 	case 1:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano - 5)  + " Voc� errou o ataque e os inimigos contra-atacaram \n sua nave ficou mais lenta." );	
					batalha01BuTec[0]-=15;
					batalha01BuTec[1]-=dano;
					break;
				 	case 2:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano - 5) + " ataque muito fraco. \n a defesa do inimigo foi ativada   " );		
					batalha01BuTec[0]-=15;
					batalha01BuTec[1]-=dano;
					break;
				 	case 3:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque forte, a nave inimiga sofreu algum dano" );		
					batalha01BuTec[1]-=dano;
					break;
				 	case 4:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque forte, Voc� quebrou a defesa inimiga agora ele esta vulner�vel" );		
					
					batalha01BuTec[1]-=dano;
					break;
				 	case 5:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque cr�tico, a nave inimiga est� mais lenta" );		
					
					batalha01BuTec[1]-=dano;
					break;
				 	case 6:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque cr�tico, motor da nave inimiga deu sinal de falha" );		
					
					batalha01BuTec[1]-=dano;
					break;

				 	default: JOptionPane.showMessageDialog( null, " morreu" );	
					break;	
					
					
				 }
				 	 
				if( batalha01BuTec[1]<0 ) {
					batalha01BuTec[1] = 0;
					 JOptionPane.showMessageDialog( null, " Pontos de vida = " + batalha01BuTec[0] + "\nVida do inimigo = " + batalha01BuTec[1] );	
				}
				else {
					JOptionPane.showMessageDialog( null, " Pontos de vida = " + batalha01BuTec[0] + "\nVida do inimigo = " + batalha01BuTec[1] );	
				}
				
				 
				 }while(batalha01BuTec[1] > 0 && batalha01BuTec[0] > 0 );
			 
			 if(batalha01BuTec[1] <= 0) {
				 JOptionPane.showMessageDialog( null,"Voc� derrotou o inimigo!" );
				 JOptionPane.showMessageDialog( null,"Voc� adquiriu uma arma de m�o... uma pistola a lazer muito usada em batalhas terrestres" );
			 }
					 
			 else if (batalha01BuTec [0] <= 0) {
				 JOptionPane.showMessageDialog( null,"Voc� n�o sobreviveu ao ataque e sua nave foi destru�da \n\nFim de jogo!" );
				 break;
			 }
			 else {
				 
				 JOptionPane.showMessageDialog( null,"Voc� n�o conseguiu destruir a nave inimiga, rode o dado outra vez!" );
			 }
			 
			 JOptionPane.showMessageDialog( null,
					  "Voc� est� dentro do centro nervoso do quartel general dos inimigos, agora precisa reunir mais \n"
					+ "informa��o sobre eles, voc� esconde sua nave e est� apenas com uma arma (com a qual ainda n�o \n"
					+ "possui muita habilidade) percebe ent�o que esta sendo vigiado enquanto caminha, e uma esp�cie \n"
					+ "de ciclope da ra�a dos otaidi  entra em seu caminho... ele j� sabe que voc� � um invasor, e puxa \n"
					+ "uma arma e atira contra voc�, por sua sorte ele tamb�m parece n�o ter uma boa mira....\n"
					+ "por�m os ciclopes s�o extremamente altos e sua for�a f�sica e vital s�o incomparaveis",
					"Introdu��o",JOptionPane.INFORMATION_MESSAGE );
			
			 int vidaPersonagem[] = {100,200};
			 
			 JOptionPane.showMessageDialog( null,"Sua vida =" +vidaPersonagem[0] + "\nVida Ciclope = " + vidaPersonagem[1],"Informa��es",JOptionPane.INFORMATION_MESSAGE );
			 
			 // segunda batalha ***come�o***
			  do {
			   		
				   do {
						dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

					} while (!dado2.equalsIgnoreCase("1"));	
						 dado3 = Integer.parseInt(dado2);
						 dado3 = dado(dado3);
						 
						 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
						 totalSoma = Integer.parseInt(somaAtributos);
						int dano = dado3 * totalSoma;
						 switch (dado3) {
					
						 
						 	case 1:
						 		JOptionPane.showMessageDialog( null," Voc� errou o tiro, e sofreu um dano" );	
							vidaPersonagem[0]-=25;
							break;
						 	case 2:
						 		JOptionPane.showMessageDialog( null," Voc� errou o tiro quase o acertando, e sofreu um dano" );		
							vidaPersonagem[0]-=25;
							break;
						 	case 3:
						 		JOptionPane.showMessageDialog( null,"Voc� acertou um tiro, mas ainda n�o atingiu um ponto vital \n"
															   +"Dano de " + dano  );		
							vidaPersonagem [1]-=dano;
							break;
						 	case 4:
						 		JOptionPane.showMessageDialog( null,"Voc� acertou um tiro, n�o atingiu um ponto vital mas passou muito pr�ximo \n"
						 						               +"Dano de " + dano  );						
							vidaPersonagem[1]-=dano;
							break;
						 	case 5:
						 		JOptionPane.showMessageDialog( null,"Voc� acertou um ponto vital\n"
										   +"Dano de " + dano  );	
							
							vidaPersonagem[1]-=dano;
							break;
						 	case 6:
						 		JOptionPane.showMessageDialog( null,"Voc� acertou um ponto vital, tirando um boa parte da vida do ciclope \n"
										   +"Dano de " + dano  );
							
							vidaPersonagem[1]-=dano;
							break;

						 	default: JOptionPane.showMessageDialog( null, " morreu" );	
							break;	
							
							
						 }
						 	 
						if( vidaPersonagem[1]<0 ) {
							vidaPersonagem[1] = 0;
							 JOptionPane.showMessageDialog( null, " Pontos de vida = " + vidaPersonagem[0] + "\nVida do inimigo = " + vidaPersonagem[1] );	
						}
						else {
							JOptionPane.showMessageDialog( null, " Pontos de vida = " + vidaPersonagem[0] + "\nVida do inimigo = " + vidaPersonagem[1] );	
						}
						
						 
						 }while(vidaPersonagem[1] > 0 && vidaPersonagem[0] > 0 );

				 if(vidaPersonagem[1] <= 0) {
					 JOptionPane.showMessageDialog( null,"Voc� derrotou o inimigo!" );
				 }
						 
				 else if (batalha01BuTec [0] <= 0) {
					 JOptionPane.showMessageDialog( null,"Voc� n�o sobreviveu ao ataque e sua nave foi destru�da \n\nFim de jogo!" );
					 break;
				 }
				 else {
					 
					 JOptionPane.showMessageDialog( null,"Voc� n�o conseguiu destruir a nave inimiga, rode o dado outra vez!" );
				 }
			 
			 //segunda batalha ***fim***
				 
				 JOptionPane.showMessageDialog( null,
						  "Voc� fica preocupado que est� batalha tenha causado muito barulho, ent�o rapidamente\n"
						+ "entra na sala mais pr�xima para n�o ser notado"
						+ " ","Item",JOptionPane.INFORMATION_MESSAGE );
				 
				 
			 // segunda escolha busca por tecnologias **fim**
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
