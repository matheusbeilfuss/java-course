package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-03-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-03-19T01:30:26");
		Instant d06 = Instant.parse("2025-03-19T01:30:26Z");
		Instant d07 = Instant.parse("2025-03-19T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("19/03/2025", formato01);
		LocalDateTime d09 = LocalDateTime.parse("19/03/2025 01:30", formato02);
		
		LocalDate d10 = LocalDate.of(2025, 3, 19);
		LocalDateTime d11 = LocalDateTime.of(2025, 3, 19, 1, 30);
		
		System.out.println("d01 = " + d01); // rodar assim é o mesmo que rodar d01.toString()
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07); // imprime 3 horas a mais porque o padrão é o horário de Londres
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}
}
