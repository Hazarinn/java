package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		
		double media = 4.6;
		
		String resultadoParcial = media >= 5.0 ? "Recuperacao" : "Reprovado";
		String resultadoFinal  = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est� : " +  resultadoFinal);
		
		
		double nota = 9.9; 
		boolean bomComportamento =  true;
		boolean passouPorMedia = nota >= 7 ? true : false;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "SIM" : "NAO";
		
		System.out.println(passouPorMedia);
		System.out.printf("tem desconto? %s" , resultado); 
	}

}
