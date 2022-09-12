package hello.world;

import java.util.Scanner;

public class DLogicaDecisaoIf {
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite sua idade:"); 
			int idade = ler.nextInt();
			
			if(idade >= 0 && idade <= 12) {
				System.out.println("Você é criança.");
			}else if(idade > 12 && idade <= 17){
				System.out.println("É adolescente.");
			}else if(idade > 17 && idade <= 59){
				System.out.println("É adulto.");
			}else if(idade > 59){
				System.out.println("É idoso.");
			}else {
				System.out.println("Idade Inválida.");
			}
			
			System.out.println("Fim do Programa");
		}
	}
}
