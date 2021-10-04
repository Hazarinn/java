package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (F - 32) 5/9 = C
		
		double farenheit = 20;
		
		final double numero1 = 5/9.0;
		final int numero2 = 32;
		
		double graus = (farenheit - numero2) / numero1;
		
		System.out.println("A conversão para graus fica" + graus);
		
	}

}
