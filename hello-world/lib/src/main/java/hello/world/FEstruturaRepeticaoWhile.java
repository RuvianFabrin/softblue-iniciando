package hello.world;

import java.util.Scanner;

public class FEstruturaRepeticaoWhile {
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			double nota = 0;
			int cont = 1;
			double soma = 0;
			while(true) {
				System.out.println("Digite a nota "+(cont)+":");
				nota = ler.nextDouble();
				if(nota==-1) {
					cont--;
					break;
				}
				cont++;
				soma +=nota;				
			}
			
			System.out.println("Média:"+(soma/cont));
		}
	}
}
