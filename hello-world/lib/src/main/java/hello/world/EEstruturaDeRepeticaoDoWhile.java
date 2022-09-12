package hello.world;

import java.util.Scanner;

public class EEstruturaDeRepeticaoDoWhile {
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			double nota;
			int contador = 1;
			double soma = 0;
			do {				
				System.out.println("Digite a nota " + (contador++) +":");
				nota = ler.nextDouble();				
				if(nota!=-1) {
					
					soma += nota;
					System.out.println("(soma = " + soma + ") - (contador = " + contador + ")");
				}
				
				
			}while (nota != -1 );
			
			double media = soma / (contador - 2);
			System.out.println("Média = " + media);
			System.out.println("Fim do Programa.");
			
		}
	}
}
