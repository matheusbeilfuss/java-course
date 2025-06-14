# Consumer (exemplo com forEach)

- https://docs.oracle.com/javase/10/docs/api/java/util/function/Consumer.html

```
public interface Consumer<T> {
  void accept (T t);
}
```

- Interface funcional parametrizada com tipo T com um único método abstrato "accept", que recebe um objeto do tipo T e não retorna nada (void).
- Veremos como exemplo o método default "forEach" da interface list.
  - Recebe um consumer como argumento. Percorre a coleção e executa o consumer para cada elemento da coleção.

---

---

- Versões (formas de fazer a mesma coisa):
  - Implementação da interface
  - Reference method com método estático
  - Reference method com método não estático
  - Expressão lambda declarada
  - Expressão lambda inline
- Repositório do professor com cada versão (separada por commits): https://github.com/acenelio/lambda3-java
