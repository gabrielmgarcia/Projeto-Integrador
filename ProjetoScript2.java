package CopoScriptTeste;

import java.util.Scanner;

import javax.swing.JOptionPane;;

public class ProjetoScript2 {
static int dado(int a) {	
	
	a = 1 +(int) (Math.random() * 6);
	return a;
			
	}

static void EscolhaPersonagem(){
	
	
}
	

	public static void main(String[] args) {
		String nick;
		String raca;
		String TipoHumano = null;
		String TipoET = null;
		String dado2;
		String somaAtributos;
		
		
		
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");				
	    JOptionPane.showMessageDialog( null, " Bem vindo  " + nick );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave  " + nick+ "! voc� ja come�a com:\n 2-For�a "
	    		+ "\n 2-Agilidade \n 2-Resist�ncia \n Obs:N�o esque�a de anotar os ganhos e perdas de atributos"
	    		+ "\n isto sera essencial no seu desenvolvimento!!!" );
	   
			  
	  
	    
	   raca = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Humano: \n 2-Extra-terrestre:");
	  
	   
	   	if(raca.equalsIgnoreCase("1")) {
	   	  JOptionPane.showMessageDialog( null, " Voc� escolheu 'Humano' ");
	   	  
	   	  JOptionPane.showMessageDialog( null, "Fac��o �Vermelha� \n\n" + 
				"Movidos pelo dinheiro os comandantes dessa fac��o buscam \n pelo dom�nio absoluto "
				+ "para controlar todos pontos econ�micos \ndo planeta �-B� para buscar melhorias "
				+ "tecnol�gicas em suas naves.");
	   	  
	   	TipoHumano = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Cientista: \n 2-Engenheiro:");
	   
	   	
		if(TipoHumano.equalsIgnoreCase("1")) {
			
			JOptionPane.showMessageDialog( null, " Humano - Cientista\r\n" + 
					"\r\n" + 
					"Ap�s perder sua fam�lia na guerra, decidiu juntar-se a um lado para acabar com a infind�vel guerra.");
			
			JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +1\n" + 
				  		"Agilidade = +2\r\n" + 
				  		"Resist�ncia = -1");
			  
		}
		 else if(TipoHumano.equalsIgnoreCase("2")) {
			 
			 JOptionPane.showMessageDialog( null, " Humano-Engenheiro\r\n" + 
			 		"\r\n" + 
			 		"Um g�nio incompreendido cujo desejo � se tornar o mais renomado estrategista da gal�xia.");
			  
			 JOptionPane.showMessageDialog( null, " Atributos \n" + 
				  		"Forca = +1\n" + 
				  		"Agilidade = -1\n" + 
				  		"Resist�ncia = +2");
			  
		  }
		 else {
			 JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );		
		 }
		
	 	}
	   	else if(raca.equalsIgnoreCase("2")) {
	  	  JOptionPane.showMessageDialog( null, " Voc� escolheu 'Extra terrestre' ");
	  	  
	  	  JOptionPane.showMessageDialog( null, "Fac��o �Azul�\n\n" + 
				"Mais ligados aos seus valores os l�deres querem \nretomar o poder completo do "
				+ "planeta e dar \ncontinuidade ao trabalho feito por seus ancestrais. " );
		   	TipoET = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Ca�ador: \n 2-Mercenario:");
		  
		   	if(TipoET.equalsIgnoreCase("1")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Ca�ador\r\n" + 
		   				"\r\n" + 
		   				"Criatura especialista em rastreamento e combates a longa dist�ncia.");
		   		
		   		JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +2\n" + 
				  		"Agilidade = +1\n" + 
				  		"Resist�ncia = -1");
		   	}
		   	else if(TipoET.equalsIgnoreCase("2")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercen�rio\r\n" + 
		   				"\n" + 
		   				"Criatura corrupta sedenta por riquezas.");
		   		
		   		JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +2\n" + 
				  		"Agilidade = -2\n" + 
				  		"Resist�ncia = +1");
		   	}
		   	else {
		   	 JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );		
			 }
	   		
	   	}
	    else {
			  JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );			 
	    }
	   	
	    JOptionPane.showMessageDialog( null, nick + "era habitante do planeta �-B -B -B� porem uma grande guerra \n "
	    										  + "entre duas fac��es que buscavam o poder absoluto, acabou com a \n "
	    										  + "destrui��o por completa do planeta. Agora ele viaja pela gal�xia \n "
	    										  + "buscando trazer a paz aos planetas que est�o em guerra para que os \n"
	    										  + "inocentes n�o acabem pagando pela ignor�ncia de seus comandantes. \n" );	
		
	     int countBatalha01 = 0;
		 int dado3 = 0;
		 do {
		 JOptionPane.showMessageDialog( null, " Logo ap�s se lembrar de seu passado e entender seu povo, voc� se depara \n"
		 		                            + " com a aproxima��o de uma guerra que pode por um fim a sua ra�a e seu planeta. \n "
		 		                            + "\n"
		 		                            + "Sua miss�o � infiltrar-se em territ�rio inimigo e descobrir poss�veis fraquezas....\n"
		 		                            + "\n"
		 		                            + "Seu general ent�o lhe entrega documentos , neles cont�m um dispositivo capaz de cortar a \n"
		 		                            + "comunica��o das naves inimigas e uma rota que demonstra uma pequena passagem para \n"
		 		                            + "entrar em territ�rio inimigo sem ser descoberto, porem essa passagem esta sob vigia de guardi�es ..... ");
		
			dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			int totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada e voc� \n teve que recuar (agilidade-1)" );		
				break;
			case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " falha no dispositivo de comunica��o, o inimigo chamou refor�os sua nave foi danificada e voc� \n teve que recuar (resist�ncia-1)" );		
				break;
			case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc�  adquiriu uma nova tecnologia, defesa contra misseis (resist�ncia+2)" );		
				break;
			case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque cr�tico, voc� adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque cr�tico, voc�  adquiriu uma nova tecnologia, escudo (resist�ncia+1)" );		
				break;
			case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " ataque cr�tico, voc�  adquiriu uma nova tecnologia, metralhadora (for�a+1)" );		
				break;

			default: JOptionPane.showMessageDialog( null, " morreu" );	
				break;	
			}
			 
			 countBatalha01++;
			
			 }while((dado3 == 1 && dado3 == 2) && countBatalha01 !=2 );
			
				 if(dado3 >2) {
				 JOptionPane.showMessageDialog( null,"efefgeugye" );		
				 }
				 
				 else {
					 JOptionPane.showMessageDialog( null,"Voce atingiu o maximo de chances" );	
				 }
	
	}
}
