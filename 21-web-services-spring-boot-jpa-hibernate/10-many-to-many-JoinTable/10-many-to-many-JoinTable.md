# Associação muitos-para-muitos com JoinTable

- No diagrama de classes:
  - Um produto pode ter várias categorias e uma categoria pode ter vários produtos. É uma relação muitos-para-muitos.
  - No paradigma de OO, os objetos ficam associados entre si. Mas, no paradigma relacional, não se vai ter isso, vai ser necessário uma **tabela de associação** (JoinTable).
  - Por isso, vamos mapear as classes Product e Category para que essa tabela de associação apareça no BD relacional.
    - Para fazer isso, escolhe-se uma das duas classes e transforma a coleção da associação em questão na tabela de associação.
    - Utiliza-se as annotations "@ManyToMany" e "@JoinTable", indicando nesta última qual será o nome da tabela e quais as chaves estrangeiras que associarão as duas tabelas (de produto e categoria nesse caso).
      - Dentro da annotation "@JoinTable", é preciso definir na propriedade "joinColumns" qual será a chave estrangeira da classe em questão (definindo isso na classe de produto, seria a de produto) e a propriedade "inverseJoinColumns" qual será a chave estrangeira da outra entidade (definindo isso na classe produto, a outra entidade é a categoria).
      - "product_id" é ficou a chave estrangeira do produto.
      - "category_id é como ficou a chave estrangeira da categoria.
    - Na classe category, é preciso fazer uma referência para o mapeamento feito acima usando a annotation "@ManyToMany". Dentro dela é preciso definir qual o nome da coleção para o qual ela é mapeada na outra classe.
- Nesse caso, também é preciso usar a annotation "@JsonIgnore", para impedir que o Jackson (pacote que serializa e insere no BD) entre em loop ao chamar as categorias relacionadas aos produtos e vice-versa.
