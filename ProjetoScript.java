package Projeto;

import javax.swing.JOptionPane;;

public class ProjetoScript {
	static int dado(int a) {	
		
		a = 1 +(int) (Math.random() * 6);
		return a;
			
	}

	public static void EscolhaRaca(String raca) {

		if (raca.equalsIgnoreCase("1")) {

			JOptionPane.showMessageDialog(null, "Você escolheu 'Humano' ");

			JOptionPane.showMessageDialog(null,
					"Facção “Vermelha” \n\n" + "Humanos movidos pelo dinheiro, os comandantes dessa facção buscam \n"
							+ "pelo domínio absoluto para controlar todos pontos econômicos \n"
							+ "do planeta “-B” para buscar melhorias tecnológicas em suas naves.");
		}

		else {

			JOptionPane.showMessageDialog(null, "Você escolheu 'Extraterrestre' ");

			JOptionPane.showMessageDialog(null,
					"Facção “Azul”\n\n" + "Extraterrestes ligados aos seus valores, os líderes querem \n"
							+ "retomar o poder completo do planeta e dar \n"
							+ "continuidade ao trabalho feito por seus ancestrais. ");
		}
	}
	
public static void EscolhaHumano(String Humano) {

		
		if(Humano.equalsIgnoreCase("1")) {
			
   			JOptionPane.showMessageDialog( null, "Humano - Cientista\r\n\r\n"
   					+ "Após perder sua família na guerra, decidiu juntar-se a um lado para acabar com a infindável guerra.");
		
   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
				    "Forca = +1\n" + 
			  		"Agilidade = +2\r\n" + 
			  		"Resistência = -1");
		  
   		}
   		else {
		 
   			JOptionPane.showMessageDialog( null, "Humano-Engenheiro\r\n\r\n"
   					+ "Um gênio incompreendido cujo desejo é se tornar o mais renomado estrategista da galáxia.");
		  
   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
			  		"Forca = +1\n" + 
			  		"Agilidade = -1\n" + 
			  		"Resistência = +2");
   		}	

	}
	
