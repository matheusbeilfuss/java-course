# Uma experiência com Comparator

- Comparator é uma interface funcional do Java 8

---

- Suponha uma classe Product com os atributos name e price.
- Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
- Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar, precisaremos alterar a classe Product.
  - Em termos de manutenção, isso é indesejável. O ideal é ter critérios de comparação independentes da classe Product, de modo que não seja necessário abrir e alterar a classe Product toda vez que mudar o critério de comparação.
- Podemos então usar o default method "sort" da interface List:
  - ``default void sort(Comparator<? super E> c)`

---

- Comparator
  - https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html
    - Interface funcional (que tem apenas um método abstrato). No caso do Comparator, o método que precisa ser implementado é o "compare", que recebe dois objetos e retorna int.
  - Veja o método sort na interface List:
    - https://docs.oracle.com/javase/10/docs/api/java/util/List.html

---

- Sintaxe função anônima (ou arrow function):

```
Tipo nomeVariavel = (parâmetros) -> {
  Corpo da função
  return
};
```

- Sintaxe mais enxuta:

```
Tipo nomeVariavel = (parâmetros) -> Corpo da função;
```

---

- Resumo da aula
  - Comparator objeto de classe separada
  - Comparator objeto de classe anônima
  - Comparator objeto de expressão lambda com chaves
  - Comparator objeto de expressão lambda sem chaves
  - Comparator expressão lambda "direto no argumento"
- Código da aula separado por commits por cada tipo de implementação: https://github.com/acenelio/lambda1-java
