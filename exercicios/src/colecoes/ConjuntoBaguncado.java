package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Add é para adicionar // converte double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("tamanho é " + conjunto.size()); // Size é para saber o tamanho
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));// remove retorna verdadeiro ou falso
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); // contains é para saber se contem ou não o valor informado
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // addAll é para juntar os elementos // addAll = adicionar todos
		
		conjunto.retainAll(nums);  // serve para reter 
		System.out.println(conjunto);
		
		conjunto.clear(); // limpar todo o conjunto
		System.out.println(conjunto); 
	}

}
