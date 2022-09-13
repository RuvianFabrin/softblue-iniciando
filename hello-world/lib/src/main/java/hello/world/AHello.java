package hello.world;


public class AHello {

	public static void main(String[] args) {
		//Operadores.matematicos();
		//Operadores.relacionais();
		//Operadores.logicos();
		//PrioridadeDeOperadores.start();
		//LogicaDecisaoIf.start();
		//EstruturaDeRepeticaoDoWhile.start();
		//FEstruturaRepeticaoWhile.start();
		//GEstruturaRepeticaoFor.start();
		//HFibonacci.start();
		//ILogicaArray.start();
		//JSort.start();
		KMetodos.calcularFibonacci(10, ",");
		System.out.println();
		int[] array = KMetodos.calcularFibonacci(9);
		for(int v : array) {
			System.out.print(v + " - ");
		}
	}


}
