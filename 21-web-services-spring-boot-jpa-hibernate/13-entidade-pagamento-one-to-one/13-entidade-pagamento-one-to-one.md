# Entidade Payment, associação um para um

- Um pedido tem 0 ou 1 pagamento, e o pagamento tem necessariamente um pedido.
  - A classe dependente é o pagamento, porque o pedido pode ter 0 pagamentos, ele pode entrar no BD sem pagamentos.
  - Na classe dependente (Payment, nesse caso), coloca-se a annotation "@OneToOne" atributo de associação (order, nesse caso) e a annotation "@MapsId".
  - Na classe independente (Order, nesse caso), também coloca-se a annotation "@OneToOne" no atributo de associação, mas indicando para qual atributo na classe dependente ele é mapeado (usando o mappedBy).
  - Além disso, é preciso adicionar o "CascadeType.ALL".
    - Isso porque, no caso de um para um, mapeia-se as duas entidades para ter o mesmo Id (se o pedido for código 5, o pagamento do pedido também vai ter código 5).
  - Para salvar um objeto dependente numa relação um para um, não chama o repository do próprio objeto, e sim o do objeto independente (usando o do Order, nesse caso).
    - Dessa forma, associa o objeto independente com o dependente (aqui, pedido com o pagamento).
