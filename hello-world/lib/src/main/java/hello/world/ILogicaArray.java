package hello.world;

import java.util.Scanner;

public class ILogicaArray {
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			/*System.out.println("Digite a nota 1: ");
			double nota1 = ler.nextDouble();
			
			System.out.println("Digite a nota 2: ");
			double nota2 = ler.nextDouble();
			
			System.out.println("Digite a nota 3: ");
			double nota3 = ler.nextDouble();
			
			System.out.println("Notas: ");
			System.out.println(nota1);
			System.out.println(nota2);
			System.out.println(nota3);*/
			//teste
			
			double[] notas = new double[3];
			
			for(int i = 0; i < notas.length;i++) {
				System.out.println("Digite a nota "+ (i+1) +": ");				
				notas[i] = ler.nextDouble();
			}
			
			for(double nota : notas) {
				System.out.println(nota);
			}
			
			double[] notas2 = {8.5, 9.0, 7.5};
			for(double nota2 : notas2) {
				System.out.println(nota2);
			}
		}
		
		
	}
}
