package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
	
	//segredo == N�o consegue acessar porque � privado, somente a ana pode acessar
//			facoDentroDeCasa
//			formaDeFalar
//			todosSabem
			
		
			
			//System.out.println(esposa.segredo);
			//System.out.println(mae.facoDentroDeCasa); // s� � visivel para quem � do mesmo pacote
			System.out.println(formaDeFalar);
			System.out.println(todosSabem);
			
		}

}
