# Modificadores de acesso

- https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html;
- **private**: o membro só pode ser acessado na **própria classe**;
- (nada): o membro só pode ser acessado nas classes do **mesmo pacote**;
- **protected**: o membro só pode ser acessado no **mesmo pacote**, bem como em **subclasses de pacotes diferentes**;
  - Relacionado ao conceito de herança.
- **public**: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está).
- Figura: https://stackoverflow.com/questions/215497/in-java-difference-between-package-private-public-protected-and-private
