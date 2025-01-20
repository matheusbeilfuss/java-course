# Construtores

- É uma operação especial da classe, que executa no momento da instanciação do objeto (comando "new");
- Usos comuns:
  - Iniciar valores dos atributos
  - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
  - `Product p = new Product();`
- É possível especificar mais de um construtor na mesma classe (sobrecarga);
- Quando um objeto é instanciado, seus atributos recebem os valores padrão.
  - No caso de string, recebe `null`;
  - No caso de int, 0;
  - No caso de double 0.0.
- No entanto, não faz sentido ter produtos sem esses dados. Por isso, a obrigatoriedade de informar esses atributos é feita através de um construtor.
  - Normalmente, fica depois dos atributos e antes dos métodos.
- Sintaxe:

```
public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
```

-
