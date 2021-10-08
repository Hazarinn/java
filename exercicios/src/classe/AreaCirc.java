package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14; // assim mostra que o valor de pi está relacionado a classe e não a instancia 
	
	
	AreaCirc (double raioInicial) {
		
		raio = raioInicial;
		
	}
			
	double area() {
		
		return PI * raio * raio;
		
	}		
	
	static double area(double raio) {
		
		return PI * Math.pow(raio, 2);
		
	}

}
