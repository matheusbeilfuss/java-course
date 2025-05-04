package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		String path = "/home/user/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // parâmetro "true" faz apenas acrescentar ao arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
