package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio");
		
		String salario1 =  entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio");
		
		String salario2 =  entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro sal�rio");
		
		String salario3 =  entrada.nextLine().replace(",",".");
		
		double proventos1 = Double.parseDouble(salario1);
		double proventos2 = Double.parseDouble(salario2);
		double proventos3 = Double.parseDouble(salario3);
		
		double resultado = (proventos1 + proventos2 + proventos3) / 3;
		
		System.out.println("A m�dia dos sal�rios �: " + resultado);
		
		
		entrada.close();
		
		
	}

}

//scanner
//
//3 strings usando nextline
//
//pode receber salarios
//
//calcular a media dos 3 ultimos salarios

