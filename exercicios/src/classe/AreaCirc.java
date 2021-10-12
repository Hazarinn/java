package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.14; // assim mostra que o valor de pi está relacionado a classe e não a instancia 
	// A classe da qual eu falo é a AreaCirc.
	// Quando colocamos static, diz que o atributo pertence a classe, não a instância.
	
	
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
