# Herança

- É um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra
- Definições importantes
- Vantagens
  - Reuso
  - Polimorfismo
- Sintaxe em Java
  - `class A extends B`
  - Classe A herda tudo que a classe B tem: dados e comportamentos

---

- Herança permite o reuso de atributos e métodos (dados e comportamento)
- Definições importantes
  - Relação "é-um"
  - Generalização/especialização
    - A superclasse é genérica, a subclasse é especializada
  - Superclasse (classe base) / subclasse (classe derivada)
  - Herança / extensão
    - A subclasse estende a superclasse: ela tem tudo o que a superclasse tem e acrescenta outras coisas
  - Herança é uma associação entre classes (e não entre objetos)
    - Quando se tem composição entre duas classes, ao instanciar os objetos também se vai ter dois objetos. Na herança, ao instanciar uma subclasse, vai-se ter um objeto só com todos os membros das duas classes (superclasse e subclasse)

---

- Modificador de acesso protected
  - Quando um membro da classe é "protected", esse membro pode ser acessado na própria classe, numa outra classe do mesmo pacote e numa outra classe de outro pacote, mas que seja uma subclasse.
