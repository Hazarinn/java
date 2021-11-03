package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}
	
	
	
	public String getNome() { // Getter ==> serve para pegar a variável
		return nome;
	}



	public void setNome(String nome) { // setter ==> para alterar a variável
		this.nome = nome;
	}
	
	



	public String getSobreNome() {
		return sobreNome;
	}



	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}



	// Getter
	public int getIdade() {
		return idade;
	}
	
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade > 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		
		return "Ola eu sou o " + getNome() + " e tenho " + getIdade() + " anos";
	}
	
	

}
