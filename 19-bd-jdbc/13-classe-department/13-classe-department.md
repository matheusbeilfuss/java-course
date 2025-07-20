# Classe Department

- Vamos começar a implementar nosso modelo de domínio;
- O sistema em questão é um sistema de vendedores que possui departamentos.
  - Um vendedor pertence a um departamento. Um departamento pode ter vários vendedores.
- Entity class checklist:
  - Attributes
  - Constructors
  - Getters/Setters
  - hashCode and equals
  - toString
  - implements Serializable
    - Isso para que os objetos possam ser transformados em sequência de bytes. É preciso implementar isso se for necessário que o objeto seja gravado em arquivo, trafegado em rede etc.
