# Primeira solução - muito ruim

- A declaração `throws ParseException` indica que aquele método pode gerar o tipo de exceção de parse (quando um parse dá errado), de modo que, se isso acontecer, essa exceção será propagada na pilha de métodos a partir desse método.
  - Caso essa exceção seja tratada no método em que ela pode ocorrer, essa declaração não é necessária.

---

- A solução dessa aula é muito ruim sobretudo porque a lógica de tratamento de exceções está no programa principal: ela deveria estar na entidade de reservas.
- Código na pasta `src`.
- Solução do exercício pelo professor:
  - https://github.com/acenelio/exceptions1-java/commit/3165fb4226be210085a2f69e2bdab2597fc2ee60
