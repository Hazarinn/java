package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data ();
		d1.imprimirDataFormatada();
		d1.ano = 2021;
		
		Data d2 = new Data();
		
		
		
		//Dessa forma, conseguimos obter a data formatada, utilizando o método criado na classe Data
		// Armazenei o valor da dataFormatada em uma variavel, para ficar mais fácil de obter o acesso a ela
		String dataFormatada1 =  d1.obterDataFormatada();
		String dataFormatada2 =  d2.obterDataFormatada();
		
	 System.out.println(dataFormatada1);
	 System.out.println(dataFormatada2);
	 
	 d1.imprimirDataFormatada();
	 d2.imprimirDataFormatada();
	 
	 
		
		
		
				
		
	}

}
