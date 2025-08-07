# Entidade pedido. Datas com Instant e padrão ISO 8601

- Vamos trabalhar com a classe pedido (Order), a classe Instant para representar um instante e o padrão ISO 8601, usado para representar datas na forma de texto.
- Sobre o atributo "moment" do pedido, antes do Java 8 se usava o tipo Date. Mas, a partir do Java 8, a classe Instant surgiu como alternativa, e ela é melhor para se trabalhar.
- Criamos a tabela de pedidos e implementamos os mapeamentos da associação.

---

- Basic new entity checklist:
  - Entity: criar a entidade
    - "To many" association, lazy loading, JsonIgnore
  - Repository
  - Seed
  - Service
  - Resource
