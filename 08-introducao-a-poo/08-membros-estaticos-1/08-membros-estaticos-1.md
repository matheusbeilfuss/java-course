# Membros estáticos - Parte 1

- Também chamados membros de classe;
  - Em oposição a membros e instância.
- São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe;
- Aplicações comuns:
  - Classes utilitárias;
  - Declaração de constantes.
- Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

- Versões da resolução do problema:

  - Versão 1: métodos na própria classe do programa;
    - Nota: dentro de um método estático você não pode chamar membros de instância da mesma classe.
  - Versão 2: classe Calculator com membros de instância;
  - Versão 3: classe Calculator com método estático.

- Como declarar constantes no Java:

  - `public static final double NET_SALARY = 1500.00;`

- A versão 1 da solução tem "static" em todos os membros;

  - Não se pode chamar métodos não estáticos dentro de um método estático.

- A versão 2 da solução delega as funções para a classe utilitária "Calculator".
  - Dessa forma, como os membros da classe calculator não são estáticos, é necessário instanciar um objeto para utilizar eles.
