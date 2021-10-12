package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	
	Data () {
		
		// Sempre que eu quiser iniciar um construtor com valor padrão, eu posso colocar na hora que estiver construindo ele 
		
     //	dia = 1;
    //	mes = 1;
   //   ano = 1970;
		
	this(1, 1, 1970); // essa é a forma utilizada para chamar um construtor dentro de outro construtor
		
		// VALOR PADRÃO
		
		// byte, short, int, long -> por padrão o valor será 0;
		// float, double -> 0.0
		// boolean -> false
		
		// Objetos -> null
		
		String s;
		s = null;
		System.out.println(s);
		
		int a;
		
		a = 0; // a variáve só pode ser utilizada quando for inicializada
		// quando temos uma variável local, obrigatoriamente ela deverá ser inicializada
		System.out.println(a); // não dará certo porque uma variável local não é inicializada por padrão
		
		
		 		
	}
	
Data (int dia, int mes, int ano) {
	
		
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	 String obterDataFormatada() {
		 
		 final String formato = "%d/%d/%d";
		 return String.format(formato, this.dia, mes, ano);
		 
		
		 
		 // Usando o string.format, eu consegui formatar o método para imprimir corretamente na tela
		 // dessa forma: 2/2/1996
		 
	 }
	 
	 void imprimirDataFormatada(){
		 System.out.println( obterDataFormatada());
	 }
	 
//	 static void teste() {
//		 this.dia = 3;
//		 
//		 // Não é possível, pois um método static de classe e naõ de instancia
//		 // se eu usar o this.dia no exemplo acima, aí sim se torna válido, pois é um método de instância, não de classe
	 // o método estático existe associado a classe e o this é uma instancia da classe.
//	 }
	
	
}
