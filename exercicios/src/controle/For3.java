package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		// Se eu quiser acessar a vari�vel "i" fora do escopo, preciso deixar ela do lado de fora do FOR!!!!!!!
		
//		for(int i = 0;i < 10; i++) {
//			System.out.println(i);
//		}		
//		
//		System.out.println("Saiu do for...");
//		System.out.println(i);
		
		// A seguir temos um la�o dentro do outro
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			// Nesse exemplo acima, o for da variavel j vai sendo executado at� que termine tamb�m o for prim�rio
			
			System.out.println();
		}
	}

}
