# Listas - Parte 2

- Parte prática: uso da estrutura;

- Tamanho da lista: `size()`
- Obter o elemento de uma posição: `get(position)`
- Inserir elemento na lista: `add(obj), add(int, obj)`
- Remover elementos da lista: `remove(obj), remove(int), removeIf(Predicate)`
- Encontrar posição de elemento: `indexOf(obj), lastIndexOf(obj)`
- Filtrar lista com base em predicado: `List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());`
- Encontrar primeira ocorrência com base em predicado: `Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);`

- Assuntos pendentes:

  - interfaces
  - generics: parametrizar a definição de um tipo informando um outro tipo específico. Exemplo de lista de inteiros: `List<Integer> list;`
  - predicados (lambda)

- Lista não aceita tipos primitivos;
- "stream()" é um tipo especial do Java 8 que aceita operações com expressões lambda.
  - Esse stream não é compatível com list. Por isso, é preciso converter ele de novo para lista usando a função "collect" e depois "toList";
  - Fica verboso, mas mantém a compatibilidade com list e deixa fazer operações de lambda com ele;
  - Resumo: converte para stream, faz a operação lambda e depois volta para lista.
