# Visão geral do JDBC

- Visão mais teórica do JDBC.
- JDBC (Java Database Connectivity): API padrão do Java para acesso a dados
  - Biblioteca que já vem no Java para acessar BDs
- Páginas oficiais:
  - https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
  - https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
- Pacotes: java.sql e javax.sql (API suplementar para servidores)

---

- Explicação da figura
  - JDBC permite programar o acesso a dados de uma forma única. Na aplicação, instala-se um driver do JDBC, que converte o código feito usando a API do JDBC para o código nativo dos bancos de dados específicos. Na figura há o Postgres, Oracle e poderia haver o MySQL.
  - Isso é interessante porque o mesmo código pode ser usado para bancos de dados diferentes.
