package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		
		
		// Byte
		
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.nextLine());
		Integer i = 10000;  // int
		Long l = 100000L;
		
		System.out.println(b.byteValue()); // valor contido dentro da variável 
		System.out.println(s.toString()); // foi impresso como string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Só foi possível porque converti o boolean para string usando toString
		
		Character c = '#'; // Char
		System.out.println(c + "...");
		
		
		
	}

}
