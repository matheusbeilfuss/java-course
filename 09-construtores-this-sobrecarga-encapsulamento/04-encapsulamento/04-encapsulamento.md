# Encapsulamento

- É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente;
- **Regra de ouro**: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso;
- Regra geral básica: um objeto **NÃO** deve expor nenhum atributo (modificador de acesso **private**);
- Os atributos devem ser acessados por meio de métodos get e set.
  - Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
- Padrão para implementação de getters e setters:

```
private String name;
private double price;

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public double getPrice() {
  return price;
}

public void setPrice(double price) {
  this.price = price;
}
```