public static void EscolhaET(String ET) {

	
	if(ET.equalsIgnoreCase("1")) {
		
		JOptionPane.showMessageDialog( null, "Extraterrestre - Caçador\r\n\r\n"
	
				+ "Criatura especialista em rastreamento e combates a longa distância.");
		
		JOptionPane.showMessageDialog( null, "Atributos \n" + 
		    "Forca = +2\n" + 
	  		"Agilidade = +1\n" + 
	  		"Resistência = -1");
	}
	else {
		
		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercenário\r\n\n"
   				+ "Criatura corrupta sedenta por riquezas.");
   		
   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
			    "Forca = +2\n" + 
		  		"Agilidade = -2\n" + 
		  		"Resistência = +1");
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
			
			opcao = JOptionPane.showInputDialog(null, "Bem-vindo ao Jogo “Batalha estelar”\n\n\r"
					+ "Digite:\n\r1 - Instruções\n\r2 - Jogar\n\r3 - Créditos\n\r4 - Sair\n\r","Menu",JOptionPane.INFORMATION_MESSAGE);
			
			
		
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
		do {
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");	
		}while(nick.equalsIgnoreCase(""));
	    JOptionPane.showMessageDialog( null, "Bem vindo " + nick + "!!!" );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave " + nick + "! você já começa com:\n"
	    		+ "5-Força \n 5-Agilidade \n5-Resistência  \n"
	    		+ "Obs: Não se esqueça de anotar os ganhos e perdas de atributos\n"
	    		+ "isto será essencial no seu desenvolvimento!!!" );
	    
		do {
		    raca = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Humano: \n 2-Extraterrestre:");
		    
		}while(!raca.equalsIgnoreCase("1") && !raca.equalsIgnoreCase("2"));
		    
		EscolhaRaca(raca);
		    
	    if(raca.equalsIgnoreCase("1")){
	    	
	    	do {
	    		TipoHumano = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Cientista: \n 2-Engenheiro:");
		    
	    	}while(!TipoHumano.equalsIgnoreCase("1") && !TipoHumano.equalsIgnoreCase("2"));
	    
	    EscolhaHumano(TipoHumano);
	    
	    }
	    else {
	    	
	    	do {
	    		TipoET = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Caçador: \n 2-Mercenario:");
	    		
	    	}while(!TipoET.equalsIgnoreCase("1") && !TipoET.equalsIgnoreCase("2"));	
	    	
	    EscolhaET(TipoET);
	    
	    }
	   	
	   		
	 
	   	
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
				 do {
						dado2 = JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");

					} while (!dado2.equalsIgnoreCase("1"));
			 dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			  totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			 	case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada. \nVocê teve que recuar. (agilidade-1)" );		
				break;
			 	case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVocê teve que recuar. (resistência-1)" );		
				break;
			 	case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, defesa contra misseis (resistência+1)" );		
				break;
			 	case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			 	case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, escudo (resistência+1)" );		
				break;
			 	case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você adquiriu uma nova tecnologia, metralhadora (força+2)" );		
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
		 do{
				
				escolha = JOptionPane.showInputDialog(null,
					"Você pode:\r\n\n"
							+ "1 - Entrar nesse torneio, tentar a sorte e vencer todos os desafios, porém... \n"
							+ "Pode ser um caminho sem volta, por conta do imenso perigo!\r\n\n"
							+ "2 - Você pode investigar mais a fundo sobre essa raça inimiga e tentar destruir \n"
							+ "a sua influência!\r\n\n");
			}while(escolha.equalsIgnoreCase("1") && escolha.equalsIgnoreCase("2"));
		 
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
								+ " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
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
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
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

					JOptionPane.showMessageDialog(null, "Parabéns! Você derrotou o primeiro inimigo!");

					JOptionPane.showMessageDialog(null,
							"O segundo guerreiro é um ex prisioneiro que foi capturado pelos \n"
									+ "“nome da raça” e vem sendo treinado intensamente para aniquilar seus inimigos, \n"
									+ "seu poder de fogo é muito grande.");

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
									+ " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
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
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
							break;
						case 6:
							JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
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

						JOptionPane.showMessageDialog(null, "Parabéns! Você derrotou o segundo inimigo!");

						JOptionPane.showMessageDialog(null,
								"Seu terceiro oponente será um oficial de alto escalão, \n"
										+ "ele já foi reconhecido várias vezes por sua eficiência em aniquilação \n"
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
										+ " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
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
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
								break;
							case 6:
								JOptionPane.showMessageDialog(null, "Dano de " + totalSoma2 + " Ataque crítico ");
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

							JOptionPane.showMessageDialog(null, "Parabéns! Chegou ao último inimigo!");

							JOptionPane.showMessageDialog(null,
									"O Quarto oponente é o próprio líder dos “nome da raça” sua \n "
											+ "nave é extremamente poderosa, sendo superior a todas as outras de sua raça.");

							JOptionPane.showMessageDialog(null, "Pontos de vida = " + v[0] + "\nCombustivel = "
									+ v[1] + "\nPontos de vida do inimigo = " + vIni4[0]);

							do {
								// última batalha do coliseu

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
											+ " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada.");
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
											"Dano de " + totalSoma2 + " Ataque crítico ");
									break;
								case 6:
									JOptionPane.showMessageDialog(null,
											"Dano de " + totalSoma2 + " Ataque crítico ");
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

								JOptionPane.showMessageDialog(null, "Parabéns! Você passou pelo coliseu");
							} else if (v[0] <= 0) {

								JOptionPane.showMessageDialog(null,
										"Você não sobreviveu à batalha e sua nave foi destruída \n\nFim de jogo!");
								break;
							}

						} else if (v[0] <= 0) {

							JOptionPane.showMessageDialog(null,
									"Você não sobreviveu à batalha e sua nave foi destruída \n\nFim de jogo!");
							break;
						}

					} else if (v[0] <= 0) {

						JOptionPane.showMessageDialog(null,
								"Você não sobreviveu à batalha e sua nave foi destruída \n\nFim de jogo!");
						break;
					}

				}

				else if (v[0] <= 0) {
					JOptionPane.showMessageDialog(null,
							"Você não sobreviveu à batalha  e sua nave foi destruída \n\nFim de jogo!");
					break;
				}

				// final batalhas do coliseu
			}
		 
		 else {
			 // segunda escolha busca por tecnologias **Começo**
			 JOptionPane.showMessageDialog( null,"Você continua a sua saga pela busca de informações do inimigo");
			 JOptionPane.showMessageDialog( null,"Entre os habitantes, havia um que por não concordar com os métodos feitos \n "
			 		+ "pelo seu líder, acabou mudando de lado, e em sua fuga levou consigo alguns documentos, ele o entrega \n"
			 		+ "esses documentos, que são um mapa, nele está especificado uma rota que mostrava um caminho para o \n"
			 		+ "centro das forças inimigas.... E junto com esse documento também está um dispositivo feito por ele \n"
			 		+ "que corta o sinal de comunicação entre os guardas com o resto do planeta!");
			 
			 JOptionPane.showMessageDialog( null,"Sua missão é se infiltrar e descobrir mais sobre os inimigos!");
			 JOptionPane.showMessageDialog( null,"Você sai em sua jornada, e a informação obtida é de que os guardas são guardiões \n"
			 									+ " eles são a patente mais alta da divisão de defesa do exército inimigo, não será \n"
			 									+ "fácil derrota-los...  ");
			 JOptionPane.showMessageDialog( null,"Ao se aproximar deles, você ativa o dispositivo para cortar o sinal, porém logo é notado... \n "
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
				 // decidir as opcoes **começo**
				 
				 	case 1:
					JOptionPane.showMessageDialog( null,"Dano de "+ (dano - 5)  + " Você errou o ataque e os inimigos contra-atacaram \n sua nave ficou mais lenta." );	
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
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque forte, Você quebrou a defesa inimiga agora ele esta vulnerável" );		
					
					batalha01BuTec[1]-=dano;
					break;
				 	case 5:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque crítico, a nave inimiga está mais lenta" );		
					
					batalha01BuTec[1]-=dano;
					break;
				 	case 6:
					JOptionPane.showMessageDialog( null,"Dano de "+ dano + " Ataque crítico, motor da nave inimiga deu sinal de falha" );		
					
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
				 JOptionPane.showMessageDialog( null,"Você derrotou o inimigo!" );
				 JOptionPane.showMessageDialog( null,"Você adquiriu uma arma de mão... uma pistola a lazer muito usada em batalhas terrestres" );
			 }
					 
			 else if (batalha01BuTec [0] <= 0) {
				 JOptionPane.showMessageDialog( null,"Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!" );
				 break;
			 }
			 else {
				 
				 JOptionPane.showMessageDialog( null,"Você não conseguiu destruir a nave inimiga, rode o dado outra vez!" );
			 }
			 
			 JOptionPane.showMessageDialog( null,
					  "Você está dentro do centro nervoso do quartel general dos inimigos, agora precisa reunir mais \n"
					+ "informação sobre eles, você esconde sua nave e está apenas com uma arma (com a qual ainda não \n"
					+ "possui muita habilidade) percebe então que esta sendo vigiado enquanto caminha, e uma espécie \n"
					+ "de ciclope da raça dos otaidi  entra em seu caminho... ele já sabe que você é um invasor, e puxa \n"
					+ "uma arma e atira contra você, por sua sorte ele também parece não ter uma boa mira....\n"
					+ "porém os ciclopes são extremamente altos e sua força física e vital são incomparaveis",
					"Introdução",JOptionPane.INFORMATION_MESSAGE );
			
			 int vidaPersonagem[] = {100,200};
			 
			 JOptionPane.showMessageDialog( null,"Sua vida =" +vidaPersonagem[0] + "\nVida Ciclope = " + vidaPersonagem[1],"Informações",JOptionPane.INFORMATION_MESSAGE );
			 
			 // segunda batalha ***começo***
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
						 		JOptionPane.showMessageDialog( null," Você errou o tiro, e sofreu um dano" );	
							vidaPersonagem[0]-=25;
							break;
						 	case 2:
						 		JOptionPane.showMessageDialog( null," Você errou o tiro quase o acertando, e sofreu um dano" );		
							vidaPersonagem[0]-=25;
							break;
						 	case 3:
						 		JOptionPane.showMessageDialog( null,"Você acertou um tiro, mas ainda não atingiu um ponto vital \n"
															   +"Dano de " + dano  );		
							vidaPersonagem [1]-=dano;
							break;
						 	case 4:
						 		JOptionPane.showMessageDialog( null,"Você acertou um tiro, não atingiu um ponto vital mas passou muito próximo \n"
						 						               +"Dano de " + dano  );						
							vidaPersonagem[1]-=dano;
							break;
						 	case 5:
						 		JOptionPane.showMessageDialog( null,"Você acertou um ponto vital\n"
										   +"Dano de " + dano  );	
							
							vidaPersonagem[1]-=dano;
							break;
						 	case 6:
						 		JOptionPane.showMessageDialog( null,"Você acertou um ponto vital, tirando um boa parte da vida do ciclope \n"
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
					 JOptionPane.showMessageDialog( null,"Você derrotou o inimigo!" );
				 }
						 
				 else if (batalha01BuTec [0] <= 0) {
					 JOptionPane.showMessageDialog( null,"Você não sobreviveu ao ataque e sua nave foi destruída \n\nFim de jogo!" );
					 break;
				 }
				 else {
					 
					 JOptionPane.showMessageDialog( null,"Você não conseguiu destruir a nave inimiga, rode o dado outra vez!" );
				 }
			 
			 //segunda batalha ***fim***
				 
				 JOptionPane.showMessageDialog( null,
						  "Você fica preocupado que está batalha tenha causado muito barulho, então rapidamente\n"
						+ "entra na sala mais próxima para não ser notado"
						+ " ","Item",JOptionPane.INFORMATION_MESSAGE );
				 
				 
			 // segunda escolha busca por tecnologias **fim**
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
