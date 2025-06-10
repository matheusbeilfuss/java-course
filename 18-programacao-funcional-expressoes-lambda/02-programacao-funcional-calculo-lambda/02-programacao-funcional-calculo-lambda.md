# Programação funcional e cálculo lambda

- Veremos teoria sobre programação funcional e cálculo lambda;
- Paradigmas de programação
  - Imperativo (C, Pascal, Fortran, Cobol)
  - Orientado a objetos (C++, Object Pascal, Java (< 8), C# (< 3))
  - Funcional (Haskell, Closure, Clean, Erlang)
  - Lógico (Prolog)
  - Multiparadigma (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)

---

- Paradigma funcional de programação;
  - Baseado no formalismo matemático Cálculo Lambda (Church 1930)
  - Nos slides, tabela comparativa entre programação imperativa e funcional. Linhas com asterisco serão compreendidas mais à frente.
- Tabela comparativa
  - Como se descreve algo a ser computado
    - Na programação imperativa, descreve-se isso com comandos, explicando como fazer algo. Na funcional, descreve por meio de expressões, fala-se o que deve ser feito.
  - Funções possuem transparência referencial (ausência de efeitos colaterais)
    - Forte na programação funcional
  - Objetos imutáveis
    - Objetos são mutáveis na imperativa. Na funcional, é comum que objetos sejam imutáveis.
    - Objetos imutáveis deixam o código mais simples.
    - Além disso, objetos imutáveis são thread safe. É mais fácil trabalhar com concorrência com eles.
  - Funções são objetos de primeira ordem (ou primeira classe)
  - Expressividade / código conciso
    - Muitas vezes, na imperativa, o código escrito é verboso e ocupa muito espaço. Na funcional, o código costuma ser conciso.
    - Exemplo disso nos slides: é possível usar funções de primeira classe para resolver problemas em algumas linhas ou até em uma só
  - Tipagem dinâmica / inferência de tipos
    - Compilador infere tipos, como no exemplo da aula anterior, onde o compilador infere que p1 e p2 são do tipo Product.
    - Exemplo no slide.
- Transparência referencial
  - Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade.
    - Se a função acessa dados externos à função, não se tem esse controle e o programa fica mais complicado.
    - Exemplo de função que não é referencialmente transparente nos slides (comportamento dela muda de acordo com informação fora da função, ele não depende exclusivamente do que está na função).
      - Esse tipo de função é mais difícil de entender no programa do que uma função que depende exclusivamente dos valores dela.
  - A transparência referencial é quando o resultado da função depende exclusivamente dos valores de entrada, tendo sempre os mesmos resultados para os valores de saída.
- Funções são objetos de primeira ordem (ou primeira classe)
  - Isso significa que funções podem, por exemplo, ser passadas como parâmetros de métodos, bem como retornadas como resultados de métodos.
  - Uma função é um objeto de primeira classe/ordem quando ela pode ser passada como argumento para outras funções e pode ser retornada por uma função.
  - Exemplo nos slides de referência da função sendo passada como argumento.
    - Sintaxe: `list.sort(Program::compareProducts);`

---

- O que são "expressões lambda"?
  - Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe.
    - Função sem nome e de primeira classe (pode ser passada como argumento para outras funções)
    - Mesmo exemplo que vimos anteriormente: função lambda passada diretamente para a função "sort". Essa função simplesmente define os parâmetros e o que retorna.
    - Exemplo no slide.
- Cálculo Lambda = formalismo matemático base da programação funcional
- Expressão lambda = função anônima de primeira classe
