package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			vectA[i] = num;
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			vectB[i] = num;
		}
		
		int[] vectRes = new int[n];
		
		for (int i=0; i<n; i++) {
			vectRes[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("\nVETOR RESULTANTE: ");
		for (int i=0; i<n; i++) {
			System.out.println(vectRes[i]);
		}
		
		sc.close();
	}

}
