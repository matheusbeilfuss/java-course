# Function

- https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html

```
public interface Function<T, R> {
  R apply (T t);
}
```

- Interface funcional com dois parâmetros (um tipo T e outro R) e seu método é o apply, que recebe um objeto do tipo T e retorna um objeto do tipo R.

- Para o exemplo, utilizaremos a função map.
- A função "map" (não confunda com a estrutura de dados Map) é uma função que aplica uma função a todos elementos de uma stream.
  - Veremos stream a seguir, mas stream é uma sequência de dados.
  - Para usar a função map, vamos ter que converter a lista para stream, aplicar o map, e depois converter para lista novamente.
- Conversões:
  - List para stream: `.stream()`
  - Stream para List: `.collect(Collectors.toList())`

---

- Versões (formas de fazer a mesma coisa):
  - Implementação da interface
  - Reference method com método estático
  - Reference method com método não estático
  - Expressão lambda declarada
  - Expressão lambda inline
- Repositório do professor com cada versão (separada por commits): https://github.com/acenelio/lambda4-java
