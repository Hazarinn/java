package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	
	
	Data (int diaInicial, int mesInicial, int anoInicial) {
		
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	Data () {
		
		// Sempre que eu quiser iniciar um construtor com valor padrão, eu posso colocar na hora que estiver construindo ele 
		
	dia = 1;
	mes = 1;
	ano = 1970;
		
		 		
	}
	
	 String obterDataFormatada() {
		 
		 return String.format("%d/%d/%d", dia, mes, ano);
		 
		 // Usando o string.format, eu consegui formatar o método para imprimir corretamente na tela
		 // dessa forma: 2/2/1996
		 
	 }
	 
	 void imprimirDataFormatada(){
		 System.out.println( obterDataFormatada());
	 }
	
	
}
