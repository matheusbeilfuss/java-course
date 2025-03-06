# Padrão ISO 8601

- Especifica como representar datas e horas na forma de texto;
- Data-[hora] local:
  - 2022-07-21 -> ano-mês-dia
  - 2022-07-21T14:52 -> ano-mês-dia-T-hora-minutos
  - 2022-07-22T14:52:09 -> ano-mês-dia-T-hora-minutos-segundos
  - 2022-07-22T14:52:09.4073 -> ano-mês-dia-T-hora-minutos-.-fração_segundos
- Data-hora global:
  - 2022-07-23T14:52:09Z -> ano-mês-dia-T-horas-minutos-fuso
  - 2022-07-23T14:52:09.254935Z -> ano-mês-dia-T-horas-minutos-.-fração_segundos-fuso
  - 2022-07-23T14:52:09-03:00 -> ano-mês-dia-T-horas-minutos-segundos-fuso_diferente_do_GMT
    - Nesse caso, é como se fosse o horário de São Paulo: GMT -03:00
