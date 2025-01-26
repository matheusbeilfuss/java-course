# Tipos referência vs. tipos valor

- Classes são tipos referência;
  - Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim “tentáculos” (ponteiros) para caixas;
  - Tipos referência aceitam o valor "null", que indica que a variável aponta pra ninguém.
- Tipos primitivos são tipos valor;
  - Em Java, tipos primitivos são tipos valor;
    - Tipos primitivos: boolean, char, byte, short, int, long, float, double.
  - Tipos valor são CAIXAS e não ponteiros;
- Variáveis de tipos primitivos precisam ser inicializadas (ter algum valor).
- Valores padrão.
  - Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos:
    - números: 0
    - boolean: false
    - char: caractere de código 0
    - objeto: null
    - string: null
