package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		
		// Domingo -> 1
		// quarta 4
		// terça 3
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do dia  semana: ");
		String diaSemana = entrada.next();
		
		if (diaSemana.equalsIgnoreCase("domingo") ) {
			System.out.println("Domingo é o dia 1 da semana");
			
		}else if (diaSemana.equalsIgnoreCase("segunda")){
			System.out.print("Segunda é o dia 2 da semana");
			
		}else if(diaSemana.equalsIgnoreCase("terça")){
			System.out.print("Terça é o dia 3 da semana");
			
		}else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.print("Quarta é o dia 4 da semana");
			
		}else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.print("Quinta é o dia 5 da semana");
			
		}else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.print("Sexta é o dia 6 da semana");
			
		}else if(diaSemana.equalsIgnoreCase("sabado")) { 
			System.out.print("Sábado é o dia 7 da semana");
			
		}else {
			System.out.print("Digite um dia válido"); 
		}
		
		entrada.close();
		
	}

}
