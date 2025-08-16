# Tratamento de exceção - Delete

- Fazer com que DELETE retorne 404 em vez de 500.
- Porque o método não lança mais exceção caso uma referência não seja encontrada, foi necessário codificar o método `delete` do `UserService` de maneira ligeiramente diferente para que a exceção fosse lançada e capturada corretamente.
- Para lançar uma exceção específica de serviço no caso de violação de integridade do BD (DataIntegrityViolationException), criou-se outra exceção personalizada: `DatabaseException`.
- Checklist:
  - NEW CLASS: services.exceptions.DatabaseException
  - ResourceExceptionHandler
    - Adicionou-se um tratamento específico para a DatabaseException.
  - UserService
    - EmptyResultDataAccessException
    - DataIntegrityViolationException
