package oo.encapsulamento.casaA;

public class Paulo {
	
	
	Ana esposa = new Ana();	
	void testeAcessos() {
//		segredo == N�o consegue acessar porque � privado, somente a ana pode acessar
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}

}
