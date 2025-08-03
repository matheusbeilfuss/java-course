# Implementando findByDepartment

- Buscar os vendedores dado um departmento;
- SQL Query:

```
SELECT seller.*,department.Name as DepName
FROM seller INNER JOIN department
ON seller.DepartmentId = department.Id
WHERE DepartmentId = ?
ORDER BY Name
```

- Restringe o departamento e ordena por nome;
- Para ter o controle da instanciação de um único departamento, há várias formas de fazer isso. Nessa aula, utilizou-se o map.
