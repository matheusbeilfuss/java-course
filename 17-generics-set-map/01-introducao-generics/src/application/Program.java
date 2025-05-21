package application;

import java.util.Scanner;

import services.PrintService;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>(); // Opcional colocar o tipo na instanciação
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		// ps.addValue(8); // não deixa mais, só do tipo String
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first(); // não precisa mais de casting
		System.out.println("First: " + x);
		
		sc.close();
	}
}