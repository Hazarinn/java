package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10; N?O ? FORMA RECOMENDADA PARA ACESSAR
		a1.raio = 10;
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100;  
		//a2.pi = 0;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		
		
		System.out.println(AreaCirc.area(100)); // area ? o metodo que pertence a classe e n?o a inst?ncia
		System.out.println(AreaCirc.PI);
		System.out.println(a2.area());
	}
}
