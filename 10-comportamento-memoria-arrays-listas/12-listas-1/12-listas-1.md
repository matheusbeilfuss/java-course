# Listas - Parte 1

- Parte teórica: explicação da estrutura;

- Lista é uma estrutura de dados:
  - Homogênea (dados do mesmo tipo);
  - Ordenada (elementos acessados por meio de posições);
  - Inicia vazia, e seus elementos são alocados sob demanda;
  - Cada elemento ocupa um "nó" (ou nodo) da lista.
- Tipo (interface): List;
  - List não é uma classe, é uma interface, um tipo que define apenas a especificação das operações;
  - Para trabalhar com interfaces, com objetos desse tipo, vamos ter que instanciar esse tipo, mas a interface não pode ser instanciada, é preciso de uma classe que implementa essa interface.
- Classes que implementam: ArrayList, LinkedList, etc.
  - Vamos usar mais o ArrayList.
- Vantagens:
  - Tamanho variável;
  - Facilidade para se realizar inserções e deleções.
- Desvantagens:
  - Acesso sequencial aos elementos \*.
    - \*Dependendo da implementação da lista, essa navegação é otimizada, como o ArrayList, por exemplo, que mistura o vetor (figura no canto inferior direito do slide) e a lista. Se comporta como um vetor. Isso minimiza a desvantagem.
