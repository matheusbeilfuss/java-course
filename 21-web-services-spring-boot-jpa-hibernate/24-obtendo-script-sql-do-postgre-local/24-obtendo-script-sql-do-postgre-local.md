# Obtendo script SQL a partir do PostgreSQL local

- PgAdmin: get SQL script:

  - Select database
  - Tools -> Backup
    - Format: Plain
    - Encoding: UTF8
    - Dump options:
      - Only schema: YES
      - Blobs: NO
      - Do not save: (ALL)
      - Verbose messages: NO

- Delete instructions before CREATE statements
- As configurações acima servem para se obter um script o mais simples possível para facilitar a compatibilidade entre o servidor de PostgreSQL e o Heroku.
- Com isso, obtém-se o script do BD para o Heroku (script no arquivo `script.sql`).
