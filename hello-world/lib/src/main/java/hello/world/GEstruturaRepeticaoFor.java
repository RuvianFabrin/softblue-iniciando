package hello.world;

import java.util.Scanner;

public class GEstruturaRepeticaoFor {
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			/*for(int x = 0; x <= 10; x++) {
				System.out.println("x: "+x);
			}*/
			
			//Imprimindo tabuada
			System.out.println("Digite um número:");
			int n = ler.nextInt();
			
			for(int i = 1; i <=10; i++) {
				System.out.println(n + " x "+ i+" = " + (n * i) );
			}
		}
		//Teste de mesa, fazer no caderno é o melhor, ajuda a pensar
		//Serve para acompanhar o programa passo a passo
		//Executando o programa manualmente passo a passo
	}
}
