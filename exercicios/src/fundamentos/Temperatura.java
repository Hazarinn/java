package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (F - 32) 5/9 = C
		
		double farenheit = 86;
		
		final double FATOR = 5/9.0;
		final int AJUSTE = 32;
		
		double graus = (farenheit - AJUSTE) * FATOR;
		
		System.out.println("A conversão para graus fica" + graus);
		
	}

}
