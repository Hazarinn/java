package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		// calcular media de notas de uma turma
		
		// criar uma variavel para armazenar notas validas de 10 a 0 e armazenar numa variavel de nome total
		// variavel para definir quantas notas foram digitadas
		// e para sair do loop, quando digitar -1
		
		Scanner entrada = new Scanner(System.in);
		
	
		
		int quantidadeNotas = 0;
		
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 para sair)");
			nota = entrada.nextDouble();
			
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
				
			}else if (nota != -1) {
				System.out.println("Nota inválida");
			}
			
			
		}
		double media = total / quantidadeNotas;
		System.out.println("Media = " + media);
		
		
		
		entrada.close();
		
		
		
		
		
	}

}
