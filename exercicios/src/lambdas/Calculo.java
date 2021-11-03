package lambdas;


@FunctionalInterface // aqui é para deixar claro que só podemos ter uma função na classe!!
public interface Calculo {
	
	// Interface funcional só pode conter um método!!!
	
	 double executar(double a, double b);
	 
	 default String legal() {
		 return "legal";
	 }
	 
	 static String muitoLegal() {
		 return "muito legal";
	 }

}
