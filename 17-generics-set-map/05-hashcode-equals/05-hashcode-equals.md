# HashCode e Equals

- São operações da classe Object utilizadas para comparar se um objeto é igual a outro
  - equals: operação lenta, mas resposta 100%, não erra
  - hashCode: operação rápida, porém resposta positiva não é 100%, há pequena possibilidade de ocasionar falso positivo
- Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. Classes personalizadas precisam sobrepô-las.

---

- Equals
  - Método que compara se o objeto é igual a outro, retornando true ou false.
  - Sintaxe:

```
String a = "Maria";
String b = "Alex";
System.out.println(a.equals(b));
```

---

- HashCode
  - Método que retorna um número inteiro representando um código gerado a partir das informações do objeto
  - Sintaxe:

```
String a = "Maria";
String b = "Alex";
System.out.println(a.hashCode());
System.out.println(b.hashCode());
```

- Regra de ouro do HashCode
  - Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
  - Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (mas, pode haver colisão)
- Uma forma de uso comum é ir comparando com HashCode e, quando a comparação for verdadeira, comparar novamente utilizando equals, para se certificar da resposta

---

- HashCode e Equals personalizados
  - Eclipse gera automaticamente em "Source -> Generate hashCode() and equals()". Nesse caso, pode-se escolher quais atributos de um objeto serão considerados para a comparação
  - Código na pasta `src`
