package oo.abstrato;

public abstract class Animal {
	
	// Só é possível ter métodos abstratos em classes abstratas
	
	public String respirar() {
		return "Usando Oxigenio";
	}
	
	public abstract String mover(); 
		
	

}
