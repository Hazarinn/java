package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y;}; // aqui, como temos as chaves, explicitamente temos que colocar return
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y; // Neste caso, implicitamente temos o return 
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y;}; // aqui, como temos as chaves, explicitamente temos que colocar return
		
		System.out.println(calc2.apply(2, 3));
		
		
		
		
		
	}

}
