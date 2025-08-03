# Implementando findAll

- Mesmo comando SQL do findByDepartment, mas sem a restrição do departamento.
- SQL Query:

```
SELECT seller.*,department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
ORDER BY Name
```
