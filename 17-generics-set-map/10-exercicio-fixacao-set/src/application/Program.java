package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		Integer a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			Integer student = sc.nextInt();
			set.add(student);
		}
		
		System.out.print("How many students for course B? ");
		Integer b = sc.nextInt();
		
		for (int i = 0; i < b; i++) {
			Integer student = sc.nextInt();
			set.add(student);
		}
		
		System.out.print("How many students for course C? ");
		Integer c = sc.nextInt();
		
		for (int i = 0; i < c; i++) {
			Integer student = sc.nextInt();
			set.add(student);
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}
}