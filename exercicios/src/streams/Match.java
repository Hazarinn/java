package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 7.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado)); // all match, é o mesmo que dizer: todos os alunos estão aprovados? retorna true or false
		System.out.println(alunos.stream().anyMatch(aprovado)); // anyMatch -> algum aprovado? retorna true or false
		System.out.println(alunos.stream().noneMatch(reprovado)); // nenhum aprovado -> retorna false or true
		
		
		// Obs: allMatch, anyMatch e noneMatch são funções terminadoras, ou seja, não podemos fazer um map por exemplo
		// apenas retorna true or false.
		
		
	}

}
