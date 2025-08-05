# Nivelamento JPA / Hibernate

1. Visão geral sobre mapeamento objeto-relacional

- Problema básico por trás do assunto de ORM: por vários anos, a maior dificuldade de usar a abordagem orientada a objetos é a comunicação com o banco de dados relacional.
  - O BD não é orientado a objetos, ele tem o paradigma relacional. Logo, ao fazer um sistema OO e trabalhar com os objetos no BD, havia um esforço enorme para programar essa interação entre dois paradigmas diferentes;
  - Usando o pacote JDBC do Java, por exemplo, era necessário programar a tradução do BD relacional para as classes OO. Ou seja, toda hora era preciso "transportar" de tabela para objeto e vice e versa.
    - Em uma função para buscar entidades era preciso: escrever o SQL, que trazia do BD um ResultSet (dados na forma de tabela), e varrer o ResultSet convertendo cada campo do ResultSet para um atributo do objeto. Isso além dos tratamentos de exceção etc.
      - Isto é, era muito custoso, pois era necessário programar na mão a interação com o BD.
    - Segundo Martin Fowler, 30% do esforço de se fazer um sistema era programar essa camada de acesso a dados.
- Isso além de outros problemas que devem ser tratados;
  - Contexto de persistência (objetos que estão ou não atrelados a uma conexão em um dado momento);
  - Mapa de identidade (cache de objetos já carregados);
  - Carregamento tardio (lazy loading);
  - Outros.
- As ferramentas de mapeamento objeto-relacional fazem tudo isso automaticamente. Ele melhora a comunicação de um sistema OO com um BD relacional;
- Veremos como é a JPA e como ela faz esse tratamento.

---

2. JPA

- Java Persistence API (JPA) é a especificação padrão da plataforma Java EE (pacote javax.persistence) para mapeamento objeto-relacional e persistência de dados.
- JPA é apenas uma especificação (JSR 338): http://download.oracle.com/otn-pub/jcp/persistence-2_1-fr-eval-spec/JavaPersistence.pdf
- Para trabalhar com JPA é preciso incluir no projeto uma implementação da API (ex: Hibernate).
- Arquitetura de uma aplicação que utiliza JPA:
  - JPA fica entre os objetos e o BD;
  - Para o JPA funcionar, é preciso fazer o mapeamento dos objetos e algumas configurações.
- Principais classes:
  - EntityManager: https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html
    - Um objeto EntityManager encapsula uma conexão com a base de dados e serve para efetuar operações de
      acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.)
      por ele monitoradas em um mesmo contexto de persistência.
      - Instanciar um objeto EntityManager, a grosso modo, significa conectar com o BD. Mas, ele é muito mais que isso;
      - O EntityManager monitora as entidades. Objetos monitorados pelo EntityManager estão em um mesmo contexto de persistência.
    - Escopo: tipicamente mantém-se uma instância única de EntityManager para cada thread do sistema (no caso
      de aplicações web, para cada requisição ao sistema).
      - Ou seja, quando o usuário faz uma requisição web, a aplicação vai instanciar um único EntityManager para trabalhar com todos os dados daquela requisição.
  - EntityManagerFactory: https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManagerFactory.html
    - Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
    - Escopo: tipicamente mantém-se uma instância única de EntityManagerFactory para toda aplicação.

---

3. Criando uma aplicação simples

- Vamos instanciar três pessoas e mostrar seus dados na tela;
- Passos:
  - Mude a perspectiva do STS para Java
    - Window -> Perspective -> Open Perspective -> Java
  - Crie o projeto
    - File -> New -> Java Project
  - Crie a classe "Pessoa" no pacote "dominio" e faça os mapeamentos
  - Crie a classe "Programa" no pacote "aplicacao"

---

4. Incluindo JPA para persistir os objetos em banco de dados

Passos:

1. Crie uma base de dados MySQL vazia

- Instale o Xampp no seu computador
- Inicie o Apache e o MySQL
- No PhpMyAdmin, crie uma base de dados chamada "aulajpa"
