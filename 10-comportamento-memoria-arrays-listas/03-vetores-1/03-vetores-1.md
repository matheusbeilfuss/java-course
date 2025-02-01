# Vetores - Parte 1

- Em programação, "vetor" é o nome dado a arranjos unidimensionais;
- Arranjo (array) é uma estrutura de dados:
  - Homogênea (dados do mesmo tipo);
  - Ordenada (elementos acessados por meio de posições);
  - Alocada de uma vez só, em um bloco contíguo de memória.
- Vantagens:
  - Acesso imediato aos elementos pela sua posição.
- Desvantagens:

  - Tamanho fixo;
  - Dificuldade para se realizar inserções e deleções.

- Sintaxe para declaração de um vetor:

```
double[] vect = new double[n];
```

- Nesse caso, esse comando faz o seguinte:

1. `double[]`: declara um array de números do tipo double. O tipo double é usado para armazenar números de ponto flutuante, ou seja, números que podem ter casas decimais.
2. `vect`: é o nome da variável que irá armazenar o array de números do tipo double. Nesse caso, o nome da variável é vect, mas poderia ser qualquer nome válido.
3. `new double[n]`: cria um novo array de tamanho n (onde n é uma variável que contém um número inteiro). O array será do tipo double e terá n elementos. Esse comando aloca a memória necessária para armazenar o array com n posições, todas inicialmente com valor 0.0 (o valor padrão para elementos do tipo double em um array).

- Para percorrer um vetor guardando dados nele, por exemplo:

```
for (int i=0; i<n; i++) {
	vect[i] = sc.nextDouble();
}
```

- Programa exemplo na pasta "src".
