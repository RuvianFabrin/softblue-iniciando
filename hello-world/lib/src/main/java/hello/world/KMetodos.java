package hello.world;

public class KMetodos {
	// O calcularFibonacci é um método
	// void quer dizer não retorna nada
	// ctrl+shift+f formata o código
	public static void calcularFibonacci(int vezes, String separador) {
		//int vezes = 10;
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + separador +" ");

			i = i + j;
			j = i - j;

		}
	}
	public static int[] calcularFibonacci(int vezes) {
		int [] array = new int[vezes];
		//int vezes = 10;
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {

			i = i + j;
			j = i - j;
			array[cont] = i;

		}
		return array;
	}
}
