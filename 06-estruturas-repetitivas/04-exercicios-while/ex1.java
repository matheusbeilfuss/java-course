package java_course_default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		
		int tentativa = sc.nextInt();

		while (tentativa != 2002) {
			System.out.println("Senha Invalida");
			tentativa = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		
		sc.close();

	}
}
