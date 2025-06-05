package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>(); // String já tem hashCode e equals implementado, por isso pode usar o TreeMap diretamente
		// TreeMap ordena pela chave
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133"); // sobrescreve o valor antigo
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email")); // retorna null
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}