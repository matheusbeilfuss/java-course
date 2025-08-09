# Inserção de User

- O objetivo é salvar no BD um usuário.
- Checklist:
  - UserService
  - UserResource
- Test:

```
{
"name": "Bob Brown",
"email": "bob@gmail.com",
"phone": "977557755",
"password": "123456"
}
```

- Para inserir algo no BD, utiliza-se a annotation "@PostMapping".
  - Para dizer que o objeto vai chegar como JSON que vai ser desserializado para um objeto User, é preciso usar a annotation "@RequestBody" na assinatura do método.
- Quando se insere um recurso, é mais adequado retornar o código de resposta "201". Esse código HTTP significa que se criou um novo recurso.
  - Por isso, em vez de `ResponseEntity.ok()`, utiliza-se `ResponseEntity.created()`.
  - Mas, esse método espera um objeto do tipo "URI". Isso porque, ao retornar um 201, é esperado que a resposta contenha um cabeçalho chamado "location" com o recurso que foi inserido.
  - No Spring Boot, há uma forma padrão de gerar esse endereço:

### Linha 41

```java
URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
    .path("/{id}")
    .buildAndExpand(obj.getId())
    .toUri();
```

Passo a passo:

1. **`ServletUriComponentsBuilder.fromCurrentRequest()`**
   Cria um _builder_ de URI a partir da **requisição atual** (o POST em `/users`).

   - Ele pega esquema, host, porta e caminho já usados na chamada (ex.: `http://localhost:8080/users`).

2. **`.path("/{id}")`**
   Acrescenta `/{id}` ao caminho atual, preparando um **template** com uma variável chamada `id`.

   - Até aqui, o caminho fica algo como `http://localhost:8080/users/{id}` (ainda sem o valor).

3. **`.buildAndExpand(obj.getId())`**
   Substitui a variável do template (`{id}`) pelo valor retornado por `obj.getId()`.

   - Normalmente, após salvar (`service.insert(obj)`), o JPA preenche o `id` gerado (ex.: `5`).
   - Resultado: `http://localhost:8080/users/5`.
   - Também faz o _encode_ correto se houver caracteres especiais (não é o caso de um id numérico, mas é uma boa prática).

4. **`.toUri()`**
   Converte o resultado do _builder_ para um objeto `java.net.URI`, que é o tipo aceito em cabeçalhos HTTP.

> Em resumo: essa linha constrói a **URI canônica do recurso recém-criado**, com base na requisição atual + o `id` gerado no banco.

---

### Linha 42

```java
return ResponseEntity.created(uri).body(obj);
```

Passo a passo:

1. **`ResponseEntity.created(uri)`**
   Cria uma resposta HTTP com **status 201 (Created)** e define o cabeçalho **`Location`** apontando para a `uri` montada acima (`/users/5`).
   - `201 Created` é o status correto para _POST_ que cria recurso.
   - O cabeçalho `Location` indica onde o novo recurso pode ser acessado via GET.
2. **`.body(obj)`**
   Adiciona o corpo da resposta com o próprio objeto criado (`obj`) — normalmente serializado em JSON.
   - Você poderia usar `.build()` para não mandar corpo nenhum, mas retornar o objeto costuma ser prático para o cliente.

- Essa é a forma adequada de inserir um recurso no BD.
