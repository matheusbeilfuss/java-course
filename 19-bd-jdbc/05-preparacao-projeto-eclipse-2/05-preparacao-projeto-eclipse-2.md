# Preparação do primeiro projeto no Eclipse - Parte 2

- Criar métodos estáticos na classe DB para conectar e desconectar com o BD;
  - Para funcionar, precisei aplicar a seguinte solução: https://stackoverflow.com/a/69497718/20205348
- Conectar com BD no JDBC é instanciar um objeto do tipo Connection (salvo na variável "conn" em DB.java);
- SQLException é derivado da classe Exception, que obriga erros desse tipo serem tratados. Por isso, nesse projeto, foi criada a exceção DbException (derivada da RuntimeException), de modo que o try-catch possa ser colocado somente quando se achar necessário.
