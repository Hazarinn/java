package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num1 = 10000; 
		System.out.println(num1.toString().length()); // Para transformar um numero em string, usa-se o toString
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
	
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	} 

}
