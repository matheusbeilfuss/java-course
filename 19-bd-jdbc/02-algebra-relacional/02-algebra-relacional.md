# Nivelamento: Álgebra Relacional e SQL

- Revisão de tópicos importantes de BDs;
- Utilizar-se-á o exemplo de "Product" e "Category";
  - Diagrama no PDF da aula.
- Outro paradigma de armazenamento de dados é o relacional. Nesse modelo, há as tabelas, que têm chaves primárias e as chaves estrangeiras (usadas para fazer o relacionamento entre as tabelas);
- Em um BD relacional, instâncias de objetos seriam mapeadas em tabelas;
- Álgebra relacional e SQL são os fundamentos da manipulação de dados no modelo relacional.

---

- A álgebra relacional é um formalismo que define operações dentro do modelo relacional;
- Operações básicas da álgebra relacional
  - Restrição
  - Projeção
  - Produto cartesiano
  - Junção (produto cartesiano + restrição de chaves correspondentes)
- Produto cartesiano;
  - "from" com duas tabelas define que um produto cartesiano entre as tabelas;
  - Produto cartesiano é o resultado da combinação de cada registro de categoria com cada registro de produto, cruzamento de todo mundo com todo mundo sem nenhum critério;
  - O resultado é outra tabela.
- Junção;
  - Produto cartesiano mais restrição de chave estrangeira com chave primária;
  - No caso do exemplo, o resultado seria somente as linhas com o produto com a categoria chave estrangeira batendo com a chave primária da tabela categoria;
  - Para escrever isso em SQL, pode-se usar o "where" ou usando o "on" do "inner join".
- Restrição;
  - Restringir mais os registros de acordo com uma condição;
  - Feita utilizando a cláusula where com as condições desejadas;
  - Primeiro faz o produto cartesiano, depois junção e depois restrição.
- Projeção.
  - Limita as colunas, trazendo apenas as desejadas;
  - No caso do exemplo, traz todos os campos da tabela "product" e só o campo nome da tabela "category".
- Essas são as quatro operações básicas da álgebra relacional e SQL. Para trabalharmos com alguma biblioteca de manipulação de dados em uma linguagem moderna orientada a objetos, precisamos conhecer esses fundamentos.
