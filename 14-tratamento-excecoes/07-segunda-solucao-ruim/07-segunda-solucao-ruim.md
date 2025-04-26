# Segunda solução - ruim

- A primeira solução foi muito ruim principalmente porque a lógica de validação da reserva foi colocada no programa principal, e não na reserva.
  - Esse é um problema grave de delegação. Quem deve ser responsável pela reserva é a classe `Reservation`.
- Por isso, nessa solução, delegou-se a lógica de validação para a classe `Reservation`.
  - A operação da classe `Reservation`, ao ocorrer um erro, vai retornar uma string com a mensagem de erro.
- Essa solução ainda é ruim, mas é melhor do que a anterior, porque pelo menos se delega a lógica para a classe certa.
- Código na pasta `src`.
- Solução do exercício pelo professor:
  - https://github.com/acenelio/exceptions1-java/tree/511ae503832e7db9b23e0d574ee2f8a8543dd531
