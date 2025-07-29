# SellerDaoJDBC e DaoFactory

- Estruturação do DAO;
- DaoFactory é a classe responsável por instanciar os DAOs.
  - Dessa forma, a classe vai expor um método que retorna o tipo da interface, mas internamente vai instanciar uma implementação. Esse é um macete para não precisa expor a implementação, apenas a interface;
  - Isto é, o programa não conhece a implementação, apenas a interface. É uma forma de fazer injeção de dependência sem explicitar a implementação.
