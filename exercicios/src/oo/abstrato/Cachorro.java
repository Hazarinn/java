package oo.abstrato;

public class Cachorro extends Mamifero {
	
	// S� � poss�vel ter m�todos abstratos em classes abstratas
	@Override
	public String mover() {
		
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		
		return "Usando leite";
	}
	
	
	

}
