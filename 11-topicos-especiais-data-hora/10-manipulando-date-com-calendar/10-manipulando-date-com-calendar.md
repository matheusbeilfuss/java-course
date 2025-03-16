# Manipulando um Date com Calendar

- Somando uma unidade de tempo

```
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

System.out.println(sdf.format(d));

Calendar cal = Calendar.getInstance();
cal.setTime(d);
cal.add(Calendar.HOUR_OF_DAY, 4); // determina que 4 horas vão ser adicionadas à data do Calendar
d = cal.getTime();

System.out.println(sdf.format(d));
```

- Obtendo uma unidade de tempo

```
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

System.out.println(sdf.format(d));

Calendar cal = Calendar.getInstance();
cal.setTime(d);
int minutes = cal.get(Calendar.MINUTE);
int month = 1 + cal.get(Calendar.MONTH); // no Calendar, os meses começam por 0 (janeiro é o mês 0)

System.out.println("Minutes: " + minutes);
System.out.println("Month: " + month);
```
