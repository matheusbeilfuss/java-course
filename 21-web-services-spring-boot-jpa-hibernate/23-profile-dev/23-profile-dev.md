# Profile dev

- Checklist:

  - PgAdmin: create local database: create database springboot_course
  - Add PostgreSQL Maven dependency
  - Create file: application-dev.properties
  - Update application.properties: spring.profiles.active=dev
  - Run application

- Quanto às propriedades do JPA:
  - `non_contextual_creation`: para criar o DB de forma não contextual, para evitar problemas de versão do PostgreSQL.
  - `dl-auto=update`: ao rodar a aplicação, o BD deve ser atualizado.
    - Se rodar a aplicação e o BD já estiver atualizado, a aplicação não vai fazer nada no BD. Se for a primeira rodando vez, vai atualizar o banco. Isso porque o BD, agora, vai persistir os dados. É uma boa prática deixar essa opção no desenvolvimento.
