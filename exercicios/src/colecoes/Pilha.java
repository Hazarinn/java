package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// Pilha funciona da seguinte forma::
		// O primeiro a entrar, � o ultimo a sair.
		
		// O ultimo a entrar � o primeiro a sair.
		
		livros.add("O pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());  // peek serve para pegar o primeiro elemento da fila
		System.out.println(livros.element()); //  Element joga uma exce��o
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());   
		System.out.println(livros.poll());// pega o primeiro elemento da fila j� removendo // o POLL retorna nulo
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop()); // Ele joga uma excess�o caso n�o tenha o elemento dentro da pilha.
//		System.out.println(livros.remove());
		
		//livros.size();  size significa tamanho // tem a mesma usabilidade do length.
		//livros.clear(); // para limpar
		//livros.contains(); // se contem o valor dentro dos ()
		//livros.isEmpty(); // se estiver vazio retorna true, caso contrario, retorna false
		
		
	}
	
}
