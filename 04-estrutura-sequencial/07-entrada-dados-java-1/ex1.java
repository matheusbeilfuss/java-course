package java_course_default;

import java.util.Locale;
import java.util.Scanner;
public class ex1 {
	public statiex4id main(String[] args) { // entry point da aplicação
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
	}

}
