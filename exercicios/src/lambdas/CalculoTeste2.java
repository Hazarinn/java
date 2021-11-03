package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y;}; // aqui, como temos as chaves, explicitamente temos que colocar return
		
		System.out.println(calc.executar(1, 2));
		
		calc = (x, y) -> x * y; // Neste caso, implicitamente temos o return 
		
		System.out.println(calc.executar(1, 2));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
		
	}

}
