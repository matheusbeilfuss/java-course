# FileReader e BufferedReader

- FileReader (stream de leitura de caracteres a partir de arquivos)
  - "stream" = sequência. Ao instanciar um FileReader, estabelece-se uma sequência de leitura a partir de um arquivo. Conforme se lê o arquivo, navega no stream.
  - https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
- BufferedReader (mais rápido)
  - É instanciado a partir do FileReader, mas implementa otimizações utilizando buffer de memória
  - https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
  - https://stackoverflow.com/questions/9648811/specific-difference-between-
    bufferedreader-and-filereader
    - Discussão sobre a diferença entre os FileReader e BufferedReader
- Nessa aula, vimos como funciona o processo de abrir e fechar manualmente as streams. Na próxima aula, veremos uma forma melhor de fazer isso.
