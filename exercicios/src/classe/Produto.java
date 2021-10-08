package classe;

public class Produto {
	
	
	// Desconto vai estar entre 0 e 1 
	// ou seja 0.1 equivale a 10% de desconto
	// 0.3 30% de desconto
	// 0.9 90% de desconto
	String nome;
	double preco;
	static double DESCONTO = 0.25;
	
	 Produto() {
			
		}
	 
	
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	

	
   double precoComDesconto () {
		
		// como dentro do objeto produto eu tenho tudo o que preciso
		// não é necessário colocar os parametros por esse motivo
		
		return (preco *(1 - DESCONTO));
   }
   
   double precoComDesconto (double descontoDoGerente) {
		
		return preco *(1 - DESCONTO + descontoDoGerente);
		
	} 

}
