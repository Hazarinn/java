package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "par" : "Impar";
				
				
				
				Function<String, String> oResultadoE = 
						valor -> "O resultado � " + valor;
						
				Function<String, String> empolgado = 
						valor -> valor + "!!!";
						
						Function<String, String> duvida = 
								valor -> valor + "????";
						
						
				String resultadoFinal1 = parOuImpar
						.andThen(oResultadoE) // AndThen traduzido quer dizer : e ent�o
						.andThen(empolgado)
						.apply(32);
				System.out.println(resultadoFinal1);
				
				
				String resultadoFinal2 = parOuImpar
						.andThen(oResultadoE) // AndThen traduzido quer dizer : e ent�o
						.andThen(duvida)
						.apply(33);
				System.out.println(resultadoFinal2);
				System.out.println(parOuImpar.apply(32));
 	}

}
