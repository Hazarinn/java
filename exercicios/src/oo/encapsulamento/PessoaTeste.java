package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		p1.setIdade(230); // Alterar valor da variável
		
		System.out.println(p1.getIdade()); // ler valor da variável
		System.out.println(p1.getNomeCompleto());
	}

}
