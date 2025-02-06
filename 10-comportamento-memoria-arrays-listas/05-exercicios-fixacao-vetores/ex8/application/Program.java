package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] nums = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			
			int num = sc.nextInt();
			sc.nextLine();

			nums[i] = num;
		}
		
		double somaPares = 0;
		int quantPares = 0;
		
		for (int i=0; i<n; i++) {
			if (nums[i] % 2 == 0) {
				somaPares += nums[i];
				quantPares++;
			}
		}
		
		if (quantPares > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", (somaPares / quantPares));
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
