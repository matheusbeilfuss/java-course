# Vamos falar um pouco sobre design

- Categorias de classes
  - Em um sistema orientado a objetos, de modo geral "tudo" é objeto.
  - Por questões de design tais como organização, flexibilidade, reuso, delegação, etc., há várias categorias de classes:
    - **Views**: telas do sistema;
    - **Controllers**: meio de campo entre tela e sistema;
    - **Entities**: de negócio (como produtos, clientes, pedidos);
    - **Services**: serviços do sistema;
    - **Repositories**: responsáveis por acessar os dados do BD.
  - Nos primeiros exemplos de composição, trabalharemos com classes do tipo "entities". Mais para frente no curso trabalharemos com todos os tipos.
