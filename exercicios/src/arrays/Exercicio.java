package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA.length - 1); // acessando dessa forma, eu vou pegar a ultima nota
		
//		System.out.println(notasAlunoA[4]); ERRO!!
		
		double totalAlunoA = 0;
		for (int i = 0; i < 3; i++) {
			totalAlunoA += notasAlunoA[i];
			
		}
		
		
		// O resultado entre um double e um inteiro, sempre será um double!!
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; // mesmo se eu passar um valor do tipo inteiro, ele será convertido para double
		
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			totalAlunoB += notasAlunoB[i];
		
			
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length); // nota-se que lenght é um atributo e não um comportamento. 
		
		
	}

}
