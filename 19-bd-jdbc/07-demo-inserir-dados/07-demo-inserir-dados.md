# Demo - inserir dados

- Código fonte da aula: https://github.com/acenelio/jdbc3

- Veremos os seguintes elementos da API:
  - PreparedStatement: objeto que permite montar a consulta SQL deixando os parâmetros para colocar depois
  - executeUpdate
  - Statement.RETURN_GENERATED_KEYS: permite que se recupere o ID do novo objeto inserido
  - getGeneratedKeys
- Checklist:
  - Inserção simples com preparedStatement
  - Inserção com recuperação de Id

---

- Código na aula no projeto jdbc3;
- "?" é o placeholder no JDBC, onde depois serão inseridos os valores;
- Para instanciar uma data no JDBC, é preciso usar o java.sql.Date;
- Conexão com o banco é sempre fechada por último.
