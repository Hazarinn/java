package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
	
		String s = "Bom dia X";
		s = s.toUpperCase(); // Transforma em letras maiusculas
		s = s.replace("X", "Senhora"); // replace serve para substituir uma letra ou string por outra string
		s = s.concat("!!"); // concat serve para concatenar
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		
		// Tipos primitivos não tem o operador "."
		
		int a = 3;
		System.out.println(a);
	


	}

}
