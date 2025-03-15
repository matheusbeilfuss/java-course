# Trabalhando com datas - Date

- Representa um INSTANTE
  - Tipo Date é o tipo mais clássico de armazenar uma data no Java
- Pacote java.util
- https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
- Um objeto Date internamente armazena:

  - O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
    - GMT: Greenwich MeanTime (time zone)
    - UTC: CoordinatedUniversal Time (time standard)
  - GMT corresponde ao padrão UTC

- SimpleDateFormat (classe)

  - https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
  - Define formatos para conversão entre Date e String
    - dd/MM/yyyy -> 23/07/2018
    - dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07

- Padrão ISO 8601 e classe Instant
  - Formato: yyyy-MM-ddTHH:mm:ssZ
  - Exemplo: "2018-06-25T15:42:07Z"
  - `Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));`
  - Para armazenar, faz em UTC. Para recuperar e mostrar na tela, faz em horário local
