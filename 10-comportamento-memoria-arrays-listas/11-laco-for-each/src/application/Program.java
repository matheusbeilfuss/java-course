package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i < vect.length; i++) { // for tradicional
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		for (String obj : vect) { // "obj" é um apelido para cada elemento do vetor, pode ser qualquer palavra
			System.out.println(obj);
		}
	}

}
