# Discussão inicial sobre exceções

- Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa **em execução**
- Em Java, uma exceção é um objeto herdado da classe:
  - `java.lang.Exception` - o compilador obriga a tratar ou propagar
  - `java.lang.RuntimeException` - o compilador não obriga a tratar ou propagar
- Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrad

---

- Hierarquia de exceções do Java
  - Throwable: super classe genérica de todas as exceções
    - Error: erros que não se espera que o programador vai tratar, como `OutOfMemoryError`
    - Exception: erros que ocorrem no programa que se espera que o programa vai tratar, porque existe essa possibilidade. Exemplos são `IOException` ou `RuntimeException`.

---

- Por que exceções?
  - O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas
  - Vantagens:
    - Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro
    - Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
    - A exceção pode carregar dados quaisquer
