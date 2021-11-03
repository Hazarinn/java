package oo.abstrato;

public class Cachorro extends Mamifero {
	
	// Só é possível ter métodos abstratos em classes abstratas
	@Override
	public String mover() {
		
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		
		return "Usando leite";
	}
	
	
	

}
