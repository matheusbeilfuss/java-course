# Set

- Set<T>
  - Tipo genérico e interface
  - Representa um conjunto de elementos (similar ao da Álgebra)
    - Não admite repetições
    - Elementos não possuem posição
      - Podem ou não possuir ordem, mas não posição
    - Acesso, inserção e remoção de elementos são rápidos
    - Oferece operações eficientes de conjunto: interseção, união, diferença.
    - Principais implementações:
      - **HashSet** - mais rápido (operações O(1) em tabela hash) e não ordenado
      - **TreeSet** - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
        compareTo do objeto (ou Comparator)
      - **LinkedHashSet** - velocidade intermediária e elementos na ordem em que são adicionados
        - Mais lento que HashSet mas um pouco mais rápido que TreeSet
  - https://docs.oracle.com/javase/10/docs/api/java/util/Set.html

---

- Alguns métodos importantes
  - add(obj), remove(obj), contains(obj)
    - A comparação para ver se pode adicionar, remover ou se existe é baseada em equals e hashCode
    - Se equals e hashCode não existir, é usada comparação de ponteiros (ou referências)
  - clear()
  - size()
  - removeIf(predicate)
    - Remove todos que atenderem ao predicado
  - addAll(other) - **união**: adiciona no conjunto os elementos do outro conjunto, sem repetição
  - retainAll(other) - **interseção**: remove do conjunto os elementos não contitos em other
  - removeAll(other) - **diferença**: remove do conjunto os elementos contidos em other

---

- Demo 1:

```
Set<String> set = new LinkedHashSet<>();

set.add("Tv");
set.add("Tablet");
set.add("Notebook");

// set.remove("Tablet");
// set.removeIf(x -> x.length() >= 3); // remove todo elemento x tal que x...
set.removeIf(x -> x.charAt(0) >= 'T');


System.out.println(set.contains("Notebook"));

for (String p : set) {
  System.out.println(p);
}
```

--- Demo 2:

```
Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

//union
Set<Integer> c = new TreeSet<>(a); // cópia do conjunto a
c.addAll(b); // c U b
System.out.println(c);

//intersection
Set<Integer> d = new TreeSet<>(a);
d.retainAll(b);
System.out.println(d);

//difference
Set<Integer> e = new TreeSet<>(a);
e.removeAll(b);
System.out.println(e);
```
