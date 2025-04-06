# Classes e métodos final

- Palavra chave: **final**
  - **Classe**: evita que a classe seja herdada
    - `public final class SavingsAccount {`
  - **Método**: evita que o método sob seja sobreposto

---

- Pra quê?
  - Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.
    - Geralmente convém acrescentar final em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências
  - Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
    - Exemplo clássico: String
