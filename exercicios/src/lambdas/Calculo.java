package lambdas;


@FunctionalInterface // aqui � para deixar claro que s� podemos ter uma fun��o na classe!!
public interface Calculo {
	
	// Interface funcional s� pode conter um m�todo!!!
	
	 double executar(double a, double b);
	 
	 default String legal() {
		 return "legal";
	 }
	 
	 static String muitoLegal() {
		 return "muito legal";
	 }

}
