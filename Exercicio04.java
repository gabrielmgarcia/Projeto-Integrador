package Aula07;

import java.util.Scanner;

public class Exercicio04 {
	static int funcao(int a) {
		
		int result;
		
		if(a < -1) {
			
			result = -a + 2;
			
		}
		
		 if(a >=- 1 && a <=2) {
			
			result = (a * a)-4;
			
		}
		
		else  {
			
			result = (2 * a)-1;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		int resultado = funcao(num);
		
		System.out.println(resultado);
	}

}
