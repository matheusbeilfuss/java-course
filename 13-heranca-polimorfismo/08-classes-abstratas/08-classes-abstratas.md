# Classes abstratas

- São classes que não podem ser instanciadas
- É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata
- Palavra `abstract` para tornar uma classe abstrata
  - `public abstract class Account {`

---

- Porque usar classe abstrata:
  - Reuso
  - Polimorfismo: a superclasse classe genérica nos permite tratarde forma fácil e uniforme todos os tipos de conta, inclusivecom polimorfismo se for o caso (como fizemos nos últimos exercícios). Por exemplo, você pode colocar todos tipos decontas em uma mesma coleção
