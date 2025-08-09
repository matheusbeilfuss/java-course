# Métodos subtotal e total

- O método subTotal pertence à classe OrderItem, e o total pertence à classe Order.
- Esses métodos já fazem parte do projeto no nível lógico, e não conceitual. Mas, adicionou-se esses métodos para visualizar que é possível acrescentar operações como essa nesse nível.
- No Java EE, é preciso usar "get" como prefixo dos métodos da entidade, por isso "getSubTotal()" em vez de "subTotal()" e "getTotal()" em vez do "total()".
- Para resolver o problema da referência cíclica entre Order e Payment, adicionou-se "@JsonIgnore" no atributo "order" classe Payment.
- Nessa aula, terminamos a implementação básica do modelo de domínio.
