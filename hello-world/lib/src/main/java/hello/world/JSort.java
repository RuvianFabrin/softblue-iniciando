package hello.world;

//Bubble Sort
public class JSort {
	public static void start() {
		int[] valores = { 3, 6, 5, 2, 1, 4, 0, 7 };
		
		for(int i = 0; i < valores.length - 1; i++) {
			for(int j = i + 1; j < valores.length ; j++) {
				if(valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}
		
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
	}

}
