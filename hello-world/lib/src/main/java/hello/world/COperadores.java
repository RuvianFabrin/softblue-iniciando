package hello.world;

import java.util.Scanner;

public class COperadores {
	public static void matematicos() {
		// System.out.println("Olá Mundo!!!");
		try (Scanner ler = new Scanner(System.in)) {
			/*
			 * System.out.println("Digite o texto 1:"); String texto1 = ler.next();
			 * 
			 * System.out.println("Digite o texto 2:"); String texto2 = ler.next();
			 * 
			 * String textoJunto = texto1+" "+texto2;
			 * 
			 * System.out.println("Concatenou: "+textoJunto);
			 */
			/*
			 * System.out.println(">>> Caucula o delta de Bascara <<<");
			 * System.out.println("a:"); double a = ler.nextDouble();
			 * 
			 * System.out.println("b:"); double b = ler.nextDouble();
			 * 
			 * System.out.println("c:"); double c = ler.nextDouble();
			 * 
			 * double delta = Math.pow(b, 2) - 4 * a * c; double x1 = (-b +
			 * Math.sqrt(delta)) / ( 2 * a); double x2 = (-b - Math.sqrt(delta)) / ( 2 * a);
			 * 
			 * System.out.println("Delta: "+delta); System.out.println("x1: "+x1);
			 * System.out.println("x2: "+x2);
			 */

			/*
			 * System.out.println(">>> Caucula o Exagono Regular <<<");
			 * System.out.println("l:"); int lado = ler.nextInt();
			 * 
			 * int p = 6 * lado; double area = (3 * lado * Math.sqrt(3)) / 2 ;
			 * 
			 * System.out.println("Perimetro:\n>>> "+p);
			 * System.out.println("Area:\n>>> "+area);
			 */

			System.out.println(">>> Par ou Impar <<<");
			System.out.println("Digite um número inteiro:");
			int numero = ler.nextInt();
			String resultado = (numero % 2) == 0 ? "Par" : "Impar";
			System.out.println("O número é " + resultado);
		}
	}

	public static void relacionais() {
		// System.out.println("Olá Mundo!!!");
		try (Scanner ler = new Scanner(System.in)) {

			System.out.println(">>> Verifica se os números digitados são iguais. <<<");
			System.out.println("Valor n1:");
			int n1 = ler.nextInt();
			System.out.println("Valor n2:");
			int n2 = ler.nextInt();
			boolean igual = n1 == n2;
			System.out.println("É igual? " + igual);

			boolean diferente = n1 != n2;
			System.out.println("É diferente? " + diferente);

			boolean primeiroMaiorQueSegundo = n1 > n2;
			System.out.println("Primeiro maior que segundo? " + primeiroMaiorQueSegundo);

			boolean primeiroMaiorIgualQueSegundo = n1 >= n2;
			System.out.println("Primeiro maior igual que segundo? " + primeiroMaiorIgualQueSegundo);
		}
	}
	
	public static void logicos() {
		// System.out.println("Olá Mundo!!!");
		try (Scanner ler = new Scanner(System.in)) {
			//Negação (Não)
			//Conjunção (E), só é verdadeiro quado todas as condições são verdadeiras
			//Disjunção (OU), só é falso quado todas as condições são falsas
			
			//boolean a =true;
			//boolean b = !a;//Negação, inverte o valor
			//System.out.println(b);
			
			//boolean c = true;
			//boolean d = true;
			//System.out.println(c && d);
			
			boolean e = false;
			boolean f = false;
			System.out.println(e || f);
			
		}
	}
}
