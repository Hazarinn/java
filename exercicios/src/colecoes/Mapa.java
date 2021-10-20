package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		// K = chave
		// V= Valor
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");  // Put é para adicionar valores // é o mesmo que add. // ele serve para incluir e alterar
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // keySet é para pegar o valor da chave
		System.out.println(usuarios.values()); // values é para pegar o valor dos usuários
		System.out.println(usuarios.entrySet()); // entrySet é para pegar a chave e valor todos juntos
		
		System.out.println(usuarios.containsKey(20)); // containsKey é para saber se contém o valor 20 declarado como chave retorna true ou false
		System.out.println(usuarios.containsValue("Rebeca") ); // containsValue é para saber se contém o valor "Rebeca" dentro do valor true ou false
		
		System.out.println(usuarios.get(20)); // aqui estamos usando o get para pegar o valor dentro da chamada, no caso, retornará "Ricardo"
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui")); // aqui estamos fazendo a remoção de chave e valor, mas vai retornar false porque não temos o valor "Gui"
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave); // aqui estamos percorrendo usando um forEach para pegar o valor de todas as chaves e armazenando dentro da variável chave
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor); // aqui estamos percorrendo usando um forEach para pegar o valor de todos os usuários e armazenando dentro da variável valor
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet() ) {
			System.out.print(registro.getKey() + " ==> ");  
			System.out.println(registro.getValue());  
			// Aqui importamos o Entry para que possamos buscar os dois valores, que notamos que é Integer para o id, e o String para o valor que é o nome
			// armazenamos dentro de registros e buscamos dentro de usuarios utilizando o entrySet.
			
		}
		
	}

}
