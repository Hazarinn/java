package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		// Quando for comparar Strings, é recomendado usar o .equals em vez do " == "
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // Usando o .equals Ele vai comprar os conteúdos
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim()); // .trim serve para tirar os espaços em branco
		System.out.println("2".equals(s2.trim())); // .trim serve para tirar os espaços em branco
		
		entrada.close();
	}

	

}
