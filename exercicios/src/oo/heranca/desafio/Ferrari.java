package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
	//@Override // serve para deixar claro que estou sobreescrevendo um método da classe pai
	
	// ele cria uma validação para comprovar que estou sobescrevendo um método
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}
//	
	

}
