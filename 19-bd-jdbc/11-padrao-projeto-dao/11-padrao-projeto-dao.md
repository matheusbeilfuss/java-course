# Padrão de projeto DAO (Data Access Object)

- Aula teórica sobre o padrão de projeto DAO;
- Referências:
  - https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999
  - https://www.oracle.com/technetwork/java/dataaccessobject-138824.html

---

- Ideia geral do padrão DAO:
  - Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta entidade. Por exemplo:
    - Cliente: ClienteDao (responsável pelo acesso a dados de clientes no BD)
    - Produto: ProdutoDao
    - Pedido: PedidoDao
  - Cada DAO será definido por uma interface.
    - Isso porque o acesso a dados pode mudar em um futuro próximo (trocar de BD, tecnologia de acesso aos dados etc.). Então, para que o sistema fique flexível e preserve o contrato dos objetos de acesso a dados, eles são definidos através de interfaces.
  - A injeção de dependência pode ser feita por meio do padrão de projeto Factory.
    - Isso pode ser feito de várias formas. Uma das formas, sem framework, é o padrão de projeto Factory;
    - O objeto Factory seria o responsável por instanciar as implementações do DAO.

---

- Diagrama exemplo no PDF.
  - É possível fazer um DAO genérico? Sim, mas como estamos iniciando nesse assunto, faremos um DAO para cada entidade separadamente;
  - Além das interfaces, vão haver as classes que vão implementar essas interfaces. Por exemplo, usando Java, pode-se usar a tecnologia JDBC para implementar a interface. Poderia ser outra tecnologia, como JPA por exemplo.
  - A DaoFactory é a responsável por instanciar os DAOs. Note que os métodos retornam o tipo da interface. Mas, o método instancia a implementação (como o ClientDaoJDBC).
