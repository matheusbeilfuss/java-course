# Interface Comparable

- https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html

- Implementação básica:

```
public interface Comparable<T> {
  int compareTo (T o);
}
```

- "T" porque essa interface é parametrizada em um tipo "T" qualquer, e o método compareTo recebe um objeto "o" do tipo "T".

---

- Problema motivador
  - Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostrá-los ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode"

---

- Outro problema
  - Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato.csv,armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar o resultado na tela.Nota: o caminho do arquivo pode ser informado "hardcode".
- Para isso, é preciso que a classe da entidade implemente a interface Comparable, que obriga a implementação do método "compareTo" que, por sua vez, serve para comparar objetos.
  - Isto é, quando se fala que uma classe é comparável, vai ser necessário implementar um contrato dizendo como se compara um objeto com outro.
- Quando se compara um objeto com outro, o resultado é um número negativo, zero ou um número positivo se o objeto é menor que, igual ou maior que o objeto especificado.
- Por exemplo, comparando "maria" com "alex", maria é maior em relação à ordem alfabética. Por isso o resultado é um número positivo.
  - É assim que o método "compareTo" deve funcionar.
- Em resumo, a interface "Comparable" serve para se definir na classe como um objeto é comparado com outro, bastando apenas implementar o contrato "compareTo".
