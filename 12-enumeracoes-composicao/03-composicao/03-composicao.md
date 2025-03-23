# Composição

- É um tipo de associação que permite que um objeto contenha outro
- Relação "tem-um" ou "tem-vários"
- Vantagens
  - **Organização**: divisão de responsabilidades (cada classe com a sua)
  - **Coesão**: cada objeto é responsável por uma única coisa, simples e bem definida
  - **Flexibilidade**: trabalhar com algo dividido em partes é mais fácil
  - **Reuso**: o mesmo objeto pode ser reaproveitado em mais de um lugar
- Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e "tem-vários".
  - O lado com diamente preto é o lado do todo, que contém as partes.
    - "Order" é o todo, "OrderItem" são partes que completam o todo.
  - No caso de "Client", ele não é parte do pedido, mas está associado com o pedido (um pedido tem um cliente).
    - Mas, mesmo assim isso também é chamado de "composição" de objetos na hora de implementar.
    - O mesmo para "OrderItem" e "Product".
- A composição de objetos pode ocorrer não só com entidades, mas também com serviços.
