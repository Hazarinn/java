package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		// Ler num1
		// ler num2
		// ler dois numeros e executar uma conta, pedindo ao usuario digitar como será a operação
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro Numero: ");
		double num1 =  entrada.nextDouble();
		
		System.out.print("Digite o segundo Numero: ");
		double num2 =  entrada.nextDouble();
        
    System.out.print("Qual será seu tipo de operação? ");
        String op = entrada.next();
        
          
        double resultado = "+".equals(op) ? num1+num2 : 0;  
        
        resultado = "-".equals(op) ? num1 - num2 : 0;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        
        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
		
		
		
	}

}
