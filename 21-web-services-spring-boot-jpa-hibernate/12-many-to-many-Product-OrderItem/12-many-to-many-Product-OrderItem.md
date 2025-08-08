# Associação muitos para muitos entre Product e OrderItem

- Dado um objeto Order, pode-se acessar os itens associados a esse pedido, que são objetos do tipo OrderItem.
- Entretanto, quando se tem um Product, ele tem "orders", e não item, porque não faz muito sentido acessar os itens de pedido que um produto esteve. Faz mais sentido querer acessar os pedidos em que o produto esteve.
  - Por isso, Product acessa os pedidos (orders) associados a ele.
- Mesmo assim, o Product tem uma associação direta com o OrderItem.
  - Por isso, para acessar os pedidos de um produto, é preciso varrer a coleção de OrderItem associada a ele e, para cada OrderItem, associar o objeto Order em OrderItem ao Product.
- Foi necessário adicionar a annotation "@JsonIgnore" ao getOrders do Product para evitar o problema da referência cíclica.
