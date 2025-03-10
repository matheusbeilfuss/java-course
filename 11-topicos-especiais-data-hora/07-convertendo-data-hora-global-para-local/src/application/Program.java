package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2025-03-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-03-19T01:30:26");
		Instant d06 = Instant.parse("2025-03-19T01:30:26Z");
		
		// for (String s: ZoneId.getAvailableZoneIds()) { // retorna uma coleção com os nomes dos fusos horários
		// System.out.println(s);
		// }; 
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // converte Instant para data local considerando fuso horário do computador
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // uma hora a mais do que Londres
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());
	}

}
