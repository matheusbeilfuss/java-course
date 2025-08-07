# JPA repository, injeção de dependência, database seeding

- Vamos implementar nosso primeiro repository utilizando JPA repository do Spring Data JPA (um subframework do ecossistema Spring)
  - Repository é a camada mais abaixo da arquitetura: controlador depende do serviço e o serviço depende do repository
  - Vamos implementar o UserRepository, responsável por fazer operações com a entidade User
- Vamos começar a trabalhar com injeção de dependência automática feita pelo container do framework
- Vamos fazer a primeira instanciação do Banco de Dados, inserindo alguns dados automaticamente no DB.

- Checklist

  - UserRepository extends JpaRepository<User, Long>
    - Para criar um UserRepository reutilizando JPARepository, basta fazer ele estender o JPARepository passando o tipo da entidade a ser acessada e o tipo da chave dessa entidade (nesse caso, Long)
    - Nossos repositories vão ser interfaces, porque o JPARepository é uma interface também. Apenas com essa definição já se tem uma instância de um objeto repository com várias operações para se trabalhar com User
    - Nesse caso, não é preciso criar a implementação da interface, porque o Spring Data JPA já tem uma implementação padrão para essa interface
  - Configuration class for "test" profile
    - Não é controller, service ou repository, é uma classe auxiliar que faz algumas configurações na aplicação
    - Nesse projeto, criou-se a "TestConfig", uma classe de configuração específica para o perfil de teste. O propósito dela é fazer o database seeding
      - Para isso, é preciso acessar o DB, e quem faz isso é o UserRepository. Então, nesse momento, vai se ter o primeiro caso de injeção de dependência, porque a classe TestConfig vai ter que ter uma dependência para o UserRepository
      - Como boa prática, quando um serviço depende de outro, essa dependência precisa ser fraca, desacoplada. Isso pode ser feito manualmente (através de um construtor, padrão fábrica, método Set etc.), mas, com um framework, normalmente ele tem um mecanismo de injeção de dependência implícito, automático
      - No Spring, para se fazer um objeto depender de outro, basta declarar essa dependência com a annotation "@Autowired". Com isso, ele consegue resolver essa dependência associando uma instância do UserRepository na classe TestConfig
  - @Autowired UserRepository
  - Instantiate objects in memory
    - Dentro do método "run"
  - Persist objects
    - Utilizando o userRepository injetado

- Com isso, fica funcionando perfeitamente o mapeamento objeto-relacional e o seed do BD

  - A partir de objetos Java instanciados manualmente, conseguimos converter esses objetos em registros do BD. Repare que os Ids dos registros foram inseridos automaticamente pelo banco.

- Mas, como executar a classe TestConfig quando o programa for iniciado? Há várias formas de fazer isso no Spring. Nesse projeto, fizemos a classe implementar a interface "CommandLineRunner".
  - Assim, tudo o que for adicionado no método "run" vai ser executado quando a aplicação for iniciada.
