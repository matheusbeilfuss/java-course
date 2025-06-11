# Interface funcional

- É uma interface que possui um único método abstrato. Suas
  implementações serão tratadas como expressões lambda.
- É o que fizemos na primeira aula do capítulo com a interface Comparator. Ela é uma interface funcional com apenas um método.
  - Criamos uma classe que implementa essa interface, implementamos o método da interface e, depois, pudemos passar o objeto dessa classe como argumento.
  - Depois, esse objeto foi substituído por uma expressão lambda, mas internamente no Java eles são equivalentes.
- No Java, a inteface funcional tem um mapeamento direto com a expressão lambda. A expressão lambda vai ser tratada como uma interface funcional.
  - Isso não existe em linguagens funcionais puras, só expressões lambda e as funções. Mas, Java mantém essa equivalência.

---

- No Java, já existem diversas interfaces funcionais. Veremos algumas agora e depois mais aprofundadamente.
- Algumas outras interfaces funcionais comuns
  - Predicate
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
    - Predicado usando em funções de coleções
  - Function
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
  - Consumer
    - https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
    - Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é esperado que ele possa gerar efeitos colaterais.
      - Isso porque o método abstrato da interface Consumer é void, ele simplesmente faz uma ação. Essa ação pode ser qualquer coisa. Por isso, é mais esperado que ela cause efeitos colaterais. Mas, é uma exceção.
- Resumindo: sempre que mexermos com expressões lambda, no fundo estaremos mexendo com uma interface funcional.
