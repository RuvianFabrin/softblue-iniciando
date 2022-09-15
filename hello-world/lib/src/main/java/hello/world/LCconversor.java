package hello.world;

import java.util.Scanner;

public class LCconversor {
	
	public static void start() {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite a temperatura:"); 
			double temp = ler.nextDouble();
			
			System.out.println("Qual a conversão? ");
			System.out.println("1: Fº -> Cº");
			System.out.println("2: Cº -> Fº");
			System.out.print(": ");
			int opcao = ler.nextInt();
			
			if(opcao==1) {
				System.out.println("A temperatura em Celsius é "+ fahrenheitToCelsius(temp));
			}else if(opcao==2) {
				System.out.println("A temperatura em Fahrenheit é "+ celsiusToFahrenheit(temp));
			}else {
				System.out.println("Opção não encontrada");
			}
			
			System.out.println("Fim do Programa");
		}
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return  (fahrenheit - 32) / 1.8;
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 1.8) + 32;
	}
}
