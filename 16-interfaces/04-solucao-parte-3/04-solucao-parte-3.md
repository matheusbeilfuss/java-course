# Solução do problema - PARTE 3

- Solução básica, com interfaces.
- O problema da solução anterior é o alto acoplamento entre os serviços `RentalService` e `BrazilTaxService`.
  - Não é uma boa prática fazer uma declaração direta do BrazilTaxService no RentalService, porque o RentalService fica dependendo exclusivamente do BrazilTaxService.
  - Isto é, o serviço de aluguel funciona exclusivamente para as regras de imposto do Brasil. Isso significa que o sistema tem dois pontos de alteração caso a regra de imposto mude em algum momento.
    - Se a regra fosse de outro país, seria necessário mudar a instanciação do TaxService no programa principal (além de criar outra classe do serviço para o país em questão) e trocar na classe RentalService.
- Para evitar esse problema de se ter mais pontos de interação, utiliza-se interface. Onde há uma classe que depende diretamente de outra, adiciona-se uma interface entre elas.
- A interface dessa solução não tem implementação da operação "tax", ela vai ser abstrata.
- A interface vai definir um contrato: um serviço de imposto precisa ter o método "tax", que recebe uma quantia e retorna o imposto relativo a essa quantia.
- Assim, caso seja necessário trocar a classe "TaxService", mexe-se num lugar só.
- Código na pasta `src`.
