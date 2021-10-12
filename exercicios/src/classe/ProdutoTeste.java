package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		// Produto p1 foi feito usando o construtor explicito, ou seja
		// o construtor que n�s mesmos criamos
		Produto p1 = new Produto("notebook", 4356.89);
		
		
		
		// aqui utilizamos o construtor padr�o do java
		var p2 = new Produto();
		p2.nome = "Caneta Preta"; 
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;  
		  
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
	    
	    double precoFinal1 = p1.precoComDesconto(0.2);
	    double precoFinal2 = p2.precoComDesconto(0.1);
	    double mediaCarrinho  = (precoFinal1 + precoFinal2) / 2;
	    
	   
	    
	    
	    
	    System.out.println(precoFinal2);
	    System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	    
	  
	    
	  
	}

}
