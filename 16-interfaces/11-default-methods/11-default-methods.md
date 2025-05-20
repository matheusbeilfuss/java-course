# Default methods

- Default methods (ou defender methods)
  - A partir do Java 8, interfaces podem conter métodos concretos.
    - Vale ressaltar que as interfaces também podem conter métodos estáticos ou privados.
  - A intenção básica é prover implementação padrão para métodos, de modo a evitar:
    1. Repetição de implementação em toda classe que implemente a interface
    2. A necessidade de se criar classes abstratas para prover reuso da implementação
- Outras vantagens:
  - Manter a retrocompatibilidade com sistemas existentes
  - Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis
    - Veremos isso mais à frente

---

- Código do problema exemplo na pasta `src`
- Implementação do professor: https://github.com/acenelio/interfaces5-java

---

- Considerações importantes
  - Sim: agora as interfaces podem prover reúso
  - Sim: agora temos uma forma de herança múltipla
    - Uma classe pode implementar várias interfaces, herdando/reutilizando comportamentos dessas interfaces
    - Não dá o problema do diamante porque o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescreve-lo
  - Interfaces ainda são bem diferentes de classes abstratas. Interfaces não possuem recursos tais como construtores e atributos.
