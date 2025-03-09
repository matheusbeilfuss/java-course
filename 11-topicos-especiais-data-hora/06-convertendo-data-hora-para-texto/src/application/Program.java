package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2025-03-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-03-19T01:30:26");
		Instant d06 = Instant.parse("2025-03-19T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// é preciso indicar o fuso horário para formatar uma data do tipo "Instant"
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // nesse caso, pega o fuso horário padrão do sistema
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // tipo pronto da documentação
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
	}

}
