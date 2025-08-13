# Atualização de User

- Checklist:
  - UserService
    - O `getReferenceById` instancia um User, mas não vai ao BD, apenas deixa um objeto monitorado pelo JPA para trabalhar com ele, e em seguida se pode efetuar alguma operação com BD.
      - É mais eficiente do que usar o `findById`, que vai ao BD e traz o objeto.
    - Permitiu-se apenas atualizar nome, e-mail e telefone.
  - UserResource
    - No padrão REST, para atualizar um recurso se utiliza o método HTTP "PUT". Por isso, utiliza-se a annotation "@PutMapping", com o id que se vai atualizar.
      - Também é preciso usar a annotation "@PathVariable", para pegar o id através da URL, e a annotation "@RequestBody", para pegar o objeto com os dados a serem atualizados.
- Test:

```
{
"name": "Bob Brown",
"email": "bob@gmail.com",
"phone": "977557755"
}
```
