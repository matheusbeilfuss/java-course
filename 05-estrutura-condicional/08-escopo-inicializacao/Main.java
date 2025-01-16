package java_course_default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double price = 400.00;
		
		double discount;
		
		if (price > 100.0) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);

		sc.close();
	}
}
