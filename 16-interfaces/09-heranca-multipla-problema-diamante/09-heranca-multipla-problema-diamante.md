# Herança múltipla e o problema do diamante

- Herança múltipla: classe herda de mais de uma superclasse
- Problema do diamante
  - A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.
  - Herança múltipla não é permitida na maioria das linguagens! Em Java também não é.
- Porém, uma classe pode implementar mais de uma interface
  - Mas, isso não é herança múltipla, pois não há reúso na relação entre a subclasse e as interfaces que ela implementa.
  - Mesmo assim, elimina o problema do diamante.
- Exemplo: https://github.com/acenelio/interfaces3-java
- Código na pasta `src`
