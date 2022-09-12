package hello.world;

public class BPrioridadeDeOperadores {
	public static void start() {
		//x=5*3+raiz de 7*7 <=100 ou não v e v
		
		//v=true
		//Primeiro os aritiméticos
		//Raiz, potencia, multiplicação e divisão
		//Soma, subtração, 
		
		//x=15+raiz de 49 <=100 ou não v e v
		
		//x=15+7<=100 ou não v e v
		//x=22<=100 ou não v e v
		
		//Depois relacionais
		//x=true ou não true e true
		//Prioridade entre os operadores lógicos
		//Não, depois (E) depois (OU)
		//x=true ou false e true
		//x=true ou false
		//x=true
		boolean v =true;
		boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
		
		System.out.println(x);
	}
}
