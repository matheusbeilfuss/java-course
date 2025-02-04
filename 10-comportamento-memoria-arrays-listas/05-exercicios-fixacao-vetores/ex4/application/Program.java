package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		int count = 0;
		
		System.out.println("\nNUMEROS PARES: ");
		for (int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				count++;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + count);
		
		sc.close();
	}

}
