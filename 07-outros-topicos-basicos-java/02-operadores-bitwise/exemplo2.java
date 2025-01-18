package java_course_default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000; // declaracao de 32 em numero binario
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!"); // 113
		} else {
			System.out.println("6th bit is false!"); // 89
		}
		
		sc.close();

	}
}
