package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rentend? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Room[] rooms = new Room[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nRent #" + (i + 1));
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			Room room = new Room(nome, email);
			
			rooms[roomNumber] = room;
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.printf("\n%d: %s, %s", i, rooms[i].getNome(), rooms[i].getEmail());
			}
		}

	}

}
