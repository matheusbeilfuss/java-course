package java_course_default;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim, duracao;
		
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
		
	}
}
