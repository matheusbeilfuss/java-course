package application;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		File file = new File("/home/user/teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
		
	}
}
