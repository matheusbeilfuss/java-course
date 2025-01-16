package java_course_default;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double valor;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		valor = 0;
		
		if (cod == 1) {
			valor = quant * 4;
		} else if (cod == 2) {
			valor = quant * 4.5;
		} else if (cod == 3) {
			valor = quant * 5;
		} else if (cod == 4) {
			valor = quant * 2;
		} else if (cod == 5) {
			valor = quant * 1.5;
		}
		
		Locale.setDefault(Locale.US);
		System.out.printf("Total: R$ %.2f", valor);
		
		sc.close();
		
	}
}
