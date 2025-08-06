# H2 database, test profile, JPA

- Vamos configurar o H2, o Banco de Dados de teste muito usado em Java para testes na aplicação. É um BD em memória integrado ao projeto.
- Vamos criar um profile de teste: perfil do projeto específico para testes.
  - Pode-se definir diferentes perfis. Por exemplo, perfil de desenvolvimento ou de produção, com BDs específicos.
- Checklist:
  - JPA & H2 dependencies
    - JPA: ferramenta de mapeamento objeto-relacional padrão do Java. Converte o modelo OO para o paradigma relacional e vice-versa.
  - application.properties
  - application-test.properties
  - Entity: JPA mapping
    - Adicionar annotations do JPA para que ele saiba como converter os objetos para o modelo relacional.
