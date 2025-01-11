# Saída de dados em Java

- Para escrever na tela um texto qualquer:
  - Sem quebra de linha ao final: `System.out.print("Bom dia!");`
  - Com quebra de linha ao final: `System.out.println("Bom dia!");`
- Para escrever o valor de variáveis na tela, basta inserir ela como parâmetro no print;
- Para controlar o número de casas decimais no print: `System.out.printf("%.2f%n", x);`;
  - Pega o formato do computador em que se está trabalhando (para vírgula ou ponto);
  - Para imprimir com ponto, importar a classe "Locale" e usar `Locale.setDefault(Locale.US);`.
- Para concatenar, basta usar "+" entre as variáveis/strings.
  - No caso do printf, é preciso usar o formato `"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2`;
    - Sendo %f para ponto flutuante, %d para inteiro, %s para texto e %n para quebra de linha.
