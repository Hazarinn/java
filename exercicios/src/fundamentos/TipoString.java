package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(2)); // CharAt serve para descobrir qual o indice da letra entre os parenteses
		
		String s = "Boa tarde";
		
		
		System.out.println(s.concat("!!!"));	
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // Verifica se a variável é iniciado com "Boa" // retorna true ou false
		System.out.println(s.startsWith("boa")); // Verifica se a variável é iniciado com "boa" // retorna true ou false
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE0"));
		System.out.println(s.length()); // saber o tamanho da String
		System.out.println(s.toLowerCase().equals("boa tarde")); // compara se o valor da variável está correto
		System.out.println(s.equalsIgnoreCase("boa tarde")); // mesma coisa acima, o que muda é que ele ignora se é maiuscula ou minuscula
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.7987;
		System.out.println("Nome: " + nome + "\nSobrenome: "
		+ sobrenome + "\nIdade: " + idade + "\nSalario: " + salario  );
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual") + "contem o qual?"); // serve para saber se contem ou não o conteudo entre aspas
		System.out.println("Frase qualquer".indexOf("qual")); // descobrir o indice da palavra qual
		System.out.println("Frase qualquer".substring(6)); // mostra de onde começa o indice da string digitada
		System.out.println("Frase qualquer".substring(6, 10)); // mostra de onde começa o indice da string digitada
		
	}

}
