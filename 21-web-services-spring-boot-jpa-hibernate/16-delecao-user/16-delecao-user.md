# Deleção de User

- Checklist:
  - UserService
  - UserResource
    - Para deletar, a annotation do Spring Boot é "@DeleteMapping".
    - ResponseEntity<Void> porque a resposta da requisição não vai retornar corpo.
    - Para o Long id ser reconhecido como uma variável da URL, utiliza-se a annotation "@PathVariable".
    - No retorno, como é uma resposta sem corpo, utiliza-se o noContent(), que retorna uma resposta vazia (com o código HTTP 204, que é de uma resposta sem conteúdo). Além disso, utiliza-se o build().
- Se o usuário tiver pedidos, não será possível deletar ele, pois assim haveriam pedidos sem cliente, perdendo a integridade do BD.
  - Nesse caso, o BD retorna um problema de Constraint Violation e a requisição retorna o código 500, de erro no servidor.
  - Vamos tratar isso em uma próxima aula.
