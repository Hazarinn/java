package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
	//@Override // serve para deixar claro que estou sobreescrevendo um m�todo da classe pai
	
	// ele cria uma valida��o para comprovar que estou sobescrevendo um m�todo
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}
//	
	

}
