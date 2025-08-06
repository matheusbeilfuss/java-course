# Entidade User e seu resource

- Basic entity checklist:
  - Basic attributes
  - Associations (instantiate collections)
  - Constructors
  - Getters & Setters (collections: only get)
  - hashCode & equals
  - Serializable
    - Interface que permite que objetos sejam transformados em cadeias em bytes para trafegar na rede, ser transformado em arquivo etc.
- O resource vai ser o recurso web correspondente à entidade User
  - Ele vai disponibilizar dois endpoints para recuperarmos os usuários cadastrados e um usuário informando o Id dele
