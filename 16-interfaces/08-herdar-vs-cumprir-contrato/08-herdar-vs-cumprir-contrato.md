# Herdar vs. cumprir contrato

- Aspectos em comum entre herança e interfaces
  - Relação é-um
  - Generalização/especialização
  - Polimorfismo
- Diferença fundamental
  - Herança => reúso
  - Interface => contrato a ser cumprido
  - Ao usar herança, temos o reúso de informações e comportamentos. Na interface, seu objetivo primordial é um contrato a ser cumprido

---

- A partir do Java 8, é possível ter implementações padrão na interface, mas o conceito clássico de interface é simplesmente a definição de um contrato.

---

- E se eu precisar implementar Shape como interface, porém também quiser definir uma estrutura comum reutilizável para todas figuras?
  - Pode-se fazer uma implementação que combina interface com classe abstrata

---

- Código na pasta `src`
- Soluções do professor: https://github.com/acenelio/interfaces2-java
  - Um commit da solução com apenas classe abstrata e outro com interface e classe abstrata
- Outro link de projeto real onde de usou esse padrão: https://github.com/acenelio/springboot2-ionic-backend/tree/master/src/main/java/com/nelioalves/cursomc/services
