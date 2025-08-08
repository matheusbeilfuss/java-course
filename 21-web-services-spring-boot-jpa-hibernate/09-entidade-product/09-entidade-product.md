# Entidade Product

- Basic entity checklist:
  - Basic attributes
  - Associations (instantiate collections)
  - Constructors
  - Getters & Setters (collections: only get)
    - Apenas get para atributos que são coleções porque não faz sentido querer trocar uma coleção. Nunca se troca uma coleção, apenas se remove ou adiciona elementos nela.
  - hashCode & equals
  - Serializable
- Após isso, fazer a classe service e a classe resource.
- Na associação de Category com Product na classe Product:
  - Set representa um conjunto, e garante que não se vai ter um produto com mais de uma ocorrência da mesma categoria.
  - Instancia-se esse conjunto para garantir que a coleção não comece valendo nula, e sim vazia.
  - Utilizou-se HashSet porque o Set é uma interface e não pode ser instanciado. Nesse caso, é preciso usar uma classe correspondente a essa interface, do mesmo jeito que se usa o List e ArrayList.
  - Não se coloca a coleção no construtor porque já se está instanciando ela na classe.
- Como o relacionamento entre Category e Product vai ser feito na próxima aula, adicionou-se a annotation "@Transient" acima do atributo que representa esse relacionamento nas duas classes para impedir que o JPA tente interpretar esse relacionamento.
