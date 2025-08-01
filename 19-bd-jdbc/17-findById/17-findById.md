# Implementando findById

- Vamos implementar a primeira operação de acesso a dados, o findById (encontrar um objeto passando ID como parâmetro)
- SQL Query:

```
SELECT seller.*,department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
WHERE seller.Id = ?
```

- Busca os dados de um vendedor específico (identificado pelo Id), trazendo todas as colunas da tabela seller e também o nome do departamento ao qual ele pertence, obtido por meio de um INNER JOIN com a tabela department. O nome do departamento é exibido com o alias DepName;
- ResultSet traz os dados no formato de tabela. A classe DAO é responsável por pegar os dados do BD relacional e transformar em objetos;
- A conexão com o BD deve ser finalizada quando o programa é finalizado, não no DAO.
