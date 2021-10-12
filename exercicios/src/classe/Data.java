package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	
	Data () {
		
		// Sempre que eu quiser iniciar um construtor com valor padr�o, eu posso colocar na hora que estiver construindo ele 
		
     //	dia = 1;
    //	mes = 1;
   //   ano = 1970;
		
	this(1, 1, 1970); // essa � a forma utilizada para chamar um construtor dentro de outro construtor
		
		// VALOR PADR�O
		
		// byte, short, int, long -> por padr�o o valor ser� 0;
		// float, double -> 0.0
		// boolean -> false
		
		// Objetos -> null
		
		String s;
		s = null;
		System.out.println(s);
		
		int a;
		
		a = 0; // a vari�ve s� pode ser utilizada quando for inicializada
		// quando temos uma vari�vel local, obrigatoriamente ela dever� ser inicializada
		System.out.println(a); // n�o dar� certo porque uma vari�vel local n�o � inicializada por padr�o
		
		
		 		
	}
	
Data (int dia, int mes, int ano) {
	
		
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	 String obterDataFormatada() {
		 
		 final String formato = "%d/%d/%d";
		 return String.format(formato, this.dia, mes, ano);
		 
		
		 
		 // Usando o string.format, eu consegui formatar o m�todo para imprimir corretamente na tela
		 // dessa forma: 2/2/1996
		 
	 }
	 
	 void imprimirDataFormatada(){
		 System.out.println( obterDataFormatada());
	 }
	 
//	 static void teste() {
//		 this.dia = 3;
//		 
//		 // N�o � poss�vel, pois um m�todo static de classe e na� de instancia
//		 // se eu usar o this.dia no exemplo acima, a� sim se torna v�lido, pois � um m�todo de inst�ncia, n�o de classe
	 // o m�todo est�tico existe associado a classe e o this � uma instancia da classe.
//	 }
	
	
}
