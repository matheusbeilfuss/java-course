# Interfaces

- Aviso
  - A partir do Java 8, interfaces podem ter "default methods" ou "defender methods" (além de métodos estáticos)
  - Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capítulo
  - Primeiro, vamos trabalhar com a definição "clássica" de interfaces. Depois vamos acrescentar o conceito de default methods.
    - Na definição clássica, as interfaces não têm implementação de métodos. Mas, a partir do Java 8 elas podem ter.

---

- Definição clássica de interface
- Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
- A interface estabelece um **contrato** que a classe deve cumprir.
- Pra quê interfaces?
  - Para criar sistemas com **baixo acoplamento** e **flexíveis**.
- Sintaxe:

```
interface Shape {
  double area();
  double perimeter();
}
```

- Classes que terão "Shape" serão obrigadas a ter os métodos "area" e "perimeter".
