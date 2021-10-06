package controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		// Aqui funciona da seguinte forma:
		// While(ENQUANTO) enquanto a expressão for menor ou maior que o contador, ele vai repetindo o loop até que chegue no valor que determinamos
		
		int contador = 1;
		
		while(contador < 20) {
			
			System.out.printf("i = %d\n", contador);
			contador +=2; // aqui ele incrementa de dois em dois
			//contador ++; aqui ele incrementa de um em um 
		}
		
	}

}
