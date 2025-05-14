# Inversão de controle e injeção de dependência

- Acoplamento forte ao fazer uma associação direta de uma classe para outra
  - Isso porque a classe RentalServiceconhece a dependência concreta
  - Se a classe concreta mudar, é preciso mudar a classe RentalService

```
class RentalService {
  (...)
  private BrazilTaxService taxService;
  (...)
}
```

- Acoplamento fraco com interface
  - A classe RentalServicenão conhece a dependência concreta
  - Se a classe concreta mudar, a classe RentalServicenão muda nada

```
class RentalService {
  (...)
  private TaxService taxService;
  (...)
}
```

- Com isso, ao instanciar o BrazilTaxService no programa principal, ocorre um upcasting no construtor do RentalService
  - Assim, poderia ser qualquer classe que implementa a interface TaxService no lugar de BrazilTaxService
  - Essa é a chamada "injeção de dependência por meio de construtor": o objeto de serviço de imposto do qual a RentalService depende é instanciado por outro lugar (nesse caso, no programa principal) e essa instância é injetada no RentalService por meio do construtor
- Se a própria classe fica responsável por instanciar suas dependências, gera-se um forte acoplamento e mais pontos de alteração, que é o que não se quer

---

- **Inversão de controle**
  - Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.
- **Injeção de dependência**
  - É uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai". Pode ser implementada de várias formas:
    - Construtor
    - Classedeinstanciação(builder/factory)
    - Container/framework
