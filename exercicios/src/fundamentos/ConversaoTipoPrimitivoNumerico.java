package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // conversão implicita
		
		System.out.println(a);  
		
		float b = (float)1.1234567888888888; // Explicita (CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
		
		
	}

}
