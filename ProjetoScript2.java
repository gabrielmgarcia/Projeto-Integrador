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
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave  " + nick+ "! você ja começa com:\n 2-Força "
	    		+ "\n 2-Agilidade \n 2-Resistência \n Obs:Não esqueça de anotar os ganhos e perdas de atributos"
	    		+ "\n isto sera essencial no seu desenvolvimento!!!" );
	   
			  
	  
	    
	   raca = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Humano: \n 2-Extra-terrestre:");
	  
	   
	   	if(raca.equalsIgnoreCase("1")) {
	   	  JOptionPane.showMessageDialog( null, " Você escolheu 'Humano' ");
	   	  
	   	  JOptionPane.showMessageDialog( null, "Facção “Vermelha” \n\n" + 
				"Movidos pelo dinheiro os comandantes dessa facção buscam \n pelo domínio absoluto "
				+ "para controlar todos pontos econômicos \ndo planeta “-B” para buscar melhorias "
				+ "tecnológicas em suas naves.");
	   	  
	   	TipoHumano = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Cientista: \n 2-Engenheiro:");
	   
	   	
		if(TipoHumano.equalsIgnoreCase("1")) {
			
			JOptionPane.showMessageDialog( null, " Humano - Cientista\r\n" + 
					"\r\n" + 
					"Após perder sua família na guerra, decidiu juntar-se a um lado para acabar com a infindável guerra.");
			
			JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +1\n" + 
				  		"Agilidade = +2\r\n" + 
				  		"Resistência = -1");
			  
		}
		 else if(TipoHumano.equalsIgnoreCase("2")) {
			 
			 JOptionPane.showMessageDialog( null, " Humano-Engenheiro\r\n" + 
			 		"\r\n" + 
			 		"Um gênio incompreendido cujo desejo é se tornar o mais renomado estrategista da galáxia.");
			  
			 JOptionPane.showMessageDialog( null, " Atributos \n" + 
				  		"Forca = +1\n" + 
				  		"Agilidade = -1\n" + 
				  		"Resistência = +2");
			  
		  }
		 else {
			 JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );		
		 }
		
	 	}
	   	else if(raca.equalsIgnoreCase("2")) {
	  	  JOptionPane.showMessageDialog( null, " Você escolheu 'Extra terrestre' ");
	  	  
	  	  JOptionPane.showMessageDialog( null, "Facção “Azul”\n\n" + 
				"Mais ligados aos seus valores os líderes querem \nretomar o poder completo do "
				+ "planeta e dar \ncontinuidade ao trabalho feito por seus ancestrais. " );
		   	TipoET = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Caçador: \n 2-Mercenario:");
		  
		   	if(TipoET.equalsIgnoreCase("1")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Caçador\r\n" + 
		   				"\r\n" + 
		   				"Criatura especialista em rastreamento e combates a longa distância.");
		   		
		   		JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +2\n" + 
				  		"Agilidade = +1\n" + 
				  		"Resistência = -1");
		   	}
		   	else if(TipoET.equalsIgnoreCase("2")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercenário\r\n" + 
		   				"\n" + 
		   				"Criatura corrupta sedenta por riquezas.");
		   		
		   		JOptionPane.showMessageDialog( null, " Atributos \n" + 
					  "Forca = +2\n" + 
				  		"Agilidade = -2\n" + 
				  		"Resistência = +1");
		   	}
		   	else {
		   	 JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );		
			 }
	   		
	   	}
	    else {
			  JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );			 
	    }
	   	
	    JOptionPane.showMessageDialog( null, nick + "era habitante do planeta “-B -B -B” porem uma grande guerra \n "
	    										  + "entre duas facções que buscavam o poder absoluto, acabou com a \n "
	    										  + "destruição por completa do planeta. Agora ele viaja pela galáxia \n "
	    										  + "buscando trazer a paz aos planetas que estão em guerra para que os \n"
	    										  + "inocentes não acabem pagando pela ignorância de seus comandantes. \n" );	
		
	     int countBatalha01 = 0;
		 int dado3 = 0;
		 do {
		 JOptionPane.showMessageDialog( null, " Logo após se lembrar de seu passado e entender seu povo, você se depara \n"
		 		                            + " com a aproximação de uma guerra que pode por um fim a sua raça e seu planeta. \n "
		 		                            + "\n"
		 		                            + "Sua missão é infiltrar-se em território inimigo e descobrir possíveis fraquezas....\n"
		 		                            + "\n"
		 		                            + "Seu general então lhe entrega documentos , neles contém um dispositivo capaz de cortar a \n"
		 		                            + "comunicação das naves inimigas e uma rota que demonstra uma pequena passagem para \n"
		 		                            + "entrar em território inimigo sem ser descoberto, porem essa passagem esta sob vigia de guardiões ..... ");
		
			dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			int totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Seu ataque não surtiu efeito e o inimigo contra-atacou com mais força e sua nave foi danificada e você \n teve que recuar (agilidade-1)" );		
				break;
			case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " falha no dispositivo de comunicação, o inimigo chamou reforços sua nave foi danificada e você \n teve que recuar (resistência-1)" );		
				break;
			case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você  adquiriu uma nova tecnologia, defesa contra misseis (resistência+2)" );		
				break;
			case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque crítico, você adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " Ataque crítico, você  adquiriu uma nova tecnologia, escudo (resistência+1)" );		
				break;
			case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + " ataque crítico, você  adquiriu uma nova tecnologia, metralhadora (força+1)" );		
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
