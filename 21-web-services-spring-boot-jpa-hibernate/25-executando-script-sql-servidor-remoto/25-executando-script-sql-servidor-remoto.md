# Executando script SQL no servidor remoto

- Vamos rodar o script SQL para criar a estrutura das tabelas do banco no Heroku.
- Checklist:

  - App dashboard -> Settings - > Config Vars.
  - Isso para pegar a string de conexão com o BD.
  - Exemplo de string de conexão: postgres://wavglvupbdad:358f443aafe452eca4c58fbc15d02e50b08130c7aaea3aff6c4f59c
    13f9abb@ec2-23-21-106-266.compute-1.amazonaws.com:5432/d7u9ub86cdsu
  - Significado da string:

    - user: wavglvupbdad
    - password: 358f443aafe452eca4c58fbc15d02e50b08130c7aaea3aff6c4f59c13f9abb
    - server: ec2-23-21-106-266.compute-1.amazonaws.com
    - port: 5432
    - database: d7u9ub86cdsu

  - PgAdmin: Servers -> Create -> Server
    - Nessa parte, cria-se um novo servidor de BD no pgAdmin, que vai ser um servidor remoto apontando para o Heroku.
    - O host é o link do servidor que vem na string. "Maintenance database" é o nome do database que vem na string. O resto também são os dados da string.
    - Advanced -> DB rescriction: (database)
      - Copias-se o nome do DB e cola em "DB restriction". Isso porque, como estamos conectando a um servidor, vão ser retornados várias bases de dados. Então, vai ficar difícil de encontrar a base de dados criada.
  - Database -> Query Tool
    - Load and run SQL Script

- Com isso, temos o BD criado no Heroku.
