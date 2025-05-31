# Como TreeSet compara os elementos

- Recordando as implementações
  - Principais implementações:
    - HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
    - TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
    - LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
- Veremos como o TreeSet faz a comparação de elementos para que eles possam ser ordenados
  - Ele usa o compareTo da interface Comparable, ou o Comparator (isso veremos mais à frente)
  - Por isso, ao usar o TreeSet, a classe do conjunto tem que ser uma implementação do Comparable, para que seja possível que o TreeSet ordene seus objetos.
