# Introdução aos Generics

- Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
  - Reuso
  - Type safety
  - Performance
- Uso comum: coleções
  - No exemplo abaixo, uma lista parametrizada com o tipo String. Essa lista só vai aceitar e devolver elementos do tipo String.
  - Vai haver a segurança de que o elemento retornado vai ser String.

```
List<String> list = new ArrayList<>();
list.add("Maria");
String name = list.get(0);
```

---

- Problemas motivadores
  1. Reúso: não é possível reutilizar uma classe para diversos tipos diferentes;
  2. Utilizando o tipo Object, não se garante que todos os itens serão do mesmo tipo (não há type safety), além de comprometer a performance, porque vai ser necessário ficar realizando casting.
  3. A melhor solução é usar o Generics, parametrizando com um tipo "T" que pode ser um tipo qualquer. Esse tipo garante o reúso e type safety. Se instanciar com String, só aceita String, por exemplo.

---

- "T" é uma convenção.
- Todas as soluções pelo professor: https://github.com/acenelio/generics1-java
