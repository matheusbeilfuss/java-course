# Camada de serviço, registro de componentes

- Vamos implementar a camada de serviço e vamos aprender sobre o registro de componentes (presente em todo framework que faz injeção de dependência).
- Na estrutura de camadas que estamos implementando, os controladores dependem dos serviços que, por sua vez, dependem dos repositories. A camada de serviço é uma camada intermediária para implementar as regras de negócio, orquestração de repositories (como verificar se há estoque de um pedido) etc.
  - São várias operações que, se ficassem todas no controlador com ele chamando as operações de salvamento do repository, tornariam os controladores muito carregados com regras de negócio.
  - Assim, há uma melhor separação de responsabilidades. O controlador, então, faz somento o que deve fazer (intermediando as asções do usuário na aplicação e as regras de negócio), enxuto, e as regras de negócio vão para a camada de serviço.
  - Há desvantagens: em algumas operações, a camada de serviço vai simplesmente repassar para o repository a chamada de algo (recuperando um usuário por Id, por exemplo).
- Quando se tem um objeto que vai poder ser injetado pelo mecanismo de injeção de dependência do Spring, a classe do objeto precisa estar registrada no mecanismo de injeção de dependência. Todo framework vai ter alguma forma de registrar um serviço ou classe no mecanismo de injeção de dependência.
  - No caso do Spring, pode-se usar a annotation "@Component". Com isso, a classe se torna um componente do Spring e pode ser injetado automaticamente com @Autowired.
  - Vale ressaltar que o Spring tem outras annotations com semântica mais específica, por exemplo:
    - @Repository para repositories
      - No caso do UserRepository, não é necessário adicionar ela porque essa interface herda de JpaRepository que já está registrado como componente do Spring.
    - @Service para services
