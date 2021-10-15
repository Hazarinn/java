package arrays;



public class ForEach {
	
	public static void main(String[] args) {
		
		double [] notas = {9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " "); // o print faz com que tudo seja imprimido na mesma linha
			
		}
		
		System.out.println("");
		
		 for(double nota: notas) { // Aqui temos um forEach
			 System.out.print(nota + " ");
		 }
	}

}
