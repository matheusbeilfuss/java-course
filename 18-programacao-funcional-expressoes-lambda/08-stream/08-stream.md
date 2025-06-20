# Stream

- É uma sequência de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
  - Fonte de dados: coleção, array, função de iteração, recurso de E/S
- Sugestão de leitura: http://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.htm

---

- Características
  - Stream é uma solução para processar sequências de dados de forma:
    - Declarativa (iteração interna: escondida do programador). Escreve o que fazer e o processamento ocorre internamente.
    - Parallel-friendly (imutável -> thread safe). O objeto imutável pode ser paralelizável de forma segura. Há uma facilidade de trabalhar com paralelismo e concorrência usando streams.
    - Sem efeitos colaterais.
    - Sob demanda (lazy evaluation). Avaliação preguiçosa ou tardia: os dados de uma stream vão ser consumidos somente à medida que forem necessários.
  - Acesso sequencial (não há índices).
  - Single-use: só pode ser "usada" uma vez. A stream consumida, não é possível utilizar ela de novo.
  - **Pipeline**: operações em streams retornam novas streams. Então é possível criar uma cadeia de operações (fluxo de processamento).

---

- Operações intermediárias e terminais
  - O pipeline (operações que se aplicam em uma stream) é composto por zero ou mais operações intermediárias e uma terminal. Pelo menos uma operação terminal é necessário para se ter um resultado.
  - Operação intermediária:
    - Produz uma nova streams (encadeamento)
    - Só executa quando uma operação terminal é invocada (lazy evaluation)
  - Operação terminal:
    - Produz um objeto não-stream (coleção ou outro objeto)
    - Determina o fim do processamento da stream
- Operações intermediárias
  - filter
  - map
  - flatmap
  - peek
  - distinct
  - sorted
  - skip
  - limit (\*)
    - Limita a quantidade de elementos lidos da stream;
    - short-circuit porque corta a execução. Quando a condição dessa função é satisfeita, o processamento termina.
  - \* short-circuit
- Operações terminais
  - forEach
  - forEachOrdered
  - toArray
  - reduce
  - collect
  - min
  - max
  - count
  - anyMatch (\*)
  - allMatch (\*)
  - noneMatch (\*)
  - findFirst (\*)
  - findAny (\*)
  - \* short-circuit

---

- Criar uma stream
  - Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection.
    - https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html
  - (Algumas) Outras formas de se criar uma stream incluem:
    - Stream.of
    - Stream.ofNullable
    - Stream.iterate
