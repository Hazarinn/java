package oo.encapsulamento.casaA;

public class Paulo {
	
	
	Ana esposa = new Ana();	
	void testeAcessos() {
//		segredo == Não consegue acessar porque é privado, somente a ana pode acessar
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa); // Consegue acessar, pois estão no mesmo pacote
		System.out.println(esposa.formaDeFalar); // porque mora na mesma casa(mesmo pacote)
		System.out.println(esposa.todosSabem);
		
	}

}
