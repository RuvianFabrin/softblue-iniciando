package hello.world;

public class HFibonacci {
	public static void start() {
		int vezes = 10;
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");
			
			i = i + j;
			j = i - j;
			
			//Aprendendo a usar o Debug do Eclipse
			//Coloque o Break Point onde você deseja entrar com o Debug
			//Vai na Baratinha
			//Resume(F8): Vai até o próximo break point
			//Terminate: para o debug
			//Step Into(F5): entra dentro das Classes
			//Step Over(F6): Vai pra próxima linha dentroda classe que está o breake point atual
			//Step Return(F7): Volta caso tenha entrado em uma classe
		}
	}
}
