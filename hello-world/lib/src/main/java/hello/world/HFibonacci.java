package hello.world;

public class HFibonacci {
	public static void start() {
		int vezes = 10;
		for(int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");
			
			i = i + j;
			j = i - j;
		}
	}
}
