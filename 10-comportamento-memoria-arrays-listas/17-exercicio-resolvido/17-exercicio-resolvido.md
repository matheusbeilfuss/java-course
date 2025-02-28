# Exercício resolvido

- Exercício para declaração, instanciação, percorrimento e acesso aos elementos de uma matriz;
- Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal
  principal e a quantidade de valores negativos da matriz.
- Resposta: https://github.com/acenelio/matrix1-java;
- Código na pasta `src`;
- Na declaração de matriz, um arranjo bidimensional é indicado por "int[][]";
  - Exemplo: `int[][] mat = new int[n][n];`;
  - Se fosse tridimensional, era só adicionar mais um "[]" à declaração.
- A propriedade "length" funciona para matrizes assim como para vetores.
  - Exemplo de percorrimento da matriz usando length:

```
int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
        }
      }
    }
```

- `mat[i].length` porque acessa o vetor na linha i e aí verifica o tamanho desse vetor. Com isso, obtém-se o número de colunas.
