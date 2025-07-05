# Preparação do primeiro projeto no Eclipse - Parte 1

- Código-fonte da aula: https://github.com/acenelio/jdbc1

- Passos realizados:
  - Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc";
  - Baixar o MySQL Java Connector;
    - Instalei o Ubuntu Linux 22.04 (Architecture Independent), DEB Package 9.4.0, 2.4M.
  - Caso ainda não exista, criar uma User Library contendo o arquivo .jar do driver do MySQL;
  - Criar um novo Java Project;
  - Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os dados de conexão;
  - No pacote "db", criar uma exceção personalizada DbException;
  - No pacote "db", criar uma classe DB com métodos estáticos auxiliares
