# Demo - transações

- Veremos como implementar uma transação usando JDBC;
- Transação é uma operação que tem que manter a consistência do BD;
- Quatro são as propriedades que ela deve ter: atômica (ou acontece tudo ou nada), consistente, isolada e durável;
  - Referências: https://www.ibm.com/support/knowledgecenter/en/SSGMCP_5.4.0/product-overview/acid.html
- Código-fonte da aula: https://github.com/acenelio/jdbc6
- Código na pasta jdbc6;
- Para implementar transações usando JDBC, vamos usar três elementos da API:
  - setAutoCommit(false): cada operação isolada vai ser confirmada só quando ela for fechada (se estiver com "false"). Se estiver com "true", ela vai ser confirmada automaticamente;
  - commit(): significa confirmar a transação;
  - rollback(): significa desfazer o que foi feito até o momento. Volta o BD ao estado anterior.
