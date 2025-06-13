# Predicate

- https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html
- Sintaxe:

```
public interface Predicate<T> {
  boolean test (T t);
}
```

- Interface generics parametrizada com tipo T e com apenas um método abstrato "test", que recebe um objeto do tipo T e retorna um booleano.

---

- Versões (formas de fazer a mesma coisa):
  - Implementação da interface
  - Reference method com método estático
  - Reference method com método não estático
  - Expressão lambda declarada
  - Expressão lambda inline
- Repositório do professor com cada versão (separada por commits): https://github.com/acenelio/lambda2-java
