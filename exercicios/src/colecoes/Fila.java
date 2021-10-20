package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<> ();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana");
		fila.offer("Bia"); // Offer é outro meio de adicionar
		fila.add("Carlos"); // Retorna falso
		fila.offer("Daniel"); // Lança uma exceção
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		// Peek e Element -> Obter o próximo elemento da fila (sem remover)
		// Diferença é o comportamento ocorre quando a fila está vazia
		
		System.out.println(fila.peek()); // peek serve para pegar o primeiro elemento da fila
		System.out.println(fila.peek()); // Peek retorna null
		System.out.println(fila.element()); //  Element joga uma exceção
		System.out.println(fila.element());
		
		// fla.size
		// fila.clear
	   // fila.isEmpty
		// fila.contains
		
		
		// Diferença é o comportamento occore
		// quando a fila está vazia!
		
		
		// Pool e Remove -> Obter o próximo elemento da fila e remove
		System.out.println(fila.poll()); // pegao primeiro elemento da fila já removendo
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		
	}
	
		

}
