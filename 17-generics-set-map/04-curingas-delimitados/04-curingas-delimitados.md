# Curingas delimitados (bounded wildcards)

- Problema 1:

```
public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
```

- Com `totalArea(List<? extends Shape> list)`, a lista pode ser de Shape ou de qualquer tipo que seja subtipo de Shape
- Solução do problema 1 em `src-problema1`
- Código pelo professor: https://github.com/acenelio/generics4-java

---

- Problema 2 (princípio get/put) - covariância
  - Ao criar uma lista de inteiros e, depois, uma lista de qualquer subtipo de number, é possível recuperar os dados, mas não adicionar números, porque o compilador não sabe se o número vai ser compatível com algum outro possível tipo Number:

```
List<Integer> intList = new ArrayList<Integer>();
intList.add(10);
intList.add(5);

List<? extends Number> list = intList;

Number x = list.get(0); // não dá erro
list.add(20); // erro de compilacao
```

- Covariância é quando a operação get é permitida, mas a de inserir (put) não é permitida.
- Há também o contrário, a contravariância:

```
List<Object> myObjs = new ArrayList<Object>();
myObjs.add("Maria");
myObjs.add("Alex");

List<? super Number> myNums = myObjs;

myNums.add(10); // não dá erro
myNums.add(3.14); // não dá erro

Number x = myNums.get(0); // erro de compilacao
```

- No caso acima, a lista "myNums" é de qualquer tipo super Number, ou seja, pode ser um Number ou qualquer supertipo de Number (Object nesse caso). Pode ser tanto Number quanto Object.
  - Mas, nesse caso, não se pode acessar os objetos da lista e guardar numa variável "Number", por exemplo, porque o tipo da lista pode ser um tipo que seja supertipo de Number.
- Na contravariância, quando se define um tipo que pode ser um tipo ou qualquer supertipo dele, vai ter um erro ao obter objeto, mas pode adicionar.
- Solução do problema 2 em `src-problema2`:
  - A lista de origem é um caso de covariância (trabalhando com os subtipos): pode-se acessar os elementos. A lista de destino é um caso de contravariância (trabalhando com os supertidos do tipo informado): pode-se adicionar.
