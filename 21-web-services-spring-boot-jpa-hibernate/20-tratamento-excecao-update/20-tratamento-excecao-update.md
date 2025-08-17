# Tratamento de exceção - update

- Tratou-se o caso em que se tenta atualizar um usuário que não existe, retornando erro 404 em vez de 500.
- Checklist:
  - UserService
    - EntityNotFoundException
