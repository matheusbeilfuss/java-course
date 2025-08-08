# Entidade OrderItem. Associação muitos-para-muitos com dados extras

- OrderItem é uma associação muitos-para-muitos com atributos extras;
  - Olhando no diagrama de classes, com categoria e produto, não há nenhum dado da associação: simplesmente se tem que uma categoria tem uma coleção de produtos e um produto tem uma coleção de categorias.
  - Já a relação entre o produto e o pedido tem dados extras: o produto, no pedido, tem uma quantidade. Quantidade é um dado da associação, e não um dado exclusivo do produto ou pedido.
    - Para isso, no BD cria-se uma tabela de associação com os atributos extras, e no diagrama de classes se representa isso por meio de uma classe de associação (classe com a linha pontilhada).
    - O preço tem que estar em OrderItem para fins de histórico.
  - Em OO, não há o conceito de chave primária composta. O atributo identificador do objeto é um só. Por isso, vai ser necessário criar uma classe auxiliar para representar o par produto-pedido (e é isso que vai identificar o objeto OrderItem, que não tem uma chave primária própria).
- No caso de ser uma classe auxiliar de chave primária composta, utiliza-se o annotation "@Embeddable".
- Checklist:
  - OrderItemPK
    - Classe auxiliar para ser a chave primária do OrderItem. Essa classe vai ter uma referência para pedido e produto.
  - OrderItem
    - No mapeamento do id da classe, utilizar a annotation "@EmbeddedId".
  - Order one-to-many association
  - Seed
