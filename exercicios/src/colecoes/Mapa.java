package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		// K = chave
		// V= Valor
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");  // Put � para adicionar valores // � o mesmo que add. // ele serve para incluir e alterar
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // keySet � para pegar o valor da chave
		System.out.println(usuarios.values()); // values � para pegar o valor dos usu�rios
		System.out.println(usuarios.entrySet()); // entrySet � para pegar a chave e valor todos juntos
		
		System.out.println(usuarios.containsKey(20)); // containsKey � para saber se cont�m o valor 20 declarado como chave retorna true ou false
		System.out.println(usuarios.containsValue("Rebeca") ); // containsValue � para saber se cont�m o valor "Rebeca" dentro do valor true ou false
		
		System.out.println(usuarios.get(20)); // aqui estamos usando o get para pegar o valor dentro da chamada, no caso, retornar� "Ricardo"
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui")); // aqui estamos fazendo a remo��o de chave e valor, mas vai retornar false porque n�o temos o valor "Gui"
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave); // aqui estamos percorrendo usando um forEach para pegar o valor de todas as chaves e armazenando dentro da vari�vel chave
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor); // aqui estamos percorrendo usando um forEach para pegar o valor de todos os usu�rios e armazenando dentro da vari�vel valor
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet() ) {
			System.out.print(registro.getKey() + " ==> ");  
			System.out.println(registro.getValue());  
			// Aqui importamos o Entry para que possamos buscar os dois valores, que notamos que � Integer para o id, e o String para o valor que � o nome
			// armazenamos dentro de registros e buscamos dentro de usuarios utilizando o entrySet.
			
		}
		
	}

}
