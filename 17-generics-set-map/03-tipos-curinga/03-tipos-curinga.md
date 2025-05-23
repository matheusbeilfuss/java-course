# Tipos curinga (wildcard types)

- Generics são invariantes
- List<Object> não é o supertipo de qualquer tipo de lista:

```
List<Object> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // erro de compilação
```

- Integer é um Object, mas List<Integer> não é List<Object>.

- O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

```
List<?> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers;
```

---

- Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo"
  - Por exemplo, um método que imprime uma lista de qualquer tipo:

```
public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
```

---

- Porém não é possível adicionar dados a uma coleção de tipo curinga:

```
public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		list.add(3); // erro de compilação
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
```

- O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
