# Enumerações

- Definição / discussão

  - É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
  - Palavra chave em Java: enum
  - Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
  - Referência: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

- Exemplo: estados de um pedido

  - Diagrama de atividades e código no slide da aula
  - Para representar esses estados de uma forma semanticamente boa e que fique fácil do programador trabalhar, pode-se usar um tipo enumerado ou enumeração
    - Para isso, pode-se declarar um enum com os valores possíveis
    - Com isso, pode-se criar uma classe com um atributo com o tipo do enum, que vai receber os valores do enum
    - Exemplo: https://github.com/acenelio/enum1-java e pasta `src`

- Conversão de string para enum

  - Isso é importante porque uma aplicação que vai usar o enum vai pedir para o usuário entrar o valor do enum. Nesse caso, é preciso pegar a string e converter para uma instância do tipo enumerado
  - Para isso, pode-se usar o método "valueOf" passando o nome do valor desejado, igual definido no enum

- Representação UML

  - O desenho do tipo enumerado é o mesmo da classe: um retângulo dividido em três;
  - Mas, no nome do tipo é preciso um estereótipo para enum: `<<enum>>`;
  - Na seção do meio, pode-se colocar os valores to tipo. Pode-se, também, atribuir números para esses valores;
  - Em uma anotação alterantiva, pode-se colocar um estereótipo em cada valor do tipo enumerado: `<<enum constant>>`.
