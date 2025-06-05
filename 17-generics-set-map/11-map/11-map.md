# Map

- Map<K,V>
  - Estrutura de dados genérica, mas com dois tipos: um tipo chave e outro valor (K,V)
  - Armazena-se valores nessa coleção, mas eles serão identificados por uma chave
  - A chave e o valor podem ser de qualquer tipo
- https://docs.oracle.com/javase/10/docs/api/java/util/Map.html
- É uma coleção de pares chave / valor
  - Não admite repetições do objeto chave
  - Os elementos são indexados pelo objeto chave (não possuem posição)
  - Acesso, inserção e remoção de elementos são rápidos
- Uso comum: cookies, local storage, qualquer modelo chave-valor
- Principais implementações:
  - **HashMap** - mais rápido (operações O(1) em tabela hash) e não ordenado
  - **TreeMap** - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
  - **LinkedHashMap** - velocidade intermediária e elementos na ordem em que são adicionados

---

- Alguns métodos importantes
  - put(key, value), remove(key), containsKey(key), get(key)
    - Baseado em equals e hashCode
    - Se equals e hashCode não existir, é usada comparação de ponteiros
  - clear()
  - size()
  - keySet() - retorna um Set<K>
    - Retorna um set com as chaves contidas no map
  - values() - retorna um Collection<V>
    - Retorna uma coleção do tipo valor
