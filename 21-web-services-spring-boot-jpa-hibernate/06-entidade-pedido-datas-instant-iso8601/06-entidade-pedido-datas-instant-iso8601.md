# Entidade pedido. Datas com Instant e padrão ISO 8601

- Vamos trabalhar com a classe pedido (Order), a classe Instant para representar um instante e o padrão ISO 8601, usado para representar datas na forma de texto.
- Sobre o atributo "moment" do pedido, antes do Java 8 se usava o tipo Date. Mas, a partir do Java 8, a classe Instant surgiu como alternativa, e ela é melhor para se trabalhar.
- Criamos a tabela de pedidos e implementamos os mapeamentos da associação (parte 1 da aula).
- Formato ISO 8601 define várias possibilidades de formato.
  - A que usamos é "2019-06-20T19:53:07Z".
  - A letra "Z" indica que esse horário está no padrão UTC, timezone GMT.
  - Com isso, qualquer desenvolvedor no mundo consegue ver que é um horário no padrão UTC e converter para o horário local.
- Nesse caso, temos uma associação dupla entre usuário e pedido: pedido tem um usuário e dentro do usuário tem uma lista de pedidos. Isso pode gerar um loop, em que o pedido chama um usuário, o usuário chama os pedidos e assim por diante.
  - Para isso não acontecer, é preciso adicionar a annotation "JsonIgnore" em um dos dois lados pelo menos. Vamos colocar na lista de pedidos do cliente, por exemplo.
- Quando se faz a chamada de um pedido, automaticamente o JPA carrega o cliente associado a ele.
  - Quando se tem uma associação "muitos para um", ao carregar um objeto do lado do "muitos", o objeto do lado "um" vem automaticamente.
  - Isso não acontece do lado do "um para muitos". Se carregar um objeto com uma associação "para muitos" do outro lado, o JPA não carrega os objetos do lado do "muitos" por padrão. Isso é chamado de "lazy loading".
  - **Lazy loading**: quando se tem uma associação "para muitos", o JPA não carrega os objetos "para muitos". Isso para não estourar a memória do computador.
    - Ele só carrega os objetos do lado "para muitos" se acionar isso explicitamente.
    - Isso tem a ver com a configuração `spring.jpa.open-in-view=true` do `application.properties`. Essa configuração permite que o Jackson (pacote que serializa os objetos), ao serializar o JSON, solicite ao JPA que traga os pedidos do BD.
    - Desabilitando essa configuração, ela tira a possibilidade do Jackson chamar o JPA para trazer os pedidos associados ao cliente. Isto é, deixando ela como falso, não se permite que um componente do fim do ciclo de vida, na hora de renderizar o JSON, chame de novo o BD para buscar o restante.
    - Deixar como true tem vantagens e desvantagens: fica mais prático, mas vai complicar o ciclo de vida (pois permite o Jackson que renderiza o JSON no fim do ciclo de vida voltar e pedir dados do BD).

---

- Basic new entity checklist:
  - Entity: criar a entidade
    - "To many" association, lazy loading, JsonIgnore
  - Repository
  - Seed
  - Service
  - Resource
