# Enum OrderStatus

- O pedido (Order) tem um atributo do tipo "OrderStatus", um tipo enumerado com valores específicos.
- Implementando o Enum simplesmente escrevendo seus valores faz com que o Java, por padrão, atribua um valor numérico para cada valor do tipo enumerado.
  - Porém, isso tem um problema de manutenção: deixando essa atribuição de valores automática, se no futuro for acrescentado mais valores ao Enum, os valores antigos podem mudar, de modo que o BD possa ficar errado.
  - Para evitar isso, basta atribuir manualmente um valor numérico para cada tipo enumerado, e adicionar algumas implementações, como um construtor para o tipo enumerado (exemplo na classe "OrderStatus").
  - É interessante, também, adicionar um método estático (funciona sem precisar instanciar) que converte os valores numéricos para os tipos enumerados.
- Nessa aula, também tratou-se o OrderStatus como Integer internamente na classe "Order". Para isso, foi necessário fazer alguns ajustes no construtor e nos Getters e Setters de OrderStatus. Mais detalhes no código.
