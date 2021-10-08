package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		// Produto p1 foi feito usando o construtor explicito, ou seja
		// o construtor que nós mesmos criados
		Produto p1 = new Produto("notebook", 4356.89);
		
		
		
		// aqui utilizamos o construtor padrão do java
		var p2 = new Produto();
		p2.nome = "Caneta Preta"; 
		p2.preco = 12.56;
	    Produto.DESCONTO = 0.29;
	    
	    System.out.println(p1.nome);
	    System.out.println(p2.nome);
	    
	    double precoFinal1 = Produto.DESCONTO;
	    double precoFinal2 = Produto.DESCONTO ;
	    double mediaCarrinho  = (precoFinal1 + precoFinal2) / 2;
	    
	    System.out.println(precoFinal1);
	    System.out.println(precoFinal2);
	    System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	    
	  
	    
	  
	}

}
