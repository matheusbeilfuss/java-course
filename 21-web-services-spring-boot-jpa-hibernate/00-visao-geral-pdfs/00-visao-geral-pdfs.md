# Visão geral do capítulo

- Objetivos
  - Criar projeto Spring Boot Java
  - Implementar modelo de domínio
  - Estruturar backend em camadas lógicas: resource, service, repository
    - Resource contém os controladores REST, interface da aplicação com o backend. Eles vão receber as requisições e vão responder de acordo com o comportamento do sistema.
    - Toda essa pilha de camadas conversa com as entidades.
  - Configurar banco de dados de teste (H2)
  - Povoar o banco de dados
  - CRUD - Create, Retrieve, Update, Delete
  - Tratamento de exceções
- Link do repositório do projeto feito pelo professor: https://github.com/acenelio/workshop-springboot2-jpa
- Ferramentas utilizadas
  - Spring Boot: framework utilizado para criar a aplicação
  - Apache Tomcat: container web para executar a aplicação
  - Maven: gerenciador de dependências
  - H2: banco de dados em memória para testes do Java
  - Postman: para teste de requisições
  - PostgreSQL: BD relacional para produção
  - Heroku: para deploy da aplicação
- Vamos instanciar os objetos e criar e povoar a base de dados relacional automaticamente.

- Atualização do projeto com Spring Boot 3: https://github.com/acenelio/workshop-springboot3-jpa
