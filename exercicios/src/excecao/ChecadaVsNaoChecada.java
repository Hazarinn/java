package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			
			System.out.println(e.getMessage()); // e.getMessage vai pegar a mensagem de erro e imprimir no console
		}
		try {
			geraErro2();
		} catch (Throwable e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Fim :)");
		
		
	}
	
	// Excecao N�O checada ou N�O verificada
	static void geraErro1()  {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
		
	}
	
	 
	// Excecao checada ou verificada
   static void geraErro2() throws Exception {
	  
	 
		throw new Exception("Ocorreu um erro bem legal #02");

		 // throw new Exception quer dizer: lan�ar nova exce��o. 
		 
	}


}
