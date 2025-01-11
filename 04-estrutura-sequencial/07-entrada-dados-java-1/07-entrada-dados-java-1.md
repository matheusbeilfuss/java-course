# Entrada de dados em Java - Parte 1

- Java tem uma particularidade para entrada de dados:
  - É preciso fazer um objeto do tipo "Scanner" para isso: `Scanner sc = new Scanner(System.in);`;
  - Importar o pacote "Scanner" e declarar "close" quando não precisar mais dele;
  - Para ler uma palavra: `x = sc.next();`;
  - Para ler um int: `x = sc.nextInt();`;
  - Para ler um double: `x = sc.nextDouble();`;
    - Pega a localidade do sistema;
    - Para considerar como ponto, usar o "Locale" antes da declaração do Scanner.
  - Para ler um char: `x = sc.next().charAt(0);`;
    - Pega o primeiro caracter.
  - Para ler dados na mesma linha separados por espaço, basta declarar os comandos um abaixo do outro;
