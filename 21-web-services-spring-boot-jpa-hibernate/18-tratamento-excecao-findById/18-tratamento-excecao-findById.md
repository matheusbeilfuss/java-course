# Tratamento de exceção - findById

- Vamos fazer tratamento de exceções de forma mais apropriada, começando pelo findById.
- Atualmente, ao buscar por um usuário cujo id não existe, é retornado o código 500 (Internal Server Error).
- Não é apropriado que erros como esse sejam retornados. Nesse caso, o erro 404 deveria ser retornado, que é o código para "não encontrado".
- O `get()` do Optional lança uma exceção se o objeto Optional não contiver usuário.
- Checklist:
  - NEW CLASS: services.exceptions.ResourceNotFoundException
    - Exceção personalizada da nossa camada de serviço, que deve ser capaz de lançar exceções dela e não deixar estourar exceções diversas.
  - NEW CLASS: resources.exceptions.StandardError
    - Quando se faz uma requisição e um erro é retornado, por padrão o Spring retorna um objeto de erro com os seguintes dados: timestamp, status, error, messagem e path.
    - Para que se possa fazer um tratamento manual das exceções e retornar um objeto similar a esse, cria-se uma classe para retornar um objeto desse.
    - Essa exceção fica com os resources, porque ela está na camada de requisição.
  - NEW CLASS: resources.exceptions.ResourceExceptionHandler
    - É nessa classe que vamos dar o tratamento manual dos erros.
    - Acima dela adicionou-se a annotation "@ControllerAdvice", que intercepta as exceções que ocorrerem para que esse objeto possa executar um possível tratamento.
    - Dentro dessa classe, ficam os métodos que vão lidar com as exceções. A annotation "@ExceptionHandler" é adicionada para que o método seja capaz de interceptar a requisição que deu exceção.
  - UserService
    - No método `findyId`, trocou-se o `.get()` pelo `.orElseThrow()`, que tenta fazer o get e, se não houver usuário, lança uma exceção.
