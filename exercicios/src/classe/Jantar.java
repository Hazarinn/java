package classe;

public class Jantar { 
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("frango", 0.123);
		Comida c2 = new Comida("arroz", 0.254);
		
		Pessoa p1 = new Pessoa("Rubens", 99.8);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		p1.comer(c1);
		
		p1.comer(c1);
		
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
