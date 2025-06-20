package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Cria stream a partir de coleção (lista)
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray())); // toArray: operação terminal que converte stream para vetor
		
		// Cria stream usando o Stream.of
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Cria stream usando função de iteração
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // Stream.iterate([primeiro elemento da stream], [função de iteração de geração dos próximos elementos])
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // usando limit porque a função de cima pode ser infinita
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
				
		}
}