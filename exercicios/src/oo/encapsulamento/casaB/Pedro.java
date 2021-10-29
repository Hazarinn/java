package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
	
	//segredo == Não consegue acessar porque é privado, somente a ana pode acessar
//			facoDentroDeCasa
//			formaDeFalar
//			todosSabem
			
		
			
			//System.out.println(esposa.segredo);
			//System.out.println(mae.facoDentroDeCasa); // só é visivel para quem é do mesmo pacote
			System.out.println(formaDeFalar); // atributos recebidos por herança, por isso pode ser acessados sem instanciação de Ana
			System.out.println(todosSabem); // atributos recebidos por herança, por isso pode ser acessados sem instanciação de Ana
			
		}

}
