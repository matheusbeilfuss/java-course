# Criando uma classe com três atributos para representar melhor o triângulo

- Triângulo é uma entidade com três atributos: a, b, c;
  - A representação anterior é ruim porque é preciso criar novas variáveis a cada novo triângulo;
  - Por isso, vamos criar os triângulos usando classes.
- Classe é um tipo estruturado que pode conter (membros):
  - Atributos (dados / campos);
  - Métodos (funções / operações).
- Sintaxe:

```
package entities; // considera-se que o triângulo é uma entidade do negócio

public class Triangle {

  public double a;
  public double b;
  public double c;
}
```

- Com isso, tem-se uma única variável x e y que constituem um triângulo: um tipo composto por três atributos;
- Para instanciar:

```
Triangle x, y;
x = new Triangle();
y = new Triangle();
```

- Variáveis declaradas normalmente são criadas em uma área da memória chamada "stack", que é onde ficam as variáveis estáticas;
- Durante a execução do programa, pode-se fazer uma alocação dinâmica de memória (usando o "new");
  - Ao instanciar um triângulo (`x = new Triangle();`), um objeto do tipo "Triangle" vai ser criado numa área de memória chamada "heap" (onde são criados os objetos dinâmicos). Com isso, a variável "x" na área "stack" vai conter um endereço de memória que aponta para o objeto criado no heap.
  - A variável se torna uma referência para um objeto no heap.
- Resumo.
  - Classe: é a definição do tipo;
  - Objetos: são instâncias da classe.
