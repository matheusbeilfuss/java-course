package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // no Calendar, os meses começam por 0 (janeiro é o mês 0)
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
}
