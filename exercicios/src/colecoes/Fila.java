package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<> ();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana");
		fila.offer("Bia"); // Offer � outro meio de adicionar
		fila.add("Carlos"); // Retorna falso
		fila.offer("Daniel"); // Lan�a uma exce��o
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		// Peek e Element -> Obter o pr�ximo elemento da fila (sem remover)
		// Diferen�a � o comportamento ocorre quando a fila est� vazia
		
		System.out.println(fila.peek()); // peek serve para pegar o primeiro elemento da fila
		System.out.println(fila.peek()); // Peek retorna null
		System.out.println(fila.element()); //  Element joga uma exce��o
		System.out.println(fila.element());
		
		// fla.size
		// fila.clear
	   // fila.isEmpty
		// fila.contains
		
		
		// Diferen�a � o comportamento occore
		// quando a fila est� vazia!
		
		
		// Pool e Remove -> Obter o pr�ximo elemento da fila e remove
		System.out.println(fila.poll()); // pegao primeiro elemento da fila j� removendo
		System.out.println(fila.remove()); // Lan�a uma exce��o
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		
	}
	
		

}
