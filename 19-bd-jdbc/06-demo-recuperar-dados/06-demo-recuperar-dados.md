# Demo - recuperar dados

- Veremos como recuperar os dados do BD;
- Para isso, vamos criar a estrutura e os dados na base de dados;
- Script SQL executado: https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql

```
CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (id)
);

INSERT INTO department (Name) VALUES
  ('Computers'),
  ('Electronics'),
  ('Fashion'),
  ('Books');

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES
  ('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2),
  ('Alex Grey','alex@gmail.com','1988-01-15 00:00:00',2200,1),
  ('Martha Red','martha@gmail.com','1993-11-30 00:00:00',3000,4),
  ('Donald Blue','donald@gmail.com','2000-01-09 00:00:00',4000,3),
  ('Alex Pink','bob@gmail.com','1997-03-04 00:00:00',3000,2);
```

- Código-fonte da aula: https://github.com/acenelio/jdbc2
- Para trabalharmos com a recuperação de dados, precisamos entender duas classes da API do JDBC: Statement e ResultSet.
- API:
  - Statement: serve para montar um comando SQL para ser executado (para recuperar os dados do BD)
  - ResultSet: representa um objeto contendo o resultado da consulta no formato de tabela (os dados podem ser acessados por colunas e linhas). Esse objeto tem as operações abaixo:
    - first() [move para posição 1, se houver]
    - beforeFirst() [move para posição 0]. Representa o começo do ResultSet antes de ter os dados.
    - next() [move para o próximo, retorna false se já estiver no último]. Útil para percorrer o ResultSet com while.
    - absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]. Posiciona o ResultSet em uma posição informada.

---

- Código na aula no projeto jdbc2.
- Checklist:
  - Usar o script SQL para criar a base de dados "coursejdbc".
  - Fazer um pequeno programa para recuperar os departamentos.
  - Na classe DB, criar métodos auxiliares estáticos para fechar ResultSet e Statement (para evitar memory leaks, pois são recursos externos à JVM).
