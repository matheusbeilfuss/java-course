# Genéricos delimitados

- Para ser possível utilizar a mesma função para diferentes tipos, pode-se indicar que ela retorna qualquer tipo T e trabalha com qualquer tipo T.
  - Para a solução com generics ter ficado completa, faltou a seguinte definição:

```
public static <T extends Comparable<? super T>> T max List<T> list) {
  (...)
}
```

- Isto é, é um tipo comparável T ou qualquer superclasse de T.
  - No caso da classe Product, é qualquer Product ou superclasse de Product, porque se qualquer superclasse de Product possuir o compareTo, Product vai herdar o compareTo.
- "super" é um tipo curinga, veremos à frente.

---

- Código na pasta `src`.
- Códigos de cada solução pelo professor: https://github.com/acenelio/generics2-java
