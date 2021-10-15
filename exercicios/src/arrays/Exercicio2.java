package arrays;


public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [4];
		
		notasAlunoA[0] =  8.1;
		notasAlunoA[1] =  9.1;
		notasAlunoA[2] =  4.1;
		notasAlunoA[3] =  5.6;
		
		for(double alunoNotas: notasAlunoA) {
//			System.out.println(alunoNotas);
	
	
		}
		
double [] notasAlunoB = new double [4];
		
		notasAlunoB[0] =  4.1;
		notasAlunoB[1] =  6.1;
		notasAlunoB[2] =  2.1;
		notasAlunoB[3] =  2.6;
		
		
		double totalNotasB = 0;
		for(double alunoNotasB: notasAlunoB) {
			
			totalNotasB += notasAlunoB[0];
			
		
	}
		
		System.out.println(totalNotasB / notasAlunoB.length);

  }
}
